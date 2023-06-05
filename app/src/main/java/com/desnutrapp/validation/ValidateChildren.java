package com.desnutrapp.validation;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.desnutrapp.R;
import com.desnutrapp.interfaces.IValidateChildren;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class ValidateChildren implements IValidateChildren {

    Context mContext;

    public ValidateChildren(Context mContext) {
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
    public boolean HandleValidateEmpty(@NonNull String data, @NonNull String msg) {

        if (data.isEmpty()) {
            Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
            return true;
        }

        return false;
    }

    @Override
    public boolean HandleValidateEmptyDocument(@NonNull TextInputLayout data) {

        String value = Objects.requireNonNull(data.getEditText()).getText().toString().trim();

        if (value.isEmpty()) {
            data.setError(null);
            data.setErrorEnabled(false);
            return true;
        } else if (value.length() != 8) {
            data.setError(mContext.getString(R.string.not_valid_dni));
            data.setErrorEnabled(true);
            return false;
        } else {
            data.setError(null);
            data.setErrorEnabled(false);

            return true;
        }
    }
}
