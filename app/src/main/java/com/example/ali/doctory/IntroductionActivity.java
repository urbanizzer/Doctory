package com.example.ali.doctory;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class IntroductionActivity extends AppCompatActivity {

    RelativeLayout myLayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_introduction );

        myLayout = (RelativeLayout) findViewById( R.id.myLayout );

        animationDrawable = (AnimationDrawable) myLayout.getBackground();
        animationDrawable.setExitFadeDuration( 4500 );
        animationDrawable.setExitFadeDuration( 4500 );
        animationDrawable.start();
    }
}
