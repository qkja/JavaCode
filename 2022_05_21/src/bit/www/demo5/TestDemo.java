package bit.www.demo5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-21
 * Time: 20:22
 */
//class OutClass {
//    public int age;
//    public static double score;
//    class InnerClass {
//        public InnerClass() {
//            System.out.println("这是一个实例内部了不带参数的构造方法");
//        }
//        public void func() {
//
//        }
//    }
//    InnerClass innerClass;
//}


class B {

}
interface A {

}
class OutClass {

    class InnerClass {
        public InnerClass() {
            System.out.println("这是一个实例内部了不带参数的构造方法");
        }

    }
}
public class TestDemo extends OutClass.InnerClass{
    public TestDemo(OutClass outClass) {
        outClass.super();
    }

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.InnerClass innerClass = outClass.new InnerClass();
    }


//    public void func() {
//        class Test {
//
//        }
//    }
}
