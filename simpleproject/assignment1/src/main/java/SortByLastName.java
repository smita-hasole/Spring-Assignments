import java.util.Comparator;

public class SortByLastName implements Comparator<Person> {
    public int compare(Person fisrtPerson, Person secondPerson) {
        return fisrtPerson.lastName.compareTo( secondPerson.lastName);
    }
}
