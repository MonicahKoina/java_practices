package Tracom.Stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Person> people = getPeople();
//        List<Person> females = new ArrayList<>();
      /*imperative
         for (Person person : people) {
            //if(person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(p -> System.out.println(p.getName()));

       */
        //declarative
        //stream provides a filter method

        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .toList();
        females.forEach(System.out::println);
    }
    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
