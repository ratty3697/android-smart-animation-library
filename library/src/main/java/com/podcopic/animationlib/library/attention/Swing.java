package com.podcopic.animationlib.library.attention;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class Swing extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "rotation", 0, 10, -10, 6, -6, 3, -3, 0)
        );
    }
}