package human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PersonReader {

    public List<Person> loadPerson(){
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Sinan", "Rakovica", LocalDate.of(2000,5,10));
        personList.add(p1);
        Person p2 = new Person("Amar", "Nisanovic", LocalDate.of(1995,5,12));
        personList.add(p2);
        Person p3 = new Person("Sinan", "Rakovica", LocalDate.of(1980,6,20));
        personList.add(p3);
        Person p4 = new Person("Sinan", "Rakovica", LocalDate.of(2008,12,23));
        personList.add(p4);

        return personList;


    }

}
