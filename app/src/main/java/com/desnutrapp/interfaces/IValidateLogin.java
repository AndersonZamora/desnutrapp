package com.desnutrapp.interfaces;

import androidx.annotation.NonNull;

import com.google.android.material.textfield.TextInputLayout;

public interface IValidateLogin {
    boolean HandleValidateEmail(@NonNull TextInputLayout value);
    boolean HandleValidatePassword(@NonNull TextInputLayout value);
}
