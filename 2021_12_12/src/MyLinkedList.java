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

    //中间节点


    //回文结构
    public boolean chkPalindrome() {

        if(this.head==null) {
            return false;
        }
        if(this.head.next==null) {
            return true;
        }
        //找到中间节点
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null&& fast.next!=null) {

            slow = slow.next;
            fast = fast.next.next;
            //fast = fast.next;
        }

        //反转
        Node cur = slow.next;
        while(cur!=null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }

        //头 -》

        while(slow != this.head) {

            if(slow.data != this.head.data) {
                return false;
            }
            if(this.head.next==slow) {

                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;

    }
    public Node partition(int x) {

        if(this.head == null) {
            return null;
        }
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while(cur!=null) {

            if(cur.data < x) {

                if(bs==null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = cur;
                }
            } else{

                if(as == null) {
                  as = cur;
                  ae = cur;
                } else{
                    ae.next = cur;
                    ae = cur;
                }

            }
            cur = cur.next;
        }
        if(bs == null) {
            //this.head = as;
            return as;
        }
        be.next = as;
        if(ae!=null) {

            ae.next = null;
        }
        //this.head = bs;
        return bs;
    }
    public Node middleNode() {

        if(this.head==null) {
            throw new RuntimeException("空节点");
        }
//        if(this.head.next==null) {
//            return this.head;
//        }
        Node slow = this.head;
        Node fast = this.head;

        while(fast != null&& fast.next!=null) {

            slow = slow.next;
            fast = fast.next.next;
            //fast = fast.next;
        }
        return slow;
    }
    //反转单链表
    public void reverseList() {

        if(this.head == null) {
            throw new RuntimeException("空节点");
        }

        Node helper = null;
        Node cur = this.head.next;
        this.head.next = null;
        while(cur != null) {

            helper = cur.next;
            cur.next = this.head;
            this.head = cur;
            cur = helper;
        }
    }
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
    //找到倒数第 k 个节点
    public Node FindKthToTail(int k) {

        if(this.head == null) {
            throw new RuntimeException("是空节点");
        }

        k = this.size() + 1 - k;
        if(k < 1 || k > this.size()) {

            throw new RuntimeException("k的值不合法");
        }
        Node cur = this.head;
        while(k-1 != 0) {
            cur = cur.next;
            k--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {

        Node node = new Node(data);
//        //判断链表的长度
//        int len = this.size();
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
    //删除第一次出现关键字为key的节点
    public void remove(int key) {

        if(this.head==null) {

            throw new RuntimeException("是空节点");
        }
        if(this.head.data == key) {

            this.head = this.head.next;
            return;
        }
        Node cur = searchNodeKey(key);
        if(cur==null) {
            //throw new RuntimeException("没有这个数");
            System.out.println("没有这个数");
            return;
        }
        cur.next = cur.next.next;
        //寻找节点
    }

    public Node deleteDuplication() {

        Node newHead = new Node(-1);
        Node cur = this.head;
        Node tep = newHead;
        while(cur != null) {

            if(cur.next!=null && cur.data==cur.next.data) {

                while(cur.next != null&&cur.data == cur.next.data) {
                    cur = cur.next;
                }
            } else{

                tep.next = cur;
                tep =  tep.next;
            }
            cur = cur.next;
        }

        tep.next = null;
        return newHead.next;
    }

    private Node searchNodeKey(int key) {

        Node node = this.head;
        //if()
        while(node.next!=null) {

            if(node.next.data == key) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {

        if(this.head==null) {

            throw new RuntimeException("空节点");
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {

            if(cur.data != key) {

                prev = cur;
                cur = cur.next;
            } else {
                prev.next = cur.next;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {

            this.head = this.head.next;
        }

    }
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

    public void display2(Node node) {

        Node cur = node;
        //方法二
        while (cur != null) {

            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("null");
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

    /**
     *
     * 释放内存  使得他们的每一个next = null  或者
     *
     */

    public void clear() {

        this.head = null;  //虽说JVM会回收  可以实现 疑惑 这个更好
    }


//    public static void main(String[] args) {
//
//        Node head;
//        int age;
//        //安全性在于可以定义一个不初始化的变量    当时不能使用
//        //System.out.println(age);
//    }
}
