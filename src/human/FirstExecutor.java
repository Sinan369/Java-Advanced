package human;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class FirstExecutor {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.loadPerson();
        Iterator<Person> personIterator = personList.iterator();
        System.out.println("--------Iterator-------");
        while (personIterator.hasNext()){
            Person person = personIterator.next();
            if (person.getName().equals("Sinan")){
                personIterator.remove();
            }
        }
        for (Person person : personList){
            System.out.println(person);
        }
        System.out.println("--------Spliterator-------");

        personList.forEach(System.out::println);

    }
}
