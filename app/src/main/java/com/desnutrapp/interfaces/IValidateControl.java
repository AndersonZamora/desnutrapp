package com.desnutrapp.interfaces;

import androidx.annotation.NonNull;

import com.google.android.material.textfield.TextInputLayout;

public interface IValidateControl {
    boolean HandleValidateControlWeight(@NonNull TextInputLayout data);
    boolean HandleValidateControlSize(@NonNull TextInputLayout data);
}
