package www.bit.demo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-22
 * Time: 20:31
 */

public class TestDemo2 {






//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
//        System.out.println(toString(arr));
//    }

//    private static int toString(int[] arr) {
//    }
//    public static String toString(int[] arr) {
//        String ret = "[";
//        for (int i = 0; i < arr.length; i++) {
//// 借助 String += 进行拼接字符串
//            ret += arr[i];
//// 除了最后一个元素之外, 其他元素后面都要加上 ", "
//            if (i != arr.length - 1) {
//                ret += ", ";
//            }
//        }
//        ret += "]";
//        return ret;
//    }

//    public static int add(int x, int y) {
//        return x + y;
//    }
//    public static double add(int x, int y) {
//        return x + y;
//    }
    public static void main2(String[] args) {
        int[][] arr = new int[1][4];
        arr[0][0] = 10;
        arr[0][1] = 11;
        arr[0][2] = 12;
        arr[0][3] = 10;
        for(int[] ret: arr) {
            for(int n: ret) {
                System.out.print(n+" ");
            }
        }

    }
    /**
     * 一维数组
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int j = 0;
        String ret = Arrays.toString(arr);
        System.out.println(ret);
//        while(scanner.hasNext()) {
////            if(j == arr.length) {
////                break;
////            }
//            arr[j++] = scanner.nextInt();
//        }
//        for(int n: arr) {
//            System.out.print(n + " ");
//        }
    }
}
