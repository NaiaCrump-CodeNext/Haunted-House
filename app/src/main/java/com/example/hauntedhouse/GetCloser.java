package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GetCloser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_closer);
    }

    public void getCloser (View view){
        Intent intent = new Intent(this, BsBeBonkers.class);
        startActivity(intent);
    }

    public void backOff(View view){
        Intent intent = new Intent(this, BackOff.class);
        startActivity(intent);
    }
}
