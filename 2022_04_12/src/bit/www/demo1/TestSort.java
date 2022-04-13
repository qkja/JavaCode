package bit.www.demo1;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-12
 * Time: 16:24
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

    /**
     *
     * @param array 数组
     * @param gap   分隔的组数
     */
    public static void shell(int[] array,int gap) {
        if(array == null) {
            return;
        }
        for (int i = gap; i < array.length; i++) {
            int ret = array[i];
            int j = i - gap;
            for (; j >=0 ; j-=gap) {
                if(array[j] > ret) {
                    array[j+gap] = array[j];
                } else {
                    break;
                }
            }
            array[j+gap] = ret;
        }
    }

    /**
     *  如何 确定 gap
     * @param array
     */
    public static void shellSort(int[] array) {
//        int[] de = {0};
//        for (int i = 0; i < de.length; i++) {
//            shell(array,de[i]);
//        }
        //shell(array,2);
        int gap = array.length;
        while (gap > 1) {
            gap = gap / 3 + 1; //为了保证最后一个序列是  1
            shell(array,gap);
        }
    }

    /**
     * 选择 排序
     * @param array
     */
    public static void selectSort(int[] array) {
        if(array == null) {
            return;
        }
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[i]) {
                    int ret = array[i];
                    array[i] = array[j];
                    array[j] = ret;
                }
            }
        }
    }
    public static void adjustDown(int[] array,int root) {
        if(array == null) {
            return;
        }
        int parent = root;
        int child = 2*parent - 1;
        while (child > 0) {

        }
    }
    public static void heapSort(int[] array) {
        if(array == null) {
            return;
        }
        for (int i = (array.length-1-1)/2; i >=0; i--) {
            //向上调整
            adjustDown(array,i);
        }
    }

    public static void bubbleSort(int[] array) {
        if(array == null) {
            return;
        }
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int ret = array[j];
                    array[j] = array[j+1];
                    array[j+1] = ret;
                    flg = true;
                }
            }
            if(flg == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main2(String[] args) {
        int[] arr = new int[10_000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_000);
        }
        long begin = System.currentTimeMillis();
        shellSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    public static void main1(String[] args) {
        int[] arr = new int[10_000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_000);
        }
        long begin = System.currentTimeMillis();
        insertSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}