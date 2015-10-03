package com.podcopic.animationlib.library.special;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class RollOut extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        int distance = (int) mSlideLength;
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,0),
                ObjectAnimator.ofFloat(target,"translationX",0, distance),
                ObjectAnimator.ofFloat(target,"rotation",0,120)
        );
    }
}
