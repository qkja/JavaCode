import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-11-22
 * Time: 15:12
 */

//import java.util.Scanner;

public class TestDemo {

    public static int sum(int x,int y) {

        return x + y;
    }

    public static double sum(double x,double y) {

        return x + y;
    }

    public static int maxNum(int x,int y) { //public static因为main是静态的 要在main中调用 返回值可有可无，看业务需求
                                            //要是有返回值 类型相同
        return x > y ? x : y;//方法体
    }

    public static int maxNum_3(int x,int y,int z) {

        return  maxNum(maxNum(x,y), z);
    }

    public static void main(String[] args) {

       //Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        int[] arr1 = new int[10];
        int[] arr2 = new int[] {1,2,3,4};
        System.out.println(arr1);
        System.out.println(arr2[0]);

//        int a = 10;
//        int b = 20;
//        double c = 10.0;
//        double d = 10.0;
//        System.out.println(sum(a, b));
//        System.out.println(sum(c, d));
//        int a = 10;
//        int b = 20;
//        int c = 0;
//        a = scan.nextInt();
//        b = scan.nextInt();
//        c = scan.nextInt();
//
//        System.out.println(maxNum(a,b));
//        System.out.println(maxNum_3(a,b,c));
//        System.out.println(maxNum_3(a, b, c));
//        System.out.println(a);


//        int n = scan.nextInt();
//        int sum = 0;
//        int i = 1;
//        int de = 1;
//        while(i<=n) {
//
//            de*=i;
//            i++;
//            sum+=de;
//        }
//        System.out.println(sum);

//        int n = scan.nextInt();
//        int i = 1;
//        int de = 1;
//        while(i<=n) {
//
//            de*=i;
//            i++;
//        }
//        System.out.println(de);

//        char ch = 0;
//        switch(ch)
//        {
//            case 1:
//                break;
//        }
//        int a = 0;
//        if(1==a) {
//
//            System.out.println(a);
//        }
//        int a = scan.nextInt();
//        double b = scan.nextDouble();
//        System.out.println(b);
//        System.out.println(a);

//        String str1 = scan.nextLine();
//
//        System.out.println(str1);
//        String str2 = scan.nextLine();
//        System.out.println(str2);
//        int a = 1;
//        int b = 2;
//        int c = (1 >2)?1:2;
//        System.out.println(c);
        //int a = (1 >2)? 1 ：2；

//        int b = -1>>>1;
//        System.out.println(b);

//        int a = 1>>1;
//        int b = 1<<1;
//        System.out.println(a);
//        System.out.println(b);
    }
}
