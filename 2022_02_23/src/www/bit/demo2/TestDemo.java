package www.bit.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-23
 * Time: 10:31
 */
public class TestDemo {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(1);
        list.add(0,1);
        System.out.println(list.isEmpty());
        System.out.println(list);
    }

    public static void main1(String[] args) {
        int k = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        int help = 1;
        for(int i = 1;i<=k;i++) {
            help*= (n+1-i)/i;
        }
        System.out.println(help);
        scanner.close();
    }
}
