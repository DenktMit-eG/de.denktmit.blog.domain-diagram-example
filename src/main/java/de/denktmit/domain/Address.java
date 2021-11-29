package de.denktmit.domain;

public class Address {

    private final String street;
    private final int houseNumber;

    private final String postcode;
    private final String city;

    public Address(String street, int houseNumber, String postcode, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.city = city;
    }
}
