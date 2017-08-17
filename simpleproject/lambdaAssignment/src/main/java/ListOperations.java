import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOperations {
    public static void main(String[] args)
    {
        ListOperations ex= new ListOperations();
        // Create a list of persons object

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );


        // to show unsorted original object list
        ex.showList(people);
       // people.sort();
        //Lambda function
        Comparator<Person> sortByLastName=(Person fisrtPerson, Person secondPerson)->{
            return fisrtPerson.lastName.compareTo( secondPerson.lastName);};
        Collections.sort(people, sortByLastName);

        // to show sorted object list
        System.out.println("\n\nList after the use of" +
                " Collection.sort() :\n");
       // ex.showList(sortByLastName.sortByLastName());
        ex.showList(people);


        // to prints all people that have last name beginning with C

        FindLastNames showPeopleNameStartWithC = (peopleList)-> {
            for (Person person : people) {
                if (person.lastName.charAt(0) == 'C') {
                    System.out.println("\n\npeople that have last name beginning with 'C' is: " + person);
                }
            }
        };

        showPeopleNameStartWithC.showPeopleNameStartWithC(people);
        }


    private void showList(List<Person> list){
        System.out.println("list is :: ");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
    }

}
