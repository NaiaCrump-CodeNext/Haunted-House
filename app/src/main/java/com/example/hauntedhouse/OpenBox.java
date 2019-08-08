package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OpenBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_box);
    }

    public void dropIt(View view){
        Intent intent = new Intent(this, DropTheEye.class);
        startActivity(intent);
    }

    public void pokeIt(View view){
        Intent intent = new Intent(this, EyeSeeYou_Ending.class);
        startActivity(intent);
    }
}
