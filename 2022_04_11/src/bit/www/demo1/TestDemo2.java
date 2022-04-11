package bit.www.demo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-11
 * Time: 20:07
 */
class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}
class LinkComparator implements Comparator<List<Integer>> {

    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
       int ret1 = o1.get(0) + o1.get(1);
       int ret2 = o2.get(0) + o2.get(1);
       return ret2 - ret1;
    }
}
public class TestDemo2 {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list1 = new ArrayList<>();
        if(nums1 == null || nums2 == null || k == 0) {
            return list1;
        }
        PriorityQueue<List<Integer>> priorityQueue = new PriorityQueue<>(k, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int ret1 = o1.get(0) + o1.get(1);
                int ret2 = o2.get(0) + o2.get(1);
                return ret2 - ret1;
            }
        });

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> list = new ArrayList<>();
                list.add(nums1[i]);
                list.add(nums2[j]);

                if(priorityQueue.size() < k) {
                    priorityQueue.offer(list);
                } else {
                    int ret1 = nums1[i] + nums2[j];
                    List<Integer> l = priorityQueue.peek();
                    int ret2 = l.get(0) + l.get(1);
                    if(ret1 < ret2) {
                        priorityQueue.poll();
                        priorityQueue.offer(list);
                    }
                }
            }
        }
        while (!priorityQueue.isEmpty()) {
            list1.add(priorityQueue.poll());
        }
        return list1;
    }
    public static void main1(String[] args) {
        //PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer('1');
        priorityQueue.offer('2');
        priorityQueue.offer('3');
        System.out.println(priorityQueue);



    }
    public static void main2(String[] args) {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(new AgeComparator());
        priorityQueue.offer(new Person("bit",111));
        priorityQueue.offer(new Person("bit",10));
        System.out.println(priorityQueue);
    }
}
