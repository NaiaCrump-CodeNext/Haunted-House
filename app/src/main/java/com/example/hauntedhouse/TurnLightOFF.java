package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TurnLightOFF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn_light_off);
    }

    public void followTheFootsteps(View view){
        Intent intent = new Intent(this, FollowFootsteps.class);
        startActivity(intent);
    }

    public void explore(View view){
        Intent intent = new Intent(this, ExploreOffice.class);
        startActivity(intent);
    }
}
