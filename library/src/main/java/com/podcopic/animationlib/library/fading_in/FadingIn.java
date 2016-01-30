package com.podcopic.animationlib.library.fading_in;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class FadingIn extends BaseViewAnimator {
    @Override
    public void prepare(View target) {

        final float horizontalCenter = mHorizontalCenter;
        final float verticalCenter = mVerticalCenter;

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",0,1),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)

        );
    }
}