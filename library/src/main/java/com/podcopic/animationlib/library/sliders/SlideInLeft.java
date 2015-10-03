package com.podcopic.animationlib.library.sliders;

import android.view.View;
import android.view.ViewGroup;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class SlideInLeft extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        ViewGroup parent = (ViewGroup)target.getParent();
        int distance = (int) mSlideLength;
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 1, 1),
                ObjectAnimator.ofFloat(target,"translationX",-distance,0)
        );
    }
}