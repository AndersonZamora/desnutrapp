package com.desnutrapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.desnutrapp.R;
import com.desnutrapp.helpers.preferenceManager;
import com.desnutrapp.helpers.types;
import com.desnutrapp.view.control.ControlListActivity;
import com.desnutrapp.view.family.PadresActivity;
import com.desnutrapp.view.record.RecordListActivity;
import com.desnutrapp.view.setting.SettingActivity;
import com.desnutrapp.view.stimulation.StimulationActivity;
import com.desnutrapp.view.vaccines.VaccinesActivity;

public class DashboardActivity extends AppCompatActivity {

    AppCompatImageView register, record, control;
    AppCompatImageView setting, vaccines, stimulation;
    preferenceManager manager;
    TextView fullNames;
    TextView specialty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();

        register.setOnClickListener(view -> startActivity(new Intent(DashboardActivity.this, PadresActivity.class)));
        record.setOnClickListener(view -> startActivity(new Intent(DashboardActivity.this, RecordListActivity.class)));
        control.setOnClickListener(view -> startActivity(new Intent(DashboardActivity.this, ControlListActivity.class)));
        setting.setOnClickListener(view -> startActivity(new Intent(DashboardActivity.this, SettingActivity.class)));
        vaccines.setOnClickListener(view -> startActivity(new Intent(DashboardActivity.this, VaccinesActivity.class)));
        stimulation.setOnClickListener(view -> startActivity(new Intent(DashboardActivity.this, StimulationActivity.class)));

        String names = manager.getString(types.NAMES);
        String lastNameM = manager.getString(types.LAST_NAME_M);
        String lastNameP = manager.getString(types.LAST_NAME);
        specialty.setText(manager.getString(types.SPECIALTY));
        fullNames.setText(String.format("%s %s%s%s", lastNameP, lastNameM, ",", names));
    }

    private void init() {
        manager = new preferenceManager(this);
        register = findViewById(R.id.image2);
        vaccines = findViewById(R.id.image11);
        record = findViewById(R.id.image3);
        control = findViewById(R.id.image1);
        setting = findViewById(R.id.image33);
        fullNames = findViewById(R.id.textView);
        specialty = findViewById(R.id.textView2);
        stimulation = findViewById(R.id.image22);
    }
}