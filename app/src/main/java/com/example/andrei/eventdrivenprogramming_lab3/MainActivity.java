package com.example.andrei.eventdrivenprogramming_lab3;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    private DrawingView drawView;
    private ImageButton eraseBtn, brushBtn;
    private float smallBrush, mediumBrush, largeBrush;
    private Button smallBtn,mediumBtn, largeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawView = (DrawingView)findViewById(R.id.drawing);
        smallBrush = 3;
        mediumBrush =7;
        largeBrush =15;
        drawView.setBrushSize(smallBrush);




        smallBtn = (Button)findViewById(R.id.btn_small);
        smallBtn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                drawView.setBrushSize(smallBrush);
            }
        });
        mediumBtn = (Button)findViewById(R.id.btn_medium);
        mediumBtn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                drawView.setBrushSize(mediumBrush);
            }
        });
        largeBtn = (Button)findViewById(R.id.btn_large);
        largeBtn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                drawView.setBrushSize(largeBrush);
            }
        });

        eraseBtn = (ImageButton)findViewById(R.id.erase_btn);
        brushBtn = (ImageButton)findViewById(R.id.brush_btn);

        eraseBtn.setOnClickListener(this);
        brushBtn.setOnClickListener(this);





    }



    @Override
    public void onClick(View view){
        //respond to clicks
        switch(view.getId()){
            case R.id.brush_btn:
                drawView.getPaint().setColor(Color.BLACK);
                smallBtn.setOnClickListener(new OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        drawView.setBrushSize(smallBrush);
                    }
                });
                mediumBtn.setOnClickListener(new OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        drawView.setBrushSize(mediumBrush);
                    }
                });
                largeBtn.setOnClickListener(new OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        drawView.setBrushSize(largeBrush);
                    }
                });
                break;

            case R.id.erase_btn:
                drawView.getPaint().setColor(Color.WHITE);
                smallBtn.setOnClickListener(new OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        drawView.setBrushSize(smallBrush);
                    }
                });
                mediumBtn.setOnClickListener(new OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        drawView.setBrushSize(mediumBrush);
                    }
                });
                largeBtn.setOnClickListener(new OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        drawView.setBrushSize(largeBrush);
                    }
                });

                break;
        }



    }
}
