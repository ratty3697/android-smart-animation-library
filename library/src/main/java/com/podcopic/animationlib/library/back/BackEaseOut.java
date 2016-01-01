package com.podcopic.animationlib.library.back;

import com.podcopic.animationlib.library.BaseEasingMethod;

public class BackEaseOut extends BaseEasingMethod {

    private float s = 1.70158f;

    public BackEaseOut(float duration) {
        super(duration);
    }

    public BackEaseOut(float duration, float back){
        this(duration);
        s = back;
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*((t=t/d-1)*t*((s+1)*t + s) + 1) + b;
    }
}
