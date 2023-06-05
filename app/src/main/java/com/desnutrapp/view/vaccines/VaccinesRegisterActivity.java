package com.desnutrapp.view.vaccines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.desnutrapp.R;
import com.desnutrapp.interfaces.IReceiveId;
import com.desnutrapp.models.vaccineModel;
import com.desnutrapp.presenters.auth.vaccine.presenterVaccineChildren;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class VaccinesRegisterActivity extends AppCompatActivity implements IReceiveId, VaccineContract.VaccineView {

    FloatingActionButton addVaccine;
    RecyclerView recyclerVaccine;
    presenterVaccineChildren mVaccine;
    ProgressBar progressVaccine;
    String uidD;
    IReceiveId mIReceiveId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines_register);

        uidD = getIntent().getStringExtra("uid");

        init();

        mVaccine.geVaccine(uidD);

        addVaccine.setOnClickListener(v -> addLunch());
    }

    private void addLunch() {
        addVaccine.setVisibility(View.GONE);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        cardFragmentVaccines lunchFrag = cardFragmentVaccines.newInstance(addVaccine, uidD);
        transaction.addToBackStack(null);
        transaction.add(R.id.fragment_container, lunchFrag, "fragment_card_vaccine").commit();
    }

    private void init() {
        mIReceiveId = this;
        progressVaccine = findViewById(R.id.progress_vaccine);
        mVaccine = new presenterVaccineChildren();
        mVaccine.attachViewVaccine(this);
        addVaccine = findViewById(R.id.add_vaccines);
        recyclerVaccine = findViewById(R.id.recycler_view_vaccine);
        recyclerVaccine.setHasFixedSize(true);
        recyclerVaccine.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void viewMessage() {
        progressVaccine.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissMessage() {
        progressVaccine.setVisibility(View.GONE);
    }

    @Override
    public void vaccine(List<vaccineModel> list) {
        Adapter adapter = new Adapter(list, mIReceiveId);
        recyclerVaccine.setAdapter(adapter);
        progressVaccine.setVisibility(View.GONE);
    }

    @Override
    public void successDelete() {
        onBackPressed();
    }

    @Override
    public void messageError() {
        Toast.makeText(this, R.string.failed_delete, Toast.LENGTH_SHORT).show();
        onBackPressed();
    }

    @Override
    public void receiveId(String uid) {
        mVaccine.deleteVaccine(uidD, uid);
    }
}