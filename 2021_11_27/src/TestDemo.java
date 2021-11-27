/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-11-27
 * Time: 16:19
 */
public class TestDemo {


    public static void main(String[] args) {

        String str = "hello ";
        System.out.println(str.length());
    }

    /**
     * 不规则的二维数组
     * @param args
     */

    public static void main3(String[] args) {

        int[][] arr = new int[2][];
         arr[0]= new int[]{1,2,3,4};
         arr[1]= new int[]{1,2,3};

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0;  j< arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }


















    /**
     * 二维数组的打印
     * @param args
     */

    public static void main2(String[] args) {

        int[][] arr = {{1,2,3},{5,6,7}};
        for(int[] val : arr) {

            for(int x: val) {

                System.out.print(x + " ");
            }
            System.out.println();
        }

    }



















    public static void fun(int[][] arr) {


    }
    public static void main1(String[] args) {

        int[][] arr = {{1,2,3},{1,2,3}};
        fun(arr);
    }

//    public static void fun(int[] arr) {
//
//        for(int i=0;i<arr.length;i++) {
//
//            arr[i] = 2*arr[i];
//        }
//    }
//
//    public static String myToString() {
//
//        String ret = "[ ";
//        ret+=1;
//        ret+=',';
//        ret+=" ]";
//        return ret;
////        System.out.print('['+ "");
////
////
////        System.out.print(" "+ ']');
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,5};
//        fun(arr);
//        String ret = myToString();
//        System.out.println(ret);
////        for(int val:arr) {
////
////            System.out.print(val+" ");
////        }
//    }
}
