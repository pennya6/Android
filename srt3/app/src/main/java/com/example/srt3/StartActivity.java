package com.example.srt3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class StartActivity extends AppCompatActivity {

    Toolbar toolbar;
    CalendarView calendarView;
    Button check_btn;
    Button button;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.start_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("출발일시");
        setSupportActionBar(toolbar);

        calendarView=findViewById(R.id.calendarView);

        check_btn=findViewById(R.id.button2);
        check_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    @SuppressLint("ResourceAsColor")
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button29:
                button=findViewById(R.id.button29);
                button.setBackgroundColor(R.color.purple_300);
                break;
        }

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
