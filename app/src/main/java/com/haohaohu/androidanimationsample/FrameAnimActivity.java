package com.haohaohu.androidanimationsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.haohaohu.frameanimview.FrameAnimView;

public class FrameAnimActivity extends AppCompatActivity {

    private FrameAnimView frameIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_anim);
        initView();
    }

    private void initView() {
        frameIv = (MyFrameAnimView) findViewById(R.id.frame_iv);
        frameIv.start();
    }
}
