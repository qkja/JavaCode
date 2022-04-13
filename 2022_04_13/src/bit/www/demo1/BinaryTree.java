package bit.www.demo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-13
 * Time: 16:18
 */
class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode () {
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    /**
     * 前序遍历
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop().right;
        }

        return list;
    }
    /**
     * 中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        //stack.push(root);
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode pop = stack.pop();
            list.add(pop.val);
            //System.out.print(pop.val+" ");
            root = pop.right;
        }
        return list;
    }

    /**
     * 后序遍历
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if(cur.right == null || prev == cur.right) {
                cur = stack.pop();
                list.add(cur.val);
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }

        return list;
    }
    public String str = "";
    public void tree2strChild(TreeNode root) {
        if(root == null) {
            return;
        }
        str+=root.val;
        if(root.left == null) {
            if(root.right == null) {
                return ;
            } else {
                str+="()";
            }
        } else {
            str+="(";
            tree2strChild(root.left);
            str+=")";
        }

        if(root.right == null) {
            return;
        } else {
            str+="(";
            tree2strChild(root.right);
            str+=")";
        }

    }
    public String tree2str(TreeNode root) {
        if(root == null) {
            return str;
        }
        tree2strChild(root);
        return str;
    }
}
