import java.util.Comparator;

public class PersonComparat implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.surname.length() > o2.surname.length()) {
            return -1;
        } else if (o1.surname.length() < o2.surname.length()) {
            return 1;
        } else {
            if (o1.age > o2.age) {
                return -1;
            } else if (o1.age < o2.age) {
                return 1;
            }
            return 0;
        }
    }

}
//return Integer.compare(o1.surname.length(), o2.surname.length());