package com.example.cat1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;


public class UserName {

    @Id
    public String id;
    public String _email;
    @Indexed (unique = true)
    public String userName;
    public String firstName;
    public String lastName;
    public String address;
    public int zipCode;
    public String state;
    public String city;

    public UserName() {}

    public UserName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public UserName(String firstName, String lastName, String userName,String _email,
                    String address,String city, String state,int zipCode) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.address = address;
        this.zipCode = zipCode;
        this.state = state;
        this.city= city;
        this._email= _email;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s',userName= '%s',email= '%s',address='%s',city= '%s',"+
                        "state='%s', zipcode= '%s' ]",
                id, firstName, lastName,userName,_email,address, city, state, zipCode);
    }

}