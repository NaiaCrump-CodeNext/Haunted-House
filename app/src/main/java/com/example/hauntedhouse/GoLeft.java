package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GoLeft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_left);
    }

    public void explore(View view){
        Intent intent = new Intent(this, ExploreAttic.class);
        startActivity(intent);
    }

    public void leave(View view){
        Intent intent = new Intent(this, LeaveAttic.class);
        startActivity(intent);
    }
}
