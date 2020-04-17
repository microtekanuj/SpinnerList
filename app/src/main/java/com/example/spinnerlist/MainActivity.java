package com.example.spinnerlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] name={"Anuj","Ashish","Prahlad","Dhruv","Aditi"};
        ListView l1;
        Spinner s1;
        s1=findViewById(R.id.spinner);
        l1=findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Goku");
        arrayList.add("Vegeta");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,name);
        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,arrayList);
        l1.setAdapter(arrayAdapter);
        s1.setAdapter(arrayAdapter1);
    }
}
