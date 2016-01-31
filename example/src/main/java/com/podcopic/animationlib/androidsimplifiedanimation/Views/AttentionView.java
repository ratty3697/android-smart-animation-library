package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class AttentionView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attention_view);

    }



    public void animationStart(View v){

        if(v.getId() == (R.id.bounce)){
            StartSmartAnimation.startAnimation(findViewById(R.id.bounce), AnimationType.Bounce, 2000);
        }
        else if(v.getId() == (R.id.flash)){
            StartSmartAnimation.startAnimation(v, AnimationType.Flash, 2000);
        }
        else if(v.getId() == (R.id.pulse)){
            StartSmartAnimation.startAnimation(v, AnimationType.Pulse, 2000);
        }
        else if(v.getId() == (R.id.rubber_band)){
            StartSmartAnimation.startAnimation(v, AnimationType.RubberBand, 2000);
        }
        else if(v.getId() == (R.id.shake)){
            StartSmartAnimation.startAnimation(v, AnimationType.Shake, 2000);
        }
        else if(v.getId() == (R.id.shake_band)){
            StartSmartAnimation.startAnimation(v, AnimationType.ShakeBand, 2000);
        }
        else if(v.getId() == (R.id.stand_up)){
            StartSmartAnimation.startAnimation(v, AnimationType.StandUp, 2000);
        }
        else if(v.getId() == (R.id.swing)){
            StartSmartAnimation.startAnimation(v, AnimationType.Swing, 2000);
        }
        else if(v.getId() == (R.id.tada)){
            StartSmartAnimation.startAnimation(v, AnimationType.Tada, 2000);
        }
        else if(v.getId() == (R.id.wave)){
            StartSmartAnimation.startAnimation(v, AnimationType.Wave, 2000);
        }
        else if(v.getId() == (R.id.wobble)){
            StartSmartAnimation.startAnimation(v, AnimationType.Wobble, 2000);
        }
    }
}
