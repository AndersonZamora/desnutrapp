package com.desnutrapp.helpers;

import java.util.ArrayList;
import java.util.List;

public class controlTree {

    public controlTree() {
        //builder required
    }

    public boolean searchAge(String data) {
        for (String value : listAge()) {
            if (value.equals(data)) {
                return true;
            }
        }

        return false;
    }

    List<String> listAge() {
        List<String> list = new ArrayList<>();
        list.add("3.0");
        list.add("3.3");
        list.add("3.6");
        list.add("3.9");
        list.add("4.0");
        list.add("4.3");
        list.add("4.6");
        list.add("4.9");
        list.add("5.0");
        return list;
    }
}
