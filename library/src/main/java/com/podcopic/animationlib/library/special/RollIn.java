package com.podcopic.animationlib.library.special;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class RollIn extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        int distance = (int) mSlideLength;
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1),
                ObjectAnimator.ofFloat(target,"translationX",-distance,0),
                ObjectAnimator.ofFloat(target,"rotation",-120,0)
        );
    }
}
