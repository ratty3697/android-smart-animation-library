package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class FadeOutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade_out_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.fade_out)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeOut, 1000, 0, 100);
        }
        else if(v.getId() == (R.id.fade_out_down)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeOutDown, 1000,0,100);
        }
        else if(v.getId() == (R.id.fade_out_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeOutLeft, 1000,0,100);
        }
        else if(v.getId() == (R.id.fade_out_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeOutRight, 1000,0,100);
        }
        else if(v.getId() == (R.id.fade_out_up)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeOutUp, 1000,0,100);
        }

    }
}
