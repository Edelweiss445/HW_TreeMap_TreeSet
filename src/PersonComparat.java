import java.util.Comparator;


public class PersonComparat implements Comparator<Person> {
    private int maxWordsInSurname;

    public PersonComparat(int maxWordsInSurname) {
        this.maxWordsInSurname = maxWordsInSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return Comparator.comparing((Person p) -> p.getSurname().split(" ").length < maxWordsInSurname)
                .thenComparingInt((Person p) -> p.getSurname().split(" ").length)
                .reversed()
                .thenComparingInt(Person::getAge)
                .compare(o1, o2);

    }
}
