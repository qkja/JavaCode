/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-12
 * Time: 22:08
 */
public class TestDemo {
    public static void main(String[] args) {

    }

    public static void main1(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6}};
        for(int[] arr1:arr) {
            for(int arr2:arr1) {
                System.out.print(arr2 + " ");
            }
        }
    }
}
