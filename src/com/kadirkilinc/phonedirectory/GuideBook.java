package com.kadirkilinc.phonedirectory;

import java.util.ArrayList;
import java.util.List;


public class GuideBook {


    private List<Contact> directory;

    public GuideBook() {
        directory = new ArrayList<>();
    }

    public void addPerson(Contact person) {
        directory.add(person);
    }

    public void deleteContact(Contact person) {
        directory.remove(person);

    }
    public void printDirectory(){
        for (Contact person : directory ){
            System.out.println(person.toString());
        }
    }

    public Contact updateContact(Contact person, String fullName, String email, String phoneNumber) {
        for (Contact person1 : directory) {
            if (person1.equals(person)) {
                person1.setFullName(fullName);
                person1.setEmail(email);
                person1.setPhoneNumber(phoneNumber);

                return person1;
            }

        }
        throw new IllegalArgumentException("Person is not found");

        //contact not found exception bunu düzelt!
    }

    public Contact findContactByName(String fullName) {
        for (Contact person1 : directory) {
            if (person1.getFullName().equals(fullName)) {
                return person1;
            }
        }
        throw new IllegalArgumentException("Person is not found");
    }
}
