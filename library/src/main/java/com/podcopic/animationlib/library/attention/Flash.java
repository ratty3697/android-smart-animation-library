package com.podcopic.animationlib.library.attention;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class Flash extends BaseViewAnimator {
    @Override
    public void prepare(View target) {

        final float horizontalCenter = mHorizontalCenter;
        final float verticalCenter = mVerticalCenter;

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,0,1,0,1),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)

        );
    }
}