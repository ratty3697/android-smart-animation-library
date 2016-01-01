package com.podcopic.animationlib.library.back;


import com.podcopic.animationlib.library.BaseEasingMethod;

public class BackEaseInOut extends BaseEasingMethod {

    private float s = 1.70158f;

    public BackEaseInOut(float duration) {
        super(duration);
    }

    public BackEaseInOut(float duration, float back){
        this(duration);
        s = back;
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1) return c / 2 * (t * t * (((s *= (1.525)) + 1) * t - s)) + b;
        return c / 2 * ((t -= 2) * t * (((s *= (1.525)) + 1) * t + s) + 2) + b;
    }
}
