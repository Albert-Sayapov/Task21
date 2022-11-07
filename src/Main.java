import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Альберт", "123456", 30));
        personList.add(new Person("Андрей", "123", 31));
        personList.add(new Person("Алексей", "1234", 19));
        personList.add(new Person("Роман", "1234", 18));

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            int size = 3;
            int person1 = o1.getSurname().length();
            int person2 = o2.getSurname().length();

            if (person1 > size && person2 > size) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }

            if (person1 < person2) {
                return Integer.compare(person1, person2);
            } else if (person1 > person2) {
                return Integer.compare(person1, person2);
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(personList, comparator);
        System.out.println(personList);
    }
}
