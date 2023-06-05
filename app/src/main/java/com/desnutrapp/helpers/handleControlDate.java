package com.desnutrapp.helpers;

import com.desnutrapp.models.handleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public class handleControlDate {

    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
    Calendar today = Calendar.getInstance();
    Calendar dob = Calendar.getInstance();

    public handleDate handle(String birth) {

        handleDate result = new handleDate();

        today.add(Calendar.MONTH, 1);

        try {
            dob.setTime(Objects.requireNonNull(df.parse(birth)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dob.add(Calendar.MONTH, 1);
        int month = today.get(Calendar.MONTH) - dob.get(Calendar.MONTH);
        if (month < 0) month = 0;
        int year = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        result.setMoth(month);
        result.setAge(String.format("%s%s%s", year, ".", month));
        result.setStringFor(String.format("%s %s %s %s ", year, "a", month, "m"));
        String age = String.format("%s%s%s", year, ".", month);
        result.setAgeC(Float.parseFloat(age));

        return result;
    }
}
