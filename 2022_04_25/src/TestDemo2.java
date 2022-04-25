//import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-25
 * Time: 15:42
 */
public class TestDemo2 {
    public static void func(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x:arr ){
            if(hashSet.contains(x)) {
                hashSet.remove(x);
            } else {
                hashSet.add(x);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(hashSet.contains(arr[i])) {
                //return arr[i];
            }
        }
    }

}
