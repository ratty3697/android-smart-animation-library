package com.podcopic.animationlib.library.rotation_in;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class RotateIn extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "rotation", -200, 0),
                ObjectAnimator.ofFloat(target, "alpha", 0, 1)
        );
    }
}
