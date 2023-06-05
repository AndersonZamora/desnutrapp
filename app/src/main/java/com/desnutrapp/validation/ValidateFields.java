package com.desnutrapp.validation;

import android.util.Patterns;

import androidx.annotation.NonNull;

import com.desnutrapp.interfaces.IValidateFields;

public class ValidateFields implements IValidateFields {

    @Override
    public boolean isEmpty(@NonNull String value) {
        return !value.isEmpty();
    }

    @Override
    public boolean isEmail(@NonNull String value) {
        return !Patterns.EMAIL_ADDRESS.matcher(value).matches();
    }

    @Override
    public boolean lengthNumber(@NonNull String value) {
        return value.length() < 9 | value.length() > 9;
    }
}
