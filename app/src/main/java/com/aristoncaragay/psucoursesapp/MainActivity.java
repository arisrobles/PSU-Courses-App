package com.aristoncaragay.psucoursesapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

     String[] courses = {"BSIT", "BSHM", "BSED"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        ListView listview = findViewById(R.id.psucourses);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, courses);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 0:
                        Intent i = new Intent(MainActivity.this, BSIT.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent a = new Intent(MainActivity.this, BSED.class);
                        startActivity(a);
                        break;
                    case 2:
                        Intent r = new Intent(MainActivity.this, BSHM.class);
                        startActivity(r);
                        break;
                }
            }
        });
    }}

