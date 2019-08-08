package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class ExploreOffice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_office);
    }

    public void leaveBox(View view){
        Intent intent = new Intent(this, AlmostDone.class);
        startActivity(intent);
    }

    public void openBox(View view){
        Intent intent = new Intent(this, OpenBox.class);
        startActivity(intent);
    }
}
