package com.desnutrapp.view.control;

import com.desnutrapp.models.history;

import java.util.ArrayList;

public class HistoryContract {

    public interface HistoryAttachView {

        void attachViewControl(HistoryView historyView);

        void getListControl(String collection);
    }

    public interface HistoryView {

        void controlList(ArrayList<history> list);

        void viewMessage();

        void dismissMessage();
    }
}
