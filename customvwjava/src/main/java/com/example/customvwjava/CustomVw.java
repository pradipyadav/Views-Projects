package com.example.customvwjava;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.EditText;

import java.util.jar.Attributes;

@SuppressLint("AppCompatCustomView")
public class CustomVw extends EditText {
    private Paint paint;

    int i;
    public CustomVw(Context context){
        super(context);
        initPaint();
    }
    public CustomVw(Context context, AttributeSet set){
        super(context, set);
        setGravity(Gravity.TOP|Gravity.LEFT);
        initPaint();
    }
    private void initPaint(){
        paint =new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawCircle(20,20,30,paint);

        paint.setColor(Color.GREEN);
        for ( int i=1;i<2000;i+=30);
          canvas.drawLine(0,10+i,100,10+i,paint);

        paint.setColor(Color.RED);
           canvas.drawLine(100,10,100,2000,paint);
    }

//    @Override
//    public void draw(Canvas canvas) {
//        super.draw(canvas);
//    }

}
