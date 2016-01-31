package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class FadeInView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade_in_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.fade_in)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeIn, 1000, 0, 100);
        }
        else if(v.getId() == (R.id.fade_in_down)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeInDown, 1000,0,100);
        }
        else if(v.getId() == (R.id.fade_in_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeInLeft, 1000,0,100);
        }
        else if(v.getId() == (R.id.fade_in_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeInRight, 1000,0,100);
        }
        else if(v.getId() == (R.id.fade_in_up)){
            StartSmartAnimation.startAnimation(v, AnimationType.FadeInUp, 1000,0,100);
        }

    }
}
