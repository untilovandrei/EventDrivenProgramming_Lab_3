package com.iucosoft.android.graphicsdrawdemo;

import android.content.Context;
import android.content.Intent;
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
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class OptionsActivity extends AppCompatActivity implements View.OnClickListener{
    private Button basic;
    private Button normal;
    private Button advanced;
    private Button input;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        basic=(Button)findViewById(R.id.btn_basic);
        normal=(Button)findViewById(R.id.btn_normal);
        advanced=(Button)findViewById(R.id.btn_advanced);
        input=(Button)findViewById(R.id.btn_input);

        basic.setOnClickListener(this);
        normal.setOnClickListener(this);
        advanced.setOnClickListener(this);
        input.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn_basic:
                intent=new Intent(this,Main2Activity.class);
                intent.putExtra("LEVEL",1);
                startActivity(intent);
                break;

            case R.id.btn_normal:
                intent=new Intent(this,Main2Activity.class);
                intent.putExtra("LEVEL",2);
                startActivity(intent);
                break;

            case R.id.btn_advanced:
                startActivity(new Intent(this ,MainActivity.class));
                break;

            case R.id.btn_input:
                InputMethodManager inputMethodManager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
                break;

        }
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_SHIFT_LEFT:
                CustomView.gradient1=new RadialGradient(600,200,100, Color.RED, Color.BLUE, Shader.TileMode.MIRROR);
                break;
            case KeyEvent.KEYCODE_ENTER:
                CustomView.gradient2=new RadialGradient(600,200,100, Color.YELLOW, Color.BLACK, Shader.TileMode.MIRROR);
                break;
        }
        return true;
    }
}
