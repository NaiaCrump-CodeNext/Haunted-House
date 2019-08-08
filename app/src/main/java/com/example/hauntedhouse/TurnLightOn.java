package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TurnLightOn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn_light_on2);
    }

    public void punchHim(View view){
        Intent intent = new Intent(this, NeedAnAsprin_Ending.class);
        startActivity(intent);
    }

    public void runAway(View view){
        Intent intent = new Intent(this, Shhhh_Ending.class);
        startActivity(intent);
    }
}
