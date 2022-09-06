/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-12-21
 * Time: 20:56
 */
class Animals {
    private int a;
    public String name;
    public void eat() {
        System.out.println(this.name + " eat()");
    }
}

class Cat extends Animals {
    public int b;
    //public String name;
//    public Cat(String name) {
//        super();
//        //super.name;
//    }

}

public class TestDemo {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "mimi";
        cat.eat();
    }
}
