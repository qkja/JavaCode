package bit.www.demo1;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-28
 * Time: 15:01
 */
class Node {
   public int val;
   public Node left;
   public Node right;

   public Node(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
   }
}

public class BinarySearchTree {
   private Node root = null;
   public void print() {
      if(this.root == null) {
         return;
      }
      //用  栈  模拟
      Stack<Node> stack = new Stack<>();
      Node cur = root;
      while (cur != null || !stack.isEmpty()) {
         while (cur != null) {
            stack.push(cur);
            cur = cur.left;
         }
         Node pop = stack.pop();
         System.out.print(pop.val+" ");
         cur = pop.right;
      }
      stack.clear();
   }

   public boolean search(int key) {
      if(this.root == null) {
         return false;
      }
      Node cur = root;
      while (cur != null) {
         if(cur.val == key) {
            return true;
         } else if(cur.val > key) {
            cur = cur.left;
         } else {
            cur = cur.right;
         }
      }
      return false;
   }

   public boolean insert(int val) {
      if(this.root == null) {
         this.root = new Node(val);
         return true;
      }
      Node cur = this.root;
      Node prev = null;
      while (cur != null) {
         if(cur.val < val) {
            prev = cur;
            cur = cur.right;
         } else if ((cur.val > val)) {
            prev = cur;
            cur = cur.left;
         } else {
            return false;
         }
      }
      if(prev.val < val) {
         prev.right = new Node(val);
      }
      if(prev.val > val) {
         prev.left = new Node(val);
      }
      return true;
   }
}
