package com.desnutrapp.view.family;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.desnutrapp.R;
import com.desnutrapp.models.father;
import com.desnutrapp.models.mather;
import com.desnutrapp.validation.ValidateChildren;
import com.desnutrapp.view.DashboardActivity;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

public class ChildrenActivity extends AppCompatActivity {

    TextInputEditText dateBirth;
    Button btnRegBb;
    TextInputLayout nameBb, apPBb, apMBb;
    TextInputLayout dateOfBirth, codeBb;
    TextInputLayout location;
    RadioGroup gender;
    ValidateChildren mChildren;
    String dateString = "";
    String locationString = "";
    String genderString = "";
    father modelF;
    mather modelM;
    FirebaseFirestore db;
    ProgressBar progress;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);

        modelF = (father) getIntent().getSerializableExtra("father");
        modelM = (mather) getIntent().getSerializableExtra("mather");

        init();
        dropDownList();
        btnRegBb.setOnClickListener(v -> handleValidate());
        calendar();
        genderGet();
    }

    void genderGet() {
        gender.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == 2131230979) {
                genderString = "girl";
            } else {
                genderString = "boy";
            }
        });
    }

    void handleValidate() {
        if (mChildren.HandleValidateEmpty(nameBb) | mChildren.HandleValidateEmpty(apMBb) |
                mChildren.HandleValidateEmpty(apPBb) |
                mChildren.HandleValidateEmpty(codeBb) |
                mChildren.HandleValidateEmpty(dateString, getString(R.string.select_date)) |
                mChildren.HandleValidateEmpty(locationString, getString(R.string.select_code)) |
                mChildren.HandleValidateEmpty(genderString, getString(R.string.select_gender))) {
            return;
        }
        saveInfo();
    }

    void saveInfo() {

        progress.setVisibility(View.VISIBLE);
        btnRegBb.setVisibility(View.GONE);
        error.setVisibility(View.GONE);

        String fullNameC = Objects.requireNonNull(nameBb.getEditText()).getText().toString().trim();
        String lastNameF = Objects.requireNonNull(apPBb.getEditText()).getText().toString().trim();
        String lastNameM = Objects.requireNonNull(apMBb.getEditText()).getText().toString().trim();
        String codeR = Objects.requireNonNull(codeBb.getEditText()).getText().toString().trim();

        Map<String, Object> childrenMap = new HashMap<>();
        childrenMap.put("fullName", fullNameC);
        childrenMap.put("lastNameP", lastNameF);
        childrenMap.put("lastNameM", lastNameM);
        childrenMap.put("dataBirth", dateString);
        childrenMap.put("gender", genderString);
        childrenMap.put("document", "");
        childrenMap.put("age", "");
        childrenMap.put("code", codeR);
        childrenMap.put("location", locationString);

        Map<String, Object> familyHistory = new HashMap<>();
        familyHistory.put("children", childrenMap);
        familyHistory.put("names", fullNameC);
        familyHistory.put("lastNameP", lastNameF);
        familyHistory.put("lastNameM", lastNameM);
        familyHistory.put("father", modelF);
        familyHistory.put("mather", modelM);
        familyHistory.put("code", codeR);

        db.collection("FamilyHistory")
                .add(familyHistory)
                .addOnSuccessListener(documentReference -> intentDashboardActivity())
                .addOnFailureListener(e -> {
                    progress.setVisibility(View.GONE);
                    btnRegBb.setVisibility(View.VISIBLE);
                    error.setVisibility(View.VISIBLE);
                });
    }

    void init() {
        db = FirebaseFirestore.getInstance();
        mChildren = new ValidateChildren(this);
        btnRegBb = findViewById(R.id.btnRegBb);
        nameBb = findViewById(R.id.nameBb);
        apPBb = findViewById(R.id.apPpBB);
        apMBb = findViewById(R.id.apMpBB);
        error = findViewById(R.id.error);
        dateOfBirth = findViewById(R.id.idFechaNacimiento);
        dateBirth = findViewById(R.id.fnacimeinto);
        dateBirth.setInputType(InputType.TYPE_NULL);
        codeBb = findViewById(R.id.idCodebb);
        location = findViewById(R.id.idlocation);
        gender = findViewById(R.id.idSex);
        progress = findViewById(R.id.progress_circular_save);

        Objects.requireNonNull(apPBb.getEditText()).setText(modelF.getLastNameF());
        Objects.requireNonNull(apMBb.getEditText()).setText(modelM.getLastNameF());
    }

    void dropDownList() {

        String[] type = new String[]{"Malat", "Santa Ana", "Florida", "La Raspadura", "Nuevo San Antonio", "Santa Rosa de Malat",
                "Nuevo Jerusalén", "Los Angeles", "Progreso", "Nuevo San Miguel", "3 de Mayo", "Villa Salvador", "Solimar",};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.drop_down_item,
                type
        );

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.localidadif);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setOnItemClickListener((adapterView, view, i, l) -> locationString = autoCompleteTextView.getText().toString());
    }

    void calendar() {

        MaterialDatePicker<Long> datePicker = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Seleccione una fecha").setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                .build();

        dateBirth.setOnClickListener(view -> {
            dateBirth.setEnabled(false);
            datePicker.show(getSupportFragmentManager(), "Material_Date_Picker");
            datePicker.addOnPositiveButtonClickListener(selection -> {
                dateBirth.setEnabled(true);
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar.setTimeInMillis(selection);
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
                dateString = format.format(calendar.getTime());
                Objects.requireNonNull(dateOfBirth.getEditText()).setText(datePicker.getHeaderText());
            });
            datePicker.addOnNegativeButtonClickListener(v -> dateBirth.setEnabled(true));
        });
    }

    void intentDashboardActivity() {
        Intent intent = new Intent(ChildrenActivity.this, DashboardActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
