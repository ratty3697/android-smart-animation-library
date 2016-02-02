package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class RotationOutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation_out_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.rotate_out)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateOut, 1000, 0,true ,100);
        }
        else if(v.getId() == (R.id.rotate_out_down_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateOutDownLeft, 1000,0,false,100);
        }
        else if(v.getId() == (R.id.rotate_out_down_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateOutDownRight, 1000,0,false,100);
        }
        else if(v.getId() == (R.id.rotate_out_up_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateOutUpLeft, 1000,0,false,100);
        }
        else if(v.getId() == (R.id.rotate_out_up_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateOutUpRight, 1000,0,false,100);
        }

    }
}
