package com.example.lcostayfit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class dbpushup extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dbpushup);

        //when activity started timer started
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                //start your activity here
                Intent myIntent = new Intent(dbpushup.this, inclinebp.class);
                dbpushup.this.startActivity(myIntent);
            }

        }, 60000);


    }
/*
    public void inclinebp(View view) {
        Intent myIntent = new Intent(dbpushup.this, inclinebp.class);
        this.startActivity(myIntent);
    }

 */
}
