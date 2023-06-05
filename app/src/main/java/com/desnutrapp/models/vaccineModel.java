package com.desnutrapp.models;

public class vaccineModel extends model {

    String title;
    String type;
    String date;

    public vaccineModel() {
        //builder required
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }
}
