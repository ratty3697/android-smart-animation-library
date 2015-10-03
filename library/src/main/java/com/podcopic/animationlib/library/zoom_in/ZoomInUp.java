package com.podcopic.animationlib.library.zoom_in;

import android.view.View;
import android.view.ViewGroup;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class ZoomInUp extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        ViewGroup parent = (ViewGroup)target.getParent();
        int distance = (int) mSlideLength;
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",0,1,1),
                ObjectAnimator.ofFloat(target,"scaleX",0.1f,0.475f,1),
                ObjectAnimator.ofFloat(target,"scaleY",0.1f,0.475f,1),
                ObjectAnimator.ofFloat(target,"translationY",distance,-60,0)
        );
    }
}
