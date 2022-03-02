package www.bit.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:  自己实现  顺序表
 * User: Qkj
 * Date: 2022-03-02
 * Time: 19:43
 */

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *   底层是一个数组
 */
class ArrayList {
    private int[] elem;
    private int top;
    private int tail;
    public ArrayList() {
        this.elem = new int[1]; //先开辟  十个 int空间   后期回扩容
        this.top = 0;
        this.tail = 0;
    }
    public void expansion() {
        if(this.tail==this.elem.length) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length+3);
        }
    }
    public void display() {
        for (int i = 0; i < this.tail; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //将指定的元素追加到此列表的末尾
    public boolean add(int pos) {
        //判断扩容
        expansion();
        this.elem[this.tail++] = pos;
        return true;
    }
    //判断  是不是 空
    public boolean icEmpty() {
        if(this.tail==0) {
            return true;
        }
        return false;
    }
    //清空
    public void clean() {
        this.tail = 0;
    }
    //将  index  插入到  pos位置中，后面后移
    public void add(int index,int pos) {
        pos = pos -1;
        if(pos<0||pos>this.tail) {
            return;
        }
        expansion();

        for (int i = tail-1; i>=pos;i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = index;
        this.tail++;
    }
}
class Node {
    public int val;
    public Node next;
    public Node() {
        this.next = null;
        this.val = 0;
    }
    public Node(int val) {
        this.next = null;
        this.val = val;
    }
}
class LinkedList {
    private Node head;
    private Node tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    //长度
    public int size() {
        if(this.head==null) {
            return -1;
        }
        int count =0;
        Node cur = this.head;
        while (cur!=null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //得到第 k 个节点
    public Node getNode(int k) {
        if(this.head==null) {
            return null;
        }
        Node cur = this.head;
        for (int i = 1; i < k ; i++) {
            cur = cur.next;
        }
        return cur;
    }

    //的到  倒数 第 k 个节点
    public Node getHeadK(int k) {
        return  getNode(size()+1-k);
    }

//    //长度
//    public int size() {
//        if(this.head==null) {
//            return -1;
//        }
//        int count =0;
//        Node cur = this.head;
//        while (cur!=null) {
//            count++;
//            cur = cur.next;
//        }
//        return count;
//    }
//    //得到第 k 个节点
//    public Node getNode(int k) {
//        if(this.head==null) {
//            return null;
//        }
//        Node cur = this.head;
//        for (int i = 1; i < k ; i++) {
//            cur = cur.next;
//        }
//        return cur;
//    }
//
//    //的到  倒数 第 k 个节点
//    public Node getHeadK(int k) {
//        return  getNode(size()+1-k);
//    }
    //尾插
    public boolean add(int val) {
        Node node = new Node(val);
        if(this.head==null) {
            this.head = node;
            this.tail = this.head;
        }
        this.tail.next = node;
        this.tail = this.tail.next;
        return true;
    }
    //清空
    public void clean() {
        this.head = null;
    }
    //判断空
    public boolean isEmpty() {
        return this.head==null;
    }

}

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList.icEmpty());
        arrayList.add(1,1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.display();
//        arrayList.add(5,3);
        arrayList.display();
//        System.out.println(arrayList.icEmpty());
//        arrayList.clean();
//        System.out.println(arrayList.icEmpty());
    }
}
