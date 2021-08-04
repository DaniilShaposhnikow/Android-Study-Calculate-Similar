package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view)
    {
        Button button = (Button) findViewById(R.id.button);
        EditText t = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText l = (EditText) findViewById(R.id.editTextNumberDecimal2);
        TextView textView = (TextView) findViewById(R.id.textView);
        double T = Double.parseDouble(t.getText().toString());
        double L = Double.parseDouble(l.getText().toString());
        double R = 3 * Math.pow(T, 2.0) + 3 * Math.pow(L, 5.0) + 4.9;
        String ac = Double.toString(R);
        textView.setText(ac);
    }
}
