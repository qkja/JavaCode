package bit.www.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:   实现  HashMap
 * User: Qkj
 * Date: 2022-05-06
 * Time: 17:56
 */

public class TestDemo {
    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        hashBuck.put(1,1);
        hashBuck.put(12,12);
        hashBuck.put(3,3);
        hashBuck.put(6,6);
        hashBuck.put(7,7);
        hashBuck.put(2,2);
        hashBuck.put(20,2);
        hashBuck.put(8,2);
        hashBuck.put(2,2);
        hashBuck.put(13,2);
        System.out.println(hashBuck.get(20));
    }
}
