package com.example.customadapterkptlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       customAdapter()
       // arrayAdapter()
    }

    private fun customAdapter()
    {
        val rdta= arrayListOf<MyItem>()
        rdta.add(MyItem(R.mipmap.ic_launcher,"Launcher"))
        rdta.add(MyItem(R.drawable.ic_settings_black_24dp,"Settings"))
        rdta.add(MyItem(R.drawable.ic_bluetooth_black_24dp,"Bluetooth"))
        rdta.add(MyItem(R.drawable.ic_delete_black_24dp,"Delete"))
        rdta.add(MyItem(R.drawable.ic_headset_black_24dp,"HeadSet"))
        rdta.add(MyItem(R.drawable.ic_phone_black_24dp,"Phone"))

        val adapter=MyAdapter(this,rdta)
        listVw.adapter=adapter
    }
    private fun arrayAdapter()
    {
        val rdta= arrayListOf<String>()
        rdta.add("Android")
        rdta.add("Kotlin")
        rdta.add("Windows")
        rdta.add("RIM")
        rdta.add("Apple")
        rdta.add("WebOs")
        rdta.add("PalmOs")

        val adapter= ArrayAdapter<String>(
                this@MainActivity,
                android.R.layout.simple_list_item_1,
                rdta
        )
        listVw.adapter=adapter
        btnadd.setOnClickListener(this::added)


        listVw.setOnItemClickListener { _, _, position, _ -> etMob.setText(rdta[position]) }

        listVw.setOnItemLongClickListener { _, _, position, _ ->
            adapter.remove(adapter.getItem(position))
            true
        }
    }

    fun added(view: View)
    {
        (listVw.adapter as ArrayAdapter<String>).add(etMob.text.toString())
        (listVw.adapter as ArrayAdapter<String>).notifyDataSetChanged()
    }

}

