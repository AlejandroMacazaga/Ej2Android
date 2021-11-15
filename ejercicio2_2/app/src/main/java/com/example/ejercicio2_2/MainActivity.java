package com.example.ejercicio2_2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private char operator;
    private double num1, num2;
    private TextView txtResult;
    private Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = (TextView) findViewById(R.id.txtViewAdd);
        num1 = 0;
        num2 = 0;
        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnSubtract = (Button) findViewById(R.id.buttonSubtract);
        btnMultiply = (Button) findViewById(R.id.buttonMultiply);
        btnDivide = (Button) findViewById(R.id.buttonDivide);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = '+';
                try {
                    num1 = Double.parseDouble(((TextView) findViewById(R.id.editText)).getText().toString());
                    num2 = Double.parseDouble(((TextView) findViewById(R.id.editText2)).getText().toString());
                }
                catch(Exception e) {

                }
                finally {
                    double result = operar();
                    txtResult.setText(result + "");
                }
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = '-';
                try {
                    num1 = Double.parseDouble(((TextView) findViewById(R.id.editText)).getText().toString());
                    num2 = Double.parseDouble(((TextView) findViewById(R.id.editText2)).getText().toString());
                }
                catch(Exception e) {

                }
                finally {
                    double result = operar();
                    txtResult.setText(result + "");
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = '*';
                try {
                    num1 = Double.parseDouble(((TextView) findViewById(R.id.editText)).getText().toString());
                    num2 = Double.parseDouble(((TextView) findViewById(R.id.editText2)).getText().toString());
                }
                catch(Exception e) {

                }
                finally {
                    double result = operar();
                    txtResult.setText(result + "");
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = '/';
                try {
                    num1 = Double.parseDouble(((TextView) findViewById(R.id.editText)).getText().toString());
                    num2 = Double.parseDouble(((TextView) findViewById(R.id.editText2)).getText().toString());
                }
                catch(Exception e) {

                }
                finally {
                    double result = operar();
                    txtResult.setText(result + "");
                }
            }
        });

    }

    private double operar() {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                break;
        }
        return 0;
    }
}