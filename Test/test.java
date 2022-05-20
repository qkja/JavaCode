





// 第五题
class Measure {
    private double weight;

    public void setWeight(double weight) {
        if (!(weight > 0 && weight < 100)) {
            throw new ArithmeticException("输入不符合规定");
        }
        this.weight = weight;
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Measure measure = new Measure();
        measure.setWeight(100);
    }
}



// 第六题
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
