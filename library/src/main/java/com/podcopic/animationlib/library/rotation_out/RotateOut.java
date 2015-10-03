package com.podcopic.animationlib.library.rotation_out;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class RotateOut extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,0),
                ObjectAnimator.ofFloat(target,"rotation",0,200)
        );
    }
}