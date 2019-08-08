package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class DropTheEye extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_the_eye);
    }

    public void cont(View view){
        Intent intent= new Intent(this, AlmostDone.class);
        startActivity(intent);
    }
}
