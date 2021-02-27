package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView titulo =(TextView) findViewById(R.id.textCentral);


        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        titulo.startAnimation(animacion);

        Animation slideup = AnimationUtils.loadAnimation(this,R.anim.slideup);
        TextView text1 = (TextView) findViewById(R.id.textDedicatoria);
        TextView text2 = (TextView) findViewById(R.id.textDedicatoria2);

        text1.startAnimation(slideup);
        text2.startAnimation(slideup);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.cancionjuan);
        mediaPlayer.start();
    }
}