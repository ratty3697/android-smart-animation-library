package com.podcopic.animationlib.library.cubic;

import com.podcopic.animationlib.library.BaseEasingMethod;

public class CubicEaseIn extends BaseEasingMethod {

    public CubicEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*(t/=d)*t*t + b;
    }
}
