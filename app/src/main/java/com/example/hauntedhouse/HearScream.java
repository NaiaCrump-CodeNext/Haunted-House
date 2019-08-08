package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HearScream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hear_scream);
    }

    public void runTowards(View view){
        Intent intent = new Intent(this, ScreamRunTowards.class);
        startActivity(intent);
    }

    public void runAway(View view){
        Intent intent = new Intent(this, YoumettheMurderer_Ending.class);
        startActivity(intent);
    }
}
