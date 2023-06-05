package com.desnutrapp.view.family;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.desnutrapp.R;
import com.desnutrapp.models.children;
import com.desnutrapp.models.father;
import com.desnutrapp.models.mather;
import com.desnutrapp.validation.ValidateChildren;
import com.desnutrapp.view.DashboardActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EditChildrenActivity extends AppCompatActivity {

    children mChildren;
    father modelF;
    mather modelM;
    Button btnUpdate;
    TextInputLayout nameBb, apPBb, apMBb;
    TextInputLayout codeBb;
    ValidateChildren vChildren;
    String locationString = "";
    ProgressBar progress;
    TextView error;
    DocumentReference updateDoc;
    String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_children);

        uid = getIntent().getStringExtra("uid");

        init();

        mChildren = (children) getIntent().getSerializableExtra("children");
        modelF = (father) getIntent().getSerializableExtra("father");
        modelM = (mather) getIntent().getSerializableExtra("mather");

        dropDownList();
        setDataChildren(mChildren);

        btnUpdate.setOnClickListener(v -> handleValidate());
    }

    void handleValidate() {
        if (vChildren.HandleValidateEmpty(nameBb) | vChildren.HandleValidateEmpty(apMBb) |
                vChildren.HandleValidateEmpty(apPBb) |
                vChildren.HandleValidateEmpty(codeBb) |
                vChildren.HandleValidateEmpty(locationString, getString(R.string.select_code))) {
            return;
        }
        updateInfo();
    }

    private void updateInfo() {
        progress.setVisibility(View.VISIBLE);
        btnUpdate.setVisibility(View.GONE);
        error.setVisibility(View.GONE);

        String fullNameC = Objects.requireNonNull(nameBb.getEditText()).getText().toString().trim();
        String lastNameF = Objects.requireNonNull(apPBb.getEditText()).getText().toString().trim();
        String lastNameM = Objects.requireNonNull(apMBb.getEditText()).getText().toString().trim();
        String codeR = Objects.requireNonNull(codeBb.getEditText()).getText().toString().trim();

        Map<String, Object> childrenMap = new HashMap<>();
        childrenMap.put("fullName", fullNameC);
        childrenMap.put("lastNameP", lastNameF);
        childrenMap.put("lastNameM", lastNameM);
        childrenMap.put("code", codeR);
        childrenMap.put("location", locationString);
        childrenMap.put("dataBirth", mChildren.getDataBirth());
        childrenMap.put("gender", mChildren.getGender());
        childrenMap.put("document", mChildren.getDocument());
        childrenMap.put("age", mChildren.getAge());

        Map<String, Object> familyHistory = new HashMap<>();
        familyHistory.put("children", childrenMap);
        familyHistory.put("names", fullNameC);
        familyHistory.put("lastNameP", lastNameF);
        familyHistory.put("lastNameM", lastNameM);
        familyHistory.put("father", modelF);
        familyHistory.put("mather", modelM);
        familyHistory.put("code", codeR);

        updateDoc.update(familyHistory)
                .addOnSuccessListener(unused -> {
                    Intent intent = new Intent(EditChildrenActivity.this, DashboardActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }).addOnFailureListener(e -> {
                    progress.setVisibility(View.GONE);
                    btnUpdate.setVisibility(View.VISIBLE);
                    error.setVisibility(View.VISIBLE);
                });
    }

    void init() {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        updateDoc = db.collection("FamilyHistory").document(uid);
        vChildren = new ValidateChildren(this);
        nameBb = findViewById(R.id.nameBb);
        apPBb = findViewById(R.id.apPpBB);
        apMBb = findViewById(R.id.apMpBB);
        codeBb = findViewById(R.id.idCodebb);
        btnUpdate = findViewById(R.id.btnUpdate);
        progress = findViewById(R.id.progress_circular_update);
        error = findViewById(R.id.error);
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
        autoCompleteTextView.setText(mChildren.getLocation());
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setOnItemClickListener((adapterView, view, i, l) -> locationString = autoCompleteTextView.getText().toString());
    }

    void setDataChildren(@NonNull children mChildren) {
        locationString = mChildren.getLocation();
        Objects.requireNonNull(nameBb.getEditText()).setText(mChildren.getFullName());
        Objects.requireNonNull(apPBb.getEditText()).setText(modelF.getLastNameF());
        Objects.requireNonNull(apMBb.getEditText()).setText(modelM.getLastNameF());
        Objects.requireNonNull(codeBb.getEditText()).setText(mChildren.getCode());
    }
}