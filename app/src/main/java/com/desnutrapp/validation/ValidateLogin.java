package com.desnutrapp.validation;

import android.content.Context;

import androidx.annotation.NonNull;

import com.desnutrapp.R;
import com.desnutrapp.interfaces.IValidateLogin;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class ValidateLogin implements IValidateLogin {

    ValidateFields mFields;
    Context mContext;

    public ValidateLogin(ValidateFields mFields, Context mContext) {
        this.mFields = mFields;
        this.mContext = mContext;
    }

    @Override
    public boolean HandleValidateEmail(@NonNull TextInputLayout value) {

        String valueEmail = Objects.requireNonNull(value.getEditText()).getText().toString().trim().replace(" ", "");

        if (mFields.isEmail(valueEmail)) {
            value.setError(mContext.getString(R.string.invalid_email));
            value.setErrorEnabled(true);
            return false;
        }

        value.setError(null);
        value.setErrorEnabled(false);

        return true;
    }

    @Override
    public boolean HandleValidatePassword(@NonNull TextInputLayout value) {

        String valuePassword = Objects.requireNonNull(value.getEditText()).getText().toString().trim().replace(" ", "");

        if (valuePassword.isEmpty()) {
            value.setError(mContext.getString(R.string.invalid_password));
            value.setErrorEnabled(true);
            return false;
        }

        value.setError(null);
        value.setErrorEnabled(false);

        return true;
    }
}
