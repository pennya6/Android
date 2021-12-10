package com.example.srt3;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class travelActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageButton choice_srt,choice_korail;
    boolean i=true;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.travel_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle("역선택");
        setSupportActionBar(toolbar);

        choice_korail=(ImageButton) findViewById(R.id.imageButton5);
        choice_srt=(ImageButton) findViewById(R.id.imageButton4);

        choice_srt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==true){
                    choice_srt.setImageResource(R.drawable.srt_2);
                    choice_korail.setImageResource(R.drawable.korail_1);
                    i=true;
                }
            }
        });

        choice_korail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==true){
                    choice_srt.setImageResource(R.drawable.srt_1);
                    choice_korail.setImageResource(R.drawable.korail_2);
                    i=true;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_second, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.back:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
