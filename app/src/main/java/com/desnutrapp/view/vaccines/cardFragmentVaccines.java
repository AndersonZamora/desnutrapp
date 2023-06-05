package com.desnutrapp.view.vaccines;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.desnutrapp.R;
import com.desnutrapp.helpers.getDate;
import com.desnutrapp.helpers.handleList;
import com.desnutrapp.helpers.listDose;
import com.desnutrapp.validation.ValidateChildren;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class cardFragmentVaccines extends Fragment {

    FloatingActionButton button;
    TextInputLayout doseContainer;
    TextInputLayout typeContainer;
    AutoCompleteTextView autoCompleteTextView;
    AutoCompleteTextView autoCompleteTextViewType;
    TextView age;
    String doseString = "";
    String doseTypeString = "";
    handleList list;
    Button saveDose;
    ValidateChildren mChildren;
    getDate mGetDate;
    String uid;
    ProgressBar progressBar;

    public cardFragmentVaccines(FloatingActionButton button, String uid) {
        this.button = button;
        this.uid = uid;
    }

    @NonNull
    public static cardFragmentVaccines newInstance(FloatingActionButton button, String uid) {
        return new cardFragmentVaccines(button, uid);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new handleList();
        mChildren = new ValidateChildren(getActivity());
        mGetDate = new getDate();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_card_vaccine, container, false);
        init(view);
        dropDownListTitle();

        saveDose.setOnClickListener(v -> handleValidation());

        return view;
    }

    private void handleValidation() {
        if (mChildren.HandleValidateEmpty(typeContainer) | mChildren.HandleValidateEmpty(doseContainer)) {
            return;
        }
        handleSaveDatabase();
    }

    private void handleSaveDatabase() {
        saveDose.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);
        Map<String, Object> vaccinePost = new HashMap<>();
        vaccinePost.put("title", doseTypeString);
        vaccinePost.put("type", doseString);
        vaccinePost.put("date", mGetDate.getTodayDate());

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("FamilyHistory").document(uid)
                .collection("vaccine")
                .document(String.valueOf(System.currentTimeMillis()))
                .set(vaccinePost)
                .addOnSuccessListener(aVoid -> requireActivity().onBackPressed())
                .addOnFailureListener(e -> {
                    progressBar.setVisibility(View.GONE);
                    saveDose.setVisibility(View.VISIBLE);
                    Toast.makeText(getActivity(), R.string.again, Toast.LENGTH_SHORT).show();
                });
    }

    private void dropDownListTitle() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.drop_down_item,
                listDose.title()
        );

        autoCompleteTextViewType.setAdapter(adapter);
        autoCompleteTextViewType.setOnItemClickListener((adapterView, view, i, l) -> {
            doseTypeString = autoCompleteTextViewType.getText().toString();
            dropDownList(doseTypeString);
        });
    }

    private void init(@NonNull View view) {
        progressBar = view.findViewById(R.id.progress_save);
        progressBar.setVisibility(View.GONE);
        saveDose = view.findViewById(R.id.save_dose);
        age = view.findViewById(R.id.vaccine_age);
        autoCompleteTextView = view.findViewById(R.id.vaccine_dose);
        autoCompleteTextViewType = view.findViewById(R.id.type_dose);
        doseContainer = view.findViewById(R.id.dose_container);
        typeContainer = view.findViewById(R.id.type_container);
        doseContainer.setVisibility(View.GONE);
    }

    void dropDownList(String type) {

        autoCompleteTextView.getText().clear();
        doseString = "";
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.drop_down_item,
                list.searchDose(type)
        );

        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setOnItemClickListener((adapterView, view, i, l) -> doseString = autoCompleteTextView.getText().toString());
        doseContainer.setVisibility(View.VISIBLE);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        button.setVisibility(View.VISIBLE);
        requireActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }
}
