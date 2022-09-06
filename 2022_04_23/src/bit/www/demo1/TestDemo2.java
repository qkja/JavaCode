package bit.www.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-24
 * Time: 16:04
 */

public class TestDemo2 {
    static class Count {
        public int count = 0;

        synchronized public void increase() {
            synchronized (this) {
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Count count = new Count();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    count.increase();
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    count.increase();
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
