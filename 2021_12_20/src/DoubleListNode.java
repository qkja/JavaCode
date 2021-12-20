import com.sun.deploy.panel.DeleteFilesDialog;
import sun.security.mscapi.CPublicKey;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-12-20
 * Time: 17:46
 */

class Node {

    public int data;
    public Node prev;
    public Node next;
    public Node(int data) {

        this.data = data;
    }
}

public class DoubleListNode {
    public Node head; //标志头
    public Node tail; //标志尾

    //头插法
    public void addFirst(int data) {

        Node node = new Node(data);

        //第一次

        if(this.head==null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
        //
    }
    //尾插法
    public void addLast(int data) {

        Node node = new Node(data);
        //第一次
        if(this.head==null) {
            this.head = node;
            this.tail = node;
        } else {

            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }
    private boolean checkIndex(int Index) {

        if(Index<0||Index>size()) {
            return false;
        }
        return true;
    }


    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {

        //Node cur = this.head;
//        if(this.head==null) {
//            //display();
//            System.out.println("空节点");
//            return false;
//        }
        //头插
        if(checkIndex(index)==false) {
            throw new RuntimeException("Index不合法");
        }
        if(index==0) {
            addFirst(data);
            return true;
        }
        if(index==size()) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node cur = this.head;
        while (index > 0) {

            cur = cur.next;
            index--;
        }
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
        return false;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {

        Node cur = this.head;
        while(cur!=null) {
            if(cur.data==key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {

        //System.out.println("完成");
        Node cur = this.head;
        if(this.head==null) {
            //display();
            System.out.println("空节点");
            return;
        }
        if(this.tail.data==key) {

            this.tail.prev.next = null;
            this.tail = this.tail.prev;
            return;
        }
        if(this.head.data==key) {

            this.head = this.head.next;
            this.head.prev = null;
            return;
        }
        while(cur!=null) {
            if(cur.data==key) {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                //cur = cur.next;
                return;
                //return true;
            }
            cur = cur.next;
        }
        System.out.println("完成");
//        System.out.println("完成");
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {

//
//        Node cur = this.head;
//        if(this.head==null) {
//            //display();
//            System.out.println("空节点");
//            return;
//        }
//        if(this.tail.data==key) {
//
//            this.tail.prev.next = null;
//            this.tail = this.tail.prev;
//            //return;
//        }
//        if(this.head.data==key) {
//
//            this.head = this.head.next;
//            this.head.prev = null;
//            //return;
//        }
//        while(cur!=null) {
//            if(cur.data==key) {
//                cur.prev.next = cur.next;
//                cur.next.prev = cur.prev;
//                //cur = cur.next;
//                //return;
//                //return true;
//            }
//            cur = cur.next;
//        }
//        //System.out.println("完成");
//        Node cur = this.head;
//        Node helper = null;
//        if(this.head==null) {
//            throw new RuntimeException("空节点");
//        }
//        while(cur!=null) {
//            if(cur.data==key) {
//
//                helper = cur.prev;
//
//                while(cur!=null && cur.data==key) {
//                    cur = cur.next;
//                }
//
//                if(helper==null) {
//                    this.head = cur;
//                }
//                if(helper!=null) {
//                    helper.next = cur;
//                }
//
//                if(cur!=null) {
//                    cur.prev = helper;
//                }
//
//            }
//
//
////            while(cur.data==key) {
////                cur = cur.next;
////            }
//            if(cur==null) {
//                return;
//            }
//            cur = cur.next;
//        }
////        if(this.head==null) {
////            System.out.println("空节点");
////            //throw new RuntimeException("空节点");
////        }
//        System.out.println("完成");
    }

    //得到单链表的长度
    public int size() {

        int count = 0;
        Node cur = this.head;
        while(cur!=null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display() {

        //int count = 0;
        if(this.head==null) {
            System.out.println("空节点");
            return;
        }

        Node cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
        //System.out.println("完成");
    }

    public void clear() {
        while(this.head!=null) {

            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
        }


//        this.head = null;//不能满足
//        this.tail.prev = null;
    }


}
