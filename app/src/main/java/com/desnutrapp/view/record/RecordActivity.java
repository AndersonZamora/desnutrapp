package com.desnutrapp.view.record;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.desnutrapp.R;
import com.desnutrapp.models.control;
import com.desnutrapp.presenters.auth.graphi.presenterGraphic;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RecordActivity extends AppCompatActivity implements GraphicContract.GraphicView {

    LineChart lineChart;
    ArrayList<Entry> lineEntries;
    ArrayList<Entry> lineEntries2;
    ArrayList<nutritionalValue> valorNutritionalArrayList;
    AlertDialog alertDialog;
    XAxis xAxis;
    LineDataSet set1, set2;
    LineData data;
    presenterGraphic mPresenterGraphic;
    ProgressBar progressBar;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        init();

        String uid = getIntent().getStringExtra("uid");

        mPresenterGraphic.geGraphic(uid);
    }

    private void setOnChartValue() {

        lineChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                int x = lineChart.getData().getDataSetForEntry(e).getEntryIndex(e);
                double age = valorNutritionalArrayList.get(x).getAge();
                float talla = valorNutritionalArrayList.get(x).getTalla();
                double peso = valorNutritionalArrayList.get(x).getPeso();
                String date = valorNutritionalArrayList.get(x).getDateControl();

                AlertDialog.Builder builder = new AlertDialog.Builder(RecordActivity.this);
                builder.setCancelable(true);

                View view = LayoutInflater.from(RecordActivity.this).inflate(R.layout.talla_size, null);

                TextInputLayout txtAge = view.findViewById(R.id.idEdad);
                TextInputLayout txtWeight = view.findViewById(R.id.idPeso);
                TextInputLayout txSize = view.findViewById(R.id.idTalla);
                TextInputLayout txDate = view.findViewById(R.id.idfechaControl);

                Objects.requireNonNull(txtAge.getEditText()).setText(String.format("%s", age));
                Objects.requireNonNull(txtWeight.getEditText()).setText(String.format("%s kg", peso));
                Objects.requireNonNull(txSize.getEditText()).setText(String.format("%s cm", talla));
                Objects.requireNonNull(txDate.getEditText()).setText(String.format("%s", date));

                builder.setView(view);
                alertDialog = builder.create();
                alertDialog.show();
            }

            @Override
            public void onNothingSelected() {

            }
        });
    }

    private void init() {
        mPresenterGraphic = new presenterGraphic();
        mPresenterGraphic.attachViewGraphic(this);
        lineChart = findViewById(R.id.line_chart);
        progressBar = findViewById(R.id.progress_circular);
        progressBar.setVisibility(View.VISIBLE);
        layout = findViewById(R.id.linearLayout3);
        layout.setVisibility(View.GONE);
        lineEntries = new ArrayList<>();
        lineEntries2 = new ArrayList<>();
        valorNutritionalArrayList = new ArrayList<>();
    }

    @Override
    public void graphic(@NonNull List<control> list) {

        for (control con : list) {
            nutritionalValue value = new nutritionalValue();
            value.setAge(Double.parseDouble(con.getAge()));
            value.setPeso(Float.parseFloat(con.getWeight()));
            value.setTalla(Float.parseFloat(con.getSize()));
            value.setDateControl(con.conId);
            lineEntries.add(new Entry(Float.parseFloat(con.getAge()), Float.parseFloat(con.getSize())));
            lineEntries2.add(new Entry(Float.parseFloat(con.getAge()), Float.parseFloat(con.getWeight())));
            valorNutritionalArrayList.add(value);
        }

        xAxis = lineChart.getXAxis();
        set1 = new LineDataSet(lineEntries, "Peso");
        set2 = new LineDataSet(lineEntries2, "Talla");
        set2.setCircleColor(Color.RED);
        data = new LineData(set1, set2);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        set2.setColors(Color.RED);
        lineChart.setScaleEnabled(false);
        lineChart.setData(data);
        lineChart.getDescription().setEnabled(false);
        lineChart.getAxisRight().setEnabled(false);
        lineChart.invalidate();

        setOnChartValue();
    }

    @Override
    public void viewMessage() {
        progressBar.setVisibility(View.VISIBLE);
        layout.setVisibility(View.GONE);
    }

    @Override
    public void dismissMessage() {
        progressBar.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }
}