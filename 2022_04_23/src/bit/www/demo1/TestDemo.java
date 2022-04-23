package bit.www.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-23
 * Time: 14:50
 */

//import java.sql.Array;
import java.util.Arrays;
import java.lang.reflect.Array;

/**
 * 泛型
 * 作用
 * 1.自动进行类型检查
 * 2.自动进行类型转换
 *
 * 注意   简单类型int  float不能作为泛型的参数
 * @param <T>  代表传入类型    代表当前类是一个泛型类   T：相当于一个占位符
 */
class Student<T> {
    //public T[] object = new Object[10];  //error  不能实例化泛型类型的数组

    public T[] object;
    //使用反射创建数组

    /**
     * 正确
     * @param clazz
     * @param capacity
     */
    public Student(Class<T> clazz,int capacity) {
        object = (T[]) Array.newInstance(clazz,capacity);
    }
    public void set(int pos,T val) {
        this.object[pos] = val;
    }
    public T get(int pos) {
        return this.object[pos];
    }

    public T[] getObject() {
        return object;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Student<String> student = new Student<>(String.class,10);
        String[] str = student.getObject();
    }
    public static void main1(String[] args) {
//        Student<String> student = new Student<>();//后面的可写可不写
//        student.set(0,"hwell");
//        //student.set(1,1);          //动进行类型检查
//        String str = student.get(0); //自动进行类型转换
//
//        Student student1 = new Student();//又给他裸漏出来了
    }
}
