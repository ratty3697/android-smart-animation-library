package com.podcopic.animationlib.library.attention;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class Bounce extends BaseViewAnimator {
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


        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"translationY",0,0,-30,0,-15,0,0),
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)
        );
    }
}
