package com.example.ejercicio2_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ImageView imgCam1, imgCam2, imgLuz1, imgLuz2;
    private Switch sw1, sw2;
    private ToggleButton tb1, tb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgCam1 = (ImageView) findViewById(R.id.imageCamara1);
        imgCam2 = (ImageView) findViewById(R.id.imageCamera2);
        imgLuz1 = (ImageView) findViewById(R.id.imageLuz1);
        imgLuz2 = (ImageView) findViewById(R.id.imageLuz2);
        sw1 = (Switch) findViewById(R.id.switch1);
        sw2 = (Switch) findViewById(R.id.switch2);
        tb1 = (ToggleButton) findViewById(R.id.toggleButton1);
        tb2 = (ToggleButton) findViewById(R.id.toggleButton2);

        tb1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(tb1.isChecked()) {
                    imgCam2.setImageResource(R.drawable.camara);
                }
                else {
                    imgCam2.setImageIcon(null);
                }
            }
        });

        tb2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(tb2.isChecked()) {
                    imgLuz2.setImageResource(R.drawable.bombilla_encendida);
                }
                else {
                    imgLuz2.setImageResource(R.drawable.bombilla_apagada);
                }
            }
        });

        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imgLuz1.setImageResource(R.drawable.bombilla_encendida);
                } else {
                    imgLuz1.setImageResource(R.drawable.bombilla_apagada);
                }
            }
        });

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    imgCam1.setImageResource(R.drawable.camara);
                }
                else {
                    imgCam1.setImageIcon(null);
                }
            }
        });


    }
}