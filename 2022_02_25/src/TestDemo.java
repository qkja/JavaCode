import java.io.IOException;
import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-25
 * Time: 16:09
 */
public class TestDemo {
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }
    public static void main5(String[] args) throws IOException {
        System.out.print("Enter a Char:");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("your char is :"+i);







//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println(name);
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n!=0) {
            count++;
            n = n&(n-1);
        }
        System.out.println(count);
        scanner.close();
    }
    public static void main(String[] args) {
        double sum = 0.0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0 / i*flg;
            flg = -flg;
        }
        System.out.println(sum);
    }

    public static boolean isDaffodils(int x) {
        if(x>99&&x<1000) {
            int ret = x;

            for (int i = 0; i < 3; i++) {
                int n = 1;
                int m = x%10;
                n = m*m*m;
                ret-=n;
                x/=10;
            }
            if(0==ret) {
                return true;
            }
        }
        return false;
    }

    public static void main2(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if(isDaffodils(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main1(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int ret = random.nextInt();
        if(ret<0) {
            ret = - ret;
        }
        ret %= 10 + 1;

        int n = 0;
        while (true) {
            System.out.println("请输入你猜测的数字:");
            n = scanner.nextInt();
            if(n==ret) {
                System.out.println("恭喜你，猜对了");
                break;
            } else if(n < ret) {
                System.out.println("sorry,小了");
            } else {
                System.out.println("sorry,大了");
            }
        }
    }
}
