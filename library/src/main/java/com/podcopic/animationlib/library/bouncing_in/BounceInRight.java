package com.podcopic.animationlib.library.bouncing_in;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class BounceInRight extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        int distance = (int) mSlideLength;
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"translationX",distance,-30,10,0),
                ObjectAnimator.ofFloat(target,"alpha",0,1,1,1)
        );
    }
}