package com.desnutrapp.interfaces;

import androidx.annotation.NonNull;

public interface IValidateFields {
    boolean isEmpty(@NonNull String value);
    boolean isEmail(@NonNull String value);
    boolean lengthNumber(@NonNull String value);
}
