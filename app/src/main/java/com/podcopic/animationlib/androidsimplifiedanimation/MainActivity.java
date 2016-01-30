package com.podcopic.animationlib.androidsimplifiedanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.SmartAnimation;
import com.podcopic.animationlib.library.StartSmartAnimation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartSmartAnimation.startAnimation(findViewById(R.id.text) , AnimationType.ZoomInRubberBand , 800);

    }


}
