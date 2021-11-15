package com.example.ejercicio2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               v.getRootView().setBackgroundColor(getResources().getColor(R.color.red));
           }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               v.getRootView().setBackgroundColor(getResources().getColor(R.color.green));
           }
        });

    }
}