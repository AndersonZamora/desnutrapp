package com.desnutrapp.view.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.desnutrapp.MainActivity;
import com.desnutrapp.R;
import com.desnutrapp.helpers.preferenceManager;
import com.desnutrapp.helpers.types;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class SettingActivity extends AppCompatActivity {

    Button regMedico;
    TextInputLayout nameMedico, apPMedico, apMMedico;
    TextInputLayout dniMedico, codeMedico, specialtyMedico;
    TextInputLayout phoneMedico, userMedico;
    preferenceManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        init();

        setData();

        regMedico.setOnClickListener(v -> {
            manager.clearPreference();
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(SettingActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        });
    }

    private void setData() {
        Objects.requireNonNull(nameMedico.getEditText()).setText(manager.getString(types.NAMES));
        Objects.requireNonNull(apMMedico.getEditText()).setText(manager.getString(types.LAST_NAME));
        Objects.requireNonNull(apPMedico.getEditText()).setText(manager.getString(types.LAST_NAME));
        Objects.requireNonNull(dniMedico.getEditText()).setText(manager.getString(types.DNI));
        Objects.requireNonNull(codeMedico.getEditText()).setText(manager.getString(types.CODE));
        Objects.requireNonNull(specialtyMedico.getEditText()).setText(manager.getString(types.SPECIALTY));
        Objects.requireNonNull(phoneMedico.getEditText()).setText(manager.getString(types.PHONE));
        Objects.requireNonNull(userMedico.getEditText()).setText(manager.getString(types.EMAIL));
    }

    void init() {
        manager = new preferenceManager(this);
        regMedico = findViewById(R.id.btnRegUser);
        nameMedico = findViewById(R.id.nameMedico);
        apPMedico = findViewById(R.id.apPMedico);
        apMMedico = findViewById(R.id.apMMedico);
        dniMedico = findViewById(R.id.idDniMedico);
        codeMedico = findViewById(R.id.idCodeMedico);
        specialtyMedico = findViewById(R.id.idSpecialty);
        phoneMedico = findViewById(R.id.idPhoneMedico);
        userMedico = findViewById(R.id.usernameM);
    }
}