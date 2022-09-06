package www.bit.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-02
 * Time: 16:06
 */
class ListNode {
    public int val;
    public ListNode next;
}

class MyListNode {
    private ListNode head;
    public MyListNode() {
        this.head = null;
    }
    //个数
    public int size() {
        if(this.head==null) {
            return -1;
        }
        int count = 0;
        ListNode cur = this.head;
        while (cur!=null) {
            count++;
            cur =cur.next;
        }
        return count;
    }
    //打印
    public void display() {
        if(this.head==null) {
            System.out.println("空链表");
            return;
        }
        ListNode cur = this.head;
        while (cur!=null) {
            System.out.print(cur.val+ "->");
            cur =cur.next;
        }
        System.out.println("null");
    }
    //找到 第 N 个节点  节点 是从   0开始的
    public ListNode searchNode(int k) {

        if(k<1 || k>size()) {
            return null;
        }
        ListNode cur = this.head;
        for(int i=1;i<k;i++) {
            cur = cur.next;
        }
        return cur;
    }
    //最后一个节点
    public ListNode tailNode() {
        if(this.head==null) {
            return null;
        }
        return searchNode(size());
    }
    //倒数第二个节点
    public ListNode beforeTailNode() {
        if(this.head==null) {
            return null;
        }
        return searchNode(size()-1);
    }
    //查找是不是有  key  元素
    public boolean search(int key) {
        if(this.head==null) {
            return false;
        }
        ListNode cur = this.head;
        while (cur!=null) {
            if(cur.val==key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

}

public class TestDemo {

}

class Solution {
    //删除所有的   key
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) {
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur!=null) {
            if(cur.val==val) {
                while(cur!=null && cur.val==val) {
                    cur = cur.next;
                }
            } else {
                prev.next = cur;
                prev = prev.next;
                cur = cur.next;
            }
        }
        //判断头节点
        if(head.val==val) {
            head = head.next;
        }
        return head;
    }

    public ListNode reverseList(ListNode head) {
        if (head==null) {
            return null;
        }
        ListNode cur = head.next;
        ListNode curNext = cur;
        head.next = null;
        while (cur!=null) {
            curNext = cur.next;
            cur.next = head;
            head =cur;
            cur = curNext;
        }
        return head;
    }



    public ListNode middleNode(ListNode head) {
        if (head==null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null) {
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}


//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if(list1==null&&list2==null) {
//            return null;
//        }
//        if (list1==null) {
//            return list2;
//        }
//        if (list2==null) {
//            return list1;
//        }
//        ListNode cur1 = list1;
//        ListNode cur2 = list2;
//        ListNode newHead = null;
//        ListNode tail = null;
//        while (cur1!=null&&cur2!=null) {
//            if(cur1.val<cur2.val) {
//                if(newHead==null) {
//                    newHead = cur1;
//                    tail = newHead;
//
//                } else {
//                    tail.next = cur1;
//                    tail = cur1;
//                }
//                cur1 = cur1.next;
//            } else {
//                if(newHead==null) {
//                    newHead = cur2;
//                    tail = newHead;
//                } else {
//                    tail.next = cur2;
//                    tail = cur2;
//                }
//                cur2 = cur2.next;
//            }
//        }//endWhile
//        if(cur1==null) {
//            tail.next = cur2;
//        }
//        if(cur2==null) {
//            tail.next = cur1;
//        }
//        return newHead;
//    }
//}
