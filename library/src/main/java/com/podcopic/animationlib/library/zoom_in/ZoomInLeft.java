package com.podcopic.animationlib.library.zoom_in;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class ZoomInLeft extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        int distance = (int) mSlideLength;
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1),
                ObjectAnimator.ofFloat(target,"scaleY",0.1f,0.475f,1),
                ObjectAnimator.ofFloat(target,"translationX",-distance,48,0),
                ObjectAnimator.ofFloat(target,"alpha",0,1,1)
        );
    }
}
