package com.desnutrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.desnutrapp.helpers.preferenceManager;
import com.desnutrapp.helpers.types;
import com.desnutrapp.models.userModel;
import com.desnutrapp.view.DashboardActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class getInformationActivity extends AppCompatActivity {

    TextView viewText;
    ProgressBar progress;
    preferenceManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_information);

        init();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        assert user != null;

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        DocumentReference docRef = db.collection("users").document(user.getUid());

        docRef.addSnapshotListener((snapshot, e) -> {
            if (e != null) {
                viewText.setVisibility(View.VISIBLE);
                progress.setVisibility(View.GONE);
                return;
            }

            if (snapshot != null && snapshot.exists()) {
                userModel model = snapshot.toObject(userModel.class);
                assert model != null;
                manager.putString(types.NAMES, model.getFullName());
                manager.putString(types.LAST_NAME_M, model.getLastNameM());
                manager.putString(types.LAST_NAME, model.getLastNameP());
                manager.putString(types.PHONE, model.getPhone());
                manager.putString(types.EMAIL, model.getEmail());
                manager.putString(types.SPECIALTY, model.getSpecialty());
                manager.putString(types.UID, user.getUid());
                manager.putString(types.DNI, model.getDni());
                manager.putString(types.CODE, model.getCode());

                Intent intent = new Intent(getInformationActivity.this, DashboardActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    private void init() {
        manager = new preferenceManager(this);
        viewText = findViewById(R.id.view_text);
        progress = findViewById(R.id.progress);
        viewText.setVisibility(View.GONE);
        progress.setVisibility(View.VISIBLE);
    }
}