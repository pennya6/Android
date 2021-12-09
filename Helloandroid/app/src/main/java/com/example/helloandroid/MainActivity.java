package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    EditText edit1, edit2;
    TextView textResult;
    String num1,num2;
    Integer result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox mycheck;

        mycheck=findViewById(R.id.android);

        mycheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        btnAdd=findViewById(R.id.BtnAdd);
        edit1=findViewById(R.id.Edit1);
        edit2=findViewById(R.id.Edit2);
        textResult=findViewById(R.id.TextResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();

                result1=Integer.parseInt(num1)+Integer.parseInt(num2);

                textResult.setText("계산결과: "+result1.toString());
            }
        });


    }
}