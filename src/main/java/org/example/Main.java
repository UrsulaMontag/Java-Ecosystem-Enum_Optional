package org.example;

import java.util.HashMap;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonRepository myPersons = new PersonRepository();
        myPersons.addPerson(new Person("id-1", "Max", Weekday.FRIDAY));
        myPersons.addPerson(new Person("id-2", "Gerlinde", Weekday.MONDAY));
        myPersons.addPerson(new Person("id-3", "Gisela", Weekday.SUNDAY));

        printPersonsName(myPersons.getPersonById("id-2"));
        printPersonsName(myPersons.getPersonById("id-4"));

    }

    static void printPersonsName(Optional<Person> person) {
        if (person.isPresent())
            System.out.println("Found person name: " + person.get().name() + " and its favorite day: " + person.get().favoriteDay());
        else System.out.println("Person not found.");
    }
}