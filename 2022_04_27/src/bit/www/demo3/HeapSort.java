package bit.www.demo3;



import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-27
 * Time: 20:07
 */


public class HeapSort<T> {

    private static<T> void adjustDown(T[] array, int length, int root,Comparator<T> comparator) {
        if(array == null) {
            return;
        }
        int parent = root;
        int child = parent*2+1;
        while (child < length) {
            if(child+1<length && comparator.compare(array[child+1],array[child]) > 0) {
                child++;
            }
            if(comparator.compare(array[parent],array[child]) < 0) {
                T ret = array[parent];
                array[parent] = array[child];
                array[child] = ret;
            } else {
                break;
            }
            parent = child;
            child = parent*2+1;
        }
    }
    private static<T> void adjustUp(T[] array,int length,Comparator<T> comparator) {
        //建立大堆

        int child = length -1;
        int parent = (child-1)/2;

        while (child > 0) {
            if(comparator.compare(array[parent],array[child]) < 0) {
                T ret = array[parent];
                array[parent] = array[child];
                array[child] = ret;
            }else {
                break;
            }
            child = parent;
            parent = (child-1)/2;
        }
    }

    public static <T>void sort(T[] array, Comparator<T> comparator) {
        if(array == null) {
            return;
        }
        for(int i=1;i<array.length;i++) {
            adjustUp(array,i+1,comparator);
        }

        //交换
        for (int i = 0; i < array.length; i++) {
            //交换 堆顶   堆尾
            T ret = array[0];
            array[0] = array[array.length -1-i];
            array[array.length -1-i] = ret;
            //向下调整
            adjustDown(array,array.length-1-i,0,comparator);
        }
    }

}
