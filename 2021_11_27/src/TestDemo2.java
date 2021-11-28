/**
 * Created with IntelliJ IDEA.
 * Description:
 *访问修饰限定符
 *      public：   共有的
 *      private:   受保护的
 *      什么都不写： 默认权限  ->   包访问权限
 * User: Qkj
 * Date: 2021-11-27
 * Time: 19:28
 */

import java.util.Scanner;
class Person {     //大驼峰

    //字段    -->    成员变量           定义在方法外面类的里面

    //实例成员变量   在对象里面
    public String name;     //允许赋值
    public int age;

    //静态成员变量
    public static int size = 10; //在对象外面

    //方法    -->    行为

    //实例成员方法
    public void eat() {

        size = 15;
        int a = 10;     //局部变量   在栈上
        System.out.println("eat!!!");
    }

    public void show() {

        System.out.println("我叫" + name + ", 今年" + age + "岁了!!!");
    }

    //静态成员方法
    public static void sleep() {

        size = 20;
        System.out.println("sleep!!!");
    }

}

class Student {

    //无特殊要求   设置私有的
    private String Myname;
    private int age;
    //提供一个接口


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getMyname() {

        return Myname;
    }

    public void setMyname(String Myname) {

        this.Myname = Myname;  //局部变量优先  this  关键字  当前对象的引用
    }
    public void fun1() {

        System.out.println("fun1");
    }


    @Override    //注解  这个方法是重写的
    public String toString() {
        return "Student{" +
                "Myname='" + Myname + '\'' +
                ", age=" + age +
                '}';
    }

    public void show() {

        System.out.println("我叫" + this.Myname + ", 今年" + this.age + "岁了!!!");
    }


}

public class TestDemo2 {

    /**
     * 封装  用private 来自修饰
     * @param args
     */




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = new String[100];
        String arr = null;
        int i = 0;
        while((arr=scan.nextLine()) ){

            str[i] = arr;
            i++;
        }
        arr = null;
        for(i--;i>=0;i--) {

            arr+=str[i];
        }
        System.out.println(arr);



    }




























    public static void main3(String[] args) {

        Student stu = new Student();

        stu.setMyname("曲康杰");
        stu.setAge(11);
        System.out.println(stu.getMyname());
        System.out.println(stu.getAge());

        stu.show();
        System.out.println(stu.toString());
//        stu.name = "曲康杰";

    }










    public static void main2(String[] args) {

        Person per = new Person();
        System.out.println(Person.size);

        per.eat();
        System.out.println(Person.size);
        Person.sleep();
        System.out.println(Person.size);

       // per.show();
    }
    /**
     * 对象
     * @param args
     */
    public static void main1(String[] args) {



        //实例化一个对象
        Person per = new Person();

        //一个类可以实例化多个变量
        Person per1 = new Person();
        Person per2 = new Person();
        Person per3 = new Person();

        //如何访问对象的实例成员变量

        System.out.println(per.name);
        System.out.println(per.age);


        System.out.println(Person.size);//警告    静态存在    方法区
        Person.size = 10;

        System.out.println(Person.size);

        //访问实例成员方法
        per.eat();
        per.show();

        //访问静态成员方法
        Person.sleep();

    }
}
