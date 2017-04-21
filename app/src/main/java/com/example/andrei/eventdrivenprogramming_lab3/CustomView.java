package com.example.andrei.eventdrivenprogramming_lab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by andrei on 4/20/17.
 */

public class CustomView extends View {
    Paint pen;
    static RadialGradient gradient1=null;
    static RadialGradient gradient2=null;
    private float brushSize;

    int[] colors=new int[]{Color.BLACK,Color.BLUE,Color.YELLOW,Color.RED,Color.MAGENTA};
    int[] weigth=new int[]{10,20,30,40,50};


    public CustomView(Context context, AttributeSet attrs){
        super(context, attrs);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setup();
    }


    public void setup(){
        pen=new Paint();
        pen.setColor(colors[0]);
        pen.setAntiAlias(true);
        pen.setStrokeWidth(10);
        pen.setStyle(Paint.Style.STROKE);
        pen.setStrokeJoin(Paint.Join.MITER);
        pen.setStrokeCap(Paint.Cap.SQUARE);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        switch (Main2Activity.level){
            case 1:
                pen.setStrokeWidth(weigth[0]);
                pen.setColor(colors[0]);
                canvas.drawLine(0,60,400,60,pen);
                pen.reset();
                pen.setColor(colors[1]);
                pen.setStrokeWidth(weigth[1]);
                canvas.drawLine(0,120,400,120,pen);
                pen.reset();
                pen.setColor(colors[2]);
                pen.setStrokeWidth(weigth[2]);
                canvas.drawLine(0,180,400,180,pen);
                pen.reset();
                pen.setColor(colors[3]);
                pen.setStrokeWidth(weigth[3]);
                canvas.drawLine(0,240,400,240,pen);
                pen.reset();
                pen.setColor(colors[4]);
                pen.setStrokeWidth(weigth[4]);
                canvas.drawLine(0,300,400,300,pen);
                pen.reset();

        /* Rectangle*/

                pen.setColor(Color.parseColor("#551A8B"));
                pen.setStyle(Paint.Style.FILL);
                canvas.drawRect(500,50,1000,350,pen);
                pen.reset();



        /* Circle */

                pen.setColor(Color.parseColor("#FFA500"));
                pen.setStrokeWidth(weigth[2]);
                pen.setStyle(Paint.Style.STROKE);
                canvas.drawCircle(250,600,180, pen);
                pen.reset();


        /* Oval */
                pen.setColor(Color.parseColor("#ff0000"));
                pen.setStrokeWidth(weigth[0]);
                pen.setStyle(Paint.Style.STROKE);
                RectF rect=new RectF(500,450,1000,750);
                canvas.drawOval(rect,pen);
                pen.reset();


        /* Triangle */

                Point point1 = new Point(); point1.set(550,900);
                Point point2 = new Point(); point2.set(350,1300);
                Point point3 = new Point(); point3.set(700,1300);

                Path path = new Path();
                path.moveTo(point1.x,point1.y);
                path.lineTo(point2.x,point2.y);
                path.lineTo(point3.x,point3.y);
                path.lineTo(point1.x,point1.y);
                path.close();
                pen.setColor(Color.parseColor("#ffff00"));
                canvas.drawPath(path,pen);
                pen.reset();


        /* Bezier curves */

                pen.setStyle(Paint.Style.STROKE);
                pen.setStrokeWidth(10);
                pen.setColor(Color.RED);
                path.moveTo(350, 1460);
                path.cubicTo(440, 1320, 586, 1650, 700, 1450);

                path.moveTo(350, 1710);
                path.cubicTo(368, 1600, 600, 1900, 650, 1650);
                canvas.drawPath(path,pen);

                break;

            case 2:
                if(gradient1!=null){
                    pen.setShader(gradient1);
                }
                pen.setColor(Color.BLUE);
                pen.setStyle(Paint.Style.FILL);
                canvas.drawCircle(300,500,200, pen);
                pen.reset();

                if(gradient2!=null){
                    pen.setShader(gradient2);
                }
                pen.setStyle(Paint.Style.FILL);
                canvas.drawRect(450,50,1000,350,pen);


                break;
        }






    }



}
