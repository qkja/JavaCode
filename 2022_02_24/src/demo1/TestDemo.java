package demo1;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-24
 * Time: 14:06
 */
class Student implements Comparable<Student> {
    protected String name;
    protected String classroom;
    protected double score;
    public Student(String name,String classroom,double score) {
        this.name = name;
        this.classroom = classroom;
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.score>o.score) {
            return 1;
        } else if(this.score<o.score) {
            return -1;
        } else {
            return 0;
        }
    }
}
class Card {
    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }
}

public class TestDemo {

    public static void main(String[] args) {

    }
    public static void main3(String[] args) {
        String str1 = "welcome bit";
        String str2 = "come";
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < str1.length(); i++) {
            String str3 = "" + str1.charAt(i);

            if(str2.contains(str3)) {
                list.add(' ');
            } else {
                list.add(str1.charAt(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        //System.out.println(list);
    }
    public static void main2(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    public static void main1(String[] args) {
        List<Student> list = new LinkedList<>();
        list.add(new Student("张三","一",70.0));
        list.add(new Student("李四","一",50.0));
        list.add(new Student("王五","一",30.0));
        Collections.sort(list);
        System.out.println(list);
    }
}
