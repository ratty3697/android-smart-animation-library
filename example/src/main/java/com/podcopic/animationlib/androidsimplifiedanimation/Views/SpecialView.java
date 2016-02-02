package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class SpecialView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.drop_out)){
            StartSmartAnimation.startAnimation(v, AnimationType.DropOut, 2000, 0, false,100);
        }
        else if(v.getId() == (R.id.landing)){
            StartSmartAnimation.startAnimation(v, AnimationType.Landing, 2000 , 0 ,true ,100);
        }
        else if(v.getId() == (R.id.taking_off)){
            StartSmartAnimation.startAnimation(v, AnimationType.TakingOff, 2000 , 0 ,true ,100);
        }
        else if(v.getId() == (R.id.hinge)){
            StartSmartAnimation.startAnimation(v, AnimationType.Hinge, 2000 , 0 ,true ,100);
        }
        else if(v.getId() == (R.id.roll_in)){
            StartSmartAnimation.startAnimation(v, AnimationType.RollIn, 2000 , 0 ,false ,100);
        }
        else if(v.getId() == (R.id.roll_out)){
            StartSmartAnimation.startAnimation(v, AnimationType.RollOut, 2000 , 0 , true ,100);
        }
    }
}
