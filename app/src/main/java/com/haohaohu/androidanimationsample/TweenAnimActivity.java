package com.haohaohu.androidanimationsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class TweenAnimActivity extends AppCompatActivity {

    private Animation anim;
    private ImageView tweenIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_anim);
        initView();
    }

    private void initView() {
        tweenIv = (ImageView) findViewById(R.id.tween_iv);
        anim = AnimationUtils.loadAnimation(TweenAnimActivity.this, R.anim.progress_anim);
        anim.setInterpolator(new LinearInterpolator());
        tweenIv.startAnimation(anim);
    }
}
