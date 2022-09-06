import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-26
 * Time: 10:36
 */
public class MyStack {
    protected int[] elem;
    protected int top;
    public  MyStack() {
        this.elem = new int[10];
    }
    public boolean isFull() {

        if(this.top == this.elem.length) {
           return true;
        }
        return false;
    }

    /**
     * 入栈
     * @param val
     */
    public void push(int val) {
        //满
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length * 2);
        }
        //this.top++;
        //不满
        this.elem[this.top++] = val;
    }
}
//class A<T> {
//    protected T[] elem;
//    protected int top;
//    public A() {
//        this.elem = (T[])(new Object[10]);
//    }
//}
