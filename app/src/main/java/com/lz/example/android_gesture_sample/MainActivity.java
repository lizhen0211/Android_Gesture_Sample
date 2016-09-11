package com.lz.example.android_gesture_sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCapturingTouchClick(View view) {
        Intent intent = new Intent(this, CapturingTouchEventsActivity.class);
        startActivity(intent);
    }

    public void onDetectGestureClick(View view) {
        Intent intent = new Intent(this, DetectGestureActivity.class);
        startActivity(intent);
    }

    public void onSimpleOnGestureClick(View view) {
        Intent intent = new Intent(this, SimpleOnGestureActivity.class);
        startActivity(intent);
    }

    public void onTrackingMovement(View view) {
        Intent intent = new Intent(this, TrackingMovement.class);
        startActivity(intent);
    }

    public void onAnimatingAScrollGesture(View view) {
        Intent intent = new Intent(this, AnimatingScrollGestureActivity.class);
        startActivity(intent);
    }
}
