package com.desnutrapp.view.record;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.desnutrapp.R;
import com.desnutrapp.helpers.handleControlDate;
import com.desnutrapp.interfaces.IReceiveId;
import com.desnutrapp.models.children;
import com.desnutrapp.models.control;
import com.desnutrapp.models.handleDate;
import com.desnutrapp.presenters.auth.control.presenterControlChildren;
import com.desnutrapp.view.control.ChildrenContract;
import com.desnutrapp.view.family.EditPadresActivity;

import java.util.List;

public class RecordControlActivity extends AppCompatActivity implements IReceiveId, ChildrenContract.ChildrenView {

    TextView name, dateBirthday, age;
    Button btnSeeGraphic;
    Button editData;
    handleControlDate controlDate;
    presenterControlChildren controlChildren;
    LinearLayout linearLayout;
    ProgressBar progressBar;
    RecyclerView recyclerView;
    children childrenG;
    IReceiveId mIReceiveId;
    String uidR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_control);

        uidR = getIntent().getStringExtra("uid");

        init();
        btnSeeGraphic.setOnClickListener(view -> handleGraphic(uidR));
        controlChildren.geChildren(uidR);

        editData.setOnClickListener(v -> {
            Intent intent = new Intent(RecordControlActivity.this, EditPadresActivity.class);
            intent.putExtra("uid", uidR);
            startActivity(intent);
        });
    }

    private void handleGraphic(String uid) {
        Intent intent = new Intent(RecordControlActivity.this, RecordActivity.class);
        intent.putExtra("uid", uid);
        intent.putExtra("children", childrenG);
        startActivity(intent);
    }

    void init() {
        mIReceiveId = this;
        controlChildren = new presenterControlChildren();
        controlChildren.attachViewChildren(this);
        controlDate = new handleControlDate();
        btnSeeGraphic = findViewById(R.id.btnSeeGraphic);
        editData = findViewById(R.id.edit_data);
        name = findViewById(R.id.idNameRecord);
        linearLayout = findViewById(R.id.linearLayout);
        progressBar = findViewById(R.id.progress_circular);
        dateBirthday = findViewById(R.id.id_DateBir);
        age = findViewById(R.id.id_AgeR);
        recyclerView = findViewById(R.id.recyclerViewControl);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void children(@NonNull children model, List<control> list) {
        name.setText(String.format("%s %s %s", model.getLastNameP(), model.getLastNameM(), model.getFullName()));
        dateBirthday.setText(String.format("%s", model.getDataBirth()));
        handleDate re = controlDate.handle(model.getDataBirth());
        age.setText(re.getStringFor());
        linearLayout.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);
        Adapter adapter = new Adapter(list, mIReceiveId);
        recyclerView.setAdapter(adapter);
        if (list.size() <= 0) btnSeeGraphic.setVisibility(View.GONE);
        childrenG = model;
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
    public void viewMessage() {
        linearLayout.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissMessage() {
        linearLayout.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void receiveId(String uid) {
        controlChildren.deleteChildren(uidR, uid);
    }
}