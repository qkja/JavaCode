package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-20
 * Time: 15:15
 */
public class TestDemo {


    public static void main(String[] args) {

    }
    public static void main3(String[] args) {
        String str = "abbabc";
        boolean flg = str.contains("abc");
        System.out.println(flg);
    }
    public static boolean func(String str) {
        if(str==null||str.length()==0) {
            return false;
        }
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)<'0'||str.charAt(i)>'9') {
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str = "";
        //判断是不是数字组成
        System.out.println(func(str));
    }

    public static void main1(String[] args) {
        //字符和字符串
        char[] arr = {'a','b','c','d'};
        String str = new String(arr);
        System.out.println(str);
        char ch = str.charAt(0);
        char ch2 = str.charAt(1);
        System.out.println(ch);
        System.out.println(ch2);
    }

}
