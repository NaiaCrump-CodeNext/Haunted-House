package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TrustKids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trust_kids);
    }

    public void leaveTheKids(View view){
        Intent intent = new Intent(this, LightSwitch.class);
        startActivity(intent);
    }
}
