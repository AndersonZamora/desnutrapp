package com.desnutrapp.validation;

import android.content.Context;

import androidx.annotation.NonNull;

import com.desnutrapp.R;
import com.desnutrapp.interfaces.IValidateControl;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class ValidateControl implements IValidateControl {

    Context mContext;

    public ValidateControl(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public boolean HandleValidateControlWeight(@NonNull TextInputLayout data) {

        String value = Objects.requireNonNull(data.getEditText()).getText().toString().trim();

        if (value.isEmpty()) {
            data.setError(mContext.getString(R.string.is_required));
            data.setErrorEnabled(true);
            return true;
        }

        double numberValue = Double.parseDouble(value);

        if (numberValue < 1 | numberValue > 40) {
            data.setError(mContext.getString(R.string.enter_valid_data));
            data.setErrorEnabled(true);
            return true;
        }

        data.setError(null);
        data.setErrorEnabled(false);

        return false;
    }

    @Override
    public boolean HandleValidateControlSize(@NonNull TextInputLayout data) {

        String value = Objects.requireNonNull(data.getEditText()).getText().toString().trim();

        if (value.isEmpty()) {
            data.setError(mContext.getString(R.string.is_required));
            data.setErrorEnabled(true);
            return true;
        }

        double numberValue = Double.parseDouble(value);

        if (numberValue < 1 | numberValue > 150) {
            data.setError(mContext.getString(R.string.enter_valid_data));
            data.setErrorEnabled(true);
            return true;
        }

        data.setError(null);
        data.setErrorEnabled(false);

        return false;
    }
}
