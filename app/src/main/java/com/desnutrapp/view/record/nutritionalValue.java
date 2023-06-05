package com.desnutrapp.view.record;

public class nutritionalValue {
    float peso;
    float talla;
    double age;
    String dateControl;

    public nutritionalValue() {
    }

    public nutritionalValue(float talla, double age) {
        this.talla = talla;
        this.age = age;
    }

    public nutritionalValue(float peso, float talla) {
        this.peso = peso;
        this.talla = talla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getDateControl() {
        return dateControl;
    }

    public void setDateControl(String dateControl) {
        this.dateControl = dateControl;
    }
}
