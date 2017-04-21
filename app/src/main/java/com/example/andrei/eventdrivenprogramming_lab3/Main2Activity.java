package com.example.andrei.eventdrivenprogramming_lab3;


import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;


public class Main2Activity extends AppCompatActivity {
    CustomView custom;
    static int level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        level=getIntent().getIntExtra("LEVEL",0);
        custom=(CustomView)findViewById(R.id.custom);

    }



}
