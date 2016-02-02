package com.podcopic.animationlib.library.rotation_out;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class RotateOutDownRight extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        float x = target.getWidth() - target.getPaddingRight();
        float y = target.getHeight() - target.getPaddingBottom();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 1, 0),
                ObjectAnimator.ofFloat(target,"rotation",0,-90),
                ObjectAnimator.ofFloat(target,"pivotX",x,x),
                ObjectAnimator.ofFloat(target,"pivotY",y,y)
        );
    }
}
