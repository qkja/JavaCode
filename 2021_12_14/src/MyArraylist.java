/**
 * Created with IntelliJ IDEA.
 * Description:
 *      顺序表博客
 * User: Qkj
 * Date: 2021-12-14
 * Time: 18:29
 */
public class MyArraylist {

    public int[] elem;         //定义一个数组
    public int usedSize;       //数组使用的长度
    public static final int intCapacity = 10;   //初始容量
    //构造方法
    public MyArraylist() {

        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    // 打印顺序表
    public void display() { }
    // 在 pos 位置新增元素
    public void add(int pos, int data) { }
    // 判定是否包含某个元素
    public boolean contains(int toFind) { return true; }
    // 查找某个元素对应的位置
    public int search(int toFind) { return -1; }
    // 获取 pos 位置的元素
    public int getPos(int pos) { return -1; }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {   }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {   }
    // 获取顺序表长度
    public int size() { return 0; }
    // 清空顺序表
    public void clear() {   }
}
