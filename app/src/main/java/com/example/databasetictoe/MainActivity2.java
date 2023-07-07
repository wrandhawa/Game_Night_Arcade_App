package com.example.databasetictoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void coinflip(View v){
        Intent i = new Intent(this, coinflip.class);
        startActivity(i);
    }
    public void Snakes(View v){
        Intent i = new Intent(this, snakes.class);
        startActivity(i);
    }
    public void statatat(View v){
        Intent i = new Intent(this, StartActivity.class);
        startActivity(i);
    }


}