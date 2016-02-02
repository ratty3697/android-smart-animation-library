package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class SlidersView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliders_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.slide_in_down)){
            StartSmartAnimation.startAnimation(v, AnimationType.SlideInDown, 2000 , 0 , false ,100);
        }
        else if(v.getId() == (R.id.slide_in_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.SlideInLeft, 2000 , 0 , false ,100);
        }
        else if(v.getId() == (R.id.slide_in_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.SlideInRight, 2000 , 0 ,false ,100);
        }
        else if(v.getId() == (R.id.slide_in_up)){
            StartSmartAnimation.startAnimation(v, AnimationType.SlideInUp, 2000 , 0 ,false ,100);
        }
        else if(v.getId() == (R.id.slide_out_down)){
            StartSmartAnimation.startAnimation(v, AnimationType.SlideOutDown, 2000 , 0 , false ,100);
        }
        else if(v.getId() == (R.id.slide_out_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.SlideOutRight, 2000 , 0 , false ,100);
        }
        else if(v.getId() == (R.id.slide_out_up)){
            StartSmartAnimation.startAnimation(v, AnimationType.SlideOutUp, 2000 , 0 ,false ,100);
        }
        else if(v.getId() == (R.id.slide_out_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.SlideOutLeft, 2000 , 0 , false ,100);
        }
    }
}
