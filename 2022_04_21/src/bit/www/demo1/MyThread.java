package bit.www.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-21
 * Time: 14:35
 */

public class MyThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    // System.out.println("正在运行");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };


    }

}

//public class MyThread {
//    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(){
//            @Override
//            public void run() {
//                while (!Thread.currentThread().isInterrupted()) {
//                   // System.out.println("正在运行");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                        break;
//                    }
//                }
//            }
//        };
//
//        t.start();
//        t.interrupt();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(t.getState());
//
//    }
//
//
//
//    public static void main1(String[] args) {
//        Thread t = new Thread(){
//            @Override
//            public void run() {
//                int count = 0;
//                while(count < 5) {
//                    System.out.println("正在工作");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    count++;
//                }
//            }
//        };
//
//        t.start();
//        try {
//            System.out.println("开始工作");
//            t.join(1000);
//            System.out.println("结束工作");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
