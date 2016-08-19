package com.podcopic.animationlib.library;

import com.podcopic.animationlib.library.special.in.DropOut;
import com.podcopic.animationlib.library.special.in.Landing;
import com.podcopic.animationlib.library.attention.Bounce;
import com.podcopic.animationlib.library.attention.Flash;
import com.podcopic.animationlib.library.attention.Pulse;
import com.podcopic.animationlib.library.attention.RubberBand;
import com.podcopic.animationlib.library.attention.Shake;
import com.podcopic.animationlib.library.attention.Standup;
import com.podcopic.animationlib.library.attention.Swing;
import com.podcopic.animationlib.library.attention.Tada;
import com.podcopic.animationlib.library.attention.Wave;
import com.podcopic.animationlib.library.attention.Wobble;
import com.podcopic.animationlib.library.attention.ShakeBand;
import com.podcopic.animationlib.library.bouncing_in.BounceIn;
import com.podcopic.animationlib.library.bouncing_in.BounceInDown;
import com.podcopic.animationlib.library.bouncing_in.BounceInLeft;
import com.podcopic.animationlib.library.bouncing_in.BounceInRight;
import com.podcopic.animationlib.library.bouncing_in.BounceInUp;
import com.podcopic.animationlib.library.fading_in.FadingIn;
import com.podcopic.animationlib.library.fading_in.FadingInDown;
import com.podcopic.animationlib.library.fading_in.FadingInLeft;
import com.podcopic.animationlib.library.fading_in.FadingInRight;
import com.podcopic.animationlib.library.fading_in.FadingInUp;
import com.podcopic.animationlib.library.fading_out.FadingOut;
import com.podcopic.animationlib.library.fading_out.FadingOutDown;
import com.podcopic.animationlib.library.fading_out.FadingOutLeft;
import com.podcopic.animationlib.library.fading_out.FadingOutRight;
import com.podcopic.animationlib.library.fading_out.FadingOutUp;
import com.podcopic.animationlib.library.Flips.FlipInXaxis;
import com.podcopic.animationlib.library.Flips.FlipInYaxis;
import com.podcopic.animationlib.library.Flips.FlipOutXaxis;
import com.podcopic.animationlib.library.Flips.FlipOutYaxis;
import com.podcopic.animationlib.library.rotation_in.RotateIn;
import com.podcopic.animationlib.library.rotation_in.RotateInDownLeft;
import com.podcopic.animationlib.library.rotation_in.RotateInDownRight;
import com.podcopic.animationlib.library.rotation_in.RotateInUpLeft;
import com.podcopic.animationlib.library.rotation_in.RotateInUpRight;
import com.podcopic.animationlib.library.rotation_out.RotateOut;
import com.podcopic.animationlib.library.rotation_out.RotateOutDownLeft;
import com.podcopic.animationlib.library.rotation_out.RotateOutDownRight;
import com.podcopic.animationlib.library.rotation_out.RotateOutUpLeft;
import com.podcopic.animationlib.library.rotation_out.RotateOutUpRight;
import com.podcopic.animationlib.library.sliders.SlideInDown;
import com.podcopic.animationlib.library.sliders.SlideInLeft;
import com.podcopic.animationlib.library.sliders.SlideInRight;
import com.podcopic.animationlib.library.sliders.SlideInUp;
import com.podcopic.animationlib.library.sliders.SlideOutDown;
import com.podcopic.animationlib.library.sliders.SlideOutLeft;
import com.podcopic.animationlib.library.sliders.SlideOutRight;
import com.podcopic.animationlib.library.sliders.SlideOutUp;
import com.podcopic.animationlib.library.zoom_in.ZoomIn;
import com.podcopic.animationlib.library.zoom_in.ZoomInRubberBand;
import com.podcopic.animationlib.library.zoom_in.ZoomInDown;
import com.podcopic.animationlib.library.zoom_in.ZoomInLeft;
import com.podcopic.animationlib.library.zoom_in.ZoomInRight;
import com.podcopic.animationlib.library.zoom_in.ZoomInUp;
import com.podcopic.animationlib.library.zoom_out.ZoomOut;
import com.podcopic.animationlib.library.zoom_out.ZoomOutDown;
import com.podcopic.animationlib.library.zoom_out.ZoomOutLeft;
import com.podcopic.animationlib.library.zoom_out.ZoomOutRight;
import com.podcopic.animationlib.library.zoom_out.ZoomOutUp;
import com.podcopic.animationlib.library.special.Hinge;
import com.podcopic.animationlib.library.special.RollIn;
import com.podcopic.animationlib.library.special.RollOut;

public enum AnimationType {

    ShakeBand(ShakeBand.class),
    DropOut(DropOut.class),
    Landing(Landing.class),

    Flash(Flash.class),
    Pulse(Pulse.class),
    RubberBand(RubberBand.class),
    Shake(Shake.class),
    Swing(Swing.class),
    Wobble(Wobble.class),
    Bounce(Bounce.class),
    Tada(Tada.class),
    StandUp(Standup.class),
    Wave(Wave.class),

    Hinge(Hinge.class),
    RollIn(RollIn.class),
    RollOut(RollOut.class),

    BounceIn(BounceIn.class),
    BounceInDown(BounceInDown.class),
    BounceInLeft(BounceInLeft.class),
    BounceInRight(BounceInRight.class),
    BounceInUp(BounceInUp.class),

    FadeIn(FadingIn.class),
    FadeInUp(FadingInUp.class),
    FadeInDown(FadingInDown.class),
    FadeInLeft(FadingInLeft.class),
    FadeInRight(FadingInRight.class),

    FadeOut(FadingOut.class),
    FadeOutDown(FadingOutDown.class),
    FadeOutLeft(FadingOutLeft.class),
    FadeOutRight(FadingOutRight.class),
    FadeOutUp(FadingOutUp.class),

    FlipInX(FlipInXaxis.class),
    FlipOutX(FlipOutXaxis.class),
    FlipInY(FlipInYaxis.class),
    FlipOutY(FlipOutYaxis.class),
    RotateIn(RotateIn.class),
    RotateInDownLeft(RotateInDownLeft.class),
    RotateInDownRight(RotateInDownRight.class),
    RotateInUpLeft(RotateInUpLeft.class),
    RotateInUpRight(RotateInUpRight.class),

    RotateOut(RotateOut.class),
    RotateOutDownLeft(RotateOutDownLeft.class),
    RotateOutDownRight(RotateOutDownRight.class),
    RotateOutUpLeft(RotateOutUpLeft.class),
    RotateOutUpRight(RotateOutUpRight.class),

    SlideInLeft(SlideInLeft.class),
    SlideInRight(SlideInRight.class),
    SlideInUp(SlideInUp.class),
    SlideInDown(SlideInDown.class),

    SlideOutLeft(SlideOutLeft.class),
    SlideOutRight(SlideOutRight.class),
    SlideOutUp(SlideOutUp.class),
    SlideOutDown(SlideOutDown.class),

    ZoomIn(ZoomIn.class),
    ZoomInDown(ZoomInDown.class),
    ZoomInLeft(ZoomInLeft.class),
    ZoomInRight(ZoomInRight.class),
    ZoomInUp(ZoomInUp.class),
    ZoomInRubberBand(ZoomInRubberBand.class),

    ZoomOut(ZoomOut.class),
    ZoomOutDown(ZoomOutDown.class),
    ZoomOutLeft(ZoomOutLeft.class),
    ZoomOutRight(ZoomOutRight.class),
    ZoomOutUp(ZoomOutUp.class);



    private Class CreatingAnimation;

    private AnimationType(Class clazz) {
        CreatingAnimation = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) CreatingAnimation.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
