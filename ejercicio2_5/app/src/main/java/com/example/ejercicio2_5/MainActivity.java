package com.example.ejercicio2_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button btnYahoo, btnBing, btnGoogle;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnYahoo = (Button) findViewById(R.id.btnYahoo);
        btnBing = (Button) findViewById(R.id.btnBing);
        btnGoogle = (Button) findViewById(R.id.btnGoogle);
        img = (ImageView) findViewById(R.id.image);
        btnYahoo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img.setImageResource(R.drawable.yahoo_logo);
            }
        });

        btnBing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img.setImageResource(R.drawable.bing_logo);
            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                img.setImageResource(R.drawable.google_logo);
            }
        });
    }
}