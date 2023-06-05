package com.desnutrapp.view;

import com.desnutrapp.models.children;
import com.desnutrapp.presenters.auth.messageEx;

public class HistoryContract {

    public interface HistoryAttachView {

        void attachViewHistory(HistoryView historyView);

        void geChildren(String uid);
    }

    public interface HistoryView extends messageEx {

        void children(children model);
    }
}
