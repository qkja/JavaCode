package www.bit.demo4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-28
 * Time: 19:32
 */
public class TestDemo {

    public static void main(String[] args) {
        String str = "aaaaaab";
        //String str2 = str.replaceAll("aa","b");
        String str2 = str.replace("aa","b");
        System.out.println(str);
        System.out.println(str2);

    }

    public static void main1(String[] args) {
        Solution solution = new Solution();
//        StringBuffer s = "We are happy";
//        solution.replaceSpace();


    }
}

class Solution {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ","%20");
//        if (str.length() <= 0)//字符串长度为空时，不用判断
//            return "";
//        String tag = " ";//为了后面计算长度---参数
//        for (int i = 0; i < str.length(); i++){
//
//            if ( str.charAt(i) == ' '){
//                str.replace(i, tag.length(), "%20");
//            }
//        }
//
//        return (String) str;

//        if(str==null||str.length()==0) {
//            return null;
//        }
//
//        for(int i=0;i<str.length();i++) {
//            if(str.charAt(i)!=' ') {
//                str.charAt(i) =
//            }
//
//        }

    }
}
