package com.desnutrapp.view.record;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.desnutrapp.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    LineChart nChart;

    PieChart pieChart;
    ArrayList<Entry> lineEntries =new ArrayList<>();
    ArrayList<Entry> lineEntries2 =new ArrayList<>();
    ArrayList<nutritionalValue> nutritionalValueArrayList =new ArrayList<>();
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        setTitle("LineChartActivityColored");

        nChart=findViewById(R.id.chart1);
        pieChart=findViewById(R.id.pie_chart);

        //setData();
        fillPesoArrayList();

        for (nutritionalValue va : nutritionalValueArrayList){

            lineEntries.add(new Entry((float) va.getAge(),va.getTalla()));
            lineEntries2.add(new Entry((float) va.getAge(), va.getPeso()));
        }


        LineDataSet lineDataSet = new LineDataSet(lineEntries,"Regional Sales");


        LineDataSet set1,set2;

        set1= new LineDataSet(lineEntries,"Peso");
        set1.setColors(Color.BLUE);
        set1.setLineWidth(4f);
        set2= new LineDataSet(lineEntries2,"Talla");
        set2.setColors(Color.RED);
        set2.setLineWidth(4f);
        LineData data= new LineData(set1,set2);
        lineDataSet.setValueTextSize(16);


        LineData lineData = new LineData(lineDataSet);
        nChart.setData(data);

        XAxis xAxis = nChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(10f);
        xAxis.setTextColor(Color.RED);
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawGridLines(true);
        xAxis.setAxisMinimum(0f);



        YAxis yAxis = nChart.getAxisLeft();

        yAxis.setTextSize(12f); // set the text size
        yAxis.setAxisMinimum(0f); // start at zero
        yAxis.setAxisMaximum(100f); // the axis maximum is 100
        yAxis.setTextColor(Color.BLUE);
        //yAxis.setDrawAxisLine(false);
        yAxis.setDrawAxisLine(false);
        yAxis.setDrawGridLines(false);
        yAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        yAxis.setGranularity(1f); // interval 1
        //yAxis.setLabelCount(6, true); // force 6 labels


        nChart.getDescription().setEnabled(false);
        nChart.getAxisRight().setEnabled(false);
        nChart.setDrawGridBackground(false);
        nChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                int x= nChart.getData().getDataSetForEntry(e).getEntryIndex(e);
                double age = nutritionalValueArrayList.get(x).getAge();
                float talla = nutritionalValueArrayList.get(x).getTalla();
                double peso = nutritionalValueArrayList.get(x).getPeso();

                AlertDialog.Builder builder = new AlertDialog.Builder(SearchActivity.this);
                builder.setCancelable(true);


                View view = LayoutInflater.from(SearchActivity.this).inflate(R.layout.talla_size,null);

                TextInputLayout txtPesp=view.findViewById(R.id.idPeso);
                TextInputLayout txTalla=view.findViewById(R.id.idTalla);
                TextInputLayout txtEdad=view.findViewById(R.id.idEdad);


                txtPesp.getEditText().setText(String.valueOf(peso+"g"));
                txTalla.getEditText().setText(String.valueOf(talla+ "cm"));
                txtEdad.getEditText().setText(String.valueOf(age+" meses"));

                builder.setView(view);
                alertDialog = builder.create();
                alertDialog.show();
            }

            @Override
            public void onNothingSelected() {

            }
        });
        //pieChart.invalidate(); // refresh

    }

    private void setData(){
        ArrayList<Entry> lpeso= new ArrayList<>();

        lpeso.add( new Entry(1, 9.2F));
        lpeso.add( new Entry(2, 10.5F));
        lpeso.add( new Entry(3, 15.4F));
        lpeso.add( new Entry(4, 9.8F));
        lpeso.add( new Entry(5, 13.0F));

        ArrayList<Entry> lTalla= new ArrayList<>();

        lTalla.add( new Entry(1, 75));
        lTalla.add( new Entry(2, 76.2F));
        lTalla.add( new Entry(3, 76.5F));
        lTalla.add( new Entry(4, 80.0F));
        lTalla.add( new Entry(5, 93.4F));
        LineDataSet set1,set2;
        set1= new LineDataSet(lpeso,"Peso");
        set1.setColors(Color.BLUE);
        set1.setLineWidth(4f);
        set2= new LineDataSet(lTalla,"Talla");
        set2.setColors(Color.RED);
        set2.setLineWidth(4f);
        LineData data= new LineData(set1,set2);





        XAxis xAxis = nChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(10f);
        xAxis.setTextColor(Color.RED);
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawGridLines(true);
        xAxis.setAxisMinimum(0f);


        YAxis yAxis = nChart.getAxisLeft();

        yAxis.setTextSize(12f); // set the text size
        yAxis.setAxisMinimum(0f); // start at zero
        yAxis.setAxisMaximum(100f); // the axis maximum is 100
        yAxis.setTextColor(Color.BLUE);
       //yAxis.setDrawAxisLine(false);
        yAxis.setDrawAxisLine(false);
        yAxis.setDrawGridLines(false);
        yAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        yAxis.setGranularity(1f); // interval 1
        yAxis.setLabelCount(6, true); // force 6 labels


        nChart.getDescription().setEnabled(false);
        nChart.getAxisRight().setEnabled(false);

        nChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                int x =nChart.getData().getDataSetForEntry(e).getEntryIndex(e);
                //String region=lpeso.get(x).
                Toast.makeText(SearchActivity.this, "funcionas", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });
        nChart.setData(data);
    }

    private void fillPesoArrayList(){
        nutritionalValue valor0 = new nutritionalValue();
        valor0.setPeso(2.5f);
        valor0.setTalla(48.18f);
        valor0.setAge(-0);

        nutritionalValue valor1 = new nutritionalValue();
        valor1.setPeso(3.5f);
        valor1.setTalla(51.18f);
        valor1.setAge(0.1);

        nutritionalValue valor2 = new nutritionalValue();
        valor2.setPeso(3.8f);
        valor2.setTalla(55.18f);
        valor2.setAge(0.2);

        nutritionalValue valor3 = new nutritionalValue();
        valor3.setPeso(5.2f);
        valor3.setTalla(60.18f);
        valor3.setAge(0.3);

        nutritionalValue valor4 = new nutritionalValue();
        valor4.setPeso(7.5f);
        valor4.setTalla(69.18f);
        valor4.setAge(0.1);

        nutritionalValue valor5 = new nutritionalValue();
        valor5.setPeso(10.8f);
        valor5.setTalla(79.18f);
        valor5.setAge(0.2);

        nutritionalValue valor6 = new nutritionalValue();
        valor6.setPeso(9f);
        valor6.setTalla(89.18f);
        valor6.setAge(0.3);

        nutritionalValueArrayList.add(valor1);
        nutritionalValueArrayList.add(valor2);
        nutritionalValueArrayList.add(valor3);
       /* valorNutricionalArrayList.add(new valorNutricional(10.5F,1.3));
        valorNutricionalArrayList.add(new valorNutricional(15.5F,1.4));
        valorNutricionalArrayList.add(new valorNutricional(9.8F,1.5));

        valorNutricionalArrayList.add(new valorNutricional(45.1F,1.2));
        valorNutricionalArrayList.add(new valorNutricional(46.8F,1.3));
        valorNutricionalArrayList.add(new valorNutricional(48.1F,1.4));
        valorNutricionalArrayList.add(new valorNutricional(47.8F,1.5));*/

    }
}