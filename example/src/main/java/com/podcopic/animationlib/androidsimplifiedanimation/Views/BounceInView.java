package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class BounceInView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounce_in_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.bounce_in)){
            StartSmartAnimation.startAnimation(v, AnimationType.BounceIn, 1000,0,true,100);
        }
        else if(v.getId() == (R.id.bounce_in_down)){
            StartSmartAnimation.startAnimation(v, AnimationType.BounceInDown, 1000,0,false,100);
        }
        else if(v.getId() == (R.id.bounce_in_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.BounceInLeft, 1000,0,true,100);
        }
        else if(v.getId() == (R.id.bounce_in_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.BounceInRight, 1000,0,false,100);
        }
        else if(v.getId() == (R.id.bounce_in_up)){
            StartSmartAnimation.startAnimation(v, AnimationType.BounceInUp, 1000,0,true,100);
        }

    }
}
