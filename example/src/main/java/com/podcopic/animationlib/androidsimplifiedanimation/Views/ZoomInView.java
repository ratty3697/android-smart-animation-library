package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class ZoomInView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_in_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.zoom_in)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomIn, 2000);
        }
        else if(v.getId() == (R.id.zoom_in_down)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomInDown, 2000 , 0 , 100);
        }
        else if(v.getId() == (R.id.zoom_in_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomInLeft, 2000 , 0 , 100);
        }
        else if(v.getId() == (R.id.zoom_in_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomInRight, 2000 , 0 , 100);
        }
        else if(v.getId() == (R.id.zoom_in_rubber_band)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomInRubberBand, 2000 , 0 , 100);
        }
        else if(v.getId() == (R.id.zoom_in_up)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomInUp, 2000 , 0 , 100);
        }
    }
}
