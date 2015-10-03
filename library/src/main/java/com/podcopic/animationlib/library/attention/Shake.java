package com.podcopic.animationlib.library.attention;


import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class Shake extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "translationX", 0, 25, -25, 25, -25,15, -15, 6, -6, 0)
        );
    }
}