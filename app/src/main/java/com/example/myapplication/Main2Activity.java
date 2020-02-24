package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=(ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("IPhone");
        arrayList.add("Windows");
        arrayList.add("Blackberry");
        arrayList.add("Linux");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent myintent=new Intent(view.getContext(),Android.class);
                    startActivityForResult(myintent,0);
                }
                if(i==1){
                    Intent myintent=new Intent(view.getContext(),IPhone.class);
                    startActivityForResult(myintent,1);
                }
                if(i==2){
                    Intent myintent=new Intent(view.getContext(),Windows.class);
                    startActivityForResult(myintent,2);
                }
                if(i==3){
                    Intent myintent=new Intent(view.getContext(),Blackberry.class);
                    startActivityForResult(myintent,3);
                }
                if(i==4){
                    Intent myintent=new Intent(view.getContext(),Linux.class);
                    startActivityForResult(myintent,4);
                }
            }
        });


    }


}
