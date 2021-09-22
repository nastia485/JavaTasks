package com.company.model;


import java.util.ArrayList;
import java.util.List;

//pojo
public class Note {
    private String secondName;
    private String firstName;
    private String patronymic;
    private String login;
    private String comment;
    private String homePhoneNumber;
    private String mobPhoneNumber;
    private String mobPhoneNumber2;
    private String email;
    private String skype;
    private String dateOfEntering;
    private String dateOfChange;
    private Address address;
    private String addressString;
    private Group group;

    public Note(String secondName,
                String firstName,
                String patronymic,
                String login,
                String comment,
                String homePhoneNumber,
                String mobPhoneNumber,
                String mobPhoneNumber2,
                String email,
                String skype,
                String dateOfEntering,
                String dateOfChange,
                Address address,
                Group group) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.login = login;
        this.comment = comment;
        this.homePhoneNumber = homePhoneNumber;
        this.mobPhoneNumber = mobPhoneNumber;
        this.mobPhoneNumber2 = mobPhoneNumber2;
        this.email = email;
        this.skype = skype;
        this.dateOfEntering = dateOfEntering;
        this.dateOfChange = dateOfChange;
        this.address = address;
        this.group = group;
    }

    public Note(){}


    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public void setMobPhoneNumber(String mobPhoneNumber) {
        this.mobPhoneNumber = mobPhoneNumber;
    }

    public void setMobPhoneNumber2(String mobPhoneNumber2) {
        this.mobPhoneNumber2 = mobPhoneNumber2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setGroup(Group group) { this.group = group; }

    public void setDateOfEntering(String dateOfEntering) {
        this.dateOfEntering = dateOfEntering;
    }

    public void setDateOfChange(String dateOfChange) {
        this.dateOfChange = dateOfChange;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

    public String getLogin() {
        return login;
    }
}
