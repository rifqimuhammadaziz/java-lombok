package rifqimuhammadaziz.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test
    void createByConstructor() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Playing Dota 2");
        hobbies.add("Hiking");
        hobbies.add("Learning new tech");

        Person person = new Person("0001", "Xenosty", 22, hobbies);
    }

    @Test
    void createBySetter() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Playing Dota 2");
        hobbies.add("Hiking");
        hobbies.add("Learning new tech");

        Person person = new Person();
        person.setId("0001");
        person.setName("Xenosty");
        person.setAge(22);
        person.setHobbies(hobbies);

        System.out.println(person);
    }

    @Test
    void createByBuilder() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Playing Dota 2");
        hobbies.add("Hiking");
        hobbies.add("Learning new tech");

        Person person = Person.builder()
                .id("0001")
                .name("Xenosty")
                .age(22)
                .hobbies(hobbies)
                .build();

        System.out.println(person);
    }

    @Test
    void createSingularListByBuilder() {
        Person person = Person.builder()
                .id("0001")
                .name("Xenosty")
                .age(22)
                .hobby("Gaming")
                .hobby("Hiking")
                .build();

        System.out.println(person);
    }
}
