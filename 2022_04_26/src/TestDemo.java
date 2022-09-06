import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-26
 * Time: 20:03
 */
public class TestDemo {
    public static  String func(String str1,String str2) {
        Set<Character> set = new HashSet<>();
        for (Character ch: str2.toCharArray()) {
            if(ch >= 'a' && ch<='z') {
                set.add((char) (ch-('a'-'A')));
            }
            else {
                set.add(ch);
            }
        }
        String str3 = "";
        Set<Character> set1 = new HashSet<>();

        for (Character ch:str1.toCharArray()) {
            if(ch >= 'a' && ch<='z') {
                ch = (char) (ch-('a'-'A'));
            }
            if(!set.contains(ch)) {
               if(!set1.contains(ch)) {
                   str3+=ch;
               }
               set1.add(ch);
            }
        }
        set.clear();
        set1.clear();
        return str3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(func(str1,str2));
    }
}
