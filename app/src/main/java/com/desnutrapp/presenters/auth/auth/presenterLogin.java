package com.desnutrapp.presenters.auth.auth;

import com.desnutrapp.auth.LoginContract;
import com.desnutrapp.interfaces.IPresenterLogin;
import com.google.firebase.auth.FirebaseAuth;

public class presenterLogin implements IPresenterLogin, LoginContract.handleLoginView {
    LoginContract.handleLogin handleLogin;

    public presenterLogin() {
        //builder required
    }

    @Override
    public void attachLoginHandLink(LoginContract.handleLogin handleLogin) {
        this.handleLogin = handleLogin;
    }

    @Override
    public void SignInWithEmailAndPassword(String email, String password) {

        handleLogin.showMessage();
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        handleLogin.closeMessage();
                        handleLogin.viewDashboard();
                    } else {
                        handleLogin.showErrorMessage();
                    }
                }).addOnFailureListener(e -> handleLogin.showErrorMessage());
    }
}
