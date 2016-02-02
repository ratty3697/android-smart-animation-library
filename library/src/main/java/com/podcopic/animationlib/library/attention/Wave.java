package com.podcopic.animationlib.library.attention;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class Wave extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }


        float x = (target.getWidth() - target.getPaddingLeft() - target.getPaddingRight())/2
                + target.getPaddingLeft();
        float y = target.getHeight() - target.getPaddingBottom();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "rotation", 12,-12,3,-3,0),
                ObjectAnimator.ofFloat(target, "pivotX", x, x,x,x,x),
                ObjectAnimator.ofFloat(target, "pivotY", y, y,y,y,y),
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1)
        );
    }
}