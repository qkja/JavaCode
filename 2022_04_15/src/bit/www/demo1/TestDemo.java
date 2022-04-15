package bit.www.demo1;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-15
 * Time: 20:54
 */
public class TestDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(0);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(4);
        priorityQueue.add(5);
        while(!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll()+" ");
        }
    }
}
