package www.bit.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-04
 * Time: 16:57
 */
//public class TestDemo {
//
//    public static void main1(String[] args) {
//        MyStack myStack = new MyStack();
//        System.out.println(myStack.empty()); //空栈
//        myStack.push(1);
//        System.out.println(myStack.peek());
//        System.out.println(myStack.empty());
//        myStack.push(2);
//        System.out.println(myStack.peek());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.empty());
//
//    }
//}

public class TestDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        System.out.println(myQueue.peek());
        myQueue.add(2);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }
}
