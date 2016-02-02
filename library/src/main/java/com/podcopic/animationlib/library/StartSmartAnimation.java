package com.podcopic.animationlib.library;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

/**
 * Created by hacker_ratty on 1/30/2016.
 */
public class StartSmartAnimation {

    /*
    this function creates animation with duration , delay , alpha
     */
    public static void startAnimation(final View v , final AnimationType tech , final long duration ,
                                      final long delay , final boolean alpha){

        if(v.getWidth() == 0 || v.getHeight() == 0){//if view is just initialized for first time
            v.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    final float w = v.getWidth() / 2.0f;
                    final float h = v.getHeight() / 2.0f;
                    SmartAnimation.with(tech)
                            .duration(duration)
                            .delay(delay)
                            .alpha(alpha)
                            .horizontalCenter(w)
                            .verticalCenter(h)
                            .playOn(v);
                }
            });
        }
        else {//if view is alreaddy loaded
            final float w = v.getWidth() / 2.0f;
            final float h = v.getHeight() / 2.0f;
            SmartAnimation.with(tech)
                    .duration(duration)
                    .delay(delay)
                    .alpha(alpha)
                    .horizontalCenter(w)
                    .verticalCenter(h)
                    .playOn(v);
        }

    }


    /*
    this function creates animation with duration , delay , alpha , slide length
     */
    public static void startAnimation(final View v , final AnimationType tech , final long duration ,
                               final long delay ,final boolean alpha ,final int slideLength){

        if(v.getWidth() == 0 || v.getHeight() == 0){//if view is just initialized for first time
            v.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    final float w = v.getWidth() / 2.0f;
                    final float h = v.getHeight() / 2.0f;
                    SmartAnimation.with(tech)
                            .duration(duration)
                            .delay(delay)
                            .alpha(alpha)
                            .slideLength(slideLength)
                            .horizontalCenter(w)
                            .verticalCenter(h)
                            .playOn(v);
                }
            });
        }
        else {//if view is alreaddy loaded
            final float w = v.getWidth() / 2.0f;
            final float h = v.getHeight() / 2.0f;
            SmartAnimation.with(tech)
                    .duration(duration)
                    .delay(delay)
                    .slideLength(slideLength)
                    .horizontalCenter(w)
                    .verticalCenter(h)
                    .playOn(v);
        }

    }
}
