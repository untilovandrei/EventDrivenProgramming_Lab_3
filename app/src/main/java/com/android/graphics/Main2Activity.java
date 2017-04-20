package com.iucosoft.android.graphicsdrawdemo;

import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;

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
