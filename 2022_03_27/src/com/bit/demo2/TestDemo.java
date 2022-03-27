package com.bit.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-27
 * Time: 18:45
 */
class Shape {
    public void draw() {

    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("打印一个🔺");
    }
}
class Round extends Shape {
    @Override
    public void draw() {
        System.out.println("打印一个⚪");
    }
}

public class TestDemo {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {

        drawMap(new Triangle());
        drawMap(new Round());
//        Shape shape1 = new Triangle();
//        shape1.draw();
//
//        Shape shape2 = new Round();
//        shape2.draw();
    }
}
