package com.podcopic.animationlib.library;

import com.nineoldandroids.animation.PropertyValuesHolder;
import com.nineoldandroids.animation.ValueAnimator;

public class Glider {

    public static ValueAnimator glide(Skill skill, float duration, ValueAnimator animator){
        return Glider.glide(skill,duration,animator,null);
    }

    public static ValueAnimator glide(Skill skill, float duration, ValueAnimator animator, BaseEasingMethod.EasingListener ... listeners){
        BaseEasingMethod t = skill.getMethod(duration);

        if(listeners!=null)
            t.addEasingListeners(listeners);

        animator.setEvaluator(t);
        return animator;
    }

    public static PropertyValuesHolder glide(Skill skill, float duration, PropertyValuesHolder propertyValuesHolder){
        propertyValuesHolder.setEvaluator(skill.getMethod(duration));
        return propertyValuesHolder;
    }


}
