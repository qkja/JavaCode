/**
 * Created with IntelliJ IDEA.
 * Description:  认识String
 * User: Qkj
 * Date: 2022-02-15
 * Time: 20:14
 */
public class TestDemo {

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcd";
        if(str1==str2) {
            System.out.println("1");
        }
        str2 = "11";
        System.out.println(str1);
//        String str = null;
//        str = new String("abcd");
//        System.out.println(str);
    }
}
