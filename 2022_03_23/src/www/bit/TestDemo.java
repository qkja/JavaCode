package www.bit;

/**
 * Created with IntelliJ IDEA.
 * Description:   复习类和对象
 * User: Qkj
 * Date: 2022-03-23
 * Time: 10:21
 */

/**
 * 这些基础的自己会了  重点在构造方法后面
 */
//class Person {
//    //这是 字段  也是属性
//    public String name; //默认值 为 null，也可以初始化
//    public int age;
//    public String sex;
//    public static int n = 10;
//
//    //方法
//    public void eat() {
//        age = 10;
//        n = 20;
//        System.out.println("hello bit");
//    }
//    //不过走之前还要看看 static
//
////    public static int n = 10;
//    public static void func() {
//
////        age = 20;
////         int b = 10;
//    }
//
////    public void func() {
////        static int b = 10;
////
////    }
//}

class Person {
    private int a;
    private static  int b = 20;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Person(int a) {
        this.a = a;
    }
    public Person(int vla,int d) {
        this(vla + d);
    }
}

class MaxValue {
    public int maxValue(int a,int b) {
        return  a  >b ? a : b;
    }

    public double maxValue(double a,double b) {
        return  a  >b ? a : b;
    }
    public double maxValue(double a,double b,int c) {
        double ret = maxValue(a,b);
        return ret > (double) c ? ret : (double)c;
    }
}
class Sum {
    public int sum(int a,int b) {
        return a+b;
    }
    public double sum(double a,double b,double c) {
        return a+b+c;
    }
}

public class TestDemo {

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void func(int n) {
        if(n >= 10) {
            func(n/10);
        }
        System.out.print(n % 10+" ");

//        if(n < 10) {
//            System.out.print(n+" ");
//        }
//        func(n/10);
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和

//    public static int func(int n) {
//        //123
//        if(n < 10) {
//            return n;
//        }
//        return n % 10 + func(n/10);
//    }
    public static void main(String[] args) {
        func(1011);
        //System.out.println(func(1234));
    }

    //递归求解汉诺塔问题



//一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法


//    public static int Fib(int n) {
//        if(n < 3) {
//            return n;
//        }
//        return Fib(n-1) + Fib(n-2);
//    }
//
//    public static int func1(int n) {
//        if(n < 3) {
//            return n;
//        }
//        return func1(n-1) + func1(n-2);
//    }
//    public static void main(String[] args) {
//
//
//        System.out.println(Fib(6));
////        MaxValue maxValue = new MaxValue();
////        System.out.println(maxValue.maxValue(1,2));
////        System.out.println(maxValue.maxValue(11.0,2.0));
////        System.out.println(maxValue.maxValue(1.0,2.0,3));
//    }
//    在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，
//    以及两个小数和一个整数的大小关系


    public static void main1(String[] args) {
        Person person = new Person(11,11);
        System.out.println(person.getA());

//        System.out.println(Person.b);
//        System.out.println(person.getA());
//        person.setA(11);
//        System.out.println(person.getA());

//        person.eat();


//        static int b = 10;
//        System.out.println(person.age);
//        System.out.println(person.name);
    }
}
