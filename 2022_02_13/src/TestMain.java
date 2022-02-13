import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 * Created with IntelliJ IDEA.
 * Description:  集合 和 后面的数据结构
 * User: Qkj
 * Date: 2022-02-13
 * Time: 18:52
 */
public class TestMain {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a==b);

    }
    public static void main2(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("国民女神","高圆圆");
        System.out.println(map);
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        System.out.println(collection.isEmpty());
        collection.clear();
        System.out.println(collection.isEmpty());
        System.out.println(collection);
    }
}
