package com.desnutrapp.interfaces;

import androidx.annotation.NonNull;

import com.google.android.material.textfield.TextInputLayout;

public interface IValidateFathers {
    boolean HandleValidateEmpty(@NonNull TextInputLayout data);
    boolean HandleValidateNumber(@NonNull TextInputLayout data, int number, String type);
}
