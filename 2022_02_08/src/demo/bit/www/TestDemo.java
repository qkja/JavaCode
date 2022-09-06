package demo.bit.www;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:  接口的应用
 * User: Qkj
 * Date: 2022-02-08
 * Time: 18:55
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;

    public Student(String name,int age,double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.age>o.age) {
            return 1;
        }else if (this.age==o.age) {
            return 0;
        }else {
            return -1;
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("gao",19,99.00);
        Student student2 = new Student("gao",18,89.00);
        Student student3 = new Student("gao",16,72.00);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

//        if(student1.compareTo(student2)<0) {
//            System.out.println("student1的年龄 < student2的年龄");
//        }
    }
}
