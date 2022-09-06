package bit.www.demo4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-21
 * Time: 19:10
 */
//class Student implements Comparable<Student>{
//    private String name;
//    private int age;
//    private String id;
//
//    public Student(String name, int age, String id) {
//        this.name = name;
//        this.age = age;
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", id='" + id + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//        //return this.age - o.age;
//    }
//}

//class Student{
//    private String name;
//    private int age;
//    private String id;
//
//    public Student(String name, int age, String id) {
//        this.name = name;
//        this.age = age;
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", id='" + id + '\'' +
//                '}';
//    }
//
//}

//class AgeComparator implements Comparator<Student> {
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.getAge() - o2.getAge();
//    }
//}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        Student[] students = new Student[3];
////        students[0] = new Student("A",18,"09154");
////        students[1] = new Student("B",19,"09155");
////        students[2] = new Student("C",10,"09159");
//        students[0] = new Student("张三",18,"09154");
//        students[1] = new Student("李四",19,"09155");
//        students[2] = new Student("王五",10,"09159");
//        Arrays.sort(students,new AgeComparator());
//        //int[] arr = new int[10];
//        //AgeComparator ageComparator = new AgeComparator();
//        //Arrays.sort(arr,a);
//        System.out.println(Arrays.toString(students));
//    }
//}


class Student implements Cloneable{
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student = new Student("张三",18,"09154");
        Student student1 = null;
        try {
            student1 = (Student) student.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(student1);
    }
}
