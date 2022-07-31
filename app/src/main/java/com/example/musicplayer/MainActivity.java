package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void begmidend(View view){
        Intent intent = new Intent(getApplicationContext(),BeggingMedEnd.class);
        startActivity(intent);
    }
    public void ennaSona(View view){
        Intent intent = new Intent(getApplicationContext(), com.example.musicplayer.EnnaSona.class);
        startActivity(intent);
    }
    public void oneDirecton(View view){
        Intent intent = new Intent(getApplicationContext(), com.example.musicplayer.OneDirection.class);
        startActivity(intent);
    }
    public void rare(View view){
        Intent intent = new Intent(getApplicationContext(), com.example.musicplayer.Rare.class);
        startActivity(intent);
    }
    public void sunSathiya(View view){
        Intent intent = new Intent(getApplicationContext(), com.example.musicplayer.SunSathiya.class);
        startActivity(intent);
    }
    public void willow(View view){
        Intent intent = new Intent(getApplicationContext(), com.example.musicplayer.Willow.class);
        startActivity(intent);
    }

}