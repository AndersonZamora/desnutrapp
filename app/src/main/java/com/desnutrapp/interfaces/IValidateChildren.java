package com.desnutrapp.interfaces;

import androidx.annotation.NonNull;

import com.google.android.material.textfield.TextInputLayout;

public interface IValidateChildren {

    boolean HandleValidateEmpty(@NonNull TextInputLayout data);

    boolean HandleValidateEmpty(@NonNull String data, @NonNull String msg);

    boolean HandleValidateEmptyDocument(@NonNull TextInputLayout data);
}
