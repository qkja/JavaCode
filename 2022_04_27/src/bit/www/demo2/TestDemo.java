package bit.www.demo2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:   自定类型的堆排序
 * User: Qkj
 * Date: 2022-04-27
 * Time: 18:55
 */
class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}

class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class TestDemo {
    public static void adjustDown(Person[] array,int length,int root) {
        if(array == null) {
            return;
        }
        AgeComparator ageComparator = new AgeComparator();
        int parent = root;
        int child = parent*2+1;
        while (child < length) {
            if(child+1<length && ageComparator.compare(array[child+1],array[child]) > 0) {
                child++;
            }
            if(ageComparator.compare(array[parent],array[child]) < 0) {
                Person ret = array[parent];
                array[parent] = array[child];
                array[child] = ret;
            } else {
                break;
            }
            parent = child;
            child = parent*2+1;
        }
    }
    public static void adjustUp(Person[] array,int length) {
        //建立大堆
        AgeComparator ageComparator = new AgeComparator();
        int child = length -1;
        int parent = (child-1)/2;

        while (child > 0) {
            if(ageComparator.compare(array[parent],array[child]) < 0) {
                Person ret = array[parent];
                array[parent] = array[child];
                array[child] = ret;
            }else {
                break;
            }
            child = parent;
            parent = (child-1)/2;
        }
    }

    public static void heapSort(Person[] array) {
        if(array == null) {
            return;
        }
        //使用向上调整
        for(int i=1;i<array.length;i++) {
            adjustUp(array,i+1);
        }

        //交换
        for (int i = 0; i < array.length; i++) {
            //交换 堆顶   堆尾
            Person ret = array[0];
            array[0] = array[array.length -1-i];
            array[array.length -1-i] = ret;
            //向下调整
            adjustDown(array,array.length-1-i,0);
        }
    }
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("a",1);
        people[1] = new Person("b",4);
        people[2] = new Person("c",-1);
        //adjustUp(people,2);
        //堆排序
        heapSort(people);
        //adjustDown(people,2,0);
        System.out.println(Arrays.toString(people));
    }
}
