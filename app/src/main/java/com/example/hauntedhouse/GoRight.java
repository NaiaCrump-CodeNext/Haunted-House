package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class GoRight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_right);
    }

    public void approach(View view){
        Intent intent = new Intent(this, Approach.class);
        startActivity(intent);
    }

    public void ignore(View view){
        Intent intent = new Intent(this, HearScream.class);
        startActivity(intent);
    }


}
