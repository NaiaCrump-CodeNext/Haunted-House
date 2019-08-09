package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScreamRunTowards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scream_run_towards);
    }

    public void pinkBed (View view){
        Intent intent = new Intent(this, PinkBed.class);
        startActivity(intent);
    }

    public void blueBed (View view){
        Intent intent = new Intent(this, BlueBed.class);
        startActivity(intent);
    }
}
