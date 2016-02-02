package com.podcopic.animationlib.library.zoom_out;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class ZoomOut extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 1;
        }
        else {
            startingAlpha = 0;
        }

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,startingAlpha),
                ObjectAnimator.ofFloat(target,"scaleX",1,0.3f,0),
                ObjectAnimator.ofFloat(target,"scaleY",1,0.3f,0)
        );
    }
}
