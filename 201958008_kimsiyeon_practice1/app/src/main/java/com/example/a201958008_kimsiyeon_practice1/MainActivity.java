package com.example.a201958008_kimsiyeon_practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView img1;

    int Imageindex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("자기 소개 앱");

        button=findViewById(R.id.button);
        img1=findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Imageindex ==0){
                    img1.setImageResource(R.drawable.me1);
                    Imageindex++;
                } else if(Imageindex==1){
                    img1.setImageResource(R.drawable.me2);
                    Imageindex++;
                } else if(Imageindex==2){
                    img1.setImageResource(R.drawable.me3);
                    Imageindex=0;
                }
            }
        });

    }
}