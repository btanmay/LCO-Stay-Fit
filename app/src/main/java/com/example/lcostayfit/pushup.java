package com.example.lcostayfit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class pushup extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pushup);

        //when activity started timer started
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                //start your activity here
                Intent myIntent = new Intent(pushup.this, dbpushup.class);
                pushup.this.startActivity(myIntent);
            }

        }, 60000);
    }

    /*
    //onclick timer starts
    public void dbpushup(View view) {
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                //start your activity here
                Intent myIntent = new Intent(pushup.this, dbpushup.class);
                pushup.this.startActivity(myIntent);
            }

        }, 60000);


    }

     */
}
