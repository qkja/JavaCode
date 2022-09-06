package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-02
 * Time: 13:13
 */
public class TestDemo {

}
//class Solution {
//    public ListNode deleteDuplication(ListNode pHead) {
//        if(pHead==null) {
//            return null;
//        }
//
//        ListNode cur = pHead;
//        ListNode head = null;
//        ListNode tail = null;
//
//        while(cur!=null) {
//            if(head==null) {
//                head = cur;
//                tail = head;
//                cur = cur.next;
//            } else if(cur.val==tail.val) {
//                cur = cur.next;
//            } else if(cur.val!=tail.val) {
//                tail.next = cur;
//                tail = cur;
//                cur = cur.next;
//            }
//
//        }
//        pHead = head;
//        return pHead;
//    }
//}



//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
//class A{
//    public ListNode partition(ListNode pHead, int x) {
//        if(pHead==null) {
//            return null;
//        }
//        ListNode cur = pHead;
//        ListNode left = null;
//        ListNode leftHelp = null;
//        ListNode right = null;
//        ListNode rightHelp = null;
//
//        while (cur!=null) {
//            if(cur.val <= x) {
//                if(left==null) {
//                    left = cur;
//                    leftHelp = left;
//
//                } else {
//                    leftHelp.next = cur;
//                    leftHelp = leftHelp.next;
//
//                }
//            } else {
//                if(right==null) {
//                    right = cur;
//                    rightHelp =right;
//
//                } else {
//                    rightHelp.next = cur;
//                    rightHelp = rightHelp.next;
//
//                }
//            }
//            cur = cur.next;
//        }
//
//        //
//        if(left==null) {
//            return right;
//        }
//        if(right!=null) {
//            leftHelp.next = right;
//            rightHelp.next = null;
//        }
//        return left;
//
//        // write code here
//    }
//}
//
//
///*
//public class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}*/
//class Partition1 {
//    public ListNode partition(ListNode pHead, int x) {
//        // write code here
//        if(pHead == null) {
//            return null;
//        }
//        ListNode bs = null;
//        ListNode be = null;
//        ListNode as = null;
//        ListNode ae = null;
//        ListNode cur = pHead;
//
//        while(cur!=null) {
//
//            if(cur.val < x) {
//
//                if(bs==null) {
//                    bs = cur;
//                    be = cur;
//                } else {
//                    be.next = cur;
//                    be = cur;
//                }
//            } else{
//
//                if(as == null) {
//                    as = cur;
//                    ae = cur;
//                } else{
//                    ae.next = cur;
//                    ae = cur;
//                }
//
//            }
//            cur = cur.next;
//        }
//
//        if(bs == null) {
//            return as;
//        }
//
//        if(as!=null) {
//            be.next = as;
//            ae.next = null;
//        }
//        return bs;
//    }
//}
//
//
////public class Solution {
////    public int size(ListNode head) {
////        if(head == null) {
////            return -1;
////        }
////        int count = 0;
////        ListNode cur = head;
////        while (cur!=null) {
////            count++;
////            cur = cur.next;
////        }
////        return count;
////    }
////    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
////        if(headA==null||headB==null) {
////            return null;
////        }
////        //得到长度
////        int lenA = size(headA);
////        int lenB = size(headB);
////        int len = lenA - lenB;
////        ListNode pl = headA;
////        ListNode ps = headB;
////        if(len < 0) {
////            pl = headB;
////            ps = headA;
////            len = lenB - lenA;
////        }
////        for (int i = 0; i < len; i++) {
////            pl = pl.next;
////        }
////        //同一个起跑线
////        while (pl!=null&&ps!=null) {
////            if(pl==ps) {
////                return pl;
////            }
////            pl = pl.next;
////            ps = ps.next;
////        }
////        return null;
////    }
////}
//import java.util.*;
//
///*
//public class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}*/
//class Partition {
//    public ListNode partition(ListNode pHead, int x) {
//        if(pHead==null) {
//            return null;
//        }
//        ListNode cur = pHead;
//        ListNode left = null;
//        ListNode leftHelp = null;
//        ListNode right = null;
//        ListNode rightHelp = null;
//        while (cur!=null) {
//            if(cur.val <= x) {
//                if(left==null) {
//                    left = cur;
//                    leftHelp = left;
//                    cur = cur.next;
//                } else {
//                    leftHelp.next = cur;
//                    leftHelp = leftHelp.next;
//                    cur = cur.next;
//                }
//            } else {
//                if(right==null) {
//                    right = cur;
//                    rightHelp =right;
//                    cur = cur.next;
//                } else {
//                    rightHelp.next = cur;
//                    rightHelp = rightHelp.next;
//                    cur = cur.next;
//                }
//            }
//        }
//
//        //
//        if(left==null) {
//            return right;
//        }
//        if(right!=null) {
//            leftHelp.next = right;
//            rightHelp.next = null;
//        }
//        return left;
//
//        // write code here
//    }
//}
