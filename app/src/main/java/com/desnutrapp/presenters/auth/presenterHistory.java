package com.desnutrapp.presenters.auth;

import com.desnutrapp.models.children;
import com.desnutrapp.models.history;
import com.desnutrapp.view.HistoryContract;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Objects;

public class presenterHistory implements HistoryContract.HistoryAttachView {

    HistoryContract.HistoryView historyView;

    @Override
    public void attachViewHistory(HistoryContract.HistoryView historyView) {
        this.historyView = historyView;
    }

    @Override
    public void geChildren(String uid) {

        historyView.viewMessage();

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        DocumentReference docRef = db.collection("FamilyHistory").document(uid);
        docRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                DocumentSnapshot document = task.getResult();
                if (document.exists()) {
                    history hist = Objects.requireNonNull(document.toObject(history.class)).withId(document.getId());
                    children child = hist.getChildren();
                    historyView.children(child);
                } else {
                    historyView.dismissMessage();
                    historyView.viewMessage();
                }
            } else {
                historyView.dismissMessage();
                historyView.viewMessage();
            }
        });
    }
}
