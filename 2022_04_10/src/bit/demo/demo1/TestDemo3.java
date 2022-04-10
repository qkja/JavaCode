package bit.demo.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-10
 * Time: 9:45
 */
public class TestDemo3 {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
        System.out.println(t1.getId());
        System.out.println(t2.getId());
//        Thread t = new Thread() {
//
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getId());
//                System.out.println(this.getId());
//            }
//        };
//
//        t.start();
    }
}
