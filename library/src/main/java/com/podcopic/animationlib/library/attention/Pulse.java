package com.podcopic.animationlib.library.attention;

import android.view.View;


import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class Pulse extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "scaleY", 1, 1.1f, 1),
                ObjectAnimator.ofFloat(target, "scaleX", 1, 1.1f, 1)
        );
    }
}
