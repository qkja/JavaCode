package bit.www.demo1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-27
 * Time: 17:59
 */

class Student implements Comparable<Student>{
    public String name;
    public double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "bit.www.demo1.Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.score - o.score);
    }
}

class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.score - o2.score);
    }
}

public class TestDemo {
    public static void main2(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("张三",10);
        students[1] = new Student("李四",100);
        if(students[0].compareTo(students[1]) > 0) {
            System.out.println("hhh");
        }

    }
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三",100);
        students[1] = new Student("李四",10);
        students[2] = new Student("王五",1000.0);
        Arrays.sort(students,new ScoreComparator());
        //这个会调用  object 类的 toString
        System.out.println(Arrays.toString(students));
    }
}
