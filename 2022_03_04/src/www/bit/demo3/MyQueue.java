package www.bit.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-04
 * Time: 17:13
 */

class QueueNode {
    public int val;
    public QueueNode next;
    public QueueNode() {
        this.val = 0;
        this.next = null;
    }
    public QueueNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MyQueue {
    private QueueNode head; // 头节点
    private QueueNode tail; // 尾节点
    public MyQueue() {
        this.head = null;
        this.tail = null;
    }
    public int poll() {
        if(this.head==null) {
            throw new RuntimeException("空");
        }
        int ret = this.head.val;
        QueueNode cur =  this.head;
        this.head = this.head.next;
        cur.next = null;
        return ret;
    }

    public int peek() {
        if(this.head==null) {
            throw new RuntimeException("空");
        }
        return this.head.val;
    }

    public boolean add(int val) {

        QueueNode node = new QueueNode(val);

        if(this.head==null) {
            this.head = node;
            this.tail = this.head;
            return true;
        }
        this.tail.next = node;
        this.tail = this.tail.next;
        return true;
    }

}
