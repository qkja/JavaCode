package bit.demo.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-10
 * Time: 15:22
 */


public class TestDemo4 {
    public static void main(String[] args) {
        Thread t = new Thread("第一线程") {
            @Override
            public void run() {
                while (true) {

                }
            }
        };
        t.start();
        System.out.println(t.getState());
    }
}

//public class TestDemo4 {
//    public static void main(String[] args) {
//        Thread t1 = new Thread("第一线程") {
//            @Override
//            public void run() {
//
//            }
//        };
//        Thread t2= new Thread() {
//            @Override
//            public void run() {
//
//            }
//        };
//        System.out.println(t1.getState());
//        t2.start();
//        System.out.println(t2.getState());
//
////        System.out.println(t1.getId());
////        System.out.println(t2.getId());
////        Thread t3= new Thread() {
////            @Override
////            public void run() {
////
////            }
////        };
//
////        System.out.println(t1.getName());
////        System.out.println(t2.getName());
////        System.out.println(t3.getName());
//    }
//}

//public class TestDemo4 {
//    public static long count = 1000000000;
//
//    /**
//     * 串行
//     */
//    public static void serial() {
//        long begin = System.currentTimeMillis();
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < count; i++) {
//            a++;
//        }
//        for (int i = 0; i < count; i++) {
//            b++;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("serial time = " + (end - begin));
//
//    }
//
//    /**
//     * 并发
//     */
//    public static void multiThread() {
//        long begin = System.currentTimeMillis();
//        Thread t1 = new Thread() {
//            @Override
//            public void run() {
//                int a = 0;
//                for (int i = 0; i < count; i++) {
//                    a++;
//                }
//            }
//        };
//        Thread t2 = new Thread() {
//            @Override
//            public void run() {
//                int b = 0;
//                for (int i = 0; i < count; i++) {
//                    b++;
//                }
//            }
//        };
//        t1.start();
//        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println("multiThread() time = " + (end - begin));
//    }
//
//    public static void main(String[] args) {
//        serial();
//        multiThread();
//    }
//}

//    public static void main(String[] args) {
//
//        long begin =  System.nanoTime();
//        Thread t = new Thread() {
//            @Override
//            public void run() {
//
//                while (count < 200000000) {
//                    count++;
//                }
//            }
//        };
//        t.start();
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        long end = System.nanoTime();
//        System.out.println(end - begin);
//    }
//}




//public class TestDemo4 {
//    public static int count = 0;
//    public static void main(String[] args) {
//
//
//
//        Thread t2 = new Thread() {
//            @Override
//            public void run() {
//                long begin =  System.nanoTime();
//                while (count < 100000000) {
//                    count++;
//                }
//                long end = System.nanoTime();
//                System.out.println(end - begin);
//            }
//        };
//
//
//
//
//        Thread t1 = new Thread() {
//            @Override
//            public void run() {
//
//                long begin =  System.nanoTime();
//                while (count < 200000000) {
//                  count++;
//                }
//                long end = System.nanoTime();
//                System.out.println(end - begin);
//            }
//        };
//        t1.start();
//    }
//}




//public class TestDemo4 {
//    public static void main(String[] args) {
//        Thread t = new Thread() {
//            @Override
//            public void run() {
//                System.out.println("hello Thread");
//            }
//        };
//
//
//
//        //t.run();
////        t.start();
////        //System.out.println(t);
////        System.out.println(t.isAlive());
////        System.out.println(t.isAlive());
////        System.out.println(t.isAlive());
////        System.out.println(t.isAlive());
////        t.interrupt();
////        System.out.println(t.isAlive());
//
//    }
//}
