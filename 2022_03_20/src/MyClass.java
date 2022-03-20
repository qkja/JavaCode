import java.util.Scanner;
import java.util.Arrays;
import  java.lang.String;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-20
 * Time: 21:45
 */
public class MyClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();
        int[] elem = new int[3*n];
        for (int i = 0; i < elem.length ; i++) {
            elem[i] = scanner.nextInt();
        }
        Arrays.sort(elem);
        long result = 0;
        for (int i = 0; i < n; i++) {
            result+=elem[elem.length-(2*(i+1))];
        }
        System.out.println(result);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String pattern = "[" + str2 + "]";
        System.out.println(str1.replaceAll(pattern, ""));
    }
}
