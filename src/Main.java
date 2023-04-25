import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person ("Вася", "Пучкин", 26));
        people.add(new Person("Виталий", "Губкиннн", 19));
        people.add(new Person("Крендель", "Джавин", 32));
        people.add(new Person("Христофер", "Букин", 29));
        System.out.println(people);


        Collections.sort(people, new PersonComparat());
        System.out.println(people);
    }
}
