package www.bit.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-21
 * Time: 17:58
 */
interface Shape {
    public abstract void draw();
    public abstract void draw2();
    default void draw3() {
        System.out.println("hhehehe");
    }
}

class A implements Shape {
    @Override
    public void draw() {
        System.out.println("1");
    }

    @Override
    public void draw2() {
        System.out.println("2");
    }

//    @Override
//    public void draw3() {
//        Shape.super.draw3();
//    }
}

public class TestInterface {
    public static void main(String[] args) {
        Shape shape = new A();
        shape.draw3();
        shape.draw();
        shape.draw2();
    }
}
