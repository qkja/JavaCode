package bit.www.demo2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-15
 * Time: 21:04
 */
//class Student implements Comparable<Student>{
//    public int age;
//    public String name;
//
//    public Student(String name,int age) {
//        this.age = age;
//        this.name = name;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.age - o.age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}


class Student {
    public int age;
    public String name;

    public Student(String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new AgeComparator());
        Student[] students = new Student[2];
        students[0] = new Student("张三",19);
        students[1] = new Student("李四",10);
        priorityQueue.add(students[0]);
        priorityQueue.add(students[1]);
        System.out.println(priorityQueue);
    }
}
