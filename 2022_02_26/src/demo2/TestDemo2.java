package demo2;
import java.util.Stack;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-26
 * Time: 17:30
 */
public class TestDemo2 {
    public static void main(String[] args) {


        S s = new S();
        String[] str = {"5","2","C","D","+"};
        int ret = s.calPoints(str);
        System.out.println(ret);
    }
}


class S{
    public int calPoints(String[] ops) {
        if(ops.length == 0) {
            return -1;
        }
        Stack<Integer> s = new  Stack<>();
        for(int i=0;i<ops.length;i++) {

            if(ops[i].equals("+")) {

                int ret1 = s.pop(); //10
                int ret2 = s.pop(); //15
                s.push(ret2);
                s.push(ret1);
                s.push(ret2 + ret1);
            } else if(ops[i].equals("D")) {
                int ret1 = 2 * s.peek();
                s.push(ret1);

            } else if(ops[i].equals("C")) {
                s.pop();
            } else {
                int ret = new Integer(ops[i]);
                s.push(ret);
            }
        }
        int score = 0;
        while(!s.empty()) {
            score += s.pop();
        }
        return score;
    }
}
