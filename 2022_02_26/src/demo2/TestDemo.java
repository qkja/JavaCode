package demo2;
import java.util.Stack;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-26
 * Time: 15:55
 */

class Solution {
    public int evalRPN(String[] tokens) {
        if( tokens.length==1) {
            return new Integer(tokens[0]);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i < tokens.length;) {
            while(!tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("+") && !tokens[i].equals("/")) {
                int ret = new Integer(tokens[i]);
                stack.push(ret);
                i++;
            }
            int right = stack.pop();
            int left = stack.pop();
            int help = 0;
            char ch = tokens[i].charAt(0);
            switch (ch) {
                case '-':
                    help = left - right;
                    break;
                case '+':
                    help = left + right;
                    break;
                case '*':
                    help = left * right;
                    break;
                case '/':
                    help = left / right;
                    break;
            }
//            if(tokens[i].equals("-")) {
//                help = left - right;
//            } else if(tokens[i].equals("+")) {
//                help = left + right;
//            } else if(tokens[i].equals("*")) {
//                help = left * right;
//            } else if(tokens[i].equals("/")) {
//                help = left / right;
//            }
            stack.push(help);
            i++;
        }
        return stack.pop();
    }
}

public class TestDemo {

    public static void main(String[] args) {
        int n = new Integer("11");
        System.out.println(n);
    }
    public static void main1(String[] args) {
        Solution solution = new Solution();
        String[] str = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int ret = solution.evalRPN(str);
        System.out.println(ret);
    }
}

class T {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if((pushA.length != popA.length) || (pushA.length == 0 || popA.length == 0)) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i = 0; i < pushA.length;i++) {
            stack.push(pushA[i]);

            while(!stack.empty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }
}
