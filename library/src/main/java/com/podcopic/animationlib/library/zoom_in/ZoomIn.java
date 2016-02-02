package com.podcopic.animationlib.library.zoom_in;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class ZoomIn extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"scaleX",0.45f,1),
                ObjectAnimator.ofFloat(target,"scaleY",0.45f,1),
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1)
        );
    }
}
