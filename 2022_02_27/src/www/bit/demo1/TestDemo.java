package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:  考核
 * User: Qkj
 * Date: 2022-02-27
 * Time: 9:23
 */

/**
 * 不一定传引用改变的值
 */
class A {
    public A() {
        System.out.println("午餐");
    }
    public A(int a) {
        System.out.println("有");
    }
}
public class TestDemo {

    public static void main(String[] args) {

    }
//    public TestDemo(int a) {
//        super(a);
//    }
//    public TestDemo() {
//       super();
//    }
    public static void main2(String[] args) {
//        new TestDemo();
//        new TestDemo(1);
    }

    public static void main1(String[] args) {
        double a = 10.0;
        double d = a%3;
        System.out.println(10.0%3.0);//我好像记得有一个不能被是 小数  知道了 是在C语言中
    }
}
//派生   可以理解成父类和子类的关系

class B {
    class C {
        private int a;
    }
}