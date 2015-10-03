package com.podcopic.animationlib.library.attention;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class Bounce extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"translationY",0,0,-30,0,-15,0,0)
        );
    }
}
