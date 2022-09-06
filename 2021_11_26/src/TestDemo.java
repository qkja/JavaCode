/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-11-26
 * Time: 8:24
 */

class  Person {

    private String name;
    private int age = 18;

    public void sleep() {

        System.out.println("我叫" + name + ", 今年" + age + "岁了。");
    }

    public static void eat() {

        System.out.println("eat");
    }

    private void printName(String name) {

        this.name = name;
    }

    public void setName(String name) {

        printName(name);
    }


}

public class TestDemo {

    public static void main(String[] args) {

        Person per = new Person();


        per.setName("张三");
        per.sleep();
//        per.age = 18;
//        per.name = "张三";
//        per.sleep();
//        per.eat();
    }
}
