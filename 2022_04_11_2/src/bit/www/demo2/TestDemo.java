package bit.www.demo2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:  笔试强训
 * User: Qkj
 * Date: 2022-04-12
 * Time: 13:56
 */

public class TestDemo {
    public static int func(int[] arr,int i) {
        int mul = 1;
        for (int j = 0; j <arr.length ; j++) {
            if(j != i) {
                mul*=arr[j];
            }
        }
        return mul;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] sumTotal = new int[n];

        int k = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            k = scanner.nextInt();
            arr[i] = k;
            sum += k;
            sumTotal[i] = sum;
        }
        int mulTotal = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            //求积
            mulTotal = func(arr,i);
            if(sum - arr[i] > mulTotal) {
                count++;
            }
        }
        System.out.println(count);
    }
}

//public class TestDemo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sum = 0;
//        int mul = 1;
//
//        int[] sumTotal = new int[n];
//        int[] mulTotal = new int[n];
//        int k = 0;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//             k = scanner.nextInt();
//             sum += k;
//             mul *= k;
//             sumTotal[i] = sum;
//             mulTotal[i] = mul;
//             if(sumTotal[i] > mulTotal[i]) {
//                 count++;
//             }
//        }
//        System.out.println(count);
//    }
//}

//public class TestDemo {
//    public static boolean isLeap(int year) {
//        if((year % 4 == 0 && year % 100 !=0) ||year % 400 == 0) {
//            return true;
//        }
//        return false;
//    }
//    public static int totalDays(int year,int month,int day) {
//
//        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
//        if(isLeap(year)) {
//            months[2] = 29;
//        }
//        int sum = day;
//        for (int i = 0; i < month; i++) {
//            sum += months[i];
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = 0;
//        int month = 0;
//        int day = 0;
//        year = scanner.nextInt();
//        month = scanner.nextInt();
//        day = scanner.nextInt();
//        int days = totalDays(year,month,day);
//        System.out.println(days);
////        System.out.println(year);
////        System.out.println(month);
////        System.out.println(day);
//    }
//}
