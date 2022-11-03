import java.util.Comparator;

public class PersonSurnameLengthComporator implements Comparator<Person> {

    private int size;

    public PersonSurnameLengthComporator(int size) {
        this.size = size;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() > size && o2.getSurname().length() > size) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        if (o1.getSurname().length() < o2.getSurname().length()) {
            return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
        } else if (o1.getSurname().length() > o2.getSurname().length()) {
            return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
