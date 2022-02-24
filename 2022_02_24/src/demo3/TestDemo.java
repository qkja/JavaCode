package demo3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-24
 * Time: 18:55
 */
public class TestDemo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year<18) {
            System.out.println("少年");
        } else if (year>=18&&year<28) {
            System.out.println("青年");
        } else if (year>=28&&year<55) {
            System.out.println("中年");
        } else{
            System.out.println("老年");
        }
        scanner.close();
    }
    public static boolean isLeapYear (int x) {
        if(x%4 == 0 && x%100!=0 || x%400==0) {
            return true;
        }
        return false;
    }

    public static boolean isPrimeNumber(int x) {
        for(int i = 2;i < x;i++) {
            if(x % i == 0) {
                return false;
            }
        }
        if(x < 2) {
            return false;
        }
        return true;
    }

    public static void main8(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(isPrimeNumber(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main7(String[] args) {
        int a = 11;
        System.out.println(isPrimeNumber(a));
    }
    
    public static void main6(String[] args) {
        for (int i = 1000; i <2000; i++) {
            if(isLeapYear(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static boolean func(int x) {
        //92
        while (x != 0) {
            int ret = x % 10;
            if(ret == 9) {
                return true;
            }
            x/=10;
        }
        return false;
    }

    public static void main5(String[] args) {

        int count = 0;
        for (int i = 0; i < 100; i++) {
            if(func(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main4(String[] args) {
        byte a = 1;
        byte b = 2;
        //byte c = a + b;
        byte d = 1 + 2;
    }

    public static void main3(String[] args) {

        byte a = 12;

        System.out.println(Byte.MAX_VALUE+2);
        System.out.println(Byte.MIN_VALUE);
    }
    public static void main2(String[] args) {

        byte a = 10;
        int b = -a;
        System.out.println(b);
        //float a = 10;
        //System.out.println(a);
//        int b = (int) 8846.0;
//        System.out.println(b);
//        int a = 3;
//        System.out.println("\\\"hello\\\"");
//        a>>>=1;
        //a<<<=1;
        //byte d = a;
//        long i = 1;
//        switch (i) {
//            case 1:
//        }

    }
    public static void main1(String[] args) {
        short a = 128;
        byte d = (byte)a;
        double x=2.0; int y=4; x/=++y;
        System.out.println(x);
        //System.out.println(d);
        //int aad.j = 10;
    }
}
