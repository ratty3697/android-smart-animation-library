package com.podcopic.animationlib.library.quad;


import com.podcopic.animationlib.library.BaseEasingMethod;

public class QuadEaseOut extends BaseEasingMethod {
    public QuadEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return -c *(t/=d)*(t-2) + b;
    }
}
