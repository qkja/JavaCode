package demo.bit.www;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *    理解多态 一个引用得到多种形态
 * User: Qkj
 * Date: 2022-01-06
 * Time: 17:25
 */

class Shape{
   protected void draw() {
    }
}

class Cycle extends Shape{
    @Override //注解 重写
    protected void draw() {
        System.out.println("画一个圆");
    }
}

class React extends Shape{
    @Override //注解 重写
    protected void draw() {
        System.out.println("画一个矩形");
    }
}

public class TestDemo2 {
    public static void main(String[] args) {

//        Shape shape1 = new Cycle();
//        Shape shape2 = new React();
//        shape1.draw();
//        shape2.draw();
        Shape[] shapes = {new Cycle(),new React()};
        for(Shape shape:shapes) {
            shape.draw();
        }
    }
}
