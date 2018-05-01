package com.example.compoundviewkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnk.setOnClickListener(this::clicked)
    }

    private fun clicked(view: View) {
        val vw: View = layoutInflater.inflate(
                R.layout.compound_view,        //compound_view is next xml file name
                null,
                false
        )
        vw.findViewById<ImageView>(R.id.imgVw).setOnClickListener {
            (it as ImageView).setImageResource(R.mipmap.ic_launcher_round)
        }
        vw.findViewById<TextView>(R.id.txtVw).setOnClickListener {
            (it as TextView).textSize = 50f
        }
        layoutRoot.addView(vw)
    }
}
