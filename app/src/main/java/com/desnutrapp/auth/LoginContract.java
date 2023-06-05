package com.desnutrapp.auth;

public class LoginContract {

    public interface handleLoginView{
        void attachLoginHandLink(handleLogin handleLogin);
    }
    public interface handleLogin{
        void showMessage();
        void closeMessage();
        void viewDashboard();
        void showErrorMessage();

    }
}
