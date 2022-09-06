package demo.bit.www;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-12-24
 * Time: 11:08
 */

//class Person {
//    public String name;
//
//    public void setName(String name) {
//        name = name;
//    }
//    public void sleep() {
//        System.out.println(this.name + " sleep()");
//    }
//
//}

//class Person {
//    public String name;
//
//    public void sleep() {
//        this.eat();
//        System.out.println(this.name + " sleep()");
//    }
//
//    public void eat() {
//        System.out.println("eat()");
//    }
//}

class Person {
    public String name;
    public int age;
    public Person() {
        this.sleep();
    }
    public Person(int age) {

        this();
        this.age = age;
    }
    public Person(String name) {
        this(11);
        this.name = name;
    }
    public void sleep() {
        System.out.println("sleep()");
    }
}

public class TestDemo2 {

    public static void main(String[] args) {
        Person per = new Person(18);
    }
}
