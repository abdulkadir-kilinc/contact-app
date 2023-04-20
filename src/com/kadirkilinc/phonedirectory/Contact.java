package com.kadirkilinc.phonedirectory;

import java.util.Objects;

public class Contact {

    private String fullName;
    private String phoneNumber;
    private String email;

    public Contact(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact directory)) return false;
        return getFullName().equals(directory.getFullName()) && getPhoneNumber().equals(directory.getPhoneNumber()) && getEmail().equals(directory.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getPhoneNumber(), getEmail());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber = ' " + phoneNumber + '\'' +
                ",email= ' " + email + '\'' +
                '}';
    }
}




