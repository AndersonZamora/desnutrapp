package com.desnutrapp.presenters.auth.splash;

import android.content.Context;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.desnutrapp.helpers.constantsN;
import com.desnutrapp.interfaces.animationF;
import com.desnutrapp.splashContract;

public class presenterSplash implements animationF, splashContract.splashPresenter {

    splashContract.splashView splashView;
    final Context mContext;

    public presenterSplash(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void setAnimation(Animation topAnim, Animation bottomAnim, @NonNull ImageView logo, @NonNull ImageView name) {
        logo.setAnimation(topAnim);
        name.setAnimation(bottomAnim);
        new Handler().postDelayed(this::checkState, constantsN.SPLASH_SCREEN);
    }

    @Override
    public void checkState() {
        splashView.viewLogIn();
    }

    @Override
    public void attachView(splashContract.splashView splashView) {
        this.splashView = splashView;
    }
}
