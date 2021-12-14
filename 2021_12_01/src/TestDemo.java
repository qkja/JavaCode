/**
 * Created with IntelliJ IDEA.
 * Description:  作业  +  顺序表
 * User: Qkj
 * Date: 2021-12-01
 * Time: 19:58
 */

import java.util.Arrays;



public class TestDemo {

    public static void main(String[] args) {

        MyArraylist myArraylist1 = new MyArraylist();
        //MyArraylist myArraylist2 = new MyArraylist();

        for (int i = 0; i < 10; i++) {

            myArraylist1.add(i,i);
        }
        myArraylist1.display();
        myArraylist1.add(0,-1);
        myArraylist1.display();













//        myArraylist1.setPos(0,-1);
//        myArraylist1.display();

//        myArraylist1.display();
//        myArraylist1.remove(9);
//        myArraylist1.display();
//        myArraylist1.remove(9);
//        myArraylist1.display();
//        myArraylist1.remove(0);
//        myArraylist1.display();
//        myArraylist1.clear();
//        myArraylist1.display();

        //myArraylist1.add(11,0);
        //System.out.println(myArraylist1.getPos(15));
//        myArraylist1.display();
//        myArraylist1.add(10,10);
//        myArraylist1.display();
//        System.out.println(myArraylist1.contains(10));

        //myArraylist1.add(13,10);
//        myArraylist1.add(0,1);
//        myArraylist1.add(0,2);
//        myArraylist1.add(0,3);
//        myArraylist1.add(3,4);
        //myArraylist1.add(3,5);
        //myArraylist1.display();
        //
        //System.out.println(myArraylist1.search(1));
//        int[] arr = new int[10];
//        System.out.println(arr.length);
    }
}

//class Test {
//
//    public String toString() {
//
//        System.out.println("aaa");
//        return "bbb";
//    }
//
//    public static void eat() {
//
//        System.out.println("eat!!");
//    }
//}
//
//class Person {
//
//    static int i = 0;
//    static int j;
//    public int test() {
//        //实例成员方法里面不能定义静态量
//        i++;
//        return i;
//    }
//}
//
//class Calculator {
//
//    private int num1;
//    private int num2;

//    public void setNum(int num1,int num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }

//
//    public void setNum1(int num1) {
//        this.num1 = num1;
//    }
//
//    public void setNum2(int num2) {
//        this.num2 = num2;
//    }
//
//    public int add() {
//
//        return this.num1 + this.num2;
//    }
//
//    public int sub() {
//
//        return this.num1 - this.num2;
//    }
//
//    public int mul() {
//
//        return this.num1 * this.num2;
//    }
//
//    public double div() {
//
//        return this.num1 * 1.0 / this.num2;
//    }


//    public int sub(int x,int y) {
//
//        return x - y;
//    }
//
//    public int mul(int x,int y) {
//
//        return x * y;
//    }
//
//    public int div(int x,int y) {
//
//        return x / y;
//    }
//}

//class MyValue {
//
//    private int val;
//
//    public void setVal(int val) {
//        this.val = val;
//    }
//
//    public int getVal() {
//        return val;
//    }
//}
//
//public class TestDemo {
//
//    public static void  twoSwap( MyValue myValue1, MyValue myValue2) {
//
//        int temp = myValue1.getVal();
//        myValue1.setVal(myValue2.getVal());
//        myValue2.setVal(temp);
//    }
//    public static void main(String[] args) {
//
//        MyValue myValue1 = new MyValue();
//        myValue1.setVal(11);
//        MyValue myValue2 = new MyValue();
//        myValue2.setVal(12);
//        System.out.println("前");
//        System.out.println(myValue1.getVal());
//        System.out.println(myValue2.getVal());
//
//        twoSwap(myValue1,myValue2);
//
//        System.out.println("后");
//        System.out.println(myValue1.getVal());
//        System.out.println(myValue2.getVal());
//
//    }


//    private  float f = 1.0f;
//
//    public static  int k = 1;
//    TestDemo(int a) {
//
//        this.f = a;
//    }
//public static int twoMax(int x,int y) {
//
//        return x > y ? x : y;
//    }
//

//    public static void swapArray(int[] arr1,int[] arr2) {
//
//        //数组大小相同
//        int ret = twoMax(arr1.length,arr2.length);
////        for (int i = 0; i < arr1.length; i++) {
////
////            int temp = 0;
////            temp = arr1[i];
////            arr1[i] = arr2[i];
////            arr2[i] = temp;
////        }
//
//        for(int i = 0;i < ret;i++) {
//
//            //1 2 3
//            //1 2 3 4
//
//        }
//
//    }

//    public static void main2(String[] args) {
//
//
//        Calculator cal = new Calculator();
//        cal.setNum1(11);
//        cal.setNum2(12);
//
//        System.out.println(cal.add());

        //cal.add();




//         int[] arr3 = {1,2,3,4};
//         arr3[4] = 0;

//        int[] arr1 = {1,3,5,7,9};
//        int[] arr2 = {2,4,6,8,10};
//        System.out.println("交换前：");
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        //swapArray(arr1,arr2);
//        System.out.println("交换后：");
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));



        //System.out.println(new Test());

//        TestDemo t = new TestDemo(88);
//
//        System.out.println(t.f);

//        this.k = 20;
//        t.f = 2.0f;
//        Person per = new Person();
//        per.test();
//        int j = per.test();
//        System.out.println(j);
//        System.out.println(Person.j);
//        String s;
//        System.out.println(s+" ");

//        Test test = null;
//        test.eat();
//    }
//}
