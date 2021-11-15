package com.example.ejercicio2_4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    private static char[] letraDni = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };
    private Button btnValidar;
    private EditText textNumber, textLetter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnValidar = (Button) findViewById(R.id.btnValidar);
        textNumber = (EditText) findViewById(R.id.dniNumbers);
        textLetter = (EditText) findViewById(R.id.dniLetter);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int num = Integer.parseInt(textNumber.getText().toString());
                char c = textLetter.getText().toString().charAt(0);
                if(validar(num, c)) {
                    v.getRootView().setBackgroundColor(getResources().getColor(R.color.green));
                }
                else {
                    v.getRootView().setBackgroundColor(getResources().getColor(R.color.red));
                }

            }
        });
    }

    private boolean validar(int num, char c) {
        return Character.toUpperCase(c) == letraDni[num % 23];
    }
}