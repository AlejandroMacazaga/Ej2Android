package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private TextView labelResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = (Button) findViewById(R.id.buttonAdd);
        labelResult = (TextView) findViewById(R.id.txtViewAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText txt1 = (EditText) findViewById(R.id.editText);
                EditText txt2 = (EditText) findViewById(R.id.editText2);
                int num1 = Integer.parseInt(txt1.getText().toString());
                int num2 = Integer.parseInt(txt2.getText().toString());
                int result = num1 + num2;
                labelResult.setText(result + "");
            }
        });
    }

}