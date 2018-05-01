package com.example.customviewkotlin

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.EditText

class MyVw(
        context: Context?,
        attr: AttributeSet?
) : EditText(context, attr) {

    private lateinit var paint: Paint

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        paint = Paint()
        paint.color = Color.RED

        canvas?.drawCircle(50f, 50f, 30f, paint)
        canvas?.drawLine(20f, 20f, 90f, 90f, paint)
    }
}