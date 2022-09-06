package demo.bit.www2;

/**
 * Created with IntelliJ IDEA.
 * Description:  看书  字符串
 * User: Qkj
 * Date: 2022-02-08
 * Time: 20:11
 */
public class TestDemo2 {
    public static void main(String[] args) {

        String str = "hello word";
        int s = str.offsetByCodePoints(0,0);
        int d = str.codePointAt(s);
        System.out.println(d);
        //System.out.println(s);
//        String str = "hello";
//        //字串
//        String s = str.substring(0,3);
//        //System.out.println(s);
//        //拼接
//        String str2 = " word";
//        String s2 = str+str2;
//        System.out.println(s2);
//        String str1 = "你好";
//        //System.out.println(str1.length());
//        String str2 = "Hello";
//        System.out.println(str2.charAt(0));
//        System.out.println(str2.charAt(1));
//        System.out.println(str2.charAt(2));
//        System.out.println(str2.charAt(3));
//        System.out.println(str2.charAt(4));
       // System.out.println(str2.charAt(5));
//        if(str1.equalsIgnoreCase(str2)) {
//            System.out.println("hehe");
//        }else  {
//            System.out.println("xixi");
//        }
    }
}
