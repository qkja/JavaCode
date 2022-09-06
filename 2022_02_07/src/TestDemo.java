/**
 * Created with IntelliJ IDEA.
 * Description:  多态
 * User: Qkj
 * Date: 2022-02-07
 * Time: 19:32
 */

//class Animal {
//    public int b;
//    public String name;
//    public Animal(String name,int a) {
//        this.name = name;
//    }
//    public Animal(String name) {
//        this.name = name;;
//    }
//    public void eat() {
//        System.out.println("eat");
//    }
//}
//
//class Cat extends Animal {
//
//    public int a;
//    public Cat (String name) {
//        super(name);
//    }
//    public Cat (String name,int a) {
//        super(name);
//    }
//    public void eat() {
//        System.out.println("eat2");
//    }
//}
class Shape {

    public void draw() {
       // System.out.println("11");
    }
}
class Cycle extends Shape {
    @Override  //注解
    public void draw() {
        System.out.println("画一个圆");
    }
}

class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
//类的实现者

//类的调用者
public class TestDemo {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);  //这个是打印出会自动 换行
        System.out.println(b);
        System.out.print(a);    //这个不会换行
    }

    public static void main(String[] args) {

        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        Shape shape3 = new Shape();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
//        shape1.draw();
//        shape2.draw();
    }

    public static void main1(String[] args) {

        //向上转型  父类引用子类对象  只能调用父类自己的东西

        //Animal animal = new Cat("qkj");
        //动态绑定  当子类当中出现和父类相同的方法时，结果是子类  编译时调用的是父类的方法   运行时出现多态
        //animal.eat();
        //animal.a = 10;
        //javap -c
    }
}
