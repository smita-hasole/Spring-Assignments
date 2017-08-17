public class Person {

    String fisrtName , lastName;
    int age;

    public Person(String fisrtName, String lastName, int age) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
