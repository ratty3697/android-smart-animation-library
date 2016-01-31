package com.podcopic.animationlib.library;

import android.view.View;
import android.view.ViewTreeObserver;

/**
 * Created by hacker_ratty on 1/30/2016.
 */
public class StartSmartAnimation {

    /*
    this function creates animation with duration
     */
    public static void startAnimation(final View v , final AnimationType tech , final long duration){
        if(v.getWidth() == 0 || v.getHeight() == 0){//if view is just initialized for first time
            v.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    final float w = v.getWidth() / 2.0f;
                    final float h = v.getHeight() / 2.0f;
                    SmartAnimation.with(tech)
                            .duration(duration)
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
                    .horizontalCenter(w)
                    .verticalCenter(h)
                    .playOn(v);
        }

    }

    /*
    this function creates animation with duration , delay
     */
    public static void startAnimation(final View v , final AnimationType tech , final long duration ,
                                      final long delay){

        if(v.getWidth() == 0 || v.getHeight() == 0){//if view is just initialized for first time
            v.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    final float w = v.getWidth() / 2.0f;
                    final float h = v.getHeight() / 2.0f;
                    SmartAnimation.with(tech)
                            .duration(duration)
                            .delay(delay)
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
                    .horizontalCenter(w)
                    .verticalCenter(h)
                    .playOn(v);
        }

    }


    /*
    this function creates animation with duration , slide length , delay
     */
    public static void startAnimation(final View v , final AnimationType tech , final long duration ,
                               final long delay , final int slideLength){

        if(v.getWidth() == 0 || v.getHeight() == 0){//if view is just initialized for first time
            v.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
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
