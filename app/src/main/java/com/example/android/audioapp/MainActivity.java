package com.example.android.audioapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.burzum_lost_wisdom);
    }

    public void onPlayButton (View view) {
        mediaPlayer.start();
    }

    public void onPauseButton (View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        } else {
         if (mediaPlayer.getCurrentPosition() != 0) {mediaPlayer.start();}
        }

    }

    public void onStopButton (View view) {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.burzum_lost_wisdom);
    }

}
