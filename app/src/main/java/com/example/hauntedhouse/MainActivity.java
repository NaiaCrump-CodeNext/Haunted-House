package com.example.hauntedhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goHome(View view){
        Intent intent = new Intent(this, Coward_Ending.class);
        startActivity(intent);
    }
    public void visitHauntedHouse(View view){
        Intent intent = new Intent(this, VisitHauntedHouseActivity.class);
        startActivity(intent);
    }


}
