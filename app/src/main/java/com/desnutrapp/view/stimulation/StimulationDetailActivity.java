package com.desnutrapp.view.stimulation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.desnutrapp.R;
import com.desnutrapp.models.stimulationModel;

public class StimulationDetailActivity extends AppCompatActivity {

    TextView titleType;
    TextView descriptionType;
    RecyclerView recyclerViewMotorCan;
    RecyclerView recyclerViewMotorHow;

    RecyclerView recyclerViewMotorCanCor;
    RecyclerView recyclerViewMotorHowCor;

    RecyclerView recyclerViewMotorCanSocial;
    RecyclerView recyclerViewMotorHowSocial;

    RecyclerView recyclerViewMotorCanLan;
    RecyclerView recyclerViewMotorHowLan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stimulation_detail);

        init();

        stimulationModel type = (stimulationModel) getIntent().getSerializableExtra("type");

        if (type != null) {
            setData(type);
        } else {
            onBackPressed();
        }
    }

    private void setData(@NonNull stimulationModel type) {

        titleType.setText(type.getTitle());
        descriptionType.setText(type.getDescription());

        AdapterCanDoModel motorAreaCan = new AdapterCanDoModel(type.getMotorAreaModelD().getCanDoModels());
        AdapterHowStimulateModel motorAreaHow = new AdapterHowStimulateModel(type.getMotorAreaModelD().getHowStimulateModels());

        recyclerViewMotorCan.setAdapter(motorAreaCan);
        recyclerViewMotorHow.setAdapter(motorAreaHow);

        AdapterCanDoModel corAreaCan = new AdapterCanDoModel(type.getCoordinationAreaModelD().getCanDoModels());
        AdapterHowStimulateModel corAreaHow = new AdapterHowStimulateModel(type.getCoordinationAreaModelD().getHowStimulateModels());
        recyclerViewMotorCanCor.setAdapter(corAreaCan);
        recyclerViewMotorHowCor.setAdapter(corAreaHow);

        AdapterCanDoModel socialAreaCan = new AdapterCanDoModel(type.getSocialAreaModelD().getCanDoModels());
        AdapterHowStimulateModel socialAreaHow = new AdapterHowStimulateModel(type.getSocialAreaModelD().getHowStimulateModels());
        recyclerViewMotorCanSocial.setAdapter(socialAreaCan);
        recyclerViewMotorHowSocial.setAdapter(socialAreaHow);

        AdapterCanDoModel lanAreaCan = new AdapterCanDoModel(type.getLanguageAreaModelD().getCanDoModels());
        AdapterHowStimulateModel lanAreaHow = new AdapterHowStimulateModel(type.getLanguageAreaModelD().getHowStimulateModels());
        recyclerViewMotorCanLan.setAdapter(lanAreaCan);
        recyclerViewMotorHowLan.setAdapter(lanAreaHow);
    }

    private void init() {

        recyclerViewMotorCan = findViewById(R.id.motor_area_can);
        recyclerViewMotorHow = findViewById(R.id.motor_area_how);

        recyclerViewMotorCanCor = findViewById(R.id.motor_area_can_cor);
        recyclerViewMotorHowCor = findViewById(R.id.motor_area_how_cor);

        recyclerViewMotorCanSocial = findViewById(R.id.motor_area_can_social);
        recyclerViewMotorHowSocial = findViewById(R.id.motor_area_how_social);

        recyclerViewMotorCanLan = findViewById(R.id.motor_area_can_lan);
        recyclerViewMotorHowLan = findViewById(R.id.motor_area_how_lan);

        titleType = findViewById(R.id.title_type);
        descriptionType = findViewById(R.id.description_type);

        recyclerViewMotorCan.setHasFixedSize(true);
        recyclerViewMotorCan.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewMotorHow.setHasFixedSize(true);
        recyclerViewMotorHow.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewMotorCanCor.setHasFixedSize(true);
        recyclerViewMotorCanCor.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewMotorHowCor.setHasFixedSize(true);
        recyclerViewMotorHowCor.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewMotorCanSocial.setHasFixedSize(true);
        recyclerViewMotorCanSocial.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewMotorHowSocial.setHasFixedSize(true);
        recyclerViewMotorHowSocial.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewMotorCanLan.setHasFixedSize(true);
        recyclerViewMotorCanLan.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewMotorHowLan.setHasFixedSize(true);
        recyclerViewMotorHowLan.setLayoutManager(new LinearLayoutManager(this));
    }
}