package com.podcopic.animationlib.library;

import android.os.Handler;
import android.view.View;

/**
 * Created by hacker_ratty on 1/30/2016.
 */
public class StartSmartAnimation {

    static float w;
    static float h;

    public StartSmartAnimation(){

    }


    /*
    this function creates animation with duration , delay , alpha
     */
    public static void startAnimation(final View v , final AnimationType tech , final long duration ,
                                      final long delay , final boolean alpha){

        if(v.getWidth() == 0 || v.getHeight() == 0){//if view is just initialized for first time
            //delay is because view takes time to load its length
            Handler delayHandler = new Handler();
            delayHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    w = v.getWidth() / 2.0f;
                    h = v.getHeight() / 2.0f;

                    SmartAnimation.with(tech)
                            .duration(duration)
                            .delay(delay)
                            .alpha(alpha)
                            .horizontalCenter(w)
                            .verticalCenter(h)
                            .playOn(v);
                }
            },400);


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

            //delay is because view takes time to load its length
            Handler delayHandler = new Handler();
            delayHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    w = v.getWidth() / 2.0f;
                    h = v.getHeight() / 2.0f;

                    SmartAnimation.with(tech)
                            .duration(duration)
                            .delay(delay)
                            .alpha(alpha)
                            .slideLength(slideLength)
                            .horizontalCenter(w)
                            .verticalCenter(h)
                            .playOn(v);
                }
            }, 400);

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
