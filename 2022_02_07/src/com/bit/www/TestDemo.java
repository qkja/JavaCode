package com.bit.www;

/**
 * Created with IntelliJ IDEA.
 * Description:  接口  抽象类的更一步的抽象
 * User: Qkj
 * Date: 2022-02-07
 * Time: 21:15
 */

/**
 * 接口  (interface)
 * 接口当中的方法都是抽象方法
 * 可以有具体实现的方法   JDK　　１.８加入的  这个方法是被default修饰的
 * 成员变量默认是常量
 * 接口当中的成员变量默认是public static final 成员方法是public 不写也可以
 * 接口不可以被实例化的  但可以向上转型
 * 接口和类的关系 implements
 * 接口的出现是解决单继承的问题  可以实现多个接口
 */
interface Shape {

    void draw();
    void draw1();
//  public int a = 10;
//
//  public static final int b = 10;
//    public void func1();
//    default void func2() { //我们一般不是使用
//
//    }
}
//interface A extends Shape {
////    default void eat() {
////
////    }
//}


//
class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
    public void draw1() {
        System.out.println("画一个⚪");
    }

//    public void draw() {
//        System.out.println("画一个⚪");
//    }
}
public class TestDemo {

    public static void main(String[] args) {

    }
}
