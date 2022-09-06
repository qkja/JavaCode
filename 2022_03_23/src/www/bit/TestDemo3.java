package www.bit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-23
 * Time: 15:22
 */

public class TestDemo3 {

    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).

    public static void move(char pos1,char pos2) {
        System.out.print(pos1 + "->" + pos2+" ");

    }
    public static void Hanoi(int n ,char pos1,char pos2,char pos3) {
        if (1==n) {
            move(pos1,pos3);
        } else {
            Hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            Hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        Hanoi(1,'A','B','C');
        System.out.println();
        Hanoi(2,'A','B','C');
        System.out.println();
        Hanoi(3,'A','B','C');
        System.out.println();
    }


//    public static int func(int n) {
//        if(n == 1) {
//            return 1;
//        }
//        return n * func(n-1);
//    }
//    public static int sum(int n) {
//        if(n == 1) {
//            return 1;
//        }
//        return n + sum(n-1);
//    }
    public static void main1(String[] args) {
        //System.out.println(func(3));
        //System.out.println(sum(10));
    }
}
