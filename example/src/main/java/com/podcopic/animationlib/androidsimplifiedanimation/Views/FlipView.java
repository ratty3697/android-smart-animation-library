package com.podcopic.animationlib.androidsimplifiedanimation.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.podcopic.animationlib.androidsimplifiedanimation.R;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class FlipView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_view);
    }

    public void animationStart(View v){

        if(v.getId() == (R.id.flip_in_x_axis)){
            StartSmartAnimation.startAnimation(v, AnimationType.FlipInX, 1000);
        }
        else if(v.getId() == (R.id.flip_in_y_axis)){
            StartSmartAnimation.startAnimation(v, AnimationType.FlipInY, 1000);
        }
        else if(v.getId() == (R.id.flip_out_x_axis)){
            StartSmartAnimation.startAnimation(v, AnimationType.FlipOutX, 1000);
        }
        else if(v.getId() == (R.id.flip_out_y_axis)){
            StartSmartAnimation.startAnimation(v, AnimationType.FlipOutY, 1000);
        }


    }
}
