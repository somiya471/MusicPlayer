package com.example.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BeggingMedEnd extends AppCompatActivity {
    MediaPlayer musicPlayer;

    public void play(View view){
        musicPlayer.start();
    }

    public void pause(View view){
        musicPlayer.pause();
    }

    public void stop(View view){
        musicPlayer.stop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begging_med_end);

        Intent intent = getIntent();
        musicPlayer = MediaPlayer.create(this,R.raw.beginning_middle_end);


    }
}