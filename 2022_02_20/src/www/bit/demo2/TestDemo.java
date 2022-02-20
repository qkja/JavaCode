package www.bit.demo2;
import java.util.Scanner;
import java.util.SplittableRandom;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-20
 * Time: 18:48
 */
public class TestDemo {
    public static String func(String str) {
        String[] ret = str.split(" ",2);
        return ret[0]+ret[1];
    }

    public static String reserve(String str) {
        char[] arr = str.toCharArray();
        System.out.println(arr.length);
        //a b c d
        for(int i = 0 ;i<arr.length/2;i++) {
            char ch = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = ch;
            System.out.println(ch);
            //System.out.println( arr[i]);
//            char ch = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = ch;
        }
        System.out.println(arr);
        return new String(arr);

//        String ret = "";
//        for(int i=0;i<str.length();i++) {
//
//            //ret  = +str.charAt(str.length()-i);
//            //str.charAt(i) = str.charAt(str.length()-i);
//
//        }
    }

    public static void main(String[] args) {


        String str = "abcd";
        //char[] str1 = {'a','b'};
        String str1 = reserve(str);
        System.out.println(str1);
    }
    public static void main1(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            String ret = func(str);
            System.out.println(ret);
        }

    }
}
