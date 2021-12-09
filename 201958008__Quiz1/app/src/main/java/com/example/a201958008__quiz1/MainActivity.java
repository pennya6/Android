package com.example.a201958008__quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);

        //자바코드로 설정하는 setOrientation
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));

        setContentView(baseLayout, params);

        //버튼
        Button btn = new Button(this);
        btn.setText("김시연(201958008)");
        baseLayout.addView(btn);

        Button btn2 = new Button(this);
        btn2.setText("숨김버튼");
        btn2.setVisibility(View.INVISIBLE);
        baseLayout.addView(btn2);


        EditText edt = new EditText(this);
        edt.setHint("파란색 글씨 텍스트뷰");
        edt.setTextColor(Color.rgb(0,0,255));
        baseLayout.addView(edt);
    }


}