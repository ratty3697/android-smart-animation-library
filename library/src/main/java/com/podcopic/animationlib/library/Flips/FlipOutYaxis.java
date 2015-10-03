package com.podcopic.animationlib.library.Flips;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class FlipOutYaxis extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "rotationY", 0, 90),
                ObjectAnimator.ofFloat(target, "alpha", 1, 0)
        );
    }
}