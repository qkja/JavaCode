/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-12-12
 * Time: 16:42
 */

class Node {

    public int data;
    public Node next;

    public Node(int data) {

        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {


    public Node head;
    public Node last;
    //类 不new一个对象  head 是 null吗  是的

    //头插法
    public void addFirst(int data) {

        Node node = new Node(data);
        //头一次插入
        if(this.head == null) {

            this.head = node;
            return;
        }

        node.next = this.head;
        head = node;

    }
    //尾插法
    public void addLast(int data) {

        Node node = new Node(data);

//        Node cur = this.head;
//        while(cur != null) {
//
//            cur = cur.next;
//        }
//        //这只能找到 null  但找不到null之前的那个地址
//        cur = node;



        //判断是不是没有节点
        if(this.head == null) {     //当没有考虑这一点会出现空指针异常

            this.head = node;
            return;
        }
        //找到 最后一个节点
        this.last = this.head;
        while(this.last.next != null) {

            this.last = this.last.next;
        }
        this.last.next = node;

    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {

        Node node = new Node(data);
        //判断链表的长度
        int len = this.size();
        if(index == 0) {

            this.addFirst(data);
            return true;
        }
        if(index == this.size()) {

            this.addLast(data);
            return true;
        }
        Node cur = searchIndex(index);

        node.next = cur.next;
        cur.next = node;
        return true;

    }

    private Node searchIndex(int index) {

        //对index检查
        if(index<0||index>this.size()) {

            throw new RuntimeException("index位置不合法");
        }
        Node cur = this.head;
        while(index-1 != 0) {

            cur = cur.next;
            index--;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {

        Node cur = this.head;
        while(cur != null) {
            if(cur.data ==  key) {

                return true;
            }
            cur = cur.next;
        }
        return false;
    }
//    //删除第一次出现关键字为key的节点
//    public void remove(int key) {}
//
//    //删除所有值为key的节点
//    public void removeAllKey(int key) {
//
//    }
    //得到单链表的长度
    public int size() {

        int count = 0;
        Node cur = this.head;
        while(cur != null) {

            cur = cur.next;
            count++;
        }

        return count;
    }

    public void display() {

        Node cur = this.head;
        //方法二
        while(cur != null) {

            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("null");

        //方法一
//        while(cur.next!=null) {
//
//            System.out.print(cur.data + " ");
//            cur = cur.next;
//        }
//
//        System.out.print(cur.data + " ");

        System.out.println();
    }
//    public void clear() {
//
//    }


//    public static void main(String[] args) {
//
//        Node head;
//        int age;
//        //安全性在于可以定义一个不初始化的变量    当时不能使用
//        //System.out.println(age);
//    }
}
