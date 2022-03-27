import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-26
 * Time: 20:11
 */
interface IA {
    void a();
}

interface IB extends IA{
    void b();
}

class C implements IB{
    @Override
    public void a() {

    }
    @Override
    public void b() {

    }
}

class D extends C implements IA,IB {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
//interface IShape {
//    public abstract void draw();
//    default public void func() {
//
//    }
//    static void func2() {
//
//    }
//}

interface IShape {
    int a = 10;
    public abstract void draw();
}



class Triangle implements IShape {
    @Override
    public void draw() {
        System.out.println("打印一个🔺");
    }
}

abstract class A implements IShape{

}

class Round implements IShape {

    @Override
    public void draw() {
        System.out.println("打印一个⚪");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        //Shape shape = new Shape();
    }
}

//abstract class A extends Shape {
//    public abstract void func();
//}
//class B extends A {
//    @Override
//    public void func() {
//
//    }
//
//    @Override
//    public void draw() {
//
//    }
//}

//class Test {
//    public static int n = 10;
//    int a;
//
//    void func() {
//        //this.a;
//    }
//    public static void hello() {
//        static int m = 20;
//    }
//    public void func() {
//        static int k = 20;
//    }
//}

//class A extends Test {
//    public void a() {
//        this.a;
//        this.func();
//    }
//}


//public class TestDemo {
//
//    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面
//    public static void swap(int[] arr) {
//        if (arr == null) {
//            return;
//        }
//        int left = 0;
//        int right = arr.length-1;
//        while (left < right) {
//            while (left < right && arr[left]%2 == 0) {
//                left++;
//            }
//            while (left < right && arr[right]%2 == 1 ) {
//                right--;
//            }
//            if(left < right) {
//                int ret = arr[left];
//                arr[left] = arr[right];
//                arr[right] = ret;
//            }
//            left++;
//            right--;
//        }
//    }
//    //给定两个整型数组, 交换两个数组的内容.
//    public static void swapArray(int[] arr1,int[] arr2) {
//        if(arr1 == null || arr2 == null) {
//            return;
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            int ret = arr1[i];
//            arr1[i] = arr2[i];
//            arr2[i] = ret;
//        }
//    }
//    public static void main1(String[] args) {
//        int[] arr = {1,1,2};
//        swap(arr);
//        System.out.println(Arrays.toString(arr));
//    }

//    static int cnt = 6;
//    static{
//        cnt += 9;
//    }
//    public static void main(String[] args){
//        System.out.println("cnt =" + cnt);
//    }
//    static{
//        cnt /=3;
//    };
//    private int count;
//
//    public static void main(String[] args) {
//
//        TestDemo test=new TestDemo(88);
//
//        System.out.println(test.count);
//
//    }

//    TestDemo(int a) {
//
//        count=a;
//
//    }
//    public int data;
//    public static int n = 20;
//    public static void main(String[] args) {
//        TestDemo testDemo = new TestDemo();
//        //this.n = 10;
//    }
//}

//public class TestDemo {
////    public int aMethod(){
////        //static int i = 0;
////        i++;
////        return i;
////    }
//    //public static int i = 10;
//    public static void main1(String[] args) {
//
//        String s;
//
//        //System.out.println("s="+s);
////        Test test = null;
////        test.hello();
//    }
//}
