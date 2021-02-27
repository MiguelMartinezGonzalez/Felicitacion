package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();


        TextView texto = (TextView) findViewById(R.id.textSplash);
        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.splash);

        texto.startAnimation(animacion);

        animacion.setAnimationListener(this);
        
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intento = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(intento);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}