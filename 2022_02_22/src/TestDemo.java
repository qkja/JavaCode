import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:   异常+初识集合
 * User: Qkj
 * Date: 2022-02-22
 * Time: 17:10
 */
public class TestDemo {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2001,"qkj");
        map.put(1990,"bit");
        map.put(1981,"张三");
        System.out.println(map);
    }
    public static void main4(String[] args) {
        Collection<String> collection = new ArrayList<>();//<数据类型的包装类>
        collection.add("1111");
        collection.add("2222");
        System.out.println(collection);
    }

    public static void main3(String[] args) {
        int i = 0;
        int k = 0;
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        i = scan.nextInt();
        //
        for(int j=1;j<=i;i++) {

        }
    }
    public static void main2(String[] args) {

        {
            int k = 10;
            System.out.println(k);
        }
        int k = 20;
        System.out.println(k);
    }







    public static void main1(String[] args) {
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[7]);
            System.out.println("1");
        }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.out.println("异常");
//        }
       catch (NullPointerException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(22222);
        }
        System.out.println("hello");
//        String s = null;
//        System.out.println(s.getBytes(StandardCharsets.UTF_8));
//        int[] arr = {1,2,3};
//        System.out.println(arr[3]);
        //int a = 10/0;
       // System.out.println(a);
    }
}
