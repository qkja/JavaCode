package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:  理解多态
 * User: Qkj
 * Date: 2022-02-21
 * Time: 14:23
 */
class Animal {
    public String name;
    public void eat() {
        System.out.println(this.name + "正在吃    Animal");
    }
}
class Cat extends Animal {
    public void eat() {
        System.out.println(this.name + "正在吃   Cat");
    }
}



public class TestDemo {

    public static void main(String[] args) {

    }
    public static void main1(String[] args) {
        Animal animal = new Cat();
        animal.name = "一";
        animal.eat();
    }
}
