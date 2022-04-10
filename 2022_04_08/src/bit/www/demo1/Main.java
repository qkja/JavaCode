package bit.www.demo1;


public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("sum = "+(a+b));
    }
}

//import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-09
 * Time: 9:31
 */
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] arr = new int[n];
//        int sum = 0;
//        int[] sumHelp = new int[n];
//        for(int i=0;i<n;i++) {
//            int ret = scan.nextInt();
//            arr[i] = ret;
//            sum += arr[i];
//            sumHelp[i] = sum;
//        }
//        int total = 0;
//        for(int i=0;i<n;i++) {
//            total += arr[i] * (sum - sumHelp[i]);
//        }
//        System.out.println(total);
//
//    }
//}

//H
//import java.util.Scanner;
//
//public class Main {
//    public static long func(int n) {
//
//        long ret = 0;
//        for(int i = 1;i <= n;i++) {
//            if(n % i == 0) {
//                ret += i*i;
//            }
//        }
//        return  ret % (1000000007);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        long ret = 0;
//        for (int i = 1; i <= n; i++) {
//            ret += func(i);
//        }
//        System.out.println(ret % (1000000007));
//    }
//}
//import java.util.Scanner;
////I
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//
//        //int[] arr = new int[n];
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            int ret = scanner.nextInt();
//            if(ret / k == 0) {
//                if(ret != 0) {
//                    sum++;
//                }
//            }
//            if(ret / k == 1) {
//                if(ret % k != 0) {
//                    sum++;
//                }
//            }
//            sum+=ret/k;
//        }
//        System.out.println(sum);
//    }
//}



















//public class Main {
//    public static int gcb(int a,int b) {
//        if(a > b) {
//            int ret = a;
//            a = b;
//            b = ret;
//        }
//        int max = 1;
//        for(int i = a;i< b;i++) {
//            if(b % i == 0) {
//                if(i > max) {
//                    max = i;
//                }
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        //System.out.println(gcb(3,9));
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        int max = a>b?a:b;
//
//        int kMin = a * b;
//
//        int minGcb = 1;
//
//        int i = 0;
//        for ( i = a*b; i > 0; i--) {
//            int ret = gcb(a+i,b+i);
//
//            if(ret >= minGcb) {
//                minGcb = ret;
//                if(i < kMin) {
//                    kMin = i;
//                }
//            }
//        }
//        System.out.println(kMin);
//
//    }
//}
