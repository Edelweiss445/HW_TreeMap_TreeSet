import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person ("Вася", "Пучкин Тучкин", 26));
        people.add(new Person("Виталий", "Губкин Боб Спанч", 19));
        people.add(new Person("Крендель", "Джавин Магомед Ильхам", 32));
        people.add(new Person("Христофер", "Букин Кукин", 29));
        people.add(new Person("Леонардо", "ди сер Пье́ро да Ви́нчи", 18));

        System.out.println(people);


        Collections.sort(people,  new PersonComparat(3));
        System.out.println(people);
    }
}
