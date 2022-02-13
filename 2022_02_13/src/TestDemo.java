/**
 * Created with IntelliJ IDEA.
 * Description:  异常
 * User: Qkj
 * Date: 2022-02-13
 * Time: 14:12
 */
public class TestDemo {

    /**
     * 手动抛出异常
     * @param args
     */
    public static void main2(String[] args) {
        int x = 0;
        if(x==0) {
            throw new UnsupportedOperationException("x==0");
        }
    }


    public static int func() {
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 0;
        }
//        finally {
//            return 1;
//        }
        return 1;
    }
    public static void main1(String[] args) {
        System.out.println(func());
//        int a = 10/1;
//        System.out.println(a);
    }
}
