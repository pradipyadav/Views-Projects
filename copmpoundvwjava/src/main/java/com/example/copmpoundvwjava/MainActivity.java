package com.example.copmpoundvwjava;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnadd).setOnClickListener(this::onClick);
//        final LayoutInflater inflater=getLayoutInflater();
//        inflater.inflate(R.layout.compoundview,(RelativeLayout)findViewById(R.layout.CmVm),true);

    }
    @SuppressLint("ResourceType")
    private void onClick(View view)
    {
        final LayoutInflater inflater=getLayoutInflater();

        LinearLayout root=(LinearLayout)findViewById(R.layout.compoundview);

        View cm= inflater.inflate(R.layout.compoundview,null,false);
        ((TextView)cm.findViewById(R.id.textView)).setText(""+new Date());

        root.addView(cm);
    }
}
