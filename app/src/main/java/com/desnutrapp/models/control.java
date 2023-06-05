package com.desnutrapp.models;

public class control extends model {
    String weight;
    String size;
    String age;
    String date;
    String observations;
    String ultimate;
    String next;

    public control(String weight, String size, String age, String date, String observations) {
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.date = date;
        this.observations = observations;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }

    public control() {
        //builder required
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
