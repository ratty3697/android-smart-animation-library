package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class RotationInView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation_in_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.rotate_in)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateIn, 1000, 0,false ,100);
        }
        else if(v.getId() == (R.id.rotate_in_down_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateInDownLeft, 1000,0,false,100);
        }
        else if(v.getId() == (R.id.rotate_in_down_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateInDownRight, 1000,0,false,100);
        }
        else if(v.getId() == (R.id.rotate_in_up_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateInUpLeft, 1000,0,false,100);
        }
        else if(v.getId() == (R.id.rotate_in_up_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.RotateInUpRight, 1000,0,false,100);
        }

    }
}
