package com.desnutrapp.presenters.auth.control;

import androidx.annotation.NonNull;

import com.desnutrapp.models.children;
import com.desnutrapp.models.control;
import com.desnutrapp.models.history;
import com.desnutrapp.view.control.ChildrenContract;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.Objects;

public class presenterControlChildren implements ChildrenContract.HistoryAttachView {

    ChildrenContract.ChildrenView childrenView;

    @Override
    public void attachViewChildren(ChildrenContract.ChildrenView childrenView) {
        this.childrenView = childrenView;
    }

    @Override
    public void geChildren(String uid) {

        childrenView.viewMessage();

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        DocumentReference docRef = db.collection("FamilyHistory").document(uid);
        docRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                DocumentSnapshot document = task.getResult();
                if (document.exists()) {

                    history model = Objects.requireNonNull(document.toObject(history.class)).withId(document.getId());
                    children ge = model.getChildren();

                    db.collection("FamilyHistory")
                            .document(document.getId())
                            .collection("control")
                            .orderBy("ultimate", Query.Direction.DESCENDING)
                            .addSnapshotListener((value, error) -> {
                                ArrayList<control> controls = new ArrayList<>();
                                assert value != null;
                                for (QueryDocumentSnapshot doc : value) {
                                    control controlM = doc.toObject(control.class).withId(doc.getId());
                                    controls.add(controlM);
                                }
                                childrenView.children(ge, controls);
                                childrenView.dismissMessage();
                            });

                } else {
                    childrenView.dismissMessage();
                    childrenView.viewMessage();
                }
            } else {
                childrenView.dismissMessage();
                childrenView.viewMessage();
            }
        });
    }

    @Override
    public void deleteChildren(String uid, String uidC) {

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("FamilyHistory").document(uid).collection("control").document(uidC)
                .delete().addOnSuccessListener(unused -> childrenView.successDelete()).addOnFailureListener(e -> childrenView.messageError());
    }
}