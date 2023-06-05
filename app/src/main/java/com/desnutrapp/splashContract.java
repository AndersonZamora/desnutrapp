package com.desnutrapp;

public class splashContract {

    public interface splashView {
        void viewLogIn();
    }

    public interface splashPresenter {
        void attachView(splashView splashView);
    }
}
