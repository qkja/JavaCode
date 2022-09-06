import java.util.LinkedList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-26
 * Time: 10:20
 */
//class A {
//    private int a;
//    public int b;
//    public A(int b) {
//
//        this.b = b;
//    }
//}
//
//class B extends A {
//    public B(int b) {
//        super(b);
//        this.b = b;
//    }
//}


public class TestDemo {


    public static void main4(String[] args) {

        int[] arr = {1,2};
        int ret = arr.length;
        String str = "-123";
        int a = new Integer(str);
        a = a + 10;
        System.out.println(a);
//        Integer a = new Integer(str);
//        int d = a.parseInt(str);
//        a = a +1;
//
//        System.out.println(a);
//        System.out.println(d);

//        String str = "-";
//        System.out.println(str.equals("-"));
    }










    public static void main3(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.isEmpty());
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
       // System.out.println(myQueue.poll());

        //System.out.println(myQueue.isEmpty());
    }
    public static void main2(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

    }

    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int a = 4;
        stack.push(a);

        System.out.println(a);
    }
}

class StockSpanner {

    private Stack<Integer> prices;
    private Stack<Integer> day;
    public StockSpanner() {
        this.prices = new Stack<>();
        this.day = new Stack<>();
    }

    public int next(int price) {
        int w = 1;
        while (!this.prices.empty() && this.day.peek() <= price) {
            this.prices.pop();
            w += this.day.pop();
        }
        this.prices.push(price);
        this.day.push(w);
        return w;
    }
}
