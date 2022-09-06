package www.bit.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-04
 * Time: 16:28
 */

public class MyStack {

    public int tail; // 标记尾
    public int[] elem;
    public MyStack() {
        this.elem = new int[10]; // 开辟 10 个整型 的空间
        this.tail = 0;
    }
    private boolean isFull() {
        return this.tail == this.elem.length; //判断是不是满了
    }
    public void push(int val) {
        if(isFull()) {
            return; //我们就不扩容了
        }
        this.elem[this.tail++] = val;
    }

    public boolean empty() {
        return this.tail == 0;
    }
    public int pop() {
        if(empty()) {
            throw new RuntimeException("空栈");
        }
        return this.elem[--this.tail];
    }

    public int peek() {
        if(empty()) {
            throw new RuntimeException("空栈");
        }
        return this.elem[this.tail-1];
    }
}
