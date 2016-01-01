package com.podcopic.animationlib.library.elastic;

import com.podcopic.animationlib.library.BaseEasingMethod;

public class ElasticEaseIn extends BaseEasingMethod {

    public ElasticEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        if (t==0) return b;  if ((t/=d)==1) return b+c;
        float p=d*.3f;
        float a=c;
        float s=p/4;
        return -(a*(float)Math.pow(2,10*(t-=1)) * (float)Math.sin( (t*d-s)*(2*(float)Math.PI)/p )) + b;
    }
}
