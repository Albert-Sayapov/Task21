import java.util.Comparator;

public class PersonSurnameLengthComporator implements Comparator<Person> {

    private int size;

    public PersonSurnameLengthComporator(int size) {
        this.size = size;
    }

    @Override
    public int compare(Person o1, Person o2) {
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
    }
}
