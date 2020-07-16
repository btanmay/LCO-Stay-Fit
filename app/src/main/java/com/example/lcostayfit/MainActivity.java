package com.example.lcostayfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }



    public void pushup(View view) {

        Intent myIntent = new Intent(MainActivity.this, pushup.class);
        MainActivity.this.startActivity(myIntent);
    }
}