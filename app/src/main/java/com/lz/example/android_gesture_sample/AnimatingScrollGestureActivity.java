package com.lz.example.android_gesture_sample;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AnimatingScrollGestureActivity extends AppCompatActivity {

    View view;

    private static final String TAG = "scroll";

    private GestureDetectorCompat mDetector;

    int currentX;
    int currentY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animating_scroll_gesture);
    }
}
