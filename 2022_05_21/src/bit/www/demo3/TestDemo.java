package bit.www.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-21
 * Time: 17:41
 */
//class Animal {
//    protected String name;
//    protected int age;
//    public void fly() {};
//    public void func() {
//        fly();
//    }
//}
//
//class Cat extends Animal {
//    public Cat(String name,int age) {
//        //super();
//        this.name = name;
//        this.age = age;
//    }
//    private void fly() {
//        System.out.println(this.name + " can fly");
//    }
//}

//public class TestDemo {
//
//    public static void main(String[] args) {
//        Animal cat = new Cat("qkj",18);
//        cat.fly();
//    }
//
//    public static void main1(String[] args) {
//        Cat cat = new Cat("qkj",18);
//        //cat.fly();
//    }
//}
abstract class A {
    public int age;
    public abstract void func();

    public void func2() {
        System.out.println("学习");
    }
}

class B extends A {
    public int ret = 3;
    @Override
    public void func() {
        System.out.println("学习");
    }
}
interface C {
    void func1();
    int a = 10;
}

public class TestDemo {
    public static void main(String[] args) {
        A b = new B();
        b.func();
    }
    //A a = new A();
}
