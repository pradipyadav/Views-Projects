package com.example.gridvwjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<MyItem> dataset=new ArrayList<>();

        dataset.add(new MyItem(R.mipmap.ic_launcher,"Launcher"));
        dataset.add(new MyItem(R.drawable.ic_settings_black_24dp,"Settings"));
        dataset.add(new MyItem(R.drawable.ic_bluetooth_black_24dp,"Bluetooth"));
        dataset.add(new MyItem(R.drawable.ic_delete_black_24dp,"Delete"));
         dataset.add(new MyItem(R.drawable.ic_headset_black_24dp,"Headset"));
        dataset.add(new MyItem(R.drawable.ic_phone_black_24dp,"Phone"));


        MyAdapter adapter=new MyAdapter(this,dataset);

        ((GridView)findViewById(R.id.gridIcons)).setAdapter(adapter);
    }
}
