package human;

import java.util.List;

public class FirstExecutor {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.loadPerson();

        for (Person person : personList){
            System.out.println(person);
        }
    }
}
