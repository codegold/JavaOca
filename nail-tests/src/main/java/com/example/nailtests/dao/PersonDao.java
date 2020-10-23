package com.example.nailtests.dao;

import com.example.nailtests.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {

        private static int PEOPLE_COUNT;
        private List<Person> people = new ArrayList<>();

    {
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Bob"));
        people.add(new Person(++PEOPLE_COUNT, "Mike"));
        people.add(new Person(++PEOPLE_COUNT, "Kate"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        //попробовать people.get(id).toString
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

}
