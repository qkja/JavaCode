package bit.www.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-06
 * Time: 21:49
 */
public class HashBuck <K,V>{
    static class Node<K,V> {
        public K key;
        public V val;
        public Node<K,V> next;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }
    public Node<K,V>[] array = (Node<K,V>[])new Node[10];
    public int usedSize;
    public static final double DEFAULT_LOAD_FACTOR = 0.75;

    public void put(K key, V value) {
        Node<K,V> node = new Node(key,value);
        int index = key.hashCode() % this.array.length;

        //遍历链表
        Node<K,V> cur = this.array[index];

        while (cur != null) {
            if(cur.key.equals(key)) {
                cur.val = value;
                return;
            }
            cur = cur.next;
        }
        //头插
        node.next = this.array[index];
        this.array[index] = node;
        this.usedSize++;

        //检查负载因子
        if(loadFactor() >= DEFAULT_LOAD_FACTOR) {
            //扩容
            resize();
        }
    }

    /**
     * 扩容很麻烦
     */
    private void resize() {
        Node<K,V>[] newArray = (Node<K,V>[])new Node[this.array.length*2];
        for (int i = 0; i < array.length; i++) {
            Node<K,V>cur = this.array[i];
            while (cur != null) {
                int index = cur.key.hashCode() % newArray.length;
                //完成 头插
                Node<K,V>curNext = cur.next;
                cur.next = newArray[index];
                newArray[index] = cur;

                cur = curNext;
            }
        }
        this.array = newArray;
        //自动回收  没有用的
    }
    private double loadFactor() {
        return 1.0*this.usedSize / this.array.length;
    }

    /**
     * 根据key获取value值
     * @param key
     * @return
     */
    public V get(K key) {

        int index = key.hashCode() % this.array.length;
        Node<K,V>cur = this.array[index];
        while (cur != null) {
            if (cur.key.equals(key)) {
                return cur.val;
            }
            cur = cur.next;
        }
        return null;
    }


}
