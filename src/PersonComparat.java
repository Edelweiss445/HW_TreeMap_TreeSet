import java.util.Comparator;


public class PersonComparat implements Comparator<Person> {
    private int maxWordsInSurname;

    public PersonComparat(int maxWordsInSurname) {
        this.maxWordsInSurname = maxWordsInSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] o1SurnameWords = o1.getSurname().split(" ");
        String[] o2SurnameWords = o2.getSurname().split(" ");

        int o1SurnameWordsCount = o1SurnameWords.length;
        int o2SurnameWordsCount = o2SurnameWords.length;

        if (o1SurnameWordsCount < maxWordsInSurname && o2SurnameWordsCount < o2SurnameWordsCount) {
            return 0;
        } else if (o1SurnameWordsCount < maxWordsInSurname) {
            return 1;
        } else if (o2SurnameWordsCount < maxWordsInSurname) {
            return -1;
        } else {
            int surnameWordsComparison = Integer.compare(o2SurnameWordsCount, o1SurnameWordsCount);
            if (surnameWordsComparison != 0) {
                return surnameWordsComparison;
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        }
    }
}
