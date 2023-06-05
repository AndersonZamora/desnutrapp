package com.desnutrapp.models;

import androidx.annotation.NonNull;

public class model {
    public String conId;

    public <T extends model> T withId(@NonNull final String conId) {
        this.conId = conId;
        //noinspection unchecked
        return (T) this;
    }
}
