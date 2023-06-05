package com.desnutrapp.helpers;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

public class listDose {

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] title() {
        return new String[]{
                "Primera dosis", "Menor de un año 4 meses", "Menor de un año 6 meses", "Al mes de la primera dosis de influenza",
                "Un año 12 Meses", "Un año 15 meses", "Un año 18 meses", "De 2 años", "2 años, 11 meses, 29 dias", "3 años, 11 meses, 29 dias",
                "4 años, 11 meses, 29 dias", "2, 3 y 4 años", "(Hasta 4 años 11 meses 29 dias)", "4 años", "(Hasta 4 años 11 meses, 29 dias)"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListFirst() {
        return new String[]{"1ra dosis Vacuna Neumococo"};
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListMinorFourMonths() {
        return new String[]{
                "2da dosis Vacuna Pentavalente",
                "2da dosis Vacuna Antipolio inactivada inyectable (IPV)",
                "2da dosis Vacuna contra Rotavirus",
                "2da dosis Vacuna Neumococo"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListMinorSixMonths() {
        return new String[]{
                "3ra dosis Vacuna Pentavalente",
                "1ra dosis Vacuna Antipolio Oral (APO)",
                "1ra dosis Vacuna Influenza Pediátrica (*)"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListMinorInfluenza() {
        return new String[]{
                "2da dosis Vacuna Influenza Pediátrica"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListOneYearTwelveMonths() {
        return new String[]{
                "1ra dosis Vacuna SPR",
                "3ra dosis Vacuna Neumococo",
                "1 dosis Vacuna contra la Varicela",
                "1 dosis Vacuna Influenza Pediátrica"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListOneYearFifteenMonths() {
        return new String[]{
                "1 dosis de Vacuna Antiamarillica (dosis única)"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListOneYearEighteenMonths() {
        return new String[]{
                "1er Refuerzo de Vacuna DPT",
                "1er Refuerzo Vacuna Antipolio oral APO",
                "2da dosis de Vacuna SPR"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListTwoYearEighteenMonths() {
        return new String[]{
                "1 dosis Vacuna Influenza Pediátrica"
        };
    }


    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListTwoYearEighteenMonths2() {
        return new String[]{
                "1 dosis Vacuna Influenza Varicela(**)"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListThreeAndFourYear() {
        return new String[]{
                "1 dosis Vacuna Influenza adulto (*)"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListThreeAndFourYear2() {
        return new String[]{
                "1 dosis Vacuna Influenza adulto (*)"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListTwoThreeAndFourYear() {
        return new String[]{
                "1 dosis Vacuna Antiamarillica (sólo aquellos que no acrediten vacuna anterior)"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListTwoThreeAndFourYear2() {
        return new String[]{
                "1 dosis Vacuna Antiamarillica (sólo aquellos que no acrediten vacuna anterior)"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListFourYears() {
        return new String[]{
                "2do Refuerzo DPT"
        };
    }

    @NonNull
    @Contract(value = " -> new", pure = true)
    public static String[] doseListMonths() {
        return new String[]{
                "2do Refuerzo Antipolio oral (APO)"
        };
    }
}
