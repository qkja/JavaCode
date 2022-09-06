

import static java.lang.Math.sqrt;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-12-31
 * Time: 21:55
 */

class Triangle {

    private double a;
    private double b;
    private double c;
    //构造一个方法
    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //计算周长
    public double perimeter() {
        return this.a + this.b + this.c;
    }

    //计算面积
    public double area() {
        double p = (this.a + this.b + this.c)/2;
        return sqrt(p*(p - this.a)*(p - this.b)*(p - this.c)); //sqrt开方
    }

}

public class TestDemo {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());
    }
}
