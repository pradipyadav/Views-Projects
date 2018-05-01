package com.example.listviewjavaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> dataSet=new ArrayList<>();


        final EditText edtxt = (EditText) findViewById(R.id.editText);
        Button btnadd = (Button) findViewById(R.id.button);
        final ListView list = (ListView) findViewById(R.id.listView);
        Button btnupdt=(Button)findViewById(R.id.button1);

        dataSet.add("Google");
        dataSet.add("Cognizant");
        dataSet.add("Wipro");
        dataSet.add("TCS");
        dataSet.add("HP");
        dataSet.add("Dell");
        dataSet.add("Sony");
        dataSet.add("FlipCart");
        dataSet.add("Amazon");

        final ArrayAdapter<String> adapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dataSet);

       // ((ListView)findViewById(R.id.listView)).setAdapter(adapter);

        list.setAdapter(adapter);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataSet.add(edtxt.getText().toString());
                adapter.notifyDataSetChanged();

            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                MainActivity adapter = (MainActivity) list.getAdapter();

                Object pos=null;
                adapter.removeItemAt((Integer) pos);
                adapter.notifyDataSetChanged();
                return true;
            }
        });

        btnupdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }


    private void notifyDataSetChanged() {

    }

    private void removeItemAt(int pos) {


    }

}
