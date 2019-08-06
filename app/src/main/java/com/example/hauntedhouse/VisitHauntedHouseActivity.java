package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class VisitHauntedHouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_haunted_house);
    }
    public void right(View view){
        Intent intent = new Intent (this, GoRight.class);
        startActivity(intent);
    }

    public void left(View view){
        Intent intent = new Intent (this, GoLeft.class);
        startActivity(intent);
    }



}
