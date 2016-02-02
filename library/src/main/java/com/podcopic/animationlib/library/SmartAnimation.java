package com.podcopic.animationlib.library;

import android.view.View;
import android.view.animation.Interpolator;

import com.nineoldandroids.animation.Animator;


import java.util.ArrayList;
import java.util.List;

public class SmartAnimation {

    private static final long DURATION = BaseViewAnimator.DURATION;
    private static final int SlideLength = BaseViewAnimator.SlideLength;
    private static final boolean Alpha = BaseViewAnimator.Alpha;
    private static final float HorizontalCenter = BaseViewAnimator.HorizontalCenter;
    private static final float VerticalCenter = BaseViewAnimator.VerticalCenter;
    private static final long NO_DELAY = 0;

    private BaseViewAnimator animator;
    private long duration;
    private int slideLength;
    private boolean alpha;
    private float horizontalCenter;
    private float verticalCenter;
    private long delay;
    private Interpolator interpolator;
    private List<Animator.AnimatorListener> callbacks;
    private View target;

    private SmartAnimation(AnimationComposer animationComposer) {
        animator = animationComposer.animator;
        duration = animationComposer.duration;
        slideLength = animationComposer.slideLength;
        alpha = animationComposer.alpha;
        horizontalCenter = animationComposer.horizontalCenter;
        verticalCenter = animationComposer.verticalCenter;
        delay = animationComposer.delay;
        interpolator = animationComposer.interpolator;
        callbacks = animationComposer.callbacks;
        target = animationComposer.target;
    }

    public static AnimationComposer with(AnimationType techniques) {
        return new AnimationComposer(techniques);
    }

    public static AnimationComposer with(BaseViewAnimator animator) {
        return new AnimationComposer(animator);
    }

    public interface AnimatorCallback {
        public void call(Animator animator);
    }

    private static class EmptyAnimatorListener implements Animator.AnimatorListener {
        @Override
        public void onAnimationStart(Animator animation){}
        @Override
        public void onAnimationEnd(Animator animation){}
        @Override
        public void onAnimationCancel(Animator animation){}
        @Override
        public void onAnimationRepeat(Animator animation){}
    }

    public static final class AnimationComposer {

        private List<Animator.AnimatorListener> callbacks = new ArrayList<Animator.AnimatorListener>();

        private BaseViewAnimator animator;
        private long duration = DURATION;
        private int slideLength = SlideLength;
        private boolean alpha = Alpha;
        private float horizontalCenter = HorizontalCenter;
        private float verticalCenter = VerticalCenter;
        private long delay = NO_DELAY;
        private Interpolator interpolator;
        private View target;

        private AnimationComposer(AnimationType techniques) {
            this.animator = techniques.getAnimator();
        }

        private AnimationComposer(BaseViewAnimator animator) {
            this.animator = animator;
        }

        public AnimationComposer duration(long duration) {
            this.duration = duration;
            return this;
        }

        public AnimationComposer slideLength(int slideLength) {
            this.slideLength = slideLength;
            return this;
        }

        public AnimationComposer alpha(boolean alpha) {
            this.alpha = alpha;
            return this;
        }

        public AnimationComposer horizontalCenter(float horizontalCenter) {
            this.horizontalCenter = horizontalCenter;
            return this;
        }

        public AnimationComposer verticalCenter(float verticalCenter) {
            this.verticalCenter = verticalCenter;
            return this;
        }

        public AnimationComposer delay(long delay) {
            this.delay = delay;
            return this;
        }

        public AnimationComposer interpolate(Interpolator interpolator) {
            this.interpolator = interpolator;
            return this;
        }


        public AnimationComposer withListener(Animator.AnimatorListener listener) {
            callbacks.add(listener);
            return this;
        }

        public AnimationComposer onStart(final AnimatorCallback callback) {
            callbacks.add(new EmptyAnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) { callback.call(animation); }
            });
            return this;
        }

        public AnimationComposer onEnd(final AnimatorCallback callback) {
            callbacks.add(new EmptyAnimatorListener() {
                @Override
                public void onAnimationEnd(Animator animation) { callback.call(animation); }
            });
            return this;
        }

        public AnimationComposer onCancel(final AnimatorCallback callback) {
            callbacks.add(new EmptyAnimatorListener() {
                @Override
                public void onAnimationCancel(Animator animation) { callback.call(animation); }
            });
            return this;
        }

        public AnimationComposer onRepeat(final AnimatorCallback callback) {
            callbacks.add(new EmptyAnimatorListener() {
                @Override
                public void onAnimationRepeat(Animator animation) { callback.call(animation); }
            });
            return this;
        }

        public SmartAnimationString playOn(View target) {
            this.target = target;
            return new SmartAnimationString(new SmartAnimation(this).play(), this.target);
        }

    }

    /**
     * SmartAnimation string, you can use this string to control your SmartAnimation.
     */
    public static final class SmartAnimationString {

        private BaseViewAnimator animator;
        private View target;

        private SmartAnimationString(BaseViewAnimator animator, View target){
            this.target = target;
            this.animator = animator;
        }

        public boolean isStarted(){
            return animator.isStarted();
        }

        public boolean isRunning(){
            return animator.isRunning();
        }

        public void stop(boolean reset){
            animator.cancel();

            if(reset)
                animator.reset(target);
        }

    }

    private BaseViewAnimator play() {

        animator.setDuration(duration)
                .setSlideLength(slideLength)
                .setAlpha(alpha)
                .setHorizontalCenter(horizontalCenter)
                .setVerticalCenter(verticalCenter)
                .setInterpolator(interpolator)
                .setStartDelay(delay);
        animator.setTarget(target);

        if (callbacks.size() > 0) {
            for (Animator.AnimatorListener callback : callbacks) {
                animator.addAnimatorListener(callback);
            }
        }

        animator.animate();
        return animator;
    }

}
