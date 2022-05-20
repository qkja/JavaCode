package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-20
 * Time: 14:33
 */
class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println(TestThread.currentThread().getName());
    }
}
public class MyThread {

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();

        t1.start(); // 启动线程 t1
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
