package com.example.srt4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.FileReader;

public class MainActivity extends AppCompatActivity {

    Toolbar mytoolbar;
    //Fragment fragment1,fragment2;
    BottomNavigationView bottomNavigationView;
    ImageButton imageButton;

    FragmentManager fragmentManager=getSupportFragmentManager();

    Button mbtn,pbtn,mbtn2,pbtn2,mbtn3,pbtn3,mbtn4,pbtn4,mbtn5,pbtn5,mbtn6,pbtn6;
    TextView nbtn,nbtn2,nbtn3,nbtn4,nbtn5,nbtn6;
    int curNum=0,curNum2=0,curNum3=0,curNum4=0,curNum5=0,curNum6=0;

    //출발 및 도착지 선택 부분 구현
    Button button_start,button_arrival,button_date;

    private fragment_second fragment_second=new fragment_second();
    private MainFragment fragment=new MainFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytoolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mytoolbar);
        getSupportActionBar().setIcon(R.drawable.srt);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");


        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.container,fragment).commitAllowingStateLoss();
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());


        //getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, fragment1).commit();

        imageButton=(ImageButton) findViewById(R.id.imageButton3);
        imageButton.bringToFront();

        mbtn=(Button) findViewById(R.id.minus_button1);
        nbtn=(TextView) findViewById(R.id.textView1);
        pbtn=(Button) findViewById(R.id.plus_button1);

        mbtn2=(Button) findViewById(R.id.minus_button2);
        nbtn2=(TextView) findViewById(R.id.textView2);
        pbtn2=(Button) findViewById(R.id.plus_button2);

        mbtn3=(Button) findViewById(R.id.minus_button3);
        nbtn3=(TextView) findViewById(R.id.textView3);
        pbtn3=(Button) findViewById(R.id.plus_button3);

        mbtn4=(Button) findViewById(R.id.minus_button4);
        nbtn4=(TextView) findViewById(R.id.textView4);
        pbtn4=(Button) findViewById(R.id.plus_button4);

        mbtn5=(Button) findViewById(R.id.minus_button5);
        nbtn5=(TextView) findViewById(R.id.textView5);
        pbtn5=(Button) findViewById(R.id.plus_button5);

        mbtn6=(Button) findViewById(R.id.minus_button6);
        nbtn6=(TextView) findViewById(R.id.textView6);
        pbtn6=(Button) findViewById(R.id.plus_button6);

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
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum2<=0){
                    nbtn2.setText("0");
                }else {
                    curNum2--;
                    nbtn2.setText(curNum2+"");
                }
            }
        });
        pbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum2>=20){
                    nbtn2.setText("20");
                }else{
                    curNum2++;
                    nbtn2.setText(curNum2+"");
                }
            }
        });
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum3<=0){
                    nbtn3.setText("0");
                }else {
                    curNum3--;
                    nbtn3.setText(curNum3+"");
                }
            }
        });
        pbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum3>=20){
                    nbtn3.setText("20");
                }else{
                    curNum3++;
                    nbtn3.setText(curNum3+"");
                }
            }
        });

        mbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum4<=0){
                    nbtn4.setText("0");
                }else {
                    curNum4--;
                    nbtn4.setText(curNum4+"");
                }
            }
        });
        pbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum4>=20){
                    nbtn4.setText("20");
                }else{
                    curNum4++;
                    nbtn4.setText(curNum4+"");
                }
            }
        });

        mbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum5<=0){
                    nbtn5.setText("0");
                }else {
                    curNum5--;
                    nbtn5.setText(curNum5+"");
                }
            }
        });
        pbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum5>=20){
                    nbtn5.setText("20");
                }else{
                    curNum5++;
                    nbtn5.setText(curNum5+"");
                }
            }
        });

        mbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum6<=0){
                    nbtn6.setText("0");
                }else {
                    curNum6--;
                    nbtn6.setText(curNum6+"");
                }
            }
        });
        pbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum6>=20){
                    nbtn6.setText("20");
                }else{
                    curNum6++;
                    nbtn6.setText(curNum6+"");
                }
            }
        });

        //출발지 및 도착지 선택
        button_arrival=(Button) findViewById(R.id.button6);
        button_arrival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),travelActivity.class);
                startActivity(intent);
            }
        });

        //출발일시
        button_date=(Button) findViewById(R.id.button4);
        button_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),StartActivity.class);
                startActivity(intent);
            }
        });
    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            switch (menuItem.getItemId()){
                case R.id.bottom_ticketing:
                    transaction.replace(R.id.container,fragment).commitAllowingStateLoss();
                    break;
                case R.id.bottom_register:
                    transaction.replace(R.id.container,fragment_second).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
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
            case R.id.people:
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);
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