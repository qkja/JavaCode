package bit.www.demo3;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-12
 * Time: 15:57
 */
public class TestSort {
    /**
     * 插入排序
     * @param array
     */
    public static void insertSort(int[] array) {
        if(array == null || array.length == 0) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int ret = array[i];
            while (j >= 0) {
                if(array[j] > ret) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
                j--;
            }
            if(j == -1) {
                array[0] = ret;
            }else {
                array[j+1] = ret;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
