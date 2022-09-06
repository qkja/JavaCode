package bit.demo.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-10
 * Time: 7:56
 */
public class TestDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                while (!Thread.interrupted()) {
                    System.out.println("线程进行中");
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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.isInterrupted());
        t.interrupt();
        System.out.println(t.isInterrupted());

    }
}
