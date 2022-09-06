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

   public Node search(int key) {
      if(this.root == null) {
         return null;
      }
      Node cur = root;
      while (cur != null) {
         if(cur.val == key) {
            return cur;
         } else if(cur.val > key) {
            cur = cur.left;
         } else {
            cur = cur.right;
         }
      }
      return null;
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
   public boolean remove(int key) {
      if(this.root == null) {
         return true;
      }
      Node cur = this.root;
      Node parent = null;

      while (cur != null) {
         if(cur.val == key) {
            //开始删除
            removeNode(cur,parent);
            return true;
         } else if(cur.val < key) {
            parent = cur;
            cur = cur.right;
         } else {
            parent = cur;
            cur = cur.left;
         }
      }
      return false;
   }
   private void removeNode(Node cur,Node parent) {
      if(cur.left == null) {
         if(cur == this.root) {
            this.root = cur.right;
         } else if(cur == parent.left) {
            parent.left = cur.right;
         }else {
            parent.right = cur.right;
         }
      } else if (cur.right == null) {
         if(cur == this.root) {
            this.root = cur.left;
         } else if (cur == parent.right) {
            parent.right = cur.left;
         } else {
            parent.left = cur.left;
         }
      } else {

            Node targetParent = cur;
            //右侧找 最小
            Node target = cur.right;
            while (target.left != null) {
               targetParent = target;
               target = target.left;
            }
            //覆盖  数据
            cur.val = target.val;
            if(targetParent.left == target) {
               targetParent.left = target.right;
            } else {
               targetParent.right = target.right;
            }
      }
   }
}
