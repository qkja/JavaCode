package bit.www.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:    复习反射
 * User: Qkj
 * Date: 2022-05-09
 * Time: 10:14
 */
class Student{
    //私有属性name
    private String name = "bit";
    //公有属性age
    public int age = 18;
    //不带参数的构造方法
    public Student(){
        System.out.println("Student()");
    }
//    public Student(int val){
//        System.out.println("Student()");
//    }
    private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
    }
    private void eat(){
        System.out.println("i am eat");
    }
    public void sleep(){
        System.out.println("i am pig");
    }
    private void function(String str) {
        System.out.println(str);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestDemo {
    /**
     * 创建对像
     */
    public static void reflectNewInstance() {
        try {
            Class<?> classStudent = Class.forName("bit.www.demo1.Student");
            Object objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;
            System.out.println("获得了一个对象  "+ student);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    //反射  构造方法
    public static void reflectPrivateConstructor() {
        try {
            Class<?> classStudent = Class.forName("bit.www.demo1.Student");

            //获得所有的共有的构造方法
            Constructor<?>[] constructors = classStudent.getConstructors();
            for (Constructor<?> ret:constructors) {
                System.out.println(ret);
            }


//            Constructor<?> studentConstructor =  classStudent.getDeclaredConstructor(String.class,int.class);
//            //可以访问的  修改
//            studentConstructor.setAccessible(true);
//            Object objectStudent = studentConstructor.newInstance("高博",15);
//
//            Student student = (Student) objectStudent;
//            System.out.println("获得私有构造哈数且修改姓名和年龄："+student);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 发射  属性
     */
    public static void reflectPrivateField(){
        try {
            Class<?> c1 = Class.forName("bit.www.demo1.Student");
            Student student = (Student) c1.newInstance();
            //下面 就是  属性
            Field field = c1.getDeclaredField("name");

            field.setAccessible(true);
            field.set(student,"qkj");
            System.out.println(student);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    public static void reflectPrivateMethod() {
        try {
            Class<?> c1 = Class.forName("bit.www.demo1.Student");
            Student student = (Student) c1.newInstance();

            Method method = c1.getDeclaredMethod("function", String.class);
            method.setAccessible(true);
            method.invoke(student,"我是第一次反射 私有的方法");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
    /**
     * 练习使用    反射类里面的方法
     * @param args
     */
    public static void main(String[] args) {
        //reflectNewInstance();
        //reflectPrivateConstructor();

        //reflectPrivateField();
        reflectPrivateMethod();
    }

    /**
     * 获取反射类  对象 的三种方法
     * @param args
     */
    public static void main1(String[] args) {
        /**
         * 使用    getClass 方法  是不是表示  每一个类都默认继承了一个   其他类？
         */
        Student student = new Student();
        Class c1 = student.getClass();

        /**
         * 直接使用  .class方法
         * 直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高
         * 这说明任何一个类都有一个隐含的 静态成员变量  class
         */
        Class c2 = Student.class;

        /**
         * 通过 Class 对象的 forName() 静态方法来获取，用的最多，
         * 但可能抛出 ClassNotFoundException 异常
         */
        Class c3 = null;
        try {
            c3 = Class.forName("bit.www.demo1.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
