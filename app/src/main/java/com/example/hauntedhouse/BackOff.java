package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class BackOff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_off);
    }

    public void ignoreItems(View view){
        Intent intent = new Intent(this, HearScream.class);
        startActivity(intent);
    }

    public void takeItems(View view){
        Intent intent = new Intent(this, HearScream.class);
        startActivity(intent);
    }
}
