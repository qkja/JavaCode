/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-09
 * Time: 12:42
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
     *
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

    // 遍历思路-求叶子结点个数
    public static int leafSize = 0;
    void getLeafSize1(TreeNode root) {
        if(root==null) {
            return;
        }
        if(root.left==null&&root.right==null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }


    // 子问题思路-求叶子结点个数
    int getLeafSize2(TreeNode root) {
        if(root==null) {
            return 0;
        }
        if(root.left==null&&root.right==null) {
           return 1;
        }

        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    public int getKLevelSize(TreeNode root,int k) {
        if(root==null||k==-1) {
            return -1;
        }
        if(k==1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    }

//    TreeNode find1(TreeNode root, char val) {
//        if(root==null) {
//            return null;
//        }
//        if(root.val==val) {
//            return root;
//        }
//        find1(root.left,val);
//        find1(root.right,val);
//        return null;
//    }
    TreeNode find2(TreeNode root, char val) {
        if(root==null) {
            return null;
        }
        if(root.val==val) {
            return root;
        }
        TreeNode ret = find2(root.left,val);
        if(ret!=null) {
            return ret;
        }
        ret = find2(root.right,val);
        if(ret!=null) {
            return ret;
        }
        return null;
    }
//    public int getHeight(TreeNode root) {
//        if(root==null) {
//            return 0;
//        }
//        if(root.left==null&&root.right==null) {
//            return 1;
//        }
//        int max = getHeight(root.right)>getHeight(root.left)?getHeight(root.right):getHeight(root.left);
//
//        return max+1;
//    }

}
