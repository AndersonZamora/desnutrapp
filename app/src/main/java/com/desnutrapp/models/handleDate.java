package com.desnutrapp.models;

public class handleDate {

    String age;
    String stringFor;
    float ageC;
    int moth;

    public handleDate() {
        //builder required
    }

    public int getMoth() {
        return moth;
    }

    public void setMoth(int moth) {
        this.moth = moth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStringFor() {
        return stringFor;
    }

    public void setStringFor(String stringFor) {
        this.stringFor = stringFor;
    }

    public float getAgeC() {
        return ageC;
    }

    public void setAgeC(float ageC) {
        this.ageC = ageC;
    }
}
