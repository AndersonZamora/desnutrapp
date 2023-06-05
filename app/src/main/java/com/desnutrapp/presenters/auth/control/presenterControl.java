package com.desnutrapp.presenters.auth.control;

import com.desnutrapp.models.history;
import com.desnutrapp.view.control.HistoryContract;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;

public class presenterControl implements HistoryContract.HistoryAttachView {

    HistoryContract.HistoryView historyView;

    @Override
    public void attachViewControl(HistoryContract.HistoryView historyView) {
        this.historyView = historyView;
    }

    @Override
    public void getListControl(String collection) {
        historyView.viewMessage();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection(collection)
                .addSnapshotListener((value, error) -> {
                    ArrayList<history> arrayList = new ArrayList<>();
                    assert value != null;
                    for (QueryDocumentSnapshot doc : value) {
                        history history = doc.toObject(history.class).withId(doc.getId());
                        arrayList.add(history);
                    }
                    historyView.dismissMessage();
                    historyView.controlList(arrayList);
                });
    }
}
