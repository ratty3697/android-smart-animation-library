package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class ZoomOutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_out_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.zoom_out)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomOut, 2000);
        }
        else if(v.getId() == (R.id.zoom_out_down)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomOutDown, 2000 , 0 , 100);
        }
        else if(v.getId() == (R.id.zoom_out_left)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomOutLeft, 2000 , 0 , 100);
        }
        else if(v.getId() == (R.id.zoom_out_right)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomOutRight, 2000 , 0 , 100);
        }
        else if(v.getId() == (R.id.zoom_out_up)){
            StartSmartAnimation.startAnimation(v, AnimationType.ZoomOutUp, 2000 , 0 , 100);
        }
    }

}
