package bit.www.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-21
 * Time: 15:34
 */
class Count {
    public int count;
    public void func() {
        count++;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Count count = new Count();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                int i = 0;
                while (i < 50000) {
                    count.func();
                    i++;
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                int j = 0;
                while (j < 50000) {
                    count.func();
                    j++;
                }
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count.count);
    }
}
