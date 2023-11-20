package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bmi = null;
    private EditText weight = null;
    private EditText height = null;
    private Button calculate = null;

//    private String  bmiValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate = findViewById(R.id.button);
        bmi = findViewById(R.id.editTextText5);
        weight = findViewById(R.id.editTextText3);
        height = findViewById(R.id.editTextText2);


        calculate.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String weightStr = weight.getText().toString();
                String heightStr = height.getText().toString();
                double weightVal = Double.parseDouble(weightStr);
                double heightVal = Double.parseDouble(heightStr);
                double total = weightVal / (heightVal/100 * heightVal/100);
                bmi.setText(String.valueOf(total));
            }
        }));


    }
}
