package bit.www.demo1;
import java.util.TreeMap;



class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("hello Thread");
            try {
                Thread.sleep(1000);//让这个线程休眠一段时间，暂时调离CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        //thread.run();
        while (true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);//让这个线程休眠一段时间，暂时调离CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}







/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-08
 * Time: 10:29
 */

//Thread 是标准库里面的类
// 常用方法我们继承这个类，
//重写run方法
//class MyThread extends Thread {
//    @Override
//    public void run() {
//       while (true) {
//           System.out.println("hello Thread");
//           try {
//               Thread.sleep(1000);//让这个线程休眠一段时间，暂时调离CPU
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
//       }
//    }
//}


//class MyRunnable implements Runnable{
//    @Override
//    public void run() {
//
//    }
//}
//public class TestDemo {
//    public static void main(String[] args) {
//        Thread thread = new Thread(()->{
//            while (true) {
//                System.out.println("hello Thread");
//                try {
//                    Thread.sleep(1000);//让这个线程休眠一段时间，暂时调离CPU
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//}
//public class TestDemo {
//    public static void main(String[] args) {
//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });







        //相当于创建了一个 内部类，这个类继承了 Thread
//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//               //任务
//            }
//        };

        //Thread thread = new Thread(new MyRunnable()); //将一个实例作为参数

//    }
//}
//public class TestDemo {
//    public static void main(String[] args) {
//      Thread thread = new Thread(new MyRunnable());
//        //thread.start();
//        thread.run();
//        while (true) {
//            System.out.println("hello main");
//            try {
//                Thread.sleep(1000);//让这个线程休眠一段时间，暂时调离CPU
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
