package com.desnutrapp.models;

import java.io.Serializable;

public class howStimulateModel implements Serializable {

    String title;

    public howStimulateModel() {
        // Build required
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
