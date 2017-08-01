package com.haohaohu.androidanimationsample;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class PropertyAnimActivity extends AppCompatActivity {

    private ImageView propertyIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_anim);
        initView();
    }

    private void initView() {
        propertyIv = (ImageView) findViewById(R.id.property_iv);
        ObjectAnimator animator = ObjectAnimator//
                .ofFloat(propertyIv, "rotation", 0.0F, 360.0F)
                .setDuration(2000);
        animator.setInterpolator(new LinearInterpolator());
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.start();
    }
}
