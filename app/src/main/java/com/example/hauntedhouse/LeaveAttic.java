package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class LeaveAttic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_attic);
    }

    public void retraceSteps(View view){
        Intent intent = new Intent(this, VisitHauntedHouseActivity.class);
        startActivity(intent);
    }

    public void continueWander(View view){
        Intent intent = new Intent(this, YouAreSafe_Ending.class);
        startActivity(intent);
    }
}
