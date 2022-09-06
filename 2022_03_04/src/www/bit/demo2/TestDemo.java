package www.bit.demo2;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-04
 * Time: 16:07
 */

public class TestDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(3);
        System.out.println(stack.peek());
    }


    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
