package com.podcopic.animationlib.library.sine;


import com.podcopic.animationlib.library.BaseEasingMethod;

public class SineEaseIn extends BaseEasingMethod {

    public SineEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return -c * (float)Math.cos(t/d * (Math.PI/2)) + c + b;
    }
}
