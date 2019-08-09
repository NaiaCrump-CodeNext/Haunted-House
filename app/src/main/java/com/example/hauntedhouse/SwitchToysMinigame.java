package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SwitchToysMinigame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_toys_minigame);
    }

    public void trustKids(View view){
        Intent intent = new Intent(this, TrustKids.class);
        startActivity(intent);
    }

    public void dontTrustKids(View view){
        Intent intent = new Intent(this, DontTrustKids.class);
        startActivity(intent);
    }
}
