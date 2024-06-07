package org.example;

import java.util.HashMap;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonRepository myPersons = new PersonRepository();
        myPersons.addPerson(new Person("id-1", "Max", Weekday.FRIDAY, Gender.DIVERSE));
        myPersons.addPerson(new Person("id-2", "Gerlinde", Weekday.MONDAY, Gender.FEMALE));
        myPersons.addPerson(new Person("id-3", "Gisela", Weekday.SUNDAY, Gender.FEMALE));
        myPersons.addPerson(new Person("id-4", "Bernd", Weekday.SATURDAY, Gender.MALE));

        printPersonsName(myPersons.getPersonById("id-2"));
        printPersonsName(myPersons.getPersonById("id-4"));

        System.out.println("Counting persons with gender diverse: " + myPersons.countGender(Gender.DIVERSE));
        System.out.println("Counting persons with gender female: " + myPersons.countGender(Gender.FEMALE));
        System.out.println("Counting persons with gender male: " + myPersons.countGender(Gender.MALE));

    }

    static void printPersonsName(Optional<Person> person) {
        if (person.isPresent())
            System.out.println("Found person name: " + person.get().name() + " and its favorite day: " + person.get().favoriteDay());
        else System.out.println("Person not found.");
    }

}