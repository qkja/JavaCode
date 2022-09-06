package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:  创建一个二叉树
 * User: Qkj
 * Date: 2022-03-04
 * Time: 14:20
 */
class TreeNode {
    public char val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(char val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    /**
     * 创建一个二叉树  返回根节点
     * @return
     */
    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        B.left = D;
        B.right = E;
        E.right = H;

        A.right = C;
        C.left = F;
        C.right = G;
        return A;
    }

    // 前序遍历  根  左  右
    public void preOrderTraversal(TreeNode root) {
        if(root==null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    // 中序遍历  左  根  右
    public void inOrderTraversal(TreeNode root) {
        if(root==null) {
            return;
        }

        preOrderTraversal(root.left);
        System.out.print(root.val+" ");
        preOrderTraversal(root.right);


    }
    // 后序遍历  左  右  根
    public void postOrderTraversal(TreeNode root) {
        if(root==null) {
            return;
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    public static int size = 0;
    public void getSize1(TreeNode root) {
        if(root==null) {
            return;
        }
        size++;
        getSize1(root.right);
        getSize1(root.left);
    }
    public int getSize2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) + 1;
    }


}
