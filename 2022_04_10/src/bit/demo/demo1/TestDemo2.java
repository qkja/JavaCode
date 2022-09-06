package bit.demo.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-10
 * Time: 9:05
 */
public class TestDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                int count = 0;
                while (count < 5) {
                    System.out.println("线程进行中");
                    count++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
                System.out.println("工作结束");
            }
        };
        t.start();
        t.interrupt();
        System.out.println("执行开始");

        t.join();
        System.out.println("执行结束");


    }
}
