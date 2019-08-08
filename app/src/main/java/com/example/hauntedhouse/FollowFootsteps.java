package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FollowFootsteps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_footsteps);
    }

    public void runFaster(View view){
        Intent intent = new Intent(this, Mother_EndingKeys.class);
        startActivity(intent);
    }

    public void giveUp(View view){
        Intent intent = new Intent(this, AlmostDone.class);
        startActivity(intent);
    }
}
