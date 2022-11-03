import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Альберт", "123456", 10));
        personList.add(new Person("Андрей", "123", 15));
        personList.add(new Person("Алексей", "1234", 14));
        personList.add(new Person("Роман", "1234", 18));

        Collections.sort(personList, new PersonSurnameLengthComporator(3));
        System.out.println(personList);
    }
}
