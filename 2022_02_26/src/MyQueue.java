/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-26
 * Time: 12:38
 */


class Node {
    protected int val;
    protected Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MyQueue {
   private Node first;
   private Node last;
   //入队
   public void offer(int val) {
       Node node = new Node(val);
       if(isEmpty()) {
           this.first = node;
           this.last = this.first;
       }
       this.last.next = node;
       this.last = this.last.next;
   }
    //出队
    public int poll() {
        //判断空
        if(isEmpty()) {
            throw new RuntimeException("空");
        }
        int ret = this.first.val;

        Node newNode = this.first.next;
        this.first.next = null; //断开链接
        this.first = newNode;
        return ret;
    }
    //得到队头  不删
    public int peek() {
        //判断空
        if(isEmpty()) {
            throw new RuntimeException("空");
        }
        int ret = this.first.val;
        return ret;
    }
    //空
    public boolean isEmpty() {
        if(this.first == null) {
            return true;
        }
       return false;
    }

}


