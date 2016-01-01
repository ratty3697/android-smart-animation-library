package com.podcopic.animationlib.library.circ;

import com.podcopic.animationlib.library.BaseEasingMethod;

public class CircEaseInOut extends BaseEasingMethod {

    public CircEaseInOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        if ((t/=d/2) < 1)
            return -c/2 * ((float)Math.sqrt(1 - t*t) - 1) + b;

        return c/2 * ((float)Math.sqrt(1 - (t-=2)*t) + 1) + b;
    }
}
