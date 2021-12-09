package com.example.a201958008__;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("MidTerm");
        button1=(Button)findViewById(R.id.classbtn);
        button2=(Button)findViewById(R.id.snobtn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.classbtn:
                if(button1.getText().toString()=="이름"){
                    button1.setBackgroundColor(Color.BLUE);
                    button1.setText("김시연");
                }
                else{
                    button1.setBackgroundColor(Color.RED);
                    button1.setText("이름"); 
                }
                return true;
            case R.id.snobtn:
                
                if(button2.getText().toString()=="학번"){
                    button2.setBackgroundColor(Color.GREEN);
                    button2.setText("201958008");
                }else{
                    button2.setBackgroundColor(Color.RED);
                    button2.setText("학번");  
                }
                return true;
        }
        return false;
    }
}