package com.lz.example.android_gesture_sample;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by LZ on 2016/9/16.
 */
public class ScrollView extends View {

    private int lastX;
    private int lastY;

    private GestureDetectorCompat detectorCompat;

    public ScrollView(Context context) {
        this(context, null);
    }

    public ScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }


    public ScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
//        detectorCompat = new GestureDetectorCompat(context, onGestureListener);
    }

    private GestureDetector.OnGestureListener onGestureListener = new GestureDetector.OnGestureListener() {
        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            ((View) getParent()).scrollBy(-(int) (e2.getX() - e1.getX()), -(int) (e2.getY() - e1.getY()));
            return true;
        }

        @Override
        public void onLongPress(MotionEvent e) {

        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    };

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        detectorCompat.onTouchEvent(event);

//        //获取到手指处的横坐标和纵坐标
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
//                moveViewOne(x, y);
//                moveViewTwo(x, y);
//                moveViewThree(x, y);
                moveViewFour(x, y);
                break;
        }
        return true;
    }

    private void moveViewOne(int x, int y) {
        //计算移动的距离
        int offX = x - lastX;
        int offY = y - lastY;
        //调用layout方法来重新放置它的位置
        layout(getLeft() + offX, getTop() + offY,
                getRight() + offX, getBottom() + offY);
    }

    private void moveViewTwo(int x, int y) {
        //计算移动的距离
        int offX = x - lastX;
        int offY = y - lastY;
        offsetLeftAndRight(offX);
        offsetTopAndBottom(offY);
    }

    private void moveViewThree(int x, int y) {
        //计算移动的距离
        int offX = x - lastX;
        int offY = y - lastY;
        ViewGroup.MarginLayoutParams mlp =
                (ViewGroup.MarginLayoutParams) getLayoutParams();
        mlp.leftMargin = getLeft() + offX;
        mlp.topMargin = getTop() + offY;
        setLayoutParams(mlp);
    }

    /**
     * scrollTo(x,y)传入的应该是移动的终点坐标。
     * scrollBy(dx,dy)传入的是移动的增量。
     *
     * @param x
     * @param y
     */
    private void moveViewFour(int x, int y) {
        //计算移动的距离
        int offX = x - lastX;
        int offY = y - lastY;
        ((View) getParent()).scrollBy(-offX, -offY);
    }
}

