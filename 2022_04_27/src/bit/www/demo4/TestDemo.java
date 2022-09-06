package bit.www.demo4;

import bit.www.demo3.HeapSort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-04-27
 * Time: 20:26
 */
class Teacher {
    public String name;
    public int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.age - o2.age;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("a",10000);
        teachers[1] = new Teacher("b",4);
        teachers[2] = new Teacher("c",-1);
        HeapSort.sort(teachers,new AgeComparator());
        System.out.println(Arrays.toString(teachers));
    }
}
