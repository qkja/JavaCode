package www.bit.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-01
 * Time: 19:59
 */
class Node {
    public int val;
    public Node next;
    public Node() {
        this.val = 0;
        this.next = null;
    }
    public Node(int x) {
        this.val = x;
        this.next = null;
    }
}

public class MyLinkedList {
    private Node head;
    public MyLinkedList() {
       this.head = null;
    }

    //判断回文


    //长度
    private int size() {
        if(this.head==null) {
            return -1;
        }
        Node cur = this.head;
        int count = 0;
        while (cur!=null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public int get(int index) {
        if(this.head==null||index < 0||index >= size()) {
            return -1;
        }
        Node cur = this.head;
        for (int i = 0;i < index;i++) {
            cur = cur.next;
        }
        return cur.val;
    }
    //头插
    public void addAtHead(int val) {
        Node node = new Node(val);
        //判断是不是空
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    public Node getLastNode() {
        Node node = this.head;
        while (node.next!=null) {
            node = node.next;
        }
        return node;
    }
    //尾插
    public void addAtTail(int val) {
        Node node = new Node(val);
        //判断是不是空
        if(this.head == null) {
            this.head = node;
            return;
        }
        //找到最后一个节点
        Node cur = getLastNode();
        cur.next = node;
    }

    //找到某个节点
    private Node getIndexNode(int index) {
        Node node = this.head;
        for (int i=0;i<index;i++) {
            node = node.next;
        }
        return node;
    }

    public void addAtIndex(int index, int val) {
        if (index<=0) {
            //头插
            addAtHead(val);
        } else if(index==size()) {
            addAtTail(val);
        } else if(index>size()) {
            return;
        } else {
            Node cur = getIndexNode(index-1);
            Node node = new Node(val);
            Node newNode = cur.next;
            cur.next = node;
            node.next = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if(this.head==null) {
            return;
        }
        if(index>=0&&index<size()) {
            if(index == 0) {
                this.head = this.head.next;
            } else {
                Node cur = getIndexNode(index-1);
                Node node =cur.next;
                cur.next = node.next;
                node.next = null;
            }
        }
    }
}
