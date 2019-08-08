package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class DontTrustKids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dont_trust_kids);
    }

    public void readNote(View view){
        Intent intent = new Intent(this, ShouldveListened_Ending.class);
        startActivity(intent);
    }

    public void dontReadNote(View view){
        Intent intent = new Intent(this, LightSwitch.class);
        startActivity(intent);
    }
}
