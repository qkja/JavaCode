package www.bit.demo1;

import javax.print.DocFlavor;

/**
 * Created with IntelliJ IDEA.
 * Description:   遍历二叉树
 * User: Qkj
 * Date: 2022-03-04
 * Time: 14:08
 */

public class TestDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
    }
}
