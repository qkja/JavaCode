import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-05
 * Time: 21:22
 */
public class TestMain {

    /**
     * Java中的优先级队列
     * @param args
     */

    public static void main(String[] args) {
        //堆 默认大小  10
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //小堆还是大堆  --  小堆
        priorityQueue.add(1);
        priorityQueue.add(2);
        System.out.println(priorityQueue.peek());
    }

    /**
     * 自己定义 堆
     * @param args
     */
    public static void main1(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] arr =  { 27,15,19,18,28,34,65,49,25,37 };
        testHeap.createHeap(arr);
        System.out.println(Arrays.toString(testHeap.elem));
    }
}
