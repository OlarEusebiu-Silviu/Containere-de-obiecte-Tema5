import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);

        TreeSet<Person> peopleByName = new TreeSet<>(nameComparator);
        TreeSet<Person> peopleByAge = new TreeSet<>(ageComparator);

        Address address1 = new Address("Strada Traian 857", "City1", "Country1");
        Address address2 = new Address("Strada 1 Decembrie 463", "City2", "Country2");
        Address address3 = new Address("Strada Buzaului 768", "City3", "Country3");

        List<Address> cyclingAddresses = Arrays.asList(address1, address2);
        List<Address> swimmingAddresses = Arrays.asList(address2, address3);

        Hobby cycling = new Hobby("cooking", 3, cyclingAddresses);
        Hobby swimming = new Hobby("Swimming", 2, swimmingAddresses);

        List<Hobby> hobbies1 = Arrays.asList(cycling, swimming);
        List<Hobby> hobbies2 = Arrays.asList(swimming);

        Person person1 = new Person("Alina", 27);
        Person person2 = new Person("Sebi", 23);

        Map<Person, List<Hobby>> personHobbiesMap = new HashMap<>();
        personHobbiesMap.put(person1, hobbies1);
        personHobbiesMap.put(person2, hobbies2);


        for (Map.Entry<Person, List<Hobby>> entry : personHobbiesMap.entrySet()) {
            Person person = entry.getKey();
            List<Hobby> hobbies = entry.getValue();

            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
            for (Hobby hobby : hobbies) {
                System.out.println("Hobby: " + hobby.getName() + ", Practice Addresses:");
                for (Address address : hobby.getPracticeAddresses()) {
                    System.out.println("Address: " + address.getCity() + ", " + address.getCountry());
                }
            }
            System.out.println();
        }
    }
}