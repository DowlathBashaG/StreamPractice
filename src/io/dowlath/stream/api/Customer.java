package io.dowlath.stream.api;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;


    public Customer() {
    }


    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // More secure if write getter method using Optional. it is recommended for reactive pgms.
    /*public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }*/

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(phoneNumbers, customer.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phoneNumbers);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
