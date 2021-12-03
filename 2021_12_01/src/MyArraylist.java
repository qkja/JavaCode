import java.util.Arrays;

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
    public static final int intCapacity = 10;   //初始容量
    public MyArraylist() {

        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    // 打印顺序表
    public void display() {

        for (int i = 0; i < this.usedSize; i++) {

            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    //判断满
    private boolean ifFull() {

        if(this.usedSize==this.elem.length) {
            //满了
            return true;
        }
        return false;
    }

    //判断空
    private boolean ifEmpty() {

        return this.usedSize==0;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {

        if(ifFull()) {
            //二倍扩容
            this.elem = Arrays.copyOf(this.elem,2 * this.elem.length);
        }

//        if(ifLeg(pos)) {
//
//            throw new RuntimeException("不合法");
//        }

        if (pos < 0 || pos > this.usedSize) {

            System.out.println("不合法");
            return;
        }

        int i = this.usedSize - 1;
        while(i >= pos) {
            this.elem[i + 1] = this.elem[i];
            i--;
        }
        this.elem[pos] = data;
        this.usedSize++;

//            int i = this.usedSize - 1;
//            while(i >= pos) {
//                this.elem[i + 1] = this.elem[i];
//                ;
//                i--;
//            }
//
//
//            this.elem[pos] = data;
//            this.usedSize++;

//            int i = usedSize;
//            //尾插  + 头插
//            if (pos == i) {
//                this.elem[i] = data;
//                //usedSize++;
//            } else {
//
//                i--;
//                while(i >= pos) {
//                    this.elem[i+1] = this.elem[i];
//                    i--;
//                }
//                this.elem[i+1] = data;
//                //usedSize++;
//            }
//            usedSize++;


    }

    //判断合法
    private boolean ifLeg(int pos) {

        if(pos<0||pos>this.usedSize) {
            //
            return true;
        }
        return false;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {

            if(this.elem[i] == toFind)
                return true;
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {

        for (int i = 0; i < this.usedSize; i++) {

            if(this.elem[i] == toFind)
                return i;
        }
        return -1;
    }


    // 获取 pos 位置的元素
    public int getPos(int pos) {

        if(ifEmpty()) {

            throw new RuntimeException("顺序表为空");
            // return -1;  //如果那个元素就是  -1

        }

        if(ifLeg(pos)) {

            throw new RuntimeException("不合法");
        }

        return this.elem[pos];

//        //若是空
//        if(this.usedSize==0) {
//            return -1;
//        }
//        //判断合法性
//        if(pos < this.usedSize){
//
//            return this.elem[pos];
//        }
//
//
//        return -1;

//        return -1;
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {


        if(ifEmpty()) {

            throw new RuntimeException("顺序表为空");
            // return -1;  //如果那个元素就是  -1
        }

        if(ifLeg(pos)) {

            throw new RuntimeException("不合法");
        }

        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {

        int i = search(toRemove);
        if(-1==i) {
            System.out.println("不存在这个数");
        } else {
            for(;i < this.usedSize-1;i++) {

                this.elem[i] = this.elem[i + 1];
            }
           this.usedSize--;

        }

    }

    // 获取顺序表长度
    public int size() {

        return this.usedSize;
        //return 0;
    }

    // 清空顺序表
    public void clear() {

        //如何清空

        this.usedSize = 0;
        System.out.println("clear");
    }
}
