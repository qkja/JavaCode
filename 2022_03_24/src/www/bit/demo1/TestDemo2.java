package www.bit.demo1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-29
 * Time: 19:58
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        //int a = scanner.nextByte();
        while (scanner.hasNext()) {
            a = scanner.nextInt();
            if(a < 18) {
                System.out.println("青年");
            } else {
                System.out.println("中年");
            }
        }
    }
}
