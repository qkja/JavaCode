package bit.www.demo3;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-05-06
 * Time: 21:39
 */
public class TestDemo {
    static class Person {
        public String ID;
        public Person(String ID) {
            this.ID = ID;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return ID.equals(person.ID);
        }

        @Override
        public int hashCode() {
            return Objects.hash(ID);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "ID='" + ID + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("123");
        Person person2 = new Person("123");
        HashBuck<Person,String> hashBuck = new HashBuck<>();
        hashBuck.put(person1,"bit");
        System.out.println(hashBuck.get(person2));
        //System.out.println(person1.hashCode());
        //System.out.println(person2.hashCode());
    }
}
