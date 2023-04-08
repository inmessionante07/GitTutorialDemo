package com.aqua.aquaproject.Aquamodel;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan 
public class UserDetails {
    
    
    private int id;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String email;
    private String address;

    public UserDetails() {
    }
    

    public UserDetails(String lastName, String firstName, String phoneNumber, String email, String address) {
       super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    



}
