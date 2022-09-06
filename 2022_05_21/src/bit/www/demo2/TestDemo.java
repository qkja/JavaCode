package bit.www.demo2;
//import javafx.scene.Node;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-21
 * Time: 17:03
 */
//class Base {
//    public int a;
//    public int b;
//}
//
//class Derive extends Base {
//    public int b = 2;
//    public void func() {
//        System.out.println(this.a);
//        System.out.println(this.b);
//    }
//}
//public class TestDemo {
//    public static void main(String[] args) {
//
//        Derive derive = new Derive();
//        derive.func();
//        //Node node
//    }
//}

//public class TestDemo extends bit.www.demo1.TestDemo {
//    public static void main(String[] args) {
//        //Node node
//    }
//}

class Animal {
    public String name;

    public Animal(String name) {

        this.name = name;
        System.out.println("先构造  父类");
    }
}

class Cat extends Animal {
    public String name;

    public Cat(String name) {
        super(name);
        System.out.println("在构造  子类");
    }
    public void func() {
        System.out.println(super.name);
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Cat cat  = new Cat("akj");
        cat.func();
    }
}
