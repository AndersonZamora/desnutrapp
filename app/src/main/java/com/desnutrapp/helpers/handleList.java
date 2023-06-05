package com.desnutrapp.helpers;

import androidx.annotation.NonNull;

public class handleList {

    public String[] searchDose(@NonNull String type) {

        String newType = type.replace(" ", "");

        switch (newType) {
            case "Menordeunaño4meses":
                return listDose.doseListMinorFourMonths();

            case "Menordeunaño6meses":
                return listDose.doseListMinorSixMonths();

            case "Almesdelaprimeradosisdeinfluenza":
                return listDose.doseListMinorInfluenza();

            case "Unaño12Meses":
                return listDose.doseListOneYearTwelveMonths();
            case "Unaño15meses":
                return listDose.doseListOneYearFifteenMonths();

            case "Unaño18meses":
                return listDose.doseListOneYearEighteenMonths();

            case "De2años":
                return listDose.doseListTwoYearEighteenMonths();

            case "2años,11meses,29dias":
                return listDose.doseListTwoYearEighteenMonths2();

            case "3años,11meses,29dias":
                return listDose.doseListThreeAndFourYear();

            case "4años,11meses,29dias":
                return listDose.doseListThreeAndFourYear2();

            case "2,3y4años":
                return listDose.doseListTwoThreeAndFourYear();

            case "(Hasta4años11meses29dias)":
                return listDose.doseListTwoThreeAndFourYear2();

            case "4años":
                return listDose.doseListFourYears();

            case "Hasta4años11meses,29dias":
                return listDose.doseListMonths();

            default:
                return listDose.doseListFirst();
        }
    }
}
