package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OpenChest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_chest);
    }
    public void leaveAttic(View view){
        Intent intent = new Intent(this, LeaveAttic.class);
        startActivity(intent);
    }

}
