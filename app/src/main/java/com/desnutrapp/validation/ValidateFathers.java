package com.desnutrapp.validation;

import android.content.Context;

import androidx.annotation.NonNull;

import com.desnutrapp.R;
import com.desnutrapp.interfaces.IValidateFathers;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class ValidateFathers implements IValidateFathers {

    Context mContext;

    public ValidateFathers(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public boolean HandleValidateEmpty(@NonNull TextInputLayout data) {

        String value = Objects.requireNonNull(data.getEditText()).getText().toString().trim();

        if (value.isEmpty()) {
            data.setError(mContext.getString(R.string.is_required));
            data.setErrorEnabled(true);
            return true;
        } else {
            data.setError(null);
            data.setErrorEnabled(false);

            return false;
        }

    }

    @Override
    public boolean HandleValidateNumber(@NonNull TextInputLayout data, int number, String type) {

        String value = Objects.requireNonNull(data.getEditText()).getText().toString().trim();

        if (value.isEmpty()) {
            data.setError(mContext.getString(R.string.is_required));
            data.setErrorEnabled(true);
            return true;
        } else if (value.length() < number | value.length() > number) {
            data.setError(type + " " + mContext.getString(R.string.not_valid));
            data.setErrorEnabled(true);
            return true;
        } else {
            data.setError(null);
            data.setErrorEnabled(false);
            return false;
        }

    }
}
