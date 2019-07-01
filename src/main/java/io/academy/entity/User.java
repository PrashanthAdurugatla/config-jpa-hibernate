package io.academy.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity

public class User {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    private  String firstName;
    private  String lastName;

    @Column(unique = true)
    private  String email;

    @OneToOne
    private Address address;

    public User( ) {
        this.id = UUID.randomUUID()
                .toString();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
