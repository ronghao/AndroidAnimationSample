package com.haohaohu.androidanimationsample;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;

import com.haohaohu.frameanimview.FrameAnimView;
import com.haohaohu.frameanimview.FrameAnimation;
import com.haohaohu.frameanimview.OnImageLoadListener;

/**
 * 帧动画view
 *
 * @author haohao on 2017/6/27 13:43
 * @version v1.0
 */
public class MyFrameAnimView extends FrameAnimView {


    int[] res = {R.drawable.spinner_0, R.drawable.spinner_1, R.drawable.spinner_2, R.drawable.spinner_3,
            R.drawable.spinner_4, R.drawable.spinner_5, R.drawable.spinner_6, R.drawable.spinner_7
            , R.drawable.spinner_8, R.drawable.spinner_9, R.drawable.spinner_10, R.drawable.spinner_11,
            R.drawable.spinner_0, R.drawable.spinner_1, R.drawable.spinner_2, R.drawable.spinner_3,
            R.drawable.spinner_4, R.drawable.spinner_5, R.drawable.spinner_6, R.drawable.spinner_7
            , R.drawable.spinner_8, R.drawable.spinner_9, R.drawable.spinner_10, R.drawable.spinner_11};

    public MyFrameAnimView(Context context) {
        super(context);
        init();
    }

    public MyFrameAnimView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyFrameAnimView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mAnimation = new FrameAnimation.FrameAnimationBuilder(getResources())
                .setLoop(true)
                .setResIds(res)
                .setDuration(100)
                .isLowMemory(true)
                .build();
        mAnimation.setOnImageLoadListener(new OnImageLoadListener() {
            @Override
            public void onImageLoad(BitmapDrawable drawable) {
                MyFrameAnimView.this.setImageDrawable(drawable);
                MyFrameAnimView.this.invalidate();
            }

            @Override
            public void onFinish() {

            }
        });
        mAnimation.start();
    }
}
