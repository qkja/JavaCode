package www.bit.demo3;

import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:  循环队列
 * User: Qkj
 * Date: 2022-02-27
 * Time: 15:05
 */
public class TestDemo {
    public static void main(String[] args) {
        Queue<Integer> a;
    }
}
class MyCircularQueue {
    private int[] elem;
    private int front;
    private int rear;
    public MyCircularQueue(int k) {
        this.elem = new int[k + 1];
        this.front = 0;
        this.rear = 0;
    }

    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear+1) % this.elem.length;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        this.front = (this.front+1)%this.elem.length;
        return true;
    }

    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }

    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        int x = (this.rear==0)? (this.elem.length-1):(this.rear-1);
        return this.elem[x];
    }

    public boolean isEmpty() {
        return this.rear==this.front;
    }

    public boolean isFull() {
        if((this.rear+1)%this.elem.length == this.front) {
            return true;
        }
        return false;
    }
}

