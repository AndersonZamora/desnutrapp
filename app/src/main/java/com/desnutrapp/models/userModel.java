package com.desnutrapp.models;

public class userModel {

    String email;
    String fullName;
    String lastNameM;
    String lastNameP;
    String phone;
    String specialty;
    String dni;
    String code;

    public userModel() {
        //builder required
    }

    public String getDni() {
        return dni;
    }

    public String getCode() {
        return code;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastNameM() {
        return lastNameM;
    }

    public String getLastNameP() {
        return lastNameP;
    }

    public String getPhone() {
        return phone;
    }

    public String getSpecialty() {
        return specialty;
    }
}
