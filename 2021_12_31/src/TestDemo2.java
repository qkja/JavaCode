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
}

final class Course {
    public String courseName;
    public int a;
    public Course next;
    public Course(String courseName,int a) {
        this.courseName = courseName;
        this.a = a;
        this.next = null;
    }
}

class Student extends People {

    public Course head;

    //选课 尾插
    public void elective(String courseName,int a) {
        Course course = new Course(courseName,a);
        //第一次插入
        if(this.head==null) {
            this.head = course;
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
            System.out.println("课程名：" + cur.courseName);
            System.out.println("星期：" + cur.a);
            cur = cur.next;
        }
    }
}

class Teacher extends People {

}

public class TestDemo2 {

    public static void main(String[] args) {

        Student stu = new Student();
        stu.name = "张三";
        stu.id = "123456";

        stu.elective("数学",2);
        stu.elective("数学",2);
        stu.elective("数学",2);
        stu.displayCourse();
        System.out.println(stu.numCourse());

    }
}
