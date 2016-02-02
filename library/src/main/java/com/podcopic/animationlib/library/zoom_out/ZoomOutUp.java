package com.podcopic.animationlib.library.zoom_out;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class ZoomOutUp extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        int distance = (int) mSlideLength;
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 1;
        }
        else {
            startingAlpha = 0;
        }

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 1,startingAlpha),
                ObjectAnimator.ofFloat(target,"scaleX",1,0.475f,0.1f,0),
                ObjectAnimator.ofFloat(target,"scaleY",1,0.475f,0.1f,0),
                ObjectAnimator.ofFloat(target,"translationY",0,60,-distance)
        );
    }
}
