package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    private Map<String, Person> persons = new HashMap<>();

    public Optional<Person> getPersonById(String id) {
        return Optional.ofNullable(persons.get(id));
    }

    public void addPerson(Person person) {
        persons.put(person.id(), person);
    }

    public int countGender(Gender gender) {
        int count = 0;
        for (Person person : persons.values()) {
            if (person.gender().equals(gender)) count++;
        }
        return count;
    }
}
