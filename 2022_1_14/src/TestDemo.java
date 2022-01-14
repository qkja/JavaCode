/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-01-14
 * Time: 21:15
 */

class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListNode {
    public Node head;
    //尾插
    public void TailInsert(int x) {
        Node newNode = new Node(x);
        if(this.head==null) {
            this.head = newNode;
            return;
        }
        Node cur = this.head;
        while(cur.next!=null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    //打印
    public void display() {
        Node cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("null");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.TailInsert(1);
        listNode.TailInsert(2);
        listNode.TailInsert(3);
        listNode.display();
    }
}
