package com.podcopic.animationlib.library.special;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class RollIn extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        int distance = (int) mSlideLength;
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",0,1),
                ObjectAnimator.ofFloat(target,"translationX",-distance,0),
                ObjectAnimator.ofFloat(target,"rotation",-120,0)
        );
    }
}
