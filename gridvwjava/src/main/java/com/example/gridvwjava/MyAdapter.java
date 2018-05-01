package com.example.gridvwjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter
{
    private final Context context;
    private final ArrayList<MyItem> dataset;
    private LayoutInflater inflater;
    public MyAdapter(Context context, ArrayList<MyItem>dataset){
        this.context=context;
        this.dataset=dataset;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataset.size();
    }

    @Override
    public Object getItem(int position) {
        return dataset.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(R.layout.grid_item,parent,false);
        ((ImageView)view.findViewById(R.id.imgIc)).setImageResource(dataset.get(position).img);
        ((TextView)view.findViewById(R.id.txtNm)).setText(dataset.get(position).txt);
        return view;
    }
}
