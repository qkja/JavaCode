package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-20
 * Time: 18:20
 */
class Node {
    public int age;
}

public class TestDemo3 {
    public static void func(Node node1,Node node2) {
        int ret = node1.age;
        node1.age = node2.age;
        node2.age = ret;
    }
    public static void func(String node1,String node2) {
        String str = node1;
        node1 = node2;
        node2 = str;
        System.out.println(node1);
        System.out.println(node2);
    }

    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "bbb";
        func(str1,str2);
        System.out.println(str1);
        System.out.println(str2);
    }
    public static void main1(String[] args) {
        Node node1 = new Node();
        node1.age = 1;
        Node node2 = new Node();
        node2.age = 2;
        func(node1,node2);
        System.out.println(node1.age);
        System.out.println(node2.age);
    }
}
