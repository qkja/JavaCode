package www.bit.demo2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-27
 * Time: 10:47
 */
public class TestDemo {
    public static void main1(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("((" ));
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.empty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
}


class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        if(!q2.isEmpty()) {
            q2.add(x);
        } else {
            q1.add(x);
        }
    }

    public int pop() {

       int ret = -1;
       if(q1.isEmpty()) {

           while (!q2.isEmpty()) {
               ret = q2.poll();
               if(!q2.isEmpty()) {
                   q1.add(ret);
               }
           }
           return ret;
       }
       if(q2.isEmpty()) {
           while (!q1.isEmpty()) {
               ret = q1.poll();
               if(!q1.isEmpty()) {
                   q2.add(ret);
               }
           }
           return ret;
       }
       return -1;
    }

    public int top() {

        int ret = -1;
        if(q1.isEmpty()) {

            while (!q2.isEmpty()) {
                ret = q2.poll();
                q1.add(ret);
            }
            return ret;
        }
        if(q2.isEmpty()) {
            while (!q1.isEmpty()) {
                ret = q1.poll();
                q2.add(ret);
            }
            return ret;
        }
        return -1;
    }

    public boolean empty() {
       return q1.isEmpty()&&q2.isEmpty();
    }
}

//class MyStack {
//
//    private Queue<Integer> q1;
//    private Queue<Integer> q2;
//    public MyStack() {
//         q1 = new LinkedList<>();
//         q2 = new LinkedList<>();
//    }
//
//    public void push(int x) {
//        //
//        q1.add(x);
//        while (!q1.isEmpty()) {
//            int ret = q1.poll();
//            q2.add(ret);
//        }
//    }
//
//    public int pop() {
//        return q2.poll();
//    }
//
//    public int top() {
//        return q2.peek();
//    }
//
//    public boolean empty() {
//        return q2.isEmpty();
//    }
//}

class Solution {
    public boolean isValid(String s) {
        if (s==null||s.length()==0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char ret = stack.peek();
                if(ch==')'&&ret=='('||ch=='}'&&ret=='{'||ch==']'&&ret=='[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

//class Solution {
//    public boolean isValid(String s) {
//        if (s==null||s.length()==0) {
//            return false;
//        }
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//
//
////            if(stack.isEmpty() || stack.peek() != s.charAt(i)) {
////                stack.push(s.charAt(i));
////            } else {
////                stack.pop();
////            }
//        }
//        return stack.isEmpty();
//    }
//}

class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
       s1.push(x);
    }

    public int pop() {
        //移除
        if(empty()) {
            return -1;
        }
        int ret = -1;
        while (!s1.empty()) {
            ret = s1.pop();
            if(!s1.empty()) {
                s2.push(ret);
            }
        }
        int x = 0;
        while (!s2.empty()) {
            x = s2.pop();
            s1.push(x);
        }
        return ret;
    }

    public int peek() {
        //不移除
        if(empty()) {
            return -1;
        }
        int ret = -1;
        while (!s1.empty()) {
            ret = s1.pop();
            s2.push(ret);
        }
        int x = 0;
        while (!s2.empty()) {
            x = s2.pop();
            s1.push(x);
        }
        return ret;
    }

    public boolean empty() {
        return s1.empty();
    }
}
