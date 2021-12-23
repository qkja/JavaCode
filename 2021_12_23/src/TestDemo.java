/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-12-23
 * Time: 22:25
 */

class Animal {
    public String name;

    private void eat() {
        System.out.println(this.name + " eat()");
    }
    public void sleep() {
        System.out.println(this.name + " sleep()");
    }
}

class Cat extends Animal {
    public String name;
    public void sleep() {
        System.out.println("sleep()!!!");
    }
}

public class TestDemo {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "mimi";
        cat.sleep();
    }
}

class Bird  extends Animal{

}


//class Cat extends Animal {
//    public String name;
//
//    public void eat() {
//        System.out.println(this.name + "eat()");
//    }
//    public void sleep() {
//        System.out.println(this.name + "sleep()");
//    }
//}

//class Bird {
//    public String name;
//
//    public void eat() {
//        System.out.println(this.name + "eat()");
//    }
//    public void sleep() {
//        System.out.println(this.name + "sleep()");
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//
//    }
//}
