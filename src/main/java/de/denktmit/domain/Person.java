package de.denktmit.domain;

import java.util.List;

public class Person {

    private final String firstName;
    private final String secondName;

    private final Address address;

    private final List<Hobby> hobbies;

    public Person(String firstName, String secondName, Address address, List<Hobby> hobbies) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.hobbies = hobbies;
    }
}
