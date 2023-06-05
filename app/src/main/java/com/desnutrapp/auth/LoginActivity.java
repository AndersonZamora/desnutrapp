package com.desnutrapp.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.desnutrapp.R;
import com.desnutrapp.getInformationActivity;
import com.desnutrapp.presenters.auth.auth.presenterLogin;
import com.desnutrapp.validation.ValidateFields;
import com.desnutrapp.validation.ValidateLogin;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity implements LoginContract.handleLogin {

    Button logIn;
    ValidateLogin nValidateLogin;
    TextInputLayout emailLogin, passwordLogin;
    presenterLogin nPresenterLogin;
    LinearLayout loginView;
    LinearLayout progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        logIn.setOnClickListener(view -> handleValidate());
    }

    void handleValidate() {
        if (!nValidateLogin.HandleValidateEmail(emailLogin) | !nValidateLogin.HandleValidatePassword(passwordLogin)) {
            return;
        }

        handleSignIn();
    }

    void init() {
        nValidateLogin = new ValidateLogin(new ValidateFields(), this);
        nPresenterLogin = new presenterLogin();
        nPresenterLogin.attachLoginHandLink(LoginActivity.this);
        logIn = findViewById(R.id.login);
        emailLogin = findViewById(R.id.username);
        passwordLogin = findViewById(R.id.password);
        loginView = findViewById(R.id.login_view);
        progress = findViewById(R.id.progress_linear_log);
        progress.setVisibility(View.GONE);
        loginView.setVisibility(View.VISIBLE);
    }

    void handleSignIn() {
        String email = Objects.requireNonNull(Objects.requireNonNull(emailLogin.getEditText()).getText().toString().trim());
        String password = Objects.requireNonNull(Objects.requireNonNull(passwordLogin.getEditText()).getText().toString().trim());
        nPresenterLogin.SignInWithEmailAndPassword(email, password);
    }

    @Override
    public void showMessage() {
        progress.setVisibility(View.VISIBLE);
        loginView.setVisibility(View.GONE);
    }

    @Override
    public void closeMessage() {
        progress.setVisibility(View.GONE);
        loginView.setVisibility(View.VISIBLE);
    }

    @Override
    public void viewDashboard() {
        Intent intent = new Intent(LoginActivity.this, getInformationActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public void showErrorMessage() {
        progress.setVisibility(View.GONE);
        loginView.setVisibility(View.VISIBLE);
        Toast.makeText(this, "usuario o contraseña inválido", Toast.LENGTH_SHORT).show();
    }
}