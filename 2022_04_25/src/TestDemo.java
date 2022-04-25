import java.util.HashMap;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-25
 * Time: 15:07
 */
public class TestDemo {
        public static int func3(int[] arr) {
            if(arr == null) {
               return -1;
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if(map.containsKey(arr[i])) {
                    map.clear();
                    return arr[i];
                } else{
                    map.put(arr[i],1);
                }
            }
            map.clear();
            return -1;
        }
        public static HashMap<Integer,Integer> func2(int[] arr) {
        if(arr == null) {
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x:arr) {
            map.put(x,1);
        }
        return map;
    }

        public static HashMap<Integer,Integer> func1(int[] arr) {
        if(arr == null) {
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        //判断 是不是在map中，在就加一
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.replace(arr[i], map.get(arr[i]),map.get(arr[i])+1);
            } else{
                map.put(arr[i],1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        int[] arr = new int[1_0000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        int ret = func3(arr);
        System.out.println(ret);
        HashMap<Integer,Integer> map = func1(arr);
        System.out.println(map);
        map.clear();
    }
}
