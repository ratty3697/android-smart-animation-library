package com.podcopic.animationlib.library.sliders;

import android.util.Log;
import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class SlideInDown extends BaseViewAnimator {

    //int distance = (int) mSlideLength;
    @Override
    public void prepare(View target) {
        int distance = (int) mSlideLength;
        Log.d("animationtest",""+distance+" "+target.getHeight()+" "+target.getTop());
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,1),
                ObjectAnimator.ofFloat(target,"translationY",-distance,0)
        );
    }
}
