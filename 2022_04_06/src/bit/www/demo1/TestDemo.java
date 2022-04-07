package bit.www.demo1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-06
 * Time: 11:15
 */

class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "bit.www.demo1.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
public class TestDemo {

    /**
     * 三个接口
     * @param args
     */
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("a" ,1);
        students[1] = new Student("b" ,10);
        students[2] = new Student("c" ,18);
        //students.
        System.out.println(Arrays.toString(students));
    }
}
