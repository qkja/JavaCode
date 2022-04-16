package bit.www.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-16
 * Time: 20:10
 */
public class TestDemo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                // 默认 是 Thread.currentThread().isInterrupted()  false
                while (!Thread.currentThread().isInterrupted()) {

                    System.out.println("线程运行中 ...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };
        t.start();
        Thread.sleep(3000);
        //打断程序  标记位 设为  true
        t.interrupt();
        //System.out.println(Thread.interrupted());
        System.out.println(t.isInterrupted());
        System.out.println("线程结束");
    }
}
