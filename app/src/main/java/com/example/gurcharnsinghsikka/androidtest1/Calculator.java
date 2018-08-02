package com.example.gurcharnsinghsikka.androidtest1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        Button addButton = (Button) findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.firstNumEditText2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                String firstNum = firstNumEditText.getText().toString();
                String secondNum = secondNumEditText.getText().toString();

                if(TextUtils.isEmpty(firstNum) || TextUtils.isEmpty(secondNum)) {
                    resultTextView.setText("Please enter values");
                }
                else {
                    int num1 = Integer.parseInt(firstNum);
                    int num2 = Integer.parseInt(secondNum);
                    int result = num1 + num2;
                    resultTextView.setText(result + "");
                }
            }
        });
    }
}
