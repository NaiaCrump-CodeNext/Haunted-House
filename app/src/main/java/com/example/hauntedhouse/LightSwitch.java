package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LightSwitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_switch);
    }

    public void turnLightOn(View view){
        Intent intent = new Intent(this, TurnLightOn.class);
        startActivity(intent);
    }

    public void keepLightOff(View view){
        Intent intent = new Intent(this, TurnLightOFF.class);
        startActivity(intent);
    }
}
