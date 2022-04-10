package bit.demo.demo1;

import static java.lang.Thread.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-10
 * Time: 7:46
 */
public class Testdemo1 {
    private static boolean flag = false;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
               while (!flag) {
                   System.out.println("线程进行中");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
        };
        t.start();
        Thread.sleep(3000);
        //Thread.sleep(3000);

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("工作结束");
        flag = true;
    }
}
