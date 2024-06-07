package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    private Map<String, Person> persons = new HashMap<>();

    public Map<String, Person> getPersons() {
        return persons;
    }

    public Optional<Person> getPersonById(String id) {
        return Optional.ofNullable(persons.get(id));
    }

    public void addPerson(Person person) {
        persons.put(person.id(), person);
    }


}
