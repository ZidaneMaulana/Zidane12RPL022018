package com.example.zidane12rpl022018;

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

    public void registerActivity(View view){

        Intent intent = new Intent(this, register.class);
        startActivity(intent);

    }

    public void dashboardActivity(View view){

        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);

    }

}