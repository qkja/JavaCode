/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-12-02
 * Time: 13:38
 */
public class MyArraylist {

    public int[] elem;     //数组
    public int usedSize;   //有效的数据个数
    public static final int capacity = 10;   //初始容量
    public MyArraylist() {

        this.elem = new int[capacity];
        this.usedSize = 0;
    }
}
