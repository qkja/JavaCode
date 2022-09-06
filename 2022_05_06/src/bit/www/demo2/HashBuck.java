package bit.www.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-06
 * Time: 18:28
 */


public class HashBuck {
    static class Node {
        public int key;
        public int value;
        public Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next  = null;
        }
    }

    private Node[] array;
    private int usedSize;
    public HashBuck() {
        this.array = new Node[10];
        this.usedSize = 0;
    }
    public static final double DEFAULT_LOAD_FACTOR = 0.75;
    public void put(int key, int value) {
        Node node = new Node(key,value);
        int index = key % this.array.length;

        //遍历链表
        Node cur = this.array[index];

        while (cur != null) {
            if(cur.key == key) {
                cur.value = value;
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
        Node[] newArray = new Node[this.array.length*2];
        for (int i = 0; i < array.length; i++) {
            Node cur = this.array[i];
            while (cur != null) {
                int index = cur.key % newArray.length;
                //完成 头插
                Node curNext = cur.next;
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
    public int get(int key) {

        int index = key % this.array.length;
        Node cur = this.array[index];
        while (cur != null) {
            if (key == cur.key) {
                return cur.value;
            }
            cur = cur.next;
        }
        return -1;
    }
}
