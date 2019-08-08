package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Approach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approach);
    }

    public void getCloser(View view){
        Intent intent = new Intent(this, BsBeBonkers.class);
        startActivity(intent);
    }

    public void backAway(View view){
        Intent intent = new Intent (this, HearScream.class);
        startActivity(intent);
    }
}
