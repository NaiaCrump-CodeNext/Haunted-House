package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AlmostDone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_box);
    }

    public void runTowardsDoors(View view){
        Intent intent = new Intent(View view);
        startActivity(intent);
    }
}
