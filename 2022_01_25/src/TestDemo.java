/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-01-25
 * Time: 22:55
 */
public class TestDemo {
    /**
     *
     * @param str  主串
     * @param sub  子串
     * @param pos  从字串的pos位置开始匹配
     * @return     返回字串再主串的下标
     */

    public static int KMP(String str,String sub,int pos) {


        if(str==null||sub==null) {
            return -1;
        }
        int lenStr = str.length();
        int lenSub = sub.length();
        if(lenStr==0||lenSub==0) {
            return -1;
        }
        if(pos<0||pos>=lenStr) {   //解释=号为何不行  迫使、
                                   //是从0开始的
            return -1;
        }
        int[] next = new int[lenSub];
        getNext(sub,next);
        int i = pos;   //遍历主串
        int j = 0; //遍历字串
        while(i < lenStr && j < lenSub) {
            if(j == -1 || str.charAt(i)==sub.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if(j>=lenSub) {
            return i-j;
        } else if(i >= lenStr) {
            return 0;
        }
        return -1;
    }
    public static void getNext(String sub,int[] next) {
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int k = 0;
        for (; i <sub.length() ; ) {
            if(k ==-1 || sub.charAt(i-1)==sub.charAt(k)) {
                next[i] = k + 1;
                k++;
                i++;
            } else {
                k = next[k];
            }
        }
    }

    public static int BF(String str,String sub) {

        if(str==null||sub==null) {
            return -1;
        }
        int lenStr = str.length();
        int lenSub = sub.length();
        if(lenStr==0||lenSub==0) {
            return -1;
        }
        int i = 0;
        int j = 0;
        while(i<lenStr&&j<lenSub) {
            if(str.charAt(i)==sub.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if(j >= lenSub) {
            return i - j;
        } else if(i >= lenStr) {
            return 0;
        }
        return  -1;
    }

    public static void main(String[] args) {
        System.out.println(KMP("abbbcbbbb","bbbbc",0)); //0
        System.out.println(KMP("abbbcbbbb","",0)); //-1
        System.out.println(KMP("abbbcbbbb","bbbc",0));//1

        System.out.println(BF("abbbcbbbb","bbbbc")); //0
        System.out.println(BF("abbbcbbbb","")); //-1
        System.out.println(BF("abbbcbbbb","bbbc"));//1
    }
}
