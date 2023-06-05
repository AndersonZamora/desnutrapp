package com.desnutrapp.models;

import java.io.Serializable;

public class canDoModel implements Serializable {

    String title;

    public canDoModel() {
        // Build required
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
