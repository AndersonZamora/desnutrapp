package com.desnutrapp.view.family;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.desnutrapp.R;
import com.desnutrapp.models.children;
import com.desnutrapp.models.father;
import com.desnutrapp.models.history;
import com.desnutrapp.models.mather;
import com.desnutrapp.validation.ValidateFathers;
import com.desnutrapp.view.DashboardActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Objects;

public class EditPadresActivity extends AppCompatActivity {

    ProgressBar progressEdit;
    String uid;
    DocumentReference docRef;
    LinearLayout viewL;

    Button btnSgt;
    Button btnDelete;
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

    children mChildren;

    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_padres);

        uid = getIntent().getStringExtra("uid");

        init();
        getData();

        btnSgt.setOnClickListener(v -> handleValidate());
        btnDelete.setOnClickListener(v -> handleDelete());
    }

    private void handleDelete() {
        progressEdit.setVisibility(View.VISIBLE);
        btnDelete.setVisibility(View.GONE);
        btnSgt.setVisibility(View.GONE);
        db.collection("FamilyHistory").document(uid)
                .delete()
                .addOnSuccessListener(aVoid -> {
                    Intent intent = new Intent(EditPadresActivity.this, DashboardActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                })
                .addOnFailureListener(e -> {
                    progressEdit.setVisibility(View.GONE);
                    btnDelete.setVisibility(View.VISIBLE);
                    btnSgt.setVisibility(View.VISIBLE);
                });
    }

    private void handleValidate() {

        if (mFathers.HandleValidateEmpty(namesM) | mFathers.HandleValidateEmpty(lastNamePM) |
                mFathers.HandleValidateEmpty(lastNameMM) | mFathers.HandleValidateNumber(documentM, 8, "DNI") |
                mFathers.HandleValidateNumber(phoneM, 9, "Celular")) {
            return;
        }

        intentChildren();
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
        Log.e("ggg", uid);
        Intent intent = new Intent(EditPadresActivity.this, EditChildrenActivity.class);
        intent.putExtra("father", modelP);
        intent.putExtra("mather", modelM);
        intent.putExtra("children", mChildren);
        intent.putExtra("uid", uid);
        startActivity(intent);
    }

    private void getData() {
        docRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                DocumentSnapshot document = task.getResult();
                if (document.exists()) {
                    history model = Objects.requireNonNull(document.toObject(history.class)).withId(document.getId());
                    father fa = model.getFather();
                    mather ma = model.getMather();
                    mChildren = model.getChildren();
                    setFather(fa);
                    setMather(ma);
                    progressEdit.setVisibility(View.GONE);
                    viewL.setVisibility(View.VISIBLE);
                    btnDelete.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    void init() {
        mFathers = new ValidateFathers(this);
        db = FirebaseFirestore.getInstance();
        docRef = db.collection("FamilyHistory").document(uid);
        viewL = findViewById(R.id.viewData);
        progressEdit = findViewById(R.id.progress_edit);
        progressEdit.setVisibility(View.VISIBLE);
        viewL.setVisibility(View.GONE);

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

        btnSgt = findViewById(R.id.btnRegFamilyUpdate);
        btnDelete = findViewById(R.id.delete_doc);
        btnDelete.setVisibility(View.GONE);
    }

    void setFather(@NonNull father father) {
        Objects.requireNonNull(namesP.getEditText()).setText(father.getFullName());
        Objects.requireNonNull(lastNameP.getEditText()).setText(father.getLastNameM());
        Objects.requireNonNull(lastNameM.getEditText()).setText(father.getLastNameM());
        Objects.requireNonNull(documentP.getEditText()).setText(father.getDocument());
        Objects.requireNonNull(phoneP.getEditText()).setText(father.getPhone());
        Objects.requireNonNull(addressP.getEditText()).setText(father.getAddress());
    }

    void setMather(@NonNull mather mather) {
        Objects.requireNonNull(namesM.getEditText()).setText(mather.getFullName());
        Objects.requireNonNull(lastNamePM.getEditText()).setText(mather.getLastNameF());
        Objects.requireNonNull(lastNameMM.getEditText()).setText(mather.getLastNameF());
        Objects.requireNonNull(documentM.getEditText()).setText(mather.getDocument());
        Objects.requireNonNull(phoneM.getEditText()).setText(mather.getPhone());
        Objects.requireNonNull(addressM.getEditText()).setText(mather.getAddress());
    }
}