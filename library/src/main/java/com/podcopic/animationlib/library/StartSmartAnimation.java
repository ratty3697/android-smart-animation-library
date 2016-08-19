package com.podcopic.animationlib.library;

import android.os.Handler;
import android.util.Log;
import android.view.View;

/**
 * Created by hacker_ratty on 1/30/2016.
 */
public class StartSmartAnimation {

    public StartSmartAnimation(){

    }


    /*
    this function creates animation with duration , delay , alpha
     */
    public static void startAnimation(final View v , final AnimationType tech , final long duration ,
                                      final long delay , final boolean alpha){

        final float[] w = new float[1];
        final float[] h = new float[1];

        if(v.getWidth() == 0 || v.getHeight() == 0){//if view is just initialized for first time
            //delay is because view takes time to load its length
            Handler delayHandler = new Handler();
            delayHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    w[0] = v.getWidth() / 2.0f;
                    h[0] = v.getHeight() / 2.0f;

                    SmartAnimation.with(tech)
                            .duration(duration)
                            .delay(delay)
                            .alpha(alpha)
                            .horizontalCenter(w[0])
                            .verticalCenter(h[0])
                            .playOn(v);
                }
            },200);


        }
        else {//if view is alreaddy loaded
            w[0] = v.getWidth() / 2.0f;
            h[0] = v.getHeight() / 2.0f;
                SmartAnimation.with(tech)
                        .duration(duration)
                        .delay(delay)
                        .alpha(alpha)
                        .horizontalCenter(w[0])
                        .verticalCenter(h[0])
                        .playOn(v);

        }

    }


    /*
    this function creates animation with duration , delay , alpha , slide length
     */
    public static void startAnimation(final View v , final AnimationType tech , final long duration ,
                               final long delay ,final boolean alpha ,final int slideLength){

        final float[] w = new float[1];
        final float[] h = new float[1];
        if(v.getWidth() == 0 || v.getHeight() == 0){//if view is just initialized for first time

            //delay is because view takes time to load its length
            Handler delayHandler = new Handler();
            delayHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    w[0] = v.getWidth() / 2.0f;
                    h[0] = v.getHeight() / 2.0f;

                    SmartAnimation.with(tech)
                            .duration(duration)
                            .delay(delay)
                            .alpha(alpha)
                            .slideLength(slideLength)
                            .horizontalCenter(w[0])
                            .verticalCenter(h[0])
                            .playOn(v);
                }
            }, 250);

        }
        else {//if view is alreaddy loaded
            w[0] = v.getWidth() / 2.0f;
            h[0] = v.getHeight() / 2.0f;
            SmartAnimation.with(tech)
                    .duration(duration)
                    .delay(delay)
                    .slideLength(slideLength)
                    .horizontalCenter(w[0])
                    .verticalCenter(h[0])
                    .playOn(v);
        }

    }

}
