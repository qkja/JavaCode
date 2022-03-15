package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-15
 * Time: 16:46
 */
class Tree {
    public int val;
    public Tree left;
    public Tree right;
    public Tree() {
        this.val = 0;
        this.left = null;
        this.right = null;
    }
}

public class TreeNode {

    public static int count = 0;
    void getLeafSize1(Tree root) {
        if(root == null) {
            return;
        }
        if(root.left!=null&&root.right!=null) {
            count++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    int getLeafSize2(Tree root) {
        if(root==null) {
            return 0;
        }
        return 1 + getLeafSize2(root.left) + getLeafSize2(root.right);
//        if(root.left==null&&root.right==null) {
//            return
//        }
    }
}
