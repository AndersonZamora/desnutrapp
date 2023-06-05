package com.desnutrapp.models;

import java.io.Serializable;
import java.util.List;

public class motorAreaModel implements Serializable {

    List<canDoModel> canDoModels;
    List<howStimulateModel> howStimulateModels;

    public motorAreaModel() {
        // Build required
    }

    public List<canDoModel> getCanDoModels() {
        return canDoModels;
    }

    public void setCanDoModels(List<canDoModel> canDoModels) {
        this.canDoModels = canDoModels;
    }

    public List<howStimulateModel> getHowStimulateModels() {
        return howStimulateModels;
    }

    public void setHowStimulateModels(List<howStimulateModel> howStimulateModels) {
        this.howStimulateModels = howStimulateModels;
    }
}
