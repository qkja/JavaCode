/**
 * Created with IntelliJ IDEA.
 * Description:
 * 抽象方法：一个方法如果被 abstract 修饰 就是抽象方法
 * 抽象类 ： 包含抽象方法的类叫做抽象类
 * User: Qkj
 * Date: 2022-02-07
 * Time: 20:51
 */

abstract class Shape1 {

    public abstract void draw();
        // System.out.println("11");
}

public class TestDemo2 {
    public static void main(String[] args) {
        //抽象类不可以被实例化
        //类内的普通成员 和其他一样
        //作用： 主要就是为了被继承
        //如果一个类继承抽象类 那么这个类一定要重写抽象方法  否则将子类也变成抽象类
        //抽象类或者是抽象方法一定不能被final修饰   也不能被private
        // Shape shape = new Shape1();

    }
}
