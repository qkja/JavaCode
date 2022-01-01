import java.awt.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-12-31
 * Time: 22:15
 */

class People {
    protected String name;
    protected String id;
    protected int age;
    private String sex;
}

final class Course {
    public String courseName;
    public int a; //星期几
    public String time;
    public Course next;
    public Course(String courseName,int a,String time) {
        this.courseName = courseName;
        this.a = a;
        this.time = time;
        this.next = null;
    }
}

class Student extends People {

    public double score;
    public String classroom;
    public Course head;
    public Student next;
    //    public Student(int a) {
//        int b = 10;
//    }
    private boolean juRep(Course course){

        Course cur = this.head;
        while(cur!=null) {
            if(cur.a == course.a){
                if(cur.time.equals(course.time)) {
                    return true;
                }
            }
            cur = cur.next;
        }
        return false;
    }
    //选课 尾插
    public void elective(String courseName,int a,String time) {
        Course course = new Course(courseName,a,time);
        //第一次插入
        if(this.head==null) {
            this.head = course;
            return;
        }
        //看自己的的课时间是否重复了
        if(juRep(course)) {
            //System.out.println("这个课时间被占用，请重新选择");
            return;
        }
        Course cur = this.head;
        while(cur.next!=null) {
            cur = cur.next;
        }
        cur.next = course;
    }
    //取消课

    //看课的数量
    public int numCourse(){
//        if(this.head==null){
//            return 0;
//        }
        int count = 0;
        Course cur = this.head;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        return count;
    }
    //打印课表
    public void displayCourse(){
        System.out.println("学生名字：" + name);
        System.out.println("学号：" + id);

        if(this.head==null){
            System.out.println("没有课");
            return;
        }
        Course cur = this.head;
        while(cur!=null){
            System.out.print("课程名：" + cur.courseName + " 星期" + cur.a + ": " + cur.time);

            System.out.println();
            //System.out.println("星期：" + cur.a);
            cur = cur.next;
        }
    }
}

class Teacher extends People {

    public Student head;
    Scanner scan = new Scanner(System.in);

    //将自己的学生的信息存储下来
    public void addStudent(String name,String id) {
        Student stu = new Student();
        stu.name = name;
        stu.id = id;
        if(this.head==null) {
            this.head = stu;
            return;
        }

        Student cur = this.head;
        while(cur.next!=null) {
            cur = cur.next;
        }
        cur.next = stu;
    }
    //录成绩 -全部
    public void RecordCore() {
        if(this.head==null) {
            System.out.println("没有学生");
            return;
        }

        Student cur = this.head;
        while(cur!=null) {
            System.out.print("学号：" + cur.id +  " 姓名：" + cur.name);
            double score= scan.nextDouble();
            cur.score = score;
            cur = cur.next;
        }
    }
    //录成绩 -一个人
    //查找学生
    public void searchStudent(String id) {
        if(this.head==null) {
            System.out.println("你还没有学生");
            return;
        }
        Student cur = this.head;
        while(cur!=null) {
            if(cur.id.equals(id)) { //判断
                System.out.println("找到了");
                return;
            }
            cur = cur.next;
        }
        System.out.println("没有这个学生");
    }
    //打印学生名单
    public void displayStudent() {
        if(this.head==null){
            System.out.println("没有学生");
            return;
        }
        Student cur = this.head;
        while(cur!=null){
            System.out.print("学号：" + cur.id +  " 姓名：" + cur.name +" " + cur.score);

            System.out.println();
            cur = cur.next;
        }
    }

    //计算平均成绩
    public double averageScore() {
        double sum = 0.0;
        if(this.head==null) {
            System.out.println("你还没有学生");
            return 0.0;
        }
        Student cur = this.head;
        int count = 0;
        while(cur!=null) {
            sum+=cur.score;
            cur = cur.next;
            count++;
        }
        return sum/count;
    }
}

public class TestDemo2 {

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "张三";
        student.id = "123456";
        student.elective("数学",1,"11:30");
        student.elective("数学",1,"11:30");
        //student.elective("数学",1,"11:50");
        student.displayCourse();






        Teacher teacher = new Teacher();
        teacher.name = "李四";
        teacher.addStudent("张三","0123456");
        teacher.searchStudent("0122");
        teacher.searchStudent("0123456");
//        teacher.addStudent("张三","0123456");
//        teacher.addStudent("张三","0123456");
//        teacher.addStudent("张三","0123456");

        teacher.RecordCore();
       teacher.displayStudent();
//        Student stu = new Student();
//        stu.name = "张三";
//        stu.id = "123456";
//
//        stu.elective("数学",2,"11:10");
//        stu.elective("数学",2,"11:10");
////        stu.elective("数学",2);
////        stu.elective("数学",2);
//        stu.displayCourse();
//        System.out.println(stu.numCourse());

    }
}
