package com.podcopic.animationlib.library.sliders;

import android.view.View;
import android.view.ViewGroup;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class SlideInUp extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        final float horizontalCenter = mHorizontalCenter;
        final float verticalCenter = mVerticalCenter;
        int distance = (int) mSlideLength;
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", startingAlpha, 1),
                ObjectAnimator.ofFloat(target,"translationY",distance,0),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)
        );
    }
}