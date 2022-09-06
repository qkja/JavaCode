import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-24
 * Time: 18:34
 */
public class TestDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("abc",3);
        map.put("bit",2);
        map.put("hello",4);
        System.out.println(map);
    }
}
