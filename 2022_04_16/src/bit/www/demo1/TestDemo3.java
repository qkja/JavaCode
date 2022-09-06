package bit.www.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-16
 * Time: 19:02
 */
public class TestDemo3 {

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
        System.out.println(Thread.interrupted());
//        System.out.println(t.isInterrupted());
        System.out.println("线程结束");
    }
//    public static boolean flag = true;
//    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread() {
//            @Override
//            public void run() {
//                while (flag) {
//
//                    System.out.println("线程运行中 ...");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        //t.interrupt();
//        t.start();
//
//        try {
//            Thread.sleep(1500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        flag = false;
//        System.out.println("线程结束");
//    }
}
