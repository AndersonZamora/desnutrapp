package com.desnutrapp.presenters.auth.vaccine;

import com.desnutrapp.models.vaccineModel;
import com.desnutrapp.view.vaccines.VaccineContract;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;

public class presenterVaccineChildren implements VaccineContract.VaccineAttachView {

    VaccineContract.VaccineView vaccineView;


    @Override
    public void attachViewVaccine(VaccineContract.VaccineView vaccineView) {
        this.vaccineView = vaccineView;
    }

    @Override
    public void geVaccine(String uid) {

        vaccineView.viewMessage();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("FamilyHistory")
                .document(uid)
                .collection("vaccine")
                .addSnapshotListener((value, error) -> {
                    ArrayList<vaccineModel> list = new ArrayList<>();
                    assert value != null;
                    for (QueryDocumentSnapshot doc : value) {
                        vaccineModel model = doc.toObject(vaccineModel.class).withId(doc.getId());
                        list.add(model);
                    }
                    vaccineView.vaccine(list);
                });
    }

    @Override
    public void deleteVaccine(String uid, String uidV) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("FamilyHistory").document(uid).collection("vaccine").document(uidV)
                .delete().addOnSuccessListener(unused -> vaccineView.successDelete()).addOnFailureListener(e -> vaccineView.messageError());
    }
}
