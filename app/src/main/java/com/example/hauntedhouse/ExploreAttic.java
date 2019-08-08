package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class ExploreAttic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
    }

    public void openChest(View view){
        //Intent intent = new Intent(this,);
        //startActivity(intent);
    }

    public void openDrawer(View view){
        Intent intent = new Intent(this, SpiderBite_Ending.class);
        startActivity(intent);
    }
}
