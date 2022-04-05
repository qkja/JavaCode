import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-05
 * Time: 20:35
 */
public class TestHeap {
    public int[] elem;
    public int usedSize;
    public TestHeap() {
        this.elem = new int[10];
    }
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }
    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }
    public void pop() {
        if(isEmpty()) {
            return;
        }
        // 交换
        int ret = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = ret;
        this.usedSize--;
        adjustDown(0,this.usedSize);

    }
    public void push(int val) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        this.elem[this.usedSize++] = val;
        adjustUp(this.usedSize - 1);
    }
    public void adjustUp(int child) {
        int parent = (child-1) / 2;
        while (child > 0) {

            if(this.elem[child] > this.elem[parent]) {
                int ret = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = ret;
            } else {
                break;
            }
            child = parent;
            parent = (child-1) / 2;
        }
    }
    public void adjustDown(int root,int len) {
        int parent = root;
        int child = 2 * root + 1;
        while(child < len) {
            //寻找 最大值
            if(child + 1 <len && this.elem[child+1] > this.elem[child]) {
                child++;
            }
            //判断 父 和  子

            if(this.elem[parent] < this.elem[child]) {
                int ret = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = ret;
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public void createHeap(int[] array) {
        if(array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }

        for (int parent = (array.length-2)/2; parent >= 0 ; parent--) {
            adjustDown(parent,this.usedSize);
        }
    }
}
