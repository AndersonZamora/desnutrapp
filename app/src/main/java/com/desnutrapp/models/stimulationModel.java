package com.desnutrapp.models;

import java.io.Serializable;

public class stimulationModel implements Serializable {

    String title;
    String description;
    motorAreaModel motorAreaModelD;
    socialAreaModel socialAreaModelD;
    languageAreaModel languageAreaModelD;
    coordinationAreaModel coordinationAreaModelD;

    public stimulationModel() {
        // Build required
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public motorAreaModel getMotorAreaModelD() {
        return motorAreaModelD;
    }

    public void setMotorAreaModelD(motorAreaModel motorAreaModelD) {
        this.motorAreaModelD = motorAreaModelD;
    }

    public socialAreaModel getSocialAreaModelD() {
        return socialAreaModelD;
    }

    public void setSocialAreaModelD(socialAreaModel socialAreaModelD) {
        this.socialAreaModelD = socialAreaModelD;
    }

    public languageAreaModel getLanguageAreaModelD() {
        return languageAreaModelD;
    }

    public void setLanguageAreaModelD(languageAreaModel languageAreaModelD) {
        this.languageAreaModelD = languageAreaModelD;
    }

    public coordinationAreaModel getCoordinationAreaModelD() {
        return coordinationAreaModelD;
    }

    public void setCoordinationAreaModelD(coordinationAreaModel coordinationAreaModelD) {
        this.coordinationAreaModelD = coordinationAreaModelD;
    }
}
