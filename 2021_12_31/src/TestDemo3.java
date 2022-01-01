/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-01-01
 * Time: 20:29
 */

class A {
    public int a;
    public A(String ch) {
        ch = "abcd";
    }
    public A(int a) {

    }
}
class B extends A{
    public  int b;
    public B(int b) {
        super("ab");
        this.b = b;
    }
    public B(String ch) {
        super("ab");
        super.a=10;

        ch = "abf";
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        B b = new B(1);
    }
}
