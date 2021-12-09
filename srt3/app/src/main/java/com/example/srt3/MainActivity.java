package com.example.srt3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    Toolbar mytoolbar;
    BottomNavigationView bottomNavigationView;
    ImageButton imageButton;

    Button mbtn,pbtn;
    TextView nbtn;
    int curNum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytoolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mytoolbar);
        getSupportActionBar().setIcon(R.drawable.srt);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");

        imageButton=(ImageButton) findViewById(R.id.imageButton3);
        imageButton.bringToFront();

        mbtn=(Button) findViewById(R.id.minus_button1);
        nbtn=(TextView) findViewById(R.id.textView1);
        pbtn=(Button) findViewById(R.id.plus_button1);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum<=0){
                    nbtn.setText("0");
                }else {
                    curNum--;
                    nbtn.setText(curNum+"");
                }
            }
        });

        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum>=20){
                    nbtn.setText("20");
                }else{
                    curNum++;
                    nbtn.setText(curNum+"");
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.chat:
                showDialog();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // 챗봇 대화상자
    void showDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this)
                .setMessage("SRT챗봇은 카카오톡 기반의 고객 안내 서비스입니다. \n\n" +
                        "상담원 연결이 필요한 고객님께서는 SR고객센터(1800-1472)를 이용해 주십시오. \n\n" +
                        "SRT챗봇으로 이동하시겠습니까?\n")
                .setPositiveButton("예", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        AlertDialog dialog=builder.create();
        dialog.show();
    }

}