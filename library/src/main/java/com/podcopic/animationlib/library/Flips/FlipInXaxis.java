package com.podcopic.animationlib.library.Flips;

import android.view.View;


import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class FlipInXaxis extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "rotationX", 90, -15, 15, 0),
                ObjectAnimator.ofFloat(target, "alpha", 0.25f, 0.5f, 0.75f, 1)

        );
    }
}
