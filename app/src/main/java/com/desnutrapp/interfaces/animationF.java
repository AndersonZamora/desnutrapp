package com.desnutrapp.interfaces;

import android.view.animation.Animation;
import android.widget.ImageView;

public interface animationF {
    void setAnimation(Animation topAnim, Animation bottomAnim, ImageView logo, ImageView name);

    void checkState();
}
