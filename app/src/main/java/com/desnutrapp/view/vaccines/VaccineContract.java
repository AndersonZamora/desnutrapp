package com.desnutrapp.view.vaccines;

import com.desnutrapp.models.vaccineModel;
import com.desnutrapp.presenters.auth.messageEx;

import java.util.List;

public class VaccineContract {

    public interface VaccineAttachView {

        void attachViewVaccine(VaccineView vaccineView);

        void geVaccine(String uid);

        void deleteVaccine(String uid, String uidV);
    }

    public interface VaccineView extends messageEx {

        void vaccine(List<vaccineModel> list);

        void successDelete();

        void messageError();
    }
}
