package com.desnutrapp.presenters.auth.graphi;

import com.desnutrapp.models.control;
import com.desnutrapp.view.record.GraphicContract;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;

public class presenterGraphic implements GraphicContract.GraphicAttachView {

    GraphicContract.GraphicView graphicView;

    @Override
    public void attachViewGraphic(GraphicContract.GraphicView graphicView) {
        this.graphicView = graphicView;
    }

    @Override
    public void geGraphic(String uid) {
        graphicView.viewMessage();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("FamilyHistory")
                .document(uid)
                .collection("control")
                .orderBy("ultimate", Query.Direction.ASCENDING)
                .addSnapshotListener((value, error) -> {
                    ArrayList<control> controls = new ArrayList<>();
                    assert value != null;
                    for (QueryDocumentSnapshot doc : value) {
                        control controlM = doc.toObject(control.class).withId(doc.getId());
                        controls.add(controlM);
                    }
                    graphicView.dismissMessage();
                    graphicView.graphic(controls);
                });
    }
}
