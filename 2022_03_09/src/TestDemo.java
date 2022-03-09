/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-09
 * Time: 12:53
 */
public class TestDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();
        TreeNode ret = binaryTree.find2(root,'F');
        if(ret==null) {
            System.out.println("111111111");
        }
        System.out.println(ret.val);

    }
    public static void main1(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();
        binaryTree.getLeafSize1(root);
        System.out.println(BinaryTree.leafSize);
        System.out.println(binaryTree.getLeafSize2(root));
    }
}
