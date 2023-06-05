package com.desnutrapp.view.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.desnutrapp.R;
import com.desnutrapp.helpers.calculateSize;
import com.desnutrapp.helpers.getDate;
import com.desnutrapp.models.ListSize;
import com.desnutrapp.view.DashboardActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AbstractControlActivity extends AppCompatActivity {

    TextInputLayout ageA, sizeA, weightA;
    ScrollView contentAb;
    TextView malnourished, overweight, severe;
    TextView normal1, normal2, shortStature;
    TextView tallSize;
    TextView data2, data3, data4;
    TextView data22, data33;
    Button btnAccept;
    ProgressBar pgbAccept;
    ProgressBar loading;
    calculateSize helper;
    String uid;
    String gender;
    String weight;
    String size;
    String age;

    Button bottom1;
    Button bottom2;
    Button bottom3;
    Button bottom4;

    Button bottom11;
    Button bottom22;
    Button bottom33;
    FirebaseFirestore db;
    Calendar today;
    String fecha;
    String sum;
    String next;
    getDate dateG;
    String stringFor;
    DecimalFormat twoDForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_control);

        init();

        weight = getIntent().getStringExtra("weight");
        size = getIntent().getStringExtra("size");
        age = getIntent().getStringExtra("age");
        gender = getIntent().getStringExtra("gender");
        uid = getIntent().getStringExtra("uid");
        sum = getIntent().getStringExtra("sum");
        stringFor = getIntent().getStringExtra("stringFor");

        bottomInfoColor();
        processData();

        btnAccept.setOnClickListener(v -> uploadData());

        fecha = dateG.getTodayDate();
        next = dateG.getTodayDate(Integer.parseInt(sum));
    }

    private void uploadData() {

        pgbAccept.setVisibility(View.VISIBLE);
        btnAccept.setVisibility(View.GONE);

        Map<String, Object> childrenMap = new HashMap<>();
        childrenMap.put("weight", weight);
        childrenMap.put("size", size);
        childrenMap.put("age", age);
        childrenMap.put("ultimate", age);
        childrenMap.put("next", next);

        db = FirebaseFirestore.getInstance();

        db.collection("FamilyHistory").document(uid)
                .collection("control")
                .document(fecha)
                .set(childrenMap)
                .addOnSuccessListener(aVoid -> intentDashboardActivity())
                .addOnFailureListener(e -> {
                    pgbAccept.setVisibility(View.GONE);
                    btnAccept.setVisibility(View.VISIBLE);
                    Toast.makeText(AbstractControlActivity.this, R.string.again, Toast.LENGTH_SHORT).show();
                });
    }

    void intentDashboardActivity() {
        Intent intent = new Intent(AbstractControlActivity.this, DashboardActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void processData() {

        ListSize resultS = helper.searchSize(age, gender);
        double weightD = Double.parseDouble(weight);
        double sizeD = Double.parseDouble(size);

        if (sizeD >= resultS.getValue3() && sizeD <= resultS.getValue4()) {

            data2.setText(String.format("%s%s", resultS.getValue2(), "kg"));
            data3.setText(String.format("%s%s", resultS.getValue3(), "kg"));
            data4.setText(String.format("%s%s", resultS.getValue4(), "kg"));

            severe.setText(String.format("%s%s%s", "<", resultS.getValue1(), "kg"));
            normal2.setText(String.format("%s %s%s %s %s", "De", resultS.getValue3(), "kg a ", resultS.getValue4(), "kg"));
            normal2.setBackgroundColor(Color.GREEN);
            normal2.setTextColor(Color.BLACK);

            shortStature.setText(String.format("%s %s%s", "<", twoDForm.format(resultS.getValue2() - 0.1), "kg"));
            tallSize.setText(String.format("%s %s%s", ">", twoDForm.format(resultS.getValue4() + 0.1), "kg"));
        }

        if (sizeD < resultS.getValue3() && sizeD >= resultS.getValue2()) {

            data2.setText(String.format("%s%s", resultS.getValue2(), "kg"));
            data3.setText(String.format("%s%s", resultS.getValue3(), "kg"));
            data4.setText(String.format("%s%s", resultS.getValue4(), "kg"));

            severe.setText(String.format("%s%s%s", "<", resultS.getValue1(), "kg"));
            normal2.setText(String.format("%s %s%s %s %s", "De", resultS.getValue3(), "kg a ", resultS.getValue4(), "kg"));

            shortStature.setText(String.format("%s %s%s", "<", twoDForm.format(resultS.getValue2() - 0.1), "kg"));
            shortStature.setBackgroundColor(Color.YELLOW);
            shortStature.setTextColor(Color.BLACK);
            tallSize.setText(String.format("%s %s%s", ">", twoDForm.format(resultS.getValue4() + 0.1), "kg"));
        }

        if (sizeD < resultS.getValue2()) {

            data2.setText(String.format("%s%s", resultS.getValue2(), "kg"));
            data3.setText(String.format("%s%s", resultS.getValue3(), "kg"));
            data4.setText(String.format("%s%s", resultS.getValue4(), "kg"));

            severe.setText(String.format("%s%s%s", "<", resultS.getValue1(), "kg"));
            severe.setBackgroundColor(Color.RED);
            severe.setTextColor(Color.WHITE);

            normal2.setText(String.format("%s %s%s %s %s", "De", resultS.getValue3(), "kg a ", resultS.getValue4(), "kg"));
            shortStature.setText(String.format("%s %s%s", "<", twoDForm.format(resultS.getValue2() - 0.1), "kg"));
            tallSize.setText(String.format("%s %s%s", ">", twoDForm.format(resultS.getValue4() + 0.1), "kg"));
        }

        if (sizeD > resultS.getValue4()) {

            data2.setText(String.format("%s%s", resultS.getValue2(), "kg"));
            data3.setText(String.format("%s%s", resultS.getValue3(), "kg"));
            data4.setText(String.format("%s%s", resultS.getValue4(), "kg"));

            severe.setText(String.format("%s %s%s", "<", resultS.getValue1(), "kg"));
            normal2.setText(String.format("%s %s%s %s %s", "De", resultS.getValue3(), "kg a ", resultS.getValue4(), "kg"));
            shortStature.setText(String.format("%s %s%s", "<", twoDForm.format(resultS.getValue2() - 0.1), "kg"));

            tallSize.setText(String.format("%s %s%s", ">", twoDForm.format(resultS.getValue4() + 0.1), "kg"));
            tallSize.setBackgroundColor(Color.RED);
            tallSize.setTextColor(Color.WHITE);

        }

        if (weightD >= resultS.getValue5() && weightD <= resultS.getValue6()) {

            data22.setText(String.format("%s%s", resultS.getValue5(), "kg"));
            data33.setText(String.format("%s%s", resultS.getValue6(), "kg"));


            malnourished.setText(String.format("%s %s%s", "<", twoDForm.format(resultS.getValue5() - 0.1), "kg"));

            normal1.setText(String.format("%s %s%s %s %s", "De", resultS.getValue5(), "kg a ", resultS.getValue6(), "kg"));
            normal1.setBackgroundColor(Color.GREEN);
            normal1.setTextColor(Color.BLACK);

            overweight.setText(String.format("%s %s%s", ">", twoDForm.format(resultS.getValue6() + 0.1), "kg"));

            contentAb.setVisibility(View.VISIBLE);
            loading.setVisibility(View.GONE);
        }

        if (weightD <= resultS.getValue5() - 0.1) {

            data22.setText(String.format("%s%s", resultS.getValue5(), "kg"));
            data33.setText(String.format("%s%s", resultS.getValue6(), "kg"));

            malnourished.setText(String.format("%s %s%s", "<", twoDForm.format(resultS.getValue5() - 0.1), "kg"));
            malnourished.setBackgroundColor(Color.RED);
            malnourished.setTextColor(Color.WHITE);

            normal1.setText(String.format("%s %s%s %s%s", "De", resultS.getValue5(), "kg a ", resultS.getValue6(), "kg"));
            overweight.setText(String.format("%s %s%s", ">", twoDForm.format(resultS.getValue6() + 0.1), "kg"));

            contentAb.setVisibility(View.VISIBLE);
            loading.setVisibility(View.GONE);
        }

        if (weightD > resultS.getValue6()) {

            data22.setText(String.format("%s%s", resultS.getValue5(), "kg"));
            data33.setText(String.format("%s%s", resultS.getValue6(), "kg"));

            malnourished.setText(String.format("%s %s%s", "<", twoDForm.format(resultS.getValue5() - 0.1), "kg"));
            normal1.setText(String.format("%s %s%s %s%s", "De", resultS.getValue5(), "kg a ", resultS.getValue6(), "kg"));

            overweight.setText(String.format("%s %s%s", ">", twoDForm.format(resultS.getValue6() + 0.1), "kg"));
            overweight.setBackgroundColor(Color.RED);
            overweight.setTextColor(Color.WHITE);

            contentAb.setVisibility(View.VISIBLE);
            loading.setVisibility(View.GONE);
        }
    }

    private void bottomInfoColor() {

        Objects.requireNonNull(ageA.getEditText()).setText(String.format("%s", stringFor));
        Objects.requireNonNull(sizeA.getEditText()).setText(String.format("%s%s", size, "cm"));
        Objects.requireNonNull(weightA.getEditText()).setText(String.format("%s%s", weight, "kg"));

        bottom1.setBackgroundColor(Color.RED);
        bottom2.setBackgroundColor(Color.YELLOW);
        bottom3.setBackgroundColor(Color.GREEN);
        bottom4.setBackgroundColor(Color.RED);
        bottom11.setBackgroundColor(Color.RED);
        bottom22.setBackgroundColor(Color.GREEN);
        bottom33.setBackgroundColor(Color.RED);
    }

    void init() {
        twoDForm = new DecimalFormat("#.#");
        helper = new calculateSize();
        today = Calendar.getInstance();
        dateG = new getDate();
        today.add(Calendar.MONTH, 1);
        contentAb = findViewById(R.id.content_ab);
        contentAb.setVisibility(View.GONE);
        loading = findViewById(R.id.progress_circular_ab);
        loading.setVisibility(View.VISIBLE);
        bottom1 = findViewById(R.id.bottom1);
        bottom2 = findViewById(R.id.bottom2);
        bottom3 = findViewById(R.id.bottom3);
        bottom4 = findViewById(R.id.bottom4);

        bottom11 = findViewById(R.id.bottom11);
        bottom22 = findViewById(R.id.bottom22);
        bottom33 = findViewById(R.id.bottom33);

        btnAccept = findViewById(R.id.btnOkAbstract);
        ageA = findViewById(R.id.id_ageA);
        sizeA = findViewById(R.id.id_sizeA);
        weightA = findViewById(R.id.id_wheightA);

        malnourished = findViewById(R.id.id_Des);
        normal1 = findViewById(R.id.id_Pnormal);
        overweight = findViewById(R.id.id_sobrepeso);

        severe = findViewById(R.id.id_sizebaja);
        shortStature = findViewById(R.id.id_sizeShort);
        normal2 = findViewById(R.id.id_sizenormal);
        tallSize = findViewById(R.id.id_sizealta);
        pgbAccept = findViewById(R.id.progress_circular_accept);

        data2 = findViewById(R.id.text21);
        data3 = findViewById(R.id.text4);
        data4 = findViewById(R.id.text5);

        data22 = findViewById(R.id.text22);
        data33 = findViewById(R.id.text44);
    }
}