package www.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-20
 * Time: 14:57
 */
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
