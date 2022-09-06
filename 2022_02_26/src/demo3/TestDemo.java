package demo3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-26
 * Time: 19:31
 */
public class TestDemo {

    public static int twoMax(int x,int y) {
        return x>y?x:y;
    }

    public static int threeMax(int x,int y,int z) {
        return twoMax(x,y)>z?twoMax(x,y):z;
    }

    public static void main(String[] args) {
        System.out.println(twoMax(1,2));
        System.out.println(threeMax(1,2,3));
    }

    public static void swapOE(int[] arr) {
        if(arr==null||arr.length==0) {
            throw new RuntimeException("空");
        }
        int i = 0;
        int j = arr.length -1;
        while (i<=j) {
            while (arr[i]%2==1) {
                i++;
            }
            while (arr[j]%2==0) {
                j--;
            }
            if(i<j) {
                int ret = arr[i];
                arr[i] = arr[j];
                arr[j] = ret;
                i++;
                j--;
            }
        }
    }
    public static void main9(String[] args) {
        int[] arr = {1,1,1,2,4,1,1,1,2,2,2,2};
        swapOE(arr);
        for (int x:arr
             ) {
            System.out.print(x+" ");
        }
    }
    public static int factorial(int n) {
        int ret = 1;
        for(int i = 1;i <= n;i++) {
            ret *= i;
        }
        return ret;
    }
    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }

    public static int func(int n) {
        int sum = 0;
        int ret = 1;
        for(int i = 1;i <= n;i++) {
            ret *= i;
            sum += ret;
        }
        return sum;
    }
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(func(n));
        scanner.close();
    }

    public static int Fib(int n) {

        int a = 1;
        int b = 1;
        int ret =1;
        for (int i = 2; i < n; i++) {
            ret = a + b;
            a = b;
            b = ret;
        }
        return ret;
    }
    public static void main6(String[] args) {
        System.out.println(Fib(5));
    }

    public static int searchOnly(int[] arr) {
       if (arr == null || arr.length == 0) {
           throw new RuntimeException("空");
       }
       int ret = arr[0];
       for (int i=1;i<arr.length;i++) {
           ret ^= arr[i];
       }
       return ret;
    }

    public static void main5(String[] args) {
        int[] arr = null;
        System.out.println(searchOnly(arr));
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((j+1)+"×"+(i+1)+"="+((j+1)*(i+1)) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[100];
        int j = 0;
        while (n!=0) {
            arr[j++] = n%10;
            n/=10;
        }
        for (int i = j-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String admin = "admin";
        System.out.println("请输入密码：");
        String myAdmin = null;
        for (int i = 0; i < 3; i++) {
            myAdmin = scanner.nextLine();
            if(admin.equals(myAdmin)) {
                System.out.println("恭喜你，输入正确");
                return;
            } else {
                if(i<2) {
                    System.out.println("对不起，输入错误，请重新输入：");
                }
                if(i==1) {
                    System.out.println("小心一点，你只有一次机会了");
                }
            }
        }

        System.out.println("抱歉，你都没成功");
        scanner.close();
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] odd = new int[16];
        int[]  even = new int[16];
        int o = 0;
        int e = 0;
        for (int i = 0; i < 32; i++) {
            int ret = (n>>i)&1;
            if((i+1)%2==0) {
                even[e++] = ret;
            } else {
                odd[o++] = ret;
            }
        }
        System.out.println("奇数");
        for (int x:odd) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("偶数");
        for (int x:even) {
            System.out.print(x+" ");
        }
        scanner.close();
    }
}
