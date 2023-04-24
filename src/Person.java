public class Person  {
    protected String name;
    protected String surname;
    protected int age;

    public  Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

//    @Override
//    public int compareTo(Object o) {
//        return Integer.compare();
//    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
