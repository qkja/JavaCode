package bit.www.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-28
 * Time: 14:57
 */

public class TestDemo {
    public static void main(String[] args) {

    }

    
    public static void main1(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(4);
        binarySearchTree.insert(0);
        binarySearchTree.insert(-1);
        binarySearchTree.insert(-3);
        binarySearchTree.print();
        if(binarySearchTree.search(-9)){
            System.out.println("jajjaj");
        }
        //Node root = null;
        //binarySearchTree.insert(root,1);
//        if(root == null) {
//            System.out.println("hehe");
//        }
        //binarySearchTree.print(root);
    }
}
