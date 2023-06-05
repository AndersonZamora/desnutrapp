package com.desnutrapp.view.control;

import com.desnutrapp.models.children;
import com.desnutrapp.models.control;

import java.util.List;

public class ChildrenContract {

    public interface HistoryAttachView {

        void attachViewChildren(ChildrenView childrenView);

        void geChildren(String uid);

        void deleteChildren(String uid, String uidC);
    }

    public interface ChildrenView {

        void children(children model, List<control> list);

        void successDelete();

        void messageError();

        void viewMessage();

        void dismissMessage();
    }

}
