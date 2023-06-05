package com.desnutrapp.helpers;

import androidx.annotation.NonNull;

import com.desnutrapp.models.ListSize;

import java.util.ArrayList;

public class calculateSize {

    @NonNull
    public ListSize searchSize(String size, @NonNull String type) {

        ListSize size1 = new ListSize();

        if (type.equals("girl")) {
            for (ListSize listSize : listSizes()) {
                if (listSize.getAges().equals(size)) {
                    size1 = listSize;
                    break;
                }
            }
        } else if (type.equals("boy")) {
            for (ListSize listSize : listSizesBoy()) {
                if (listSize.getAges().equals(size)) {
                    size1 = listSize;
                    break;
                }
            }
        }

        return size1;
    }


    ArrayList<ListSize> listSizes() {

        ArrayList<ListSize> list = new ArrayList<>();

        ListSize threeYears1 = new ListSize();
        threeYears1.setAges("3.0");
        threeYears1.setValue1(83.6);
        threeYears1.setValue2(87.4);
        threeYears1.setValue3(91.2);
        threeYears1.setValue4(98.9);
        threeYears1.setValue5(10.8);
        threeYears1.setValue6(18.1);
        list.add(threeYears1);

        ListSize threeYears2 = new ListSize();
        threeYears2.setAges("3.1");
        threeYears2.setValue1(84.2);
        threeYears2.setValue2(88.0);
        threeYears2.setValue3(91.9);
        threeYears2.setValue4(99.6);
        threeYears2.setValue5(10.9);
        threeYears2.setValue6(18.4);
        list.add(threeYears2);

        ListSize threeYears3 = new ListSize();
        threeYears3.setAges("3.2");
        threeYears3.setValue1(84.7);
        threeYears3.setValue2(88.6);
        threeYears3.setValue3(92.5);
        threeYears3.setValue4(100.3);
        threeYears3.setValue5(11.1);
        threeYears3.setValue6(18.7);
        list.add(threeYears3);

        ListSize threeYears4 = new ListSize();
        threeYears4.setAges("3.3");
        threeYears4.setValue1(85.3);
        threeYears4.setValue2(89.2);
        threeYears4.setValue3(93.1);
        threeYears4.setValue4(101.0);
        threeYears4.setValue5(11.2);
        threeYears4.setValue6(19.0);
        list.add(threeYears4);

        ListSize threeYears5 = new ListSize();
        threeYears5.setAges("3.4");
        threeYears5.setValue1(85.8);
        threeYears5.setValue2(89.8);
        threeYears5.setValue3(93.8);
        threeYears5.setValue4(101.7);
        threeYears5.setValue5(11.3);
        threeYears5.setValue6(19.2);
        list.add(threeYears5);

        ListSize threeYears6 = new ListSize();
        threeYears6.setAges("3.5");
        threeYears6.setValue1(86.3);
        threeYears6.setValue2(90.4);
        threeYears6.setValue3(94.4);
        threeYears6.setValue4(102.4);
        threeYears6.setValue5(11.5);
        threeYears6.setValue6(19.5);
        list.add(threeYears6);

        ListSize threeYears7 = new ListSize();
        threeYears7.setAges("3.6");
        threeYears7.setValue1(86.8);
        threeYears7.setValue2(90.9);
        threeYears7.setValue3(95.0);
        threeYears7.setValue4(103.1);
        threeYears7.setValue5(11.6);
        threeYears7.setValue6(19.8);
        list.add(threeYears7);

        ListSize threeYears8 = new ListSize();
        threeYears8.setAges("3.7");
        threeYears8.setValue1(87.4);
        threeYears8.setValue2(91.5);
        threeYears8.setValue3(95.6);
        threeYears8.setValue4(103.8);
        threeYears8.setValue5(11.7);
        threeYears8.setValue6(20.1);
        list.add(threeYears8);

        ListSize threeYears9 = new ListSize();
        threeYears9.setAges("3.8");
        threeYears9.setValue1(87.9);
        threeYears9.setValue2(92.0);
        threeYears9.setValue3(96.2);
        threeYears9.setValue4(104.5);
        threeYears9.setValue5(11.8);
        threeYears9.setValue6(20.4);
        list.add(threeYears9);

        ListSize threeYears10 = new ListSize();
        threeYears10.setAges("3.9");
        threeYears10.setValue1(88.9);
        threeYears10.setValue2(92.5);
        threeYears10.setValue3(96.7);
        threeYears10.setValue4(105.1);
        threeYears10.setValue5(12.0);
        threeYears10.setValue6(20.7);
        list.add(threeYears10);

        ListSize threeYears11 = new ListSize();
        threeYears11.setAges("3.10");
        threeYears11.setValue1(88.9);
        threeYears11.setValue2(93.1);
        threeYears11.setValue3(97.3);
        threeYears11.setValue4(105.8);
        threeYears11.setValue5(12.1);
        threeYears11.setValue6(20.9);
        list.add(threeYears11);

        ListSize threeYears12 = new ListSize();
        threeYears12.setAges("3.11");
        threeYears12.setValue1(89.3);
        threeYears12.setValue2(93.6);
        threeYears12.setValue3(97.9);
        threeYears12.setValue4(106.4);
        threeYears12.setValue5(12.2);
        threeYears12.setValue6(21.2);
        list.add(threeYears12);

        ListSize fourYears1 = new ListSize();
        fourYears1.setAges("4.0");
        fourYears1.setValue1(89.8);
        fourYears1.setValue2(94.1);
        fourYears1.setValue3(98.4);
        fourYears1.setValue4(107.0);
        fourYears1.setValue5(12.3);
        fourYears1.setValue6(21.5);
        list.add(fourYears1);

        ListSize fourYears2 = new ListSize();
        fourYears2.setAges("4.1");
        fourYears2.setValue1(90.3);
        fourYears2.setValue2(94.6);
        fourYears2.setValue3(99.0);
        fourYears2.setValue4(107.7);
        fourYears2.setValue5(12.4);
        fourYears2.setValue6(21.8);
        list.add(fourYears2);

        ListSize fourYears3 = new ListSize();
        fourYears3.setAges("4.2");
        fourYears3.setValue1(90.7);
        fourYears3.setValue2(95.1);
        fourYears3.setValue3(99.5);
        fourYears3.setValue4(108.3);
        fourYears3.setValue5(12.6);
        fourYears3.setValue6(22.1);
        list.add(fourYears3);

        ListSize fourYears4 = new ListSize();
        fourYears4.setAges("4.3");
        fourYears4.setValue1(91.2);
        fourYears4.setValue2(95.6);
        fourYears4.setValue3(100.1);
        fourYears4.setValue4(108.9);
        fourYears4.setValue5(12.7);
        fourYears4.setValue6(22.4);
        list.add(fourYears4);

        ListSize fourYears5 = new ListSize();
        fourYears5.setAges("4.4");
        fourYears5.setValue1(91.7);
        fourYears5.setValue2(96.1);
        fourYears5.setValue3(100.6);
        fourYears5.setValue4(109.5);
        fourYears5.setValue5(12.8);
        fourYears5.setValue6(22.6);
        list.add(fourYears5);

        ListSize fourYears6 = new ListSize();
        fourYears6.setAges("4.5");
        fourYears6.setValue1(92.1);
        fourYears6.setValue2(96.6);
        fourYears6.setValue3(101.1);
        fourYears6.setValue4(110.1);
        fourYears6.setValue5(12.9);
        fourYears6.setValue6(22.9);
        list.add(fourYears6);

        ListSize fourYears7 = new ListSize();
        fourYears7.setAges("4.6");
        fourYears7.setValue1(92.6);
        fourYears7.setValue2(97.1);
        fourYears7.setValue3(101.6);
        fourYears7.setValue4(110.7);
        fourYears7.setValue5(13.0);
        fourYears7.setValue6(23.2);
        list.add(fourYears7);

        ListSize fourYears8 = new ListSize();
        fourYears8.setAges("4.7");
        fourYears8.setValue1(93.0);
        fourYears8.setValue2(97.6);
        fourYears8.setValue3(102.2);
        fourYears8.setValue4(111.3);
        fourYears8.setValue5(13.2);
        fourYears8.setValue6(23.5);
        list.add(fourYears8);

        ListSize fourYears9 = new ListSize();
        fourYears9.setAges("4.8");
        fourYears9.setValue1(93.4);
        fourYears9.setValue2(98.1);
        fourYears9.setValue3(102.7);
        fourYears9.setValue4(111.9);
        fourYears9.setValue5(13.3);
        fourYears9.setValue6(23.8);
        list.add(fourYears9);

        ListSize fourYears10 = new ListSize();
        fourYears10.setAges("4.9");
        fourYears10.setValue1(93.9);
        fourYears10.setValue2(98.5);
        fourYears10.setValue3(103.2);
        fourYears10.setValue4(112.5);
        fourYears10.setValue5(13.4);
        fourYears10.setValue6(24.1);
        list.add(fourYears10);

        ListSize fourYears11 = new ListSize();
        fourYears11.setAges("4.10");
        fourYears11.setValue1(94.3);
        fourYears11.setValue2(99.0);
        fourYears11.setValue3(103.7);
        fourYears11.setValue4(113.0);
        fourYears11.setValue5(13.5);
        fourYears11.setValue6(24.4);
        list.add(fourYears11);

        ListSize fourYears12 = new ListSize();
        fourYears12.setAges("4.11");
        fourYears12.setValue1(94.7);
        fourYears12.setValue2(99.5);
        fourYears12.setValue3(104.2);
        fourYears12.setValue4(113.6);
        fourYears12.setValue5(13.6);
        fourYears12.setValue6(24.6);
        list.add(fourYears12);

        ListSize fourYears13 = new ListSize();
        fourYears13.setAges("0.0");
        fourYears13.setValue1(43.6);
        fourYears13.setValue2(45.4);
        fourYears13.setValue3(47.3);
        fourYears13.setValue4(51.0);
        fourYears13.setValue5(2.4);
        fourYears13.setValue6(4.2);
        list.add(fourYears13);

        ListSize fourYears14 = new ListSize();
        fourYears14.setAges("0.1");
        fourYears14.setValue1(47.8);
        fourYears14.setValue2(49.8);
        fourYears14.setValue3(51.7);
        fourYears14.setValue4(55.6);
        fourYears14.setValue5(3.2);
        fourYears14.setValue6(5.5);
        list.add(fourYears14);

        ListSize fourYears15 = new ListSize();
        fourYears15.setAges("0.2");
        fourYears15.setValue1(51.0);
        fourYears15.setValue2(53.0);
        fourYears15.setValue3(55.0);
        fourYears15.setValue4(59.1);
        fourYears15.setValue5(3.9);
        fourYears15.setValue6(6.6);
        list.add(fourYears15);

        ListSize fourYears16 = new ListSize();
        fourYears16.setAges("0.3");
        fourYears16.setValue1(47.8);
        fourYears16.setValue2(49.8);
        fourYears16.setValue3(51.7);
        fourYears16.setValue4(55.6);
        fourYears16.setValue5(4.2);
        fourYears16.setValue6(7.5);
        list.add(fourYears16);

        ListSize fourYears17 = new ListSize();
        fourYears17.setAges("0.4");
        fourYears17.setValue1(55.6);
        fourYears17.setValue2(57.8);
        fourYears17.setValue3(59.9);
        fourYears17.setValue4(64.3);
        fourYears17.setValue5(5.0);
        fourYears17.setValue6(8.2);
        list.add(fourYears17);

        ListSize fourYears18 = new ListSize();
        fourYears18.setAges("0.5");
        fourYears18.setValue1(57.4);
        fourYears18.setValue2(59.6);
        fourYears18.setValue3(61.8);
        fourYears18.setValue4(66.2);
        fourYears18.setValue5(5.4);
        fourYears18.setValue6(8.8);
        list.add(fourYears18);

        ListSize fourYears19 = new ListSize();
        fourYears19.setAges("0.6");
        fourYears19.setValue1(59.9);
        fourYears19.setValue2(61.2);
        fourYears19.setValue3(63.5);
        fourYears19.setValue4(68.0);
        fourYears19.setValue5(5.7);
        fourYears19.setValue6(9.3);
        list.add(fourYears19);

        ListSize fourYears20 = new ListSize();
        fourYears20.setAges("0.7");
        fourYears20.setValue1(60.3);
        fourYears20.setValue2(62.7);
        fourYears20.setValue3(65.0);
        fourYears20.setValue4(69.6);
        fourYears20.setValue5(6.0);
        fourYears20.setValue6(9.8);
        list.add(fourYears20);

        ListSize fourYears21 = new ListSize();
        fourYears21.setAges("0.8");
        fourYears21.setValue1(61.7);
        fourYears21.setValue2(64.0);
        fourYears21.setValue3(66.4);
        fourYears21.setValue4(71.1);
        fourYears21.setValue5(6.3);
        fourYears21.setValue6(10.2);
        list.add(fourYears21);

        ListSize fourYears22 = new ListSize();
        fourYears22.setAges("0.9");
        fourYears22.setValue1(62.9);
        fourYears22.setValue2(65.3);
        fourYears22.setValue3(67.7);
        fourYears22.setValue4(72.6);
        fourYears22.setValue5(6.5);
        fourYears22.setValue6(10.5);
        list.add(fourYears22);

        ListSize fourYears23 = new ListSize();
        fourYears23.setAges("0.10");
        fourYears23.setValue1(64.1);
        fourYears23.setValue2(66.5);
        fourYears23.setValue3(69.0);
        fourYears23.setValue4(73.9);
        fourYears23.setValue5(6.7);
        fourYears23.setValue6(10.9);
        list.add(fourYears23);

        ListSize fourYears24 = new ListSize();
        fourYears24.setAges("0.11");
        fourYears24.setValue1(65.2);
        fourYears24.setValue2(67.7);
        fourYears24.setValue3(70.3);
        fourYears24.setValue4(75.3);
        fourYears24.setValue5(6.9);
        fourYears24.setValue6(11.2);
        list.add(fourYears24);

        ListSize fourYears25 = new ListSize();
        fourYears25.setAges("1.0");
        fourYears25.setValue1(66.3);
        fourYears25.setValue2(68.9);
        fourYears25.setValue3(71.4);
        fourYears25.setValue4(76.6);
        fourYears25.setValue5(7.0);
        fourYears25.setValue6(11.5);
        list.add(fourYears25);

        ListSize fourYears26 = new ListSize();
        fourYears26.setAges("1.1");
        fourYears26.setValue1(67.3);
        fourYears26.setValue2(70.0);
        fourYears26.setValue3(72.6);
        fourYears26.setValue4(77.8);
        fourYears26.setValue5(7.2);
        fourYears26.setValue6(11.8);
        list.add(fourYears26);

        ListSize fourYears27 = new ListSize();
        fourYears27.setAges("1.2");
        fourYears27.setValue1(68.3);
        fourYears27.setValue2(71.0);
        fourYears27.setValue3(73.7);
        fourYears27.setValue4(79.1);
        fourYears27.setValue5(7.4);
        fourYears27.setValue6(12.1);
        list.add(fourYears27);

        ListSize fourYears28 = new ListSize();
        fourYears28.setAges("1.3");
        fourYears28.setValue1(69.3);
        fourYears28.setValue2(72.0);
        fourYears28.setValue3(74.8);
        fourYears28.setValue4(80.2);
        fourYears28.setValue5(7.6);
        fourYears28.setValue6(12.4);
        list.add(fourYears28);

        ListSize fourYears29 = new ListSize();
        fourYears29.setAges("1.4");
        fourYears29.setValue1(70.2);
        fourYears29.setValue2(73.0);
        fourYears29.setValue3(75.8);
        fourYears29.setValue4(81.4);
        fourYears29.setValue5(7.7);
        fourYears29.setValue6(12.6);
        list.add(fourYears29);

        ListSize fourYears30 = new ListSize();
        fourYears30.setAges("1.5");
        fourYears30.setValue1(71.1);
        fourYears30.setValue2(74.0);
        fourYears30.setValue3(76.8);
        fourYears30.setValue4(82.5);
        fourYears30.setValue5(7.9);
        fourYears30.setValue6(12.9);
        list.add(fourYears30);

        ListSize fourYears31 = new ListSize();
        fourYears31.setAges("1.6");
        fourYears31.setValue1(72.0);
        fourYears31.setValue2(74.9);
        fourYears31.setValue3(77.8);
        fourYears31.setValue4(83.6);
        fourYears31.setValue5(8.1);
        fourYears31.setValue6(13.2);
        list.add(fourYears31);

        ListSize fourYears32 = new ListSize();
        fourYears32.setAges("1.7");
        fourYears32.setValue1(72.8);
        fourYears32.setValue2(75.8);
        fourYears32.setValue3(78.8);
        fourYears32.setValue4(83.7);
        fourYears32.setValue5(8.2);
        fourYears32.setValue6(13.5);
        list.add(fourYears32);

        ListSize fourYears33 = new ListSize();
        fourYears33.setAges("1.8");
        fourYears33.setValue1(73.7);
        fourYears33.setValue2(76.7);
        fourYears33.setValue3(79.7);
        fourYears33.setValue4(85.7);
        fourYears33.setValue5(8.4);
        fourYears33.setValue6(13.7);
        list.add(fourYears33);

        ListSize fourYears34 = new ListSize();
        fourYears34.setAges("1.9");
        fourYears34.setValue1(74.5);
        fourYears34.setValue2(77.5);
        fourYears34.setValue3(80.6);
        fourYears34.setValue4(86.7);
        fourYears34.setValue5(8.6);
        fourYears34.setValue6(14.0);
        list.add(fourYears34);

        ListSize fourYears35 = new ListSize();
        fourYears35.setAges("1.10");
        fourYears35.setValue1(75.2);
        fourYears35.setValue2(78.4);
        fourYears35.setValue3(81.5);
        fourYears35.setValue4(87.7);
        fourYears35.setValue5(8.7);
        fourYears35.setValue6(14.3);
        list.add(fourYears35);

        ListSize fourYears36 = new ListSize();
        fourYears36.setAges("1.11");
        fourYears36.setValue1(76.0);
        fourYears36.setValue2(79.2);
        fourYears36.setValue3(82.3);
        fourYears36.setValue4(88.7);
        fourYears36.setValue5(8.9);
        fourYears36.setValue6(14.6);
        list.add(fourYears36);

        ListSize fourYears37 = new ListSize();
        fourYears37.setAges("2.0");
        fourYears37.setValue1(76.0);
        fourYears37.setValue2(79.3);
        fourYears37.setValue3(82.5);
        fourYears37.setValue4(88.9);
        fourYears37.setValue5(9.0);
        fourYears37.setValue6(14.8);
        list.add(fourYears37);

        ListSize fourYears38 = new ListSize();
        fourYears38.setAges("2.1");
        fourYears38.setValue1(76.8);
        fourYears38.setValue2(80.0);
        fourYears38.setValue3(83.3);
        fourYears38.setValue4(89.9);
        fourYears38.setValue5(9.2);
        fourYears38.setValue6(15.1);
        list.add(fourYears38);

        ListSize fourYears39 = new ListSize();
        fourYears39.setAges("2.2");
        fourYears39.setValue1(77.5);
        fourYears39.setValue2(80.8);
        fourYears39.setValue3(84.1);
        fourYears39.setValue4(90.8);
        fourYears39.setValue5(9.4);
        fourYears39.setValue6(15.4);
        list.add(fourYears39);

        ListSize fourYears40 = new ListSize();
        fourYears40.setAges("2.3");
        fourYears40.setValue1(78.1);
        fourYears40.setValue2(81.5);
        fourYears40.setValue3(84.9);
        fourYears40.setValue4(91.7);
        fourYears40.setValue5(9.5);
        fourYears40.setValue6(15.7);
        list.add(fourYears40);

        ListSize fourYears41 = new ListSize();
        fourYears41.setAges("2.4");
        fourYears41.setValue1(78.8);
        fourYears41.setValue2(82.2);
        fourYears41.setValue3(85.7);
        fourYears41.setValue4(92.5);
        fourYears41.setValue5(9.7);
        fourYears41.setValue6(16.0);
        list.add(fourYears41);

        ListSize fourYears42 = new ListSize();
        fourYears42.setAges("2.5");
        fourYears42.setValue1(79.5);
        fourYears42.setValue2(82.9);
        fourYears42.setValue3(86.4);
        fourYears42.setValue4(93.4);
        fourYears42.setValue5(9.8);
        fourYears42.setValue6(16.2);
        list.add(fourYears42);

        ListSize fourYears43 = new ListSize();
        fourYears43.setAges("2.6");
        fourYears43.setValue1(80.1);
        fourYears43.setValue2(83.6);
        fourYears43.setValue3(87.1);
        fourYears43.setValue4(94.2);
        fourYears43.setValue5(10.0);
        fourYears43.setValue6(16.5);
        list.add(fourYears43);

        ListSize fourYears44 = new ListSize();
        fourYears44.setAges("2.7");
        fourYears44.setValue1(80.7);
        fourYears44.setValue2(84.3);
        fourYears44.setValue3(87.9);
        fourYears44.setValue4(95.0);
        fourYears44.setValue5(10.1);
        fourYears44.setValue6(16.8);
        list.add(fourYears44);

        ListSize fourYears45 = new ListSize();
        fourYears45.setAges("2.8");
        fourYears45.setValue1(81.3);
        fourYears45.setValue2(84.9);
        fourYears45.setValue3(88.6);
        fourYears45.setValue4(95.8);
        fourYears45.setValue5(10.3);
        fourYears45.setValue6(17.1);
        list.add(fourYears45);

        ListSize fourYears46 = new ListSize();
        fourYears46.setAges("2.9");
        fourYears46.setValue1(81.9);
        fourYears46.setValue2(85.6);
        fourYears46.setValue3(89.3);
        fourYears46.setValue4(96.9);
        fourYears46.setValue5(10.4);
        fourYears46.setValue6(17.3);
        list.add(fourYears46);

        ListSize fourYears47 = new ListSize();
        fourYears47.setAges("2.10");
        fourYears47.setValue1(82.5);
        fourYears47.setValue2(85.2);
        fourYears47.setValue3(89.9);
        fourYears47.setValue4(97.4);
        fourYears47.setValue5(10.5);
        fourYears47.setValue6(17.6);
        list.add(fourYears47);

        ListSize fourYears48 = new ListSize();
        fourYears48.setAges("2.11");
        fourYears48.setValue1(83.1);
        fourYears48.setValue2(86.8);
        fourYears48.setValue3(90.6);
        fourYears48.setValue4(98.1);
        fourYears48.setValue5(10.7);
        fourYears48.setValue6(17.9);
        list.add(fourYears48);

        return list;
    }

    ArrayList<ListSize> listSizesBoy() {

        ArrayList<ListSize> list = new ArrayList<>();

        ListSize threeYears1 = new ListSize();
        threeYears1.setAges("3.0");
        threeYears1.setValue1(85.0);
        threeYears1.setValue2(88.7);
        threeYears1.setValue3(92.4);
        threeYears1.setValue4(99.8);
        threeYears1.setValue5(11.3);
        threeYears1.setValue6(18.3);
        list.add(threeYears1);

        ListSize threeYears2 = new ListSize();
        threeYears2.setAges("3.1");
        threeYears2.setValue1(85.5);
        threeYears2.setValue2(89.2);
        threeYears2.setValue3(93.0);
        threeYears2.setValue4(100.5);
        threeYears2.setValue5(11.4);
        threeYears2.setValue6(18.6);
        list.add(threeYears2);

        ListSize threeYears3 = new ListSize();
        threeYears3.setAges("3.2");
        threeYears3.setValue1(86.0);
        threeYears3.setValue2(89.8);
        threeYears3.setValue3(93.6);
        threeYears3.setValue4(101.2);
        threeYears3.setValue5(11.5);
        threeYears3.setValue6(18.8);
        list.add(threeYears3);

        ListSize threeYears4 = new ListSize();
        threeYears4.setAges("3.3");
        threeYears4.setValue1(86.5);
        threeYears4.setValue2(90.3);
        threeYears4.setValue3(94.2);
        threeYears4.setValue4(101.8);
        threeYears4.setValue5(11.6);
        threeYears4.setValue6(19.0);
        list.add(threeYears4);

        ListSize threeYears5 = new ListSize();
        threeYears5.setAges("3.4");
        threeYears5.setValue1(87.0);
        threeYears5.setValue2(90.9);
        threeYears5.setValue3(94.7);
        threeYears5.setValue4(102.5);
        threeYears5.setValue5(11.8);
        threeYears5.setValue6(19.3);
        list.add(threeYears5);

        ListSize threeYears6 = new ListSize();
        threeYears6.setAges("3.5");
        threeYears6.setValue1(87.5);
        threeYears6.setValue2(91.4);
        threeYears6.setValue3(95.3);
        threeYears6.setValue4(103.2);
        threeYears6.setValue5(11.9);
        threeYears6.setValue6(19.5);
        list.add(threeYears6);

        ListSize threeYears7 = new ListSize();
        threeYears7.setAges("3.6");
        threeYears7.setValue1(88.0);
        threeYears7.setValue2(91.9);
        threeYears7.setValue3(95.9);
        threeYears7.setValue4(103.8);
        threeYears7.setValue5(12.0);
        threeYears7.setValue6(19.7);
        list.add(threeYears7);

        ListSize threeYears8 = new ListSize();
        threeYears8.setAges("3.7");
        threeYears8.setValue1(88.4);
        threeYears8.setValue2(92.4);
        threeYears8.setValue3(96.4);
        threeYears8.setValue4(104.5);
        threeYears8.setValue5(12.1);
        threeYears8.setValue6(20.0);
        list.add(threeYears8);

        ListSize threeYears9 = new ListSize();
        threeYears9.setAges("3.8");
        threeYears9.setValue1(88.9);
        threeYears9.setValue2(93.0);
        threeYears9.setValue3(97.0);
        threeYears9.setValue4(105.1);
        threeYears9.setValue5(12.2);
        threeYears9.setValue6(20.2);
        list.add(threeYears9);

        ListSize threeYears10 = new ListSize();
        threeYears10.setAges("3.9");
        threeYears10.setValue1(89.4);
        threeYears10.setValue2(93.5);
        threeYears10.setValue3(97.5);
        threeYears10.setValue4(105.7);
        threeYears10.setValue5(12.4);
        threeYears10.setValue6(20.5);
        list.add(threeYears10);

        ListSize threeYears11 = new ListSize();
        threeYears11.setAges("3.10");
        threeYears11.setValue1(89.8);
        threeYears11.setValue2(94.0);
        threeYears11.setValue3(98.1);
        threeYears11.setValue4(106.3);
        threeYears11.setValue5(12.5);
        threeYears11.setValue6(20.7);
        list.add(threeYears11);

        ListSize threeYears12 = new ListSize();
        threeYears12.setAges("3.11");
        threeYears12.setValue1(90.3);
        threeYears12.setValue2(94.4);
        threeYears12.setValue3(98.6);
        threeYears12.setValue4(106.9);
        threeYears12.setValue5(12.6);
        threeYears12.setValue6(20.9);
        list.add(threeYears12);

        ListSize fourYears1 = new ListSize();
        fourYears1.setAges("4.0");
        fourYears1.setValue1(90.7);
        fourYears1.setValue2(94.9);
        fourYears1.setValue3(99.1);
        fourYears1.setValue4(107.5);
        fourYears1.setValue5(12.7);
        fourYears1.setValue6(21.2);
        list.add(fourYears1);

        ListSize fourYears2 = new ListSize();
        fourYears2.setAges("4.1");
        fourYears2.setValue1(91.2);
        fourYears2.setValue2(95.4);
        fourYears2.setValue3(99.7);
        fourYears2.setValue4(108.1);
        fourYears2.setValue5(12.8);
        fourYears2.setValue6(21.4);
        list.add(fourYears2);

        ListSize fourYears3 = new ListSize();
        fourYears3.setAges("4.2");
        fourYears3.setValue1(91.6);
        fourYears3.setValue2(95.9);
        fourYears3.setValue3(100.2);
        fourYears3.setValue4(108.7);
        fourYears3.setValue5(12.9);
        fourYears3.setValue6(22.7);
        list.add(fourYears3);

        ListSize fourYears4 = new ListSize();
        fourYears4.setAges("4.3");
        fourYears4.setValue1(92.1);
        fourYears4.setValue2(96.4);
        fourYears4.setValue3(100.7);
        fourYears4.setValue4(109.3);
        fourYears4.setValue5(13.1);
        fourYears4.setValue6(21.9);
        list.add(fourYears4);

        ListSize fourYears5 = new ListSize();
        fourYears5.setAges("4.4");
        fourYears5.setValue1(92.5);
        fourYears5.setValue2(96.9);
        fourYears5.setValue3(101.2);
        fourYears5.setValue4(109.9);
        fourYears5.setValue5(13.2);
        fourYears5.setValue6(22.2);
        list.add(fourYears5);

        ListSize fourYears6 = new ListSize();
        fourYears6.setAges("4.5");
        fourYears6.setValue1(93.0);
        fourYears6.setValue2(97.4);
        fourYears6.setValue3(101.7);
        fourYears6.setValue4(110.5);
        fourYears6.setValue5(13.3);
        fourYears6.setValue6(23.4);
        list.add(fourYears6);

        ListSize fourYears7 = new ListSize();
        fourYears7.setAges("4.6");
        fourYears7.setValue1(93.4);
        fourYears7.setValue2(97.8);
        fourYears7.setValue3(102.3);
        fourYears7.setValue4(111.1);
        fourYears7.setValue5(13.4);
        fourYears7.setValue6(22.7);
        list.add(fourYears7);

        ListSize fourYears8 = new ListSize();
        fourYears8.setAges("4.7");
        fourYears8.setValue1(93.9);
        fourYears8.setValue2(98.3);
        fourYears8.setValue3(102.8);
        fourYears8.setValue4(111.7);
        fourYears8.setValue5(13.5);
        fourYears8.setValue6(22.9);
        list.add(fourYears8);

        ListSize fourYears9 = new ListSize();
        fourYears9.setAges("4.8");
        fourYears9.setValue1(94.3);
        fourYears9.setValue2(98.8);
        fourYears9.setValue3(103.3);
        fourYears9.setValue4(112.3);
        fourYears9.setValue5(13.6);
        fourYears9.setValue6(23.2);
        list.add(fourYears9);

        ListSize fourYears10 = new ListSize();
        fourYears10.setAges("4.9");
        fourYears10.setValue1(94.7);
        fourYears10.setValue2(99.3);
        fourYears10.setValue3(103.8);
        fourYears10.setValue4(112.8);
        fourYears10.setValue5(13.7);
        fourYears10.setValue6(23.4);
        list.add(fourYears10);

        ListSize fourYears11 = new ListSize();
        fourYears11.setAges("4.10");
        fourYears11.setValue1(95.2);
        fourYears11.setValue2(99.7);
        fourYears11.setValue3(104.3);
        fourYears11.setValue4(113.4);
        fourYears11.setValue5(13.8);
        fourYears11.setValue6(23.7);
        list.add(fourYears11);

        ListSize fourYears12 = new ListSize();
        fourYears12.setAges("4.11");
        fourYears12.setValue1(95.6);
        fourYears12.setValue2(100.2);
        fourYears12.setValue3(104.8);
        fourYears12.setValue4(114.0);
        fourYears12.setValue5(14.0);
        fourYears12.setValue6(23.9);
        list.add(fourYears12);

        ListSize fourYears13 = new ListSize();
        fourYears13.setAges("0.0");
        fourYears13.setValue1(44.2);
        fourYears13.setValue2(46.1);
        fourYears13.setValue3(48.0);
        fourYears13.setValue4(51.8);
        fourYears13.setValue5(2.5);
        fourYears13.setValue6(4.4);
        list.add(fourYears13);

        ListSize fourYears14 = new ListSize();
        fourYears14.setAges("0.1");
        fourYears14.setValue1(48.9);
        fourYears14.setValue2(50.8);
        fourYears14.setValue3(52.8);
        fourYears14.setValue4(56.7);
        fourYears14.setValue5(3.4);
        fourYears14.setValue6(5.8);
        list.add(fourYears14);

        ListSize fourYears15 = new ListSize();
        fourYears15.setAges("0.2");
        fourYears15.setValue1(52.4);
        fourYears15.setValue2(54.4);
        fourYears15.setValue3(56.4);
        fourYears15.setValue4(60.4);
        fourYears15.setValue5(4.3);
        fourYears15.setValue6(7.1);
        list.add(fourYears15);

        ListSize fourYears16 = new ListSize();
        fourYears16.setAges("0.3");
        fourYears16.setValue1(55.3);
        fourYears16.setValue2(57.3);
        fourYears16.setValue3(59.4);
        fourYears16.setValue4(63.5);
        fourYears16.setValue5(5.0);
        fourYears16.setValue6(8.0);
        list.add(fourYears16);

        ListSize fourYears17 = new ListSize();
        fourYears17.setAges("0.4");
        fourYears17.setValue1(57.6);
        fourYears17.setValue2(59.6);
        fourYears17.setValue3(61.8);
        fourYears17.setValue4(66.0);
        fourYears17.setValue5(5.6);
        fourYears17.setValue6(8.7);
        list.add(fourYears17);

        ListSize fourYears18 = new ListSize();
        fourYears18.setAges("0.5");
        fourYears18.setValue1(59.6);
        fourYears18.setValue2(61.7);
        fourYears18.setValue3(63.8);
        fourYears18.setValue4(68.0);
        fourYears18.setValue5(6.0);
        fourYears18.setValue6(9.3);
        list.add(fourYears18);

        ListSize fourYears19 = new ListSize();
        fourYears19.setAges("0.6");
        fourYears19.setValue1(61.2);
        fourYears19.setValue2(63.3);
        fourYears19.setValue3(65.5);
        fourYears19.setValue4(69.8);
        fourYears19.setValue5(6.4);
        fourYears19.setValue6(9.8);
        list.add(fourYears19);

        ListSize fourYears20 = new ListSize();
        fourYears20.setAges("0.7");
        fourYears20.setValue1(62.7);
        fourYears20.setValue2(64.8);
        fourYears20.setValue3(67.0);
        fourYears20.setValue4(71.3);
        fourYears20.setValue5(67);
        fourYears20.setValue6(10.3);
        list.add(fourYears20);

        ListSize fourYears21 = new ListSize();
        fourYears21.setAges("0.8");
        fourYears21.setValue1(64.0);
        fourYears21.setValue2(66.2);
        fourYears21.setValue3(68.4);
        fourYears21.setValue4(72.8);
        fourYears21.setValue5(6.9);
        fourYears21.setValue6(10.7);
        list.add(fourYears21);

        ListSize fourYears22 = new ListSize();
        fourYears22.setAges("0.9");
        fourYears22.setValue1(65.2);
        fourYears22.setValue2(67.5);
        fourYears22.setValue3(69.7);
        fourYears22.setValue4(74.2);
        fourYears22.setValue5(7.1);
        fourYears22.setValue6(11.0);
        list.add(fourYears22);

        ListSize fourYears23 = new ListSize();
        fourYears23.setAges("0.10");
        fourYears23.setValue1(66.4);
        fourYears23.setValue2(68.7);
        fourYears23.setValue3(71.0);
        fourYears23.setValue4(75.6);
        fourYears23.setValue5(7.4);
        fourYears23.setValue6(11.4);
        list.add(fourYears23);

        ListSize fourYears24 = new ListSize();
        fourYears24.setAges("0.11");
        fourYears24.setValue1(67.6);
        fourYears24.setValue2(69.9);
        fourYears24.setValue3(72.2);
        fourYears24.setValue4(76.9);
        fourYears24.setValue5(7.6);
        fourYears24.setValue6(11.7);
        list.add(fourYears24);

        ListSize fourYears25 = new ListSize();
        fourYears25.setAges("1.0");
        fourYears25.setValue1(68.6);
        fourYears25.setValue2(71.0);
        fourYears25.setValue3(73.4);
        fourYears25.setValue4(78.1);
        fourYears25.setValue5(7.7);
        fourYears25.setValue6(12.0);
        list.add(fourYears25);

        ListSize fourYears26 = new ListSize();
        fourYears26.setAges("1.1");
        fourYears26.setValue1(69.6);
        fourYears26.setValue2(72.1);
        fourYears26.setValue3(74.5);
        fourYears26.setValue4(79.3);
        fourYears26.setValue5(7.9);
        fourYears26.setValue6(12.3);
        list.add(fourYears26);

        ListSize fourYears27 = new ListSize();
        fourYears27.setAges("1.2");
        fourYears27.setValue1(70.6);
        fourYears27.setValue2(73.1);
        fourYears27.setValue3(75.6);
        fourYears27.setValue4(80.5);
        fourYears27.setValue5(8.1);
        fourYears27.setValue6(12.6);
        list.add(fourYears27);

        ListSize fourYears28 = new ListSize();
        fourYears28.setAges("1.3");
        fourYears28.setValue1(71.6);
        fourYears28.setValue2(74.1);
        fourYears28.setValue3(76.6);
        fourYears28.setValue4(81.7);
        fourYears28.setValue5(8.3);
        fourYears28.setValue6(12.8);
        list.add(fourYears28);

        ListSize fourYears29 = new ListSize();
        fourYears29.setAges("1.4");
        fourYears29.setValue1(72.5);
        fourYears29.setValue2(75.0);
        fourYears29.setValue3(77.6);
        fourYears29.setValue4(82.8);
        fourYears29.setValue5(8.4);
        fourYears29.setValue6(13.1);
        list.add(fourYears29);

        ListSize fourYears30 = new ListSize();
        fourYears30.setAges("1.5");
        fourYears30.setValue1(73.3);
        fourYears30.setValue2(76.0);
        fourYears30.setValue3(78.6);
        fourYears30.setValue4(83.9);
        fourYears30.setValue5(8.6);
        fourYears30.setValue6(13.4);
        list.add(fourYears30);

        ListSize fourYears31 = new ListSize();
        fourYears31.setAges("1.6");
        fourYears31.setValue1(74.2);
        fourYears31.setValue2(76.9);
        fourYears31.setValue3(79.6);
        fourYears31.setValue4(85.0);
        fourYears31.setValue5(8.8);
        fourYears31.setValue6(13.7);
        list.add(fourYears31);

        ListSize fourYears32 = new ListSize();
        fourYears32.setAges("1.7");
        fourYears32.setValue1(75.0);
        fourYears32.setValue2(77.7);
        fourYears32.setValue3(80.5);
        fourYears32.setValue4(86.0);
        fourYears32.setValue5(8.9);
        fourYears32.setValue6(13.9);
        list.add(fourYears32);

        ListSize fourYears33 = new ListSize();
        fourYears33.setAges("1.8");
        fourYears33.setValue1(75.8);
        fourYears33.setValue2(78.6);
        fourYears33.setValue3(81.4);
        fourYears33.setValue4(87.0);
        fourYears33.setValue5(9.1);
        fourYears33.setValue6(14.2);
        list.add(fourYears33);

        ListSize fourYears34 = new ListSize();
        fourYears34.setAges("1.9");
        fourYears34.setValue1(76.5);
        fourYears34.setValue2(79.4);
        fourYears34.setValue3(82.3);
        fourYears34.setValue4(88.0);
        fourYears34.setValue5(9.2);
        fourYears34.setValue6(14.5);
        list.add(fourYears34);

        ListSize fourYears35 = new ListSize();
        fourYears35.setAges("1.10");
        fourYears35.setValue1(77.2);
        fourYears35.setValue2(80.2);
        fourYears35.setValue3(83.1);
        fourYears35.setValue4(89.0);
        fourYears35.setValue5(9.4);
        fourYears35.setValue6(14.7);
        list.add(fourYears35);

        ListSize fourYears36 = new ListSize();
        fourYears36.setAges("1.11");
        fourYears36.setValue1(78.0);
        fourYears36.setValue2(81.0);
        fourYears36.setValue3(83.9);
        fourYears36.setValue4(89.9);
        fourYears36.setValue5(9.5);
        fourYears36.setValue6(15.0);
        list.add(fourYears36);

        ListSize fourYears37 = new ListSize();
        fourYears37.setAges("2.0");
        fourYears37.setValue1(78.0);
        fourYears37.setValue2(81.0);
        fourYears37.setValue3(84.1);
        fourYears37.setValue4(90.2);
        fourYears37.setValue5(9.7);
        fourYears37.setValue6(15.3);
        list.add(fourYears37);

        ListSize fourYears38 = new ListSize();
        fourYears38.setAges("2.1");
        fourYears38.setValue1(78.6);
        fourYears38.setValue2(81.7);
        fourYears38.setValue3(84.9);
        fourYears38.setValue4(91.1);
        fourYears38.setValue5(9.8);
        fourYears38.setValue6(15.5);
        list.add(fourYears38);

        ListSize fourYears39 = new ListSize();
        fourYears39.setAges("2.2");
        fourYears39.setValue1(79.3);
        fourYears39.setValue2(82.5);
        fourYears39.setValue3(85.6);
        fourYears39.setValue4(92.0);
        fourYears39.setValue5(10.0);
        fourYears39.setValue6(15.8);
        list.add(fourYears39);

        ListSize fourYears40 = new ListSize();
        fourYears40.setAges("2.3");
        fourYears40.setValue1(79.9);
        fourYears40.setValue2(83.1);
        fourYears40.setValue3(86.4);
        fourYears40.setValue4(92.9);
        fourYears40.setValue5(10.1);
        fourYears40.setValue6(16.1);
        list.add(fourYears40);

        ListSize fourYears41 = new ListSize();
        fourYears41.setAges("2.4");
        fourYears41.setValue1(80.5);
        fourYears41.setValue2(83.8);
        fourYears41.setValue3(87.1);
        fourYears41.setValue4(93.7);
        fourYears41.setValue5(10.2);
        fourYears41.setValue6(16.3);
        list.add(fourYears41);

        ListSize fourYears42 = new ListSize();
        fourYears42.setAges("2.5");
        fourYears42.setValue1(81.1);
        fourYears42.setValue2(84.5);
        fourYears42.setValue3(87.8);
        fourYears42.setValue4(94.5);
        fourYears42.setValue5(10.4);
        fourYears42.setValue6(16.6);
        list.add(fourYears42);

        ListSize fourYears43 = new ListSize();
        fourYears43.setAges("2.6");
        fourYears43.setValue1(81.7);
        fourYears43.setValue2(85.1);
        fourYears43.setValue3(88.5);
        fourYears43.setValue4(95.3);
        fourYears43.setValue5(10.5);
        fourYears43.setValue6(16.9);
        list.add(fourYears43);

        ListSize fourYears44 = new ListSize();
        fourYears44.setAges("2.7");
        fourYears44.setValue1(82.3);
        fourYears44.setValue2(85.7);
        fourYears44.setValue3(89.2);
        fourYears44.setValue4(96.1);
        fourYears44.setValue5(10.7);
        fourYears44.setValue6(17.1);
        list.add(fourYears44);

        ListSize fourYears45 = new ListSize();
        fourYears45.setAges("2.8");
        fourYears45.setValue1(82.8);
        fourYears45.setValue2(86.4);
        fourYears45.setValue3(89.9);
        fourYears45.setValue4(96.9);
        fourYears45.setValue5(10.8);
        fourYears45.setValue6(17.4);
        list.add(fourYears45);

        ListSize fourYears46 = new ListSize();
        fourYears46.setAges("2.9");
        fourYears46.setValue1(83.4);
        fourYears46.setValue2(86.9);
        fourYears46.setValue3(90.5);
        fourYears46.setValue4(97.6);
        fourYears46.setValue5(10.9);
        fourYears46.setValue6(17.6);
        list.add(fourYears46);

        ListSize fourYears47 = new ListSize();
        fourYears47.setAges("2.10");
        fourYears47.setValue1(83.9);
        fourYears47.setValue2(87.5);
        fourYears47.setValue3(91.1);
        fourYears47.setValue4(98.4);
        fourYears47.setValue5(11.0);
        fourYears47.setValue6(17.8);
        list.add(fourYears47);

        ListSize fourYears48 = new ListSize();
        fourYears48.setAges("2.11");
        fourYears48.setValue1(84.4);
        fourYears48.setValue2(88.1);
        fourYears48.setValue3(91.8);
        fourYears48.setValue4(99.1);
        fourYears48.setValue5(11.2);
        fourYears48.setValue6(18.1);
        list.add(fourYears48);

        return list;
    }
}
