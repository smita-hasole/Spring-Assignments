
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssignmentUsingJava7 {

    public static void main(String[] args)
    {
        AssignmentUsingJava7 ex= new AssignmentUsingJava7();
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

        Collections.sort(people, new SortByLastName());
        // to show sorted object list
        System.out.println("List after the use of" +
                " Collection.sort() :\n");
        ex.showList(people);

        // to prints all people that have last name beginning with C
    ex.showPeopleNameStartWithC(people);

    }

    private void showList(List<Person> list){
        System.out.println("list is :: ");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
    }

    private void showPeopleNameStartWithC(List<Person> people){

        for (Person person:people) {
           if(person.lastName.charAt(0)=='C'){
               System.out.println("people that have last name beginning with 'C' is: "+ person);
           }
        }
    }
}
