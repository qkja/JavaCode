/**
 * Created with IntelliJ IDEA.
 * Description: 数组
 * User: Qkj
 * Date: 2021-11-13
 * Time: 16:38
 */
public class TestDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int[] arr0 = {1,2,3,4,5,6,7,8,9,0};
        //数组在堆上

        int[] arr1 = new int[10];

        int[] arr2 = new int[] {11,22,33,44};
        for (int i = 0; i < arr2.length; i++) {

            System.out.println(arr2[i]);
        }

    }
}
