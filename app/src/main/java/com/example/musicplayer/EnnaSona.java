package com.example.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EnnaSona extends AppCompatActivity {
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
        setContentView(R.layout.activity_enna_sona);

        Intent intent = getIntent();
        musicPlayer = MediaPlayer.create(this,R.raw.enna_sona);

    }
}