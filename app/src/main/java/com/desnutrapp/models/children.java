package com.desnutrapp.models;

import java.io.Serializable;

public class children extends model implements Serializable {

    String fullName;
    String lastNameP;
    String lastNameM;
    String dataBirth;
    String gender;
    String document;
    String location;
    String code;
    String age;

    public children() {
        //builder required
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastNameP() {
        return lastNameP;
    }

    public String getLastNameM() {
        return lastNameM;
    }

    public String getDataBirth() {
        return dataBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getDocument() {
        return document;
    }

    public String getLocation() {
        return location;
    }

    public String getCode() {
        return code;
    }

    public String getAge() {
        return age;
    }
}
