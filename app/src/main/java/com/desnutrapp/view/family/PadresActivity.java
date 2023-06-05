package com.desnutrapp.view.family;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.desnutrapp.R;
import com.desnutrapp.models.father;
import com.desnutrapp.models.mather;
import com.desnutrapp.validation.ValidateFathers;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class PadresActivity extends AppCompatActivity {

    Button btnSgt;
    TextInputLayout namesP;
    TextInputLayout lastNameP;
    TextInputLayout lastNameM;
    TextInputLayout documentP;
    TextInputLayout phoneP;
    TextInputLayout addressP;
    TextInputLayout namesM;
    TextInputLayout lastNamePM;
    TextInputLayout lastNameMM;
    TextInputLayout documentM;
    TextInputLayout phoneM;
    TextInputLayout addressM;
    ValidateFathers mFathers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padres);
        init();

        btnSgt.setOnClickListener(view -> handleValidate());
    }

    private void handleValidate() {

        if (mFathers.HandleValidateEmpty(namesM) | mFathers.HandleValidateEmpty(lastNamePM) |
                mFathers.HandleValidateEmpty(lastNameMM) | mFathers.HandleValidateNumber(documentM, 8, "DNI") |
                mFathers.HandleValidateNumber(phoneM, 9, "Celular")) {
            return;
        }

        intentChildren();
    }

    void init() {
        mFathers = new ValidateFathers(this);
        btnSgt = findViewById(R.id.btnRegFamily);

        namesP = findViewById(R.id.namePadre);
        lastNameP = findViewById(R.id.apPp);
        lastNameM = findViewById(R.id.apMp);
        documentP = findViewById(R.id.dniPadre);
        phoneP = findViewById(R.id.telefono);
        addressP = findViewById(R.id.direccionPadre);

        namesM = findViewById(R.id.nameMadre);
        lastNamePM = findViewById(R.id.apPm);
        lastNameMM = findViewById(R.id.apMm);
        documentM = findViewById(R.id.dniMadre);
        phoneM = findViewById(R.id.telefonoMadre);
        addressM = findViewById(R.id.direccionMadre);

    }

    private void intentChildren() {

        String namesAp = Objects.requireNonNull(namesP.getEditText()).getText().toString().trim();
        String lastNameAp = Objects.requireNonNull(lastNameP.getEditText()).getText().toString().trim();
        String lastNameAPm = Objects.requireNonNull(lastNameM.getEditText()).getText().toString().trim();
        String documentAp = Objects.requireNonNull(documentP.getEditText()).getText().toString().trim();
        String phoneAp = Objects.requireNonNull(phoneP.getEditText()).getText().toString().trim();
        String addressAp = Objects.requireNonNull(addressP.getEditText()).getText().toString().trim();

        father modelP = new father();
        modelP.setFullName(namesAp);
        modelP.setLastNameF(lastNameAp);
        modelP.setLastNameM(lastNameAPm);
        modelP.setDocument(documentAp);
        modelP.setPhone(phoneAp);
        modelP.setAddress(addressAp);

        String namesBm = Objects.requireNonNull(namesM.getEditText()).getText().toString().trim();
        String lastNameBPm = Objects.requireNonNull(lastNamePM.getEditText()).getText().toString().trim();
        String lastNameBm = Objects.requireNonNull(lastNameMM.getEditText()).getText().toString().trim();
        String documentBp = Objects.requireNonNull(documentM.getEditText()).getText().toString().trim();
        String phoneBp = Objects.requireNonNull(phoneM.getEditText()).getText().toString().trim();
        String addressBp = Objects.requireNonNull(addressM.getEditText()).getText().toString().trim();

        mather modelM = new mather();
        modelM.setFullName(namesBm);
        modelM.setLastNameF(lastNameBPm);
        modelM.setLastNameM(lastNameBm);
        modelM.setDocument(documentBp);
        modelM.setPhone(phoneBp);
        modelM.setAddress(addressBp);

        Intent intent = new Intent(PadresActivity.this, ChildrenActivity.class);
        intent.putExtra("father", modelP);
        intent.putExtra("mather", modelM);
        startActivity(intent);
    }
}