package com.desnutrapp.view.record;

import com.desnutrapp.models.control;

import java.util.List;

public class GraphicContract {

    public interface GraphicAttachView {

        void attachViewGraphic(GraphicView graphicView);

        void geGraphic(String uid);
    }

    public interface GraphicView {

        void graphic(List<control> list);

        void viewMessage();

        void dismissMessage();
    }
}