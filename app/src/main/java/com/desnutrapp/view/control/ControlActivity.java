package com.desnutrapp.view.control;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.desnutrapp.R;
import com.desnutrapp.helpers.controlTree;
import com.desnutrapp.helpers.handleControlDate;
import com.desnutrapp.models.children;
import com.desnutrapp.models.control;
import com.desnutrapp.models.handleDate;
import com.desnutrapp.presenters.auth.control.presenterControlChildren;
import com.desnutrapp.validation.ValidateControl;
import com.google.android.material.textfield.TextInputLayout;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class ControlActivity extends AppCompatActivity implements ChildrenContract.ChildrenView {

    TextView nameBbControl, alertText;
    TextInputLayout pesoControl, sizeControl, ageControl;
    Button btnDiagnose;
    presenterControlChildren controlChildren;
    LinearLayout content;
    ProgressBar progressBar;
    ValidateControl mControl;
    String age;
    String gender;
    String uid;
    String sum;
    String next;
    String stringFor;
    controlTree mTree;
    handleControlDate controlDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        init();

        uid = getIntent().getStringExtra("uid");
        controlChildren.geChildren(uid);
        btnDiagnose.setOnClickListener(v -> handleValidate());
    }

    void handleValidate() {
        if (mControl.HandleValidateControlWeight(pesoControl) | mControl.HandleValidateControlSize(sizeControl)) {
            return;
        }

        handleDiagnose();
    }

    void handleDiagnose() {

        String weight = Objects.requireNonNull(pesoControl.getEditText()).getText().toString().trim();
        String size = Objects.requireNonNull(sizeControl.getEditText()).getText().toString().trim();

        Intent intent = new Intent(ControlActivity.this, AbstractControlActivity.class);
        intent.putExtra("weight", weight);
        intent.putExtra("size", size);
        intent.putExtra("age", age);
        intent.putExtra("gender", gender);
        intent.putExtra("uid", uid);
        intent.putExtra("sum", sum);
        intent.putExtra("stringFor", stringFor);
        startActivity(intent);
    }

    void init() {
        controlDate = new handleControlDate();
        mTree = new controlTree();
        mControl = new ValidateControl(this);
        controlChildren = new presenterControlChildren();
        controlChildren.attachViewChildren(this);
        btnDiagnose = findViewById(R.id.btnRegCalculo);
        alertText = findViewById(R.id.text_en);
        alertText.setVisibility(View.GONE);
        nameBbControl = findViewById(R.id.idNameBbControl);
        ageControl = findViewById(R.id.idEdadControl);
        content = findViewById(R.id.content);
        progressBar = findViewById(R.id.progress_circular_control);
        pesoControl = findViewById(R.id.idPesoControl);
        sizeControl = findViewById(R.id.idTallaControl);
    }

    @Override
    public void children(@NonNull children model, @NonNull List<control> list) {


        handleDate re = controlDate.handle(model.getDataBirth());
        age = re.getAge();
        stringFor = re.getStringFor();
        float ageC = Float.parseFloat(age);

        Objects.requireNonNull(ageControl.getEditText()).setText(age);
        gender = model.getGender();

        if (extracted(list)) {
            alertText.setText(String.format("%s %s %s %s", getString(R.string.already_registered), stringFor, getString(R.string.already_registered_2), next));
            alertText.setVisibility(View.VISIBLE);
            content.setVisibility(View.GONE);
            btnDiagnose.setVisibility(View.GONE);
            return;
        }

        if (ageC < 2) {
            sum = "1";
            alertText.setVisibility(View.GONE);
            nameBbControl.setText(String.format("%s %s %s", model.getLastNameP(), model.getLastNameM(), model.getFullName()));
            content.setVisibility(View.VISIBLE);
            btnDiagnose.setVisibility(View.VISIBLE);
            return;
        }

        if ((re.getMoth() % 2) == 0 && ageC >= 2 && ageC < 3) {
            sum = "2";
            alertText.setVisibility(View.GONE);
            nameBbControl.setText(String.format("%s %s %s", model.getLastNameP(), model.getLastNameM(), model.getFullName()));
            content.setVisibility(View.VISIBLE);
            btnDiagnose.setVisibility(View.VISIBLE);
            return;
        }

        if (mTree.searchAge(age)) {
            sum = "3";
            alertText.setVisibility(View.GONE);
            nameBbControl.setText(String.format("%s %s %s", model.getLastNameP(), model.getLastNameM(), model.getFullName()));
            content.setVisibility(View.VISIBLE);
            btnDiagnose.setVisibility(View.VISIBLE);
            return;
        }

        alertText.setText(String.format("%s %s", getString(R.string.this_age), stringFor));
        alertText.setVisibility(View.VISIBLE);
    }

    @Override
    public void successDelete() {

    }

    @Override
    public void messageError() {

    }

    private boolean extracted(@NonNull List<control> list) {

        if (list.size() > 0) {
            for (control listSize : list) {

                if (Double.parseDouble(listSize.getAge()) == Double.parseDouble(age)) {
                    next = listSize.getNext();
                    return true;
                }
            }
            return false;
        }

        return false;
    }


    @Override
    public void viewMessage() {
        progressBar.setVisibility(View.VISIBLE);
        content.setVisibility(View.GONE);
    }

    @Override
    public void dismissMessage() {
        progressBar.setVisibility(View.GONE);
    }
}