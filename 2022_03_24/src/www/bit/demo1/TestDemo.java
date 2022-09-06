package www.bit.demo1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-24
 * Time: 13:52
 */
public class TestDemo {
    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static double avg(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum*1.0)/arr.length;
    }


    public static double avg(double[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }

    public static double sum(double[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int sum(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

//    实现一个方法 transform,
//    以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
//    例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}

    public static int[] transform(int[] arr) {
        if(arr == null || arr.length == 0) {
            return new int[0];
        }
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i] * 2;
        }
        return copyArr;
    }

    //实现一个方法 printArray,
    // 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void printArray (int[] arr) {
        if(arr == null || arr.length == 0) {
            return;
        }
        for(int ret:arr) {
            System.out.print(ret+" ");
        }
        System.out.println();
    }

    //创建一个 int 类型的数组,
    //元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static int[] createArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    //给定一个整型数组,
    // 实现冒泡排序(升序排序)
    public static void bubbleSort(int[] arr) {
        if(arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int ret = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = ret;
                }
            }
        }
    }

    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean isOrder(int[] arr) {
        if(arr == null || arr.length == 0) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    //给定一个有序整型数组, 实现二分查找
    public static int binarySearch(int[] arr,int key) {
        if(arr == null || arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {

            mid = (left + right)/2;
            if(arr[mid] < key) {
                left = mid + 1;
            } else if (arr[mid] > key) {
                right = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] copyOf(int [] arr) {
        if(arr == null || arr.length == 0) {
            return null;
        }
        int[] copyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    //实现一个方法 toString,
    // 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]",
    // 注意 逗号 的位置和数量.

    public static void toString(int[] arr) {
        if(arr == null || arr.length == 0) {
            return;
        }
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if(i != arr.length-1) {
                ret+=", ";
            }
        }
        ret+="]";
        System.out.println(ret);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3};
        toString(arr);
        //System.out.println(binarySearch(arr, 5));
//        System.out.println(isOrder(arr));
//        bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
//        System.out.println(isOrder(arr));
//        printArray(arr);
//        System.out.println(avg(arr));
//        System.out.println(sum(arr));
    }
}
