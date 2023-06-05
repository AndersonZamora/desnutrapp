package com.desnutrapp.view.vaccines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.desnutrapp.R;
import com.desnutrapp.presenters.auth.control.presenterControl;
import com.desnutrapp.view.control.Adapter;
import com.desnutrapp.interfaces.IReceiveId;
import com.desnutrapp.models.history;
import com.desnutrapp.view.control.HistoryContract;

import java.util.ArrayList;

public class VaccinesActivity extends AppCompatActivity implements IReceiveId, HistoryContract.HistoryView {

    SearchView searchView;
    RecyclerView recyclerView;
    ProgressBar progressCircular;
    Adapter adapter;
    ArrayList<history> get;
    IReceiveId mIReceiveId;
    presenterControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines);

        init();
        search();
        control.getListControl("FamilyHistory");
    }

    private void init() {
        mIReceiveId = this;
        control = new presenterControl();
        control.attachViewControl(this);
        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        progressCircular = findViewById(R.id.progress_circular);
        recyclerView = findViewById(R.id.recyclerViewVaccines);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void search() {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return false;
            }
        });
    }

    private void filterList(String newText) {
        ArrayList<history> list = new ArrayList<>();
        for (history history : get) {
            if (history.getLastNameP().toLowerCase().contains(newText.toLowerCase())) {
                list.add(history);
            }
        }
        if (!list.isEmpty()) {
            adapter.setList(list);
        } else {
            adapter.setList(new ArrayList<>());
        }
    }

    @Override
    public void controlList(ArrayList<history> list) {
        adapter = new Adapter(list, mIReceiveId);
        recyclerView.setAdapter(adapter);
        get = list;
    }

    @Override
    public void viewMessage() {
        progressCircular.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissMessage() {
        progressCircular.setVisibility(View.GONE);
    }

    @Override
    public void receiveId(String uid) {
        Intent intent = new Intent(this, VaccinesRegisterActivity.class);
        intent.putExtra("uid", uid);
        startActivity(intent);
    }
}