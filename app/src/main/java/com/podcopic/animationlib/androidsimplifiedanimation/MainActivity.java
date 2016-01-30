package com.podcopic.animationlib.androidsimplifiedanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import com.podcopic.animationlib.androidsimplifiedanimation.Views.AttentionView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.BounceInView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.FadeInView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.FadeOutView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.FlipView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.RotationInView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.RotationOutView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.SlidersView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.SpecialView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.ZoomInView;
import com.podcopic.animationlib.androidsimplifiedanimation.Views.ZoomOutView;
import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.SmartAnimation;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //StartSmartAnimation.startAnimation(findViewById(R.id.text) , AnimationType.ZoomInRubberBand , 800);

    }

    public void showAnimation(View v){

        final Intent i;

        if(v.getId() == (R.id.attention)){
            i = new Intent(MainActivity.this,AttentionView.class);
        }
        else if(v.getId() == (R.id.bounce_in)){
            i = new Intent(MainActivity.this,BounceInView.class);
        }
        else if(v.getId() == (R.id.fade_in)){
            i = new Intent(MainActivity.this,FadeInView.class);
        }
        else if(v.getId() == (R.id.fade_out)){
            i = new Intent(MainActivity.this,FadeOutView.class);
        }
        else if(v.getId() == (R.id.flips)){
            i = new Intent(MainActivity.this,FlipView.class);
        }
        else if(v.getId() == (R.id.rotation_in)){
            i = new Intent(MainActivity.this,RotationInView.class);
        }
        else if(v.getId() == (R.id.rotation_out)){
            i = new Intent(MainActivity.this,RotationOutView.class);
        }
        else if(v.getId() == (R.id.sliders)){
            i = new Intent(MainActivity.this,SlidersView.class);
        }
        else if(v.getId() == (R.id.special)){
            i = new Intent(MainActivity.this,SpecialView.class);
        }
        else if(v.getId() == (R.id.zoom_in)){
            i = new Intent(MainActivity.this,ZoomInView.class);
        }
        else if(v.getId() == (R.id.zoom_out)){
            i = new Intent(MainActivity.this,ZoomOutView.class);
        }
    }


}
