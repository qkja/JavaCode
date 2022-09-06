package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-23
 * Time: 9:45
 */
public class TestDemo {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        for (int i : new int[]{1, 2, 3, 4, 5}) {
            System.out.println(i);
        }

        int[] arr2 = {1,2,3,4,5,5};
        arr1 = arr2;
//        for(int x:arr1) {
//            System.out.println(x);
//        }
    }

    public static void main4(String[] args) {
        int c = 0;
        A:
        for (int i = 0; i < 10; i++) {
            for (int j = 0;  j< 10; j++) {
                if(j==5) {
                    c = 20;
                    break A;
                }
            }
        }

        System.out.println(c);

    }

    /**
     * 装箱  拆箱
     * @param args
     */
    public static void main3(String[] args) {

        Integer a = 220;
        Integer b = 220;
        System.out.println(a==b);
        //我们
    }
    public static void main2(String[] args) {
        //拆箱
        //自动
        Integer a = 10;
        int i = a;
        int i2 = a.intValue();
    }
    public static void main1(String[] args) {
        //装箱    装包   简单类行  变成    包装类
        //自动装箱
        int i = 10;
        Integer a = i;

        //手动装箱
        Integer a2 = Integer.valueOf(i);
        System.out.println(a2);
    }
}
