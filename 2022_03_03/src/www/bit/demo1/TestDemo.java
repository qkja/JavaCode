package www.bit.demo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-03
 * Time: 12:35
 */
public class TestDemo {
}


//双端 循环 队列
class MyCircularDeque {
    private int[] elem;
    private int head;
    private int tail;
    private int size = 0;
    public MyCircularDeque(int k) {
        this.elem = new int[k];
        this.head = 0;
        this.tail = 0;
        this.size = k;
    }

    public boolean insertFront(int value) {
        //将一个元素添加到双端队列头部
        if(isFull()) {
            return false;
        }
        int j = this.tail - 1;
        for(;j>=0;j--) {
            this.elem[j+1] = this.elem[j];
        }
        this.elem[0] = value;
        this.tail++;
        return true;
    }

    public boolean insertLast(int value) {
        //将一个元素添加到双端队列尾部
        if(isFull()) {
            return false;
        }
        this.elem[this.tail++] = value;
        return true;
    }

    public boolean deleteFront() {
        //从双端队列头部删除一个元素
        if(isEmpty()) {
            return false;
        }
        this.tail --;
        for (int i = 0; i <this.tail ; i++) {
            this.elem[i] = this.elem[i+1];
        }
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()) {
            return false;
        }
        this.tail--;
        return true;
    }

    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }

    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[this.tail-1];
    }

    public boolean isEmpty() {
        return this.tail == 0;
    }

    public boolean isFull() {
        return this.tail == this.size;
    }
}







class RecentCounter {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public RecentCounter() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    public int ping(int t) {
        if(q1.isEmpty()&&q2.isEmpty()) {
            q1.add(t);
            return q1.size();
        }
        if(!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                int ret = q1.poll();
                if(ret>=t-3000) {
                    q2.add(ret);
                }
            }
            q2.add(t);
            return q2.size();
        }
        if(!q2.isEmpty()) {
            while (!q2.isEmpty()) {
                int ret = q2.poll();
                if(ret>=t-3000) {
                    q1.add(ret);
                }
            }
            q1.add(t);
            return q1.size();
        }
        return -1;
    }
}

class CatDogAsylum {

    public void func(int[] arr,int head,int y) {
        if (y==0) {
            return;
        }
        for (int i = y; i >head ; i--) {
            arr[i] = arr[i-1];
        }
    }
    public ArrayList<Integer> asylum(int[][] ope) {
        if(ope ==null||ope.length==0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] elem = new int[ope.length];
        int head = 0;
        int tail = 0;

        for(int i =0;i<ope.length;i++) {
            if(ope[i][0]==1) {
                //add
                elem[tail++] = ope[i][1];
            } else if(ope[i][0]==2) {
                //删除
                if (tail == 0) {
                    throw new RuntimeException("空栈");
                }

                if(ope[i][1] == 0) {
                    int ret = elem[head];
                    arrayList.add(ret);
                    head++;
                } else if (ope[i][1] == 1) {

                    int j = 0;
                    for (j =head; j < tail; j++) {
                        if(elem[j]>0) {
                            int ret = elem[j];
                            arrayList.add(ret);
                            //  从  head  将其覆盖
                            func(elem,head,j);
                            head++;
                            break;
                        }
                    }
                    if(j==tail) {
                        throw new RuntimeException("空栈");
                    }
                } else if (ope[i][1]==-1) {

                    int j = 0;
                    for (j =head; j < tail; j++) {
                        if(elem[j] < 0) {
                            int ret = elem[j];
                            arrayList.add(ret);
                            //  从  head  将其覆盖
                            func(elem,head,j);
                            head++;
                            break;
                        }
                    }
                    if(j==tail) {
                        throw new RuntimeException("空栈");
                    }
                }
            }
        }
        // write code here
        return arrayList;
    }
}
