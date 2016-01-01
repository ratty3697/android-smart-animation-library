package com.podcopic.animationlib.library.quint;


import com.podcopic.animationlib.library.BaseEasingMethod;

public class QuintEaseOut extends BaseEasingMethod {
    public QuintEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*((t=t/d-1)*t*t*t*t + 1) + b;
    }
}
