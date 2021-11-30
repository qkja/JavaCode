/**
 * Created with IntelliJ IDEA.
 * Description:  两数相加
 * User: Qkj
 * Date: 2021-11-30
 * Time: 17:30
 */
import java.util.Scanner;
import java.lang.String;


import java.util.Scanner;
import java.lang.String;

public class TestDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String arr1 = null;
        String arr2 = null;

        arr1 = scan.nextLine();
        arr2 = scan.nextLine();

        char[] array1= arr1.toCharArray();  //将字符串转换为数组
        char[] array2= arr2.toCharArray();

        int a = calBin(array1);
        int b = calBin(array2);
//        System.out.println(a);
//        System.out.println(b);
        int anser = 0;
        int ret = b;
        while (ret != 0)
        {
            anser = a ^ b;
            ret = (a & b) << 1;
            a = anser;
            b = ret;
        }
        System.out.println(a);
    }
    public static int calBin(char[] arr) {

        //10   -   2
        int ret = 0;
        for(int i = 0; i < arr.length; i++) {

            ret += myPow(arr[i]-'0',arr.length-i-1);

        }
        return ret;
    }

    public static int myPow(int x,int y) {

        int ret = 1;
        if(x==0) {

            return 0;
        }
        while(y > 0) {

            ret *= 2;
            y--;
        }
        return  ret;
    }
}
//public class TestDemo {
//
//    public static void main3(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        String arr1 = null;
//        String arr2 = null;
//
//        arr1 = scan.nextLine();
//        arr2 = scan.nextLine();
//
//        char[] array1= arr1.toCharArray();  //将字符串转换为数组
//        char[] array2= arr2.toCharArray();
//
//        int a = calBin(array1);
//        int b = calBin(array2);
////        System.out.println(a);
////        System.out.println(b);
//        int anser = 0;
//        int ret = b;
//        while (ret != 0)
//        {
//            anser = a ^ b;
//            ret = (a & b) << 1;
//            a = anser;
//            b = ret;
//        }
//        System.out.println(a);
//    }
//    public static int calBin(char[] arr) {
//
//        //10   -   2
//        int ret = 0;
//        for(int i = 0; i < arr.length; i++) {
//
//            ret += myPow(arr[i]-'0',arr.length-i-1);
//
//        }
//        return ret;
//    }
//
//    public static int myPow(int x,int y) {
//
//        int ret = 1;
//        if(x==0) {
//
//            return 0;
//        }
//        while(y > 0) {
//
//            ret *= 2;
//            y--;
//        }
//        return  ret;
//    }
//
//
//    public static void main2(String[] args) {
//
//        int a = 3;
//        int b = 1;
//        int anser = 0;
//        int ret = b;
//
//        while (ret != 0)
//        {
//            anser = a ^ b;
//            ret = (a & b) << 1;
//            a = anser;
//            b = ret;
//        }
//        System.out.println(a);
//    }
//
//
//
//    public static void main1(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        String arr1 = null;
//        String arr2 = null;
//
//        //System.out.println(myPow(1,4));
//
//        arr1 = scan.nextLine();
//        arr2 = scan.nextLine();
//
////        int len_a = arr1.length();
////        int len_b = arr2.length();
//
//        char[] array1= arr1.toCharArray();
//        //System.out.println(array1.length);
//        char[] array2= arr2.toCharArray();
//
//        int a = calBin(array1);
//        int b = calBin(array1);
////        System.out.println(calBin(array1));
////        System.out.println(calBin(array2));
//
//
//        int anser = 0;
//        int ret = b;
//
//        while (ret != 0)
//        {
//            anser = a ^ b;
//            ret = (a & b) << 1;
//            a = anser;
//            b = ret;
//        }
//        System.out.println(a);
//
//
//        //System.out.println(calBin(array1));
////
////        //1101   4
////        int ret1 = calBin(array1);
////        int ret2 = calBin(array1);
//
//
////        for(char val:array1) {
////
////            System.out.print(val + " ");
////        }
//
////        int[] str1 = new int[10];
////        int[] str2 = new int[10];
////        int i = 0;
////        for(i = 0;i<len_a;i++) {
////
////
////        }
//        //System.out.println(ret);
//    }
//
//
////    public static int twoMax(int x,int y) {
////
////        //return 1;
////        return x > y ? x : y;
//    //}
//}

