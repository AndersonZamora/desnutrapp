package com.desnutrapp.helpers;

import java.util.Calendar;

public class getDate {

    public getDate() {
        //builder required
    }

    public String getTodayDate() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        int year = calendar.get(Calendar.YEAR);
        int moth = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, moth, year);
    }

    public String getTodayDate(int sum) {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.MONTH, sum);
        int year = calendar.get(Calendar.YEAR);
        int moth = calendar.get(Calendar.MONTH);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, moth, year);
    }

    public String makeDateString(int day, int month, int year) {
        return getDayFormat(day) + "-" + getMonthFormat(month) + "-" + year;
    }

    public String getDayFormat(int day) {

        if (day == 1) {
            return "01";
        }
        if (day == 2) {
            return "02";
        }
        if (day == 3) {
            return "03";
        }
        if (day == 4) {
            return "04";
        }
        if (day == 5) {
            return "05";
        }
        if (day == 6) {
            return "06";
        }
        if (day == 7) {
            return "07";
        }
        if (day == 8) {
            return "08";
        }
        if (day == 9) {
            return "09";
        }

        return String.valueOf(day);
    }

    public String getMonthFormat(int month) {
        if (month == 1) {
            return "01";
        }
        if (month == 2) {
            return "02";
        }
        if (month == 3) {
            return "03";
        }
        if (month == 4) {
            return "04";
        }
        if (month == 5) {
            return "05";
        }
        if (month == 6) {
            return "06";
        }
        if (month == 7) {
            return "07";
        }
        if (month == 8) {
            return "08";
        }
        if (month == 9) {
            return "09";
        }
        if (month == 10) {
            return "10";
        }
        if (month == 11) {
            return "11";
        }
        if (month == 12) {
            return "12";
        }
        return "01";
    }
}
