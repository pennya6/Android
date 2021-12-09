package com.example.project7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색바꾸기(컨테스트메뉴)");
        baseLayout=(LinearLayout) findViewById(R.id.baseLayouts);
        button1=(Button) findViewById(R.id.button1);
        registerForContextMenu(button1);
        button2=(Button) findViewById(R.id.button2);
        registerForContextMenu(button2);
    }
}