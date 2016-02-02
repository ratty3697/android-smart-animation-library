package com.podcopic.animationlib.library.attention;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class Wobble extends BaseViewAnimator {
    @Override
    public void prepare(View target) {

        final float horizontalCenter = mHorizontalCenter;
        final float verticalCenter = mVerticalCenter;
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        float width = target.getWidth();
        float one = (float)(width/100.0);
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "translationX", 0 * one, -25 * one, 20 * one, -15 * one, 10 * one, -5 * one, 0 * one,0),
                ObjectAnimator.ofFloat(target, "rotation", 0, -5, 3, -3, 2, -1,0),
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)

        );
    }
}