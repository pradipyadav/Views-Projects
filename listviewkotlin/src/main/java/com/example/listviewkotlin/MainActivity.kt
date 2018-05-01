package com.example.listviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


val rdta= arrayListOf<String>()
var elementPos : Int = 0

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




            rdta.add("Android")
            rdta.add("Kotlin")
            rdta.add("Windows")
            rdta.add("RIM")
            rdta.add("Apple")
            rdta.add("WebOs")
            rdta.add("PalmOs")

            val adapter=ArrayAdapter<String>(
                    this@MainActivity,
                    android.R.layout.simple_list_item_1,
                    rdta
            )
        listVw.adapter=adapter
        btnadd.setOnClickListener(this::added)


        listVw.setOnItemClickListener { _, _, position, _ -> etMob.setText(rdta[position])

        elementPos=position
        }

        listVw.setOnItemLongClickListener { _, _, position, _ ->
            adapter.remove(adapter.getItem(position))
            true
        }
        btnUpdate.setOnClickListener(this::updated)
    }

    fun added(view:View)
    {
        (listVw.adapter as ArrayAdapter<String>).add(etMob.text.toString())
        (listVw.adapter as ArrayAdapter<String>).notifyDataSetChanged()
    }

    internal  fun updated(view : View){
        (listVw.adapter as ArrayAdapter<String>).remove(rdta.get(elementPos))
        (listVw.adapter as ArrayAdapter<String>).insert((etMob.text.toString()), elementPos)
        (listVw.adapter as ArrayAdapter<String>).notifyDataSetChanged()
        etMob.setText("")
    }

}

