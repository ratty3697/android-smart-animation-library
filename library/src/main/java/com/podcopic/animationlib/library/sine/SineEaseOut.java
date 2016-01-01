package com.podcopic.animationlib.library.sine;


import com.podcopic.animationlib.library.BaseEasingMethod;

public class SineEaseOut extends BaseEasingMethod {
    public SineEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c * (float)Math.sin(t/d * (Math.PI/2)) + b;
    }
}
