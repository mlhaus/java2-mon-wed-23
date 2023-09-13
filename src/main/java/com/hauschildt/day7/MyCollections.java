package com.hauschildt.day7;

import com.hauschildt.day2.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>(Arrays.asList("Python", "C#", "Java", "PHP", "Cobol"));
        List<String> copy = new ArrayList<>(programmingLanguages);

        // filter anything that doesn't start with the letter P
        copy.removeIf((language) -> language.toLowerCase().charAt(0) != 'p');
        copy.forEach(System.out::println);
        System.out.println();
        programmingLanguages.forEach(System.out::println);

        List<Person> people = new ArrayList<>(){{
            add(new Person("Python"));
            add(new Person("C#"));
            add(new Person("Java"));
            add(new Person("PHP"));
            add(new Person("Cobol"));
        }};
        List<Person> copy2 = new ArrayList<>(people);

        // filter anything that doesn't start with the letter P
        copy2.removeIf((person) -> person.getName().toLowerCase().charAt(0) != 'p');
        copy2.forEach(System.out::println);
        System.out.println();
        people.forEach(System.out::println);
    }
}