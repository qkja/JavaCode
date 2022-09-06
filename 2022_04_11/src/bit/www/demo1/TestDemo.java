package bit.www.demo1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description: 三个接口
 * User: Qkj
 * Date: 2022-04-11
 * Time: 16:27
 */
//class Student implements Comparable<Student>{
//
//
//    public String name;
//    public int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
//}

//class AgeComparator implements Comparator<Student>{
//
//    @Override
//    public int compare(Student o1, Student o2) {
//      return o1.age - o2.age;
//    }
//}
//class Student{
//
//
//    public String name;
//    public int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//public class TestDemo {
//    public static void main(String[] args) {
//     Student[] students = new Student[3];
//     students[0] = new Student("a",18);
//     students[1] = new Student("b",10);
//     students[2] = new Student("c",108);
//        System.out.println(Arrays.toString(students));
//        AgeComparator ageComparator = new AgeComparator();
//        Arrays.sort(students,ageComparator);
//        System.out.println(Arrays.toString(students));
//
//        //System.out.println(students[0].compareTo(students[1]));
//    }
//}
