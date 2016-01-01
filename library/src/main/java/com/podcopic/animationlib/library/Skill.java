package com.podcopic.animationlib.library;

import com.podcopic.animationlib.library.back.BackEaseIn;
import com.podcopic.animationlib.library.back.BackEaseInOut;
import com.podcopic.animationlib.library.back.BackEaseOut;
import com.podcopic.animationlib.library.bounce.BounceEaseIn;
import com.podcopic.animationlib.library.bounce.BounceEaseInOut;
import com.podcopic.animationlib.library.bounce.BounceEaseOut;
import com.podcopic.animationlib.library.circ.CircEaseIn;
import com.podcopic.animationlib.library.circ.CircEaseInOut;
import com.podcopic.animationlib.library.circ.CircEaseOut;
import com.podcopic.animationlib.library.cubic.CubicEaseIn;
import com.podcopic.animationlib.library.cubic.CubicEaseInOut;
import com.podcopic.animationlib.library.cubic.CubicEaseOut;
import com.podcopic.animationlib.library.elastic.ElasticEaseIn;
import com.podcopic.animationlib.library.elastic.ElasticEaseOut;
import com.podcopic.animationlib.library.expo.ExpoEaseIn;
import com.podcopic.animationlib.library.expo.ExpoEaseInOut;
import com.podcopic.animationlib.library.expo.ExpoEaseOut;
import com.podcopic.animationlib.library.quad.QuadEaseIn;
import com.podcopic.animationlib.library.quad.QuadEaseInOut;
import com.podcopic.animationlib.library.quad.QuadEaseOut;
import com.podcopic.animationlib.library.quint.QuintEaseIn;
import com.podcopic.animationlib.library.quint.QuintEaseInOut;
import com.podcopic.animationlib.library.quint.QuintEaseOut;
import com.podcopic.animationlib.library.sine.SineEaseIn;
import com.podcopic.animationlib.library.sine.SineEaseInOut;
import com.podcopic.animationlib.library.sine.SineEaseOut;
import com.podcopic.animationlib.library.linear.Linear;
import com.podcopic.animationlib.library.BaseEasingMethod;


public enum  Skill {

    BackEaseIn(BackEaseIn.class),
    BackEaseOut(BackEaseOut.class),
    BackEaseInOut(BackEaseInOut.class),

    BounceEaseIn(BounceEaseIn.class),
    BounceEaseOut(BounceEaseOut.class),
    BounceEaseInOut(BounceEaseInOut.class),

    CircEaseIn(CircEaseIn.class),
    CircEaseOut(CircEaseOut.class),
    CircEaseInOut(CircEaseInOut.class),

    CubicEaseIn(CubicEaseIn.class),
    CubicEaseOut(CubicEaseOut.class),
    CubicEaseInOut(CubicEaseInOut.class),

    ElasticEaseIn(ElasticEaseIn.class),
    ElasticEaseOut(ElasticEaseOut.class),

    ExpoEaseIn(ExpoEaseIn.class),
    ExpoEaseOut(ExpoEaseOut.class),
    ExpoEaseInOut(ExpoEaseInOut.class),

    QuadEaseIn(QuadEaseIn.class),
    QuadEaseOut(QuadEaseOut.class),
    QuadEaseInOut(QuadEaseInOut.class),

    QuintEaseIn(QuintEaseIn.class),
    QuintEaseOut(QuintEaseOut.class),
    QuintEaseInOut(QuintEaseInOut.class),

    SineEaseIn(SineEaseIn.class),
    SineEaseOut(SineEaseOut.class),
    SineEaseInOut(SineEaseInOut.class),

    Linear(Linear.class);


    private Class easingMethod;

    private Skill(Class clazz) {
        easingMethod = clazz;
    }

    public BaseEasingMethod getMethod(float duration) {
        try {
            return (BaseEasingMethod)easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
