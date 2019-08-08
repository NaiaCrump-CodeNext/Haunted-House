package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class BlueBed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_bed);
    }

    public void takeToys(View view){
        Intent intent = new Intent(this, ThatsMineBoy.class);
        startActivity(intent);
    }

    public void switchToys(View view){
        Intent intent = new Intent(this, ThatsMineBoy.class);
        startActivity(intent);
    }
}
