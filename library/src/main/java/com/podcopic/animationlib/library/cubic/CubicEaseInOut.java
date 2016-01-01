package com.podcopic.animationlib.library.cubic;

import com.podcopic.animationlib.library.BaseEasingMethod;

public class CubicEaseInOut extends BaseEasingMethod {

    public CubicEaseInOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        if ((t/=d/2) < 1)
            return c/2*t*t*t + b;

        return c/2*((t-=2)*t*t + 2) + b;
    }
}
