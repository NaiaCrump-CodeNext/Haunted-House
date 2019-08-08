package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PinkBed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pink_bed);
    }

    public void takeToy (View view){
        Intent intent = new Intent(this, ThatsMineGirl.class);
        startActivity(intent);
    }

    public void switchToys(View view){
        Intent intent = new Intent(this, switchToys.class);
        startActivity(intent);
    }
}
