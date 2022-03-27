package com.bit.demo1;

//import  java.sql.Date;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-27
 * Time: 9:57
 */
class Animal {
    public String name;
    public int age;
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
class Bird extends Animal {
    public int a = 10;

    public Bird(String name, int age) {
        super(name, age);
    }
    public void fly() {
        System.out.println("我叫" + this.name + "，正在飞");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Animal animal = new Bird("feie",18);
        Bird bird = (Bird) animal;
        bird.fly();
    }
}
//class A {
//    public int n = 0;
//}
//class B extends A {
//    public int n = 1;
//}
//public class TestDemo {
//    public static void main(String[] args) {
//        A a = new A();
//        System.out.println(a.n);
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        Animal animal = new Dog("hehe",19);
//        //animal.a = 100;
//    }
//}
//public class TestDemo {
//    public static void main(String[] args) {
//        Animal animal = new Dog("hehe",18);
//        animal.a = 100;
//
//        //animal.eat();
//    }
//}

//public class TestDemo {
//    public static Animal func(Animal ani) {
//        Dog dog = new Dog();
//        return dog;
//    }
//    public static void main(String[] args) {
//        //Animal animal = new Dog();
//        Dog dog = new Dog();
//        func(dog);
//    }
//}

//class X {
//    Y y=new Y();
//    public X(){
//        System.out.print("X");
//    }
//}
//class Y {
//    public Y() {
//        System.out.print("Y");
//    }
//}
//public class com.bit.demo1.TestDemo extends X {
//    Y y = new Y();
//    public com.bit.demo1.TestDemo() {
//        System.out.print("Z");
//    }
//    public static void main(String[] args) {
//        new com.bit.demo1.TestDemo();
//    }
//}

//class T {
//    T() {
//        System.out.println("aaaaaa");
//    }
//}

//public class com.bit.demo1.TestDemo extends T {
//    T t= new T();
//
//    public static void main(String[] args) {
////        System.out.println("qqqqqqq");
////      new T();
////      new T();
//    }
//}
//class A {
//
////    public A() {
////
////    }
//
//    public A(int val) {
//
//    }
//    public int a;
//}
//
//class B extends A {
////    public B() {
////        super(1);
////    }
//    public B(int val) {
//        super(val);
//    }
//    public void gunc() {
//        super.a = 10;
//    }
//}
//
//class Teacher {
//
//}
//class Student {
//
//}
//class School {
//    public Teacher[] teachers;
//    public Student[] students;
//}

//public class com.bit.demo1.TestDemo {
//    public int a;
//    public static void main(String[] args) {
//        //this.a = 10;
//        //java.util.Date date1 = new java.util.Date();
//        //java.sql.Date data2 = new  java.sql.Date();
//    }
//
////    public static void main(String[] args) {
////        int[] arr = {1,2,3,4};
////        System.out.println(Arrays.toString(arr));
////    }
//}
//class Test {
//
//    public  int age;
//    {
//        System.out.println("这是一个 实例代码块 ！！！");
//    }
//    static {
//        System.out.println("这是一个静态代码块 ！！！！");
//    }
//
//    public Test() {
//        System.out.println("这是一个构造方法！！");
//    }
//}
//public class com.bit.demo1.TestDemo {
//    public static void main(String[] args) {
//        Test test1 = new Test();
//        System.out.println("================");
//        Test test2 = new Test();
//    }
//}

//class Person{
//
//    private String name = "Person";
//
//    int age=0;
//
//}
//
//public class com.bit.demo1.TestDemo extends Person{
//
//
////    static int cnt = 6;
////    static{
////        cnt += 9;
////    }
////    public static void main(String[] args）{
////        System.out.println（“cnt =” + cnt);
////    }
////    static{
////        cnt /=3;
////    };
//
////    public String grade;
////
////    public static void main(String[] args){
////
////        Person p = new com.bit.demo1.TestDemo();
////
////        System.out.println(p.name);
////
////    }
//
//}
