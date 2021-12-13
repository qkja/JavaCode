/**
 * Created with IntelliJ IDEA.
 * Description:
 *       单链表
 * User: Qkj
 * Date: 2021-12-12
 * Time: 16:24
 */
public class TestDemo {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(5);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(2);
        myLinkedList.display();
        myLinkedList.removeAllKey(5);
        myLinkedList.display();
//        myLinkedList.display();

//        myLinkedList.remove(1);
//        myLinkedList.display();
//        myLinkedList.remove(3);
//        myLinkedList.display();
//        myLinkedList.remove(4);
//        myLinkedList.display();
//        myLinkedList.remove(5);
//        myLinkedList.display();
//        myLinkedList.clear();
//        myLinkedList.display();
//        System.out.println(myLinkedList.contains(3));
//        System.out.println(myLinkedList.contains(1));
//        System.out.println(myLinkedList.contains(2));
//        System.out.println(myLinkedList.contains(0));
//        for (int i = 0; i < 10; i++) {
//            myLinkedList.addFirst(i);
//        }
//        myLinkedList.display();
//        System.out.println(myLinkedList.size());
//        myLinkedList.addLast(-1);
//        myLinkedList.display();
//        System.out.println(myLinkedList.size());
//        myLinkedList.addFirst(0);
    }
}
