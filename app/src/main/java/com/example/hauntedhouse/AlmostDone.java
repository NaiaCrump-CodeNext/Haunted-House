package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostDone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approach);
    }

    public void runTowardsDoors(View view){
        Intent intent = new Intent(this, Father_EndingDirections.class);
        startActivity(intent);
    }
}
