package bit.www.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-16
 * Time: 17:44
 */

public class TestDemo2 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {

                    System.out.println("MyThread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }
}
