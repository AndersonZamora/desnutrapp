package com.desnutrapp.view.stimulation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.desnutrapp.R;
import com.desnutrapp.data.listData;
import com.desnutrapp.models.stimulationModel;

public class StimulationActivity extends AppCompatActivity {

    CardView stimulation03;
    CardView stimulation46;
    CardView stimulation711;
    CardView stimulation1214;
    CardView stimulation23;
    CardView stimulation34;
    CardView stimulation45;
    listData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stimulation);
        init();

        stimulation03.setOnClickListener(v -> intent(data.data03()));
        stimulation46.setOnClickListener(v -> intent(data.data46()));
        stimulation711.setOnClickListener(v -> intent(data.data711()));
        stimulation1214.setOnClickListener(v -> intent(data.data1214()));
        stimulation23.setOnClickListener(v -> intent(data.data23()));
        stimulation34.setOnClickListener(v -> intent(data.data34()));
        stimulation45.setOnClickListener(v -> intent(data.data45()));
    }

    private void init() {
        data = new listData();
        stimulation03 = findViewById(R.id.stimulation_03);
        stimulation46 = findViewById(R.id.stimulation_46);
        stimulation711 = findViewById(R.id.stimulation_711);
        stimulation1214 = findViewById(R.id.stimulation_1214);
        stimulation23 = findViewById(R.id.stimulation_23);
        stimulation34 = findViewById(R.id.stimulation_34);
        stimulation45 = findViewById(R.id.stimulation_45);
    }

    private void intent(stimulationModel model) {
        Intent intent = new Intent(StimulationActivity.this, StimulationDetailActivity.class);
        intent.putExtra("type", model);
        startActivity(intent);
    }

}