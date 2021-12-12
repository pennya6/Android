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
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.navigation.NavigationBarView;

import java.io.FileReader;

public class MainActivity extends AppCompatActivity {

    Toolbar mytoolbar;

    BottomNavigationView bottomNavigationView;
    ImageButton imageButton;

    FragmentManager fragmentManager=getSupportFragmentManager();

    private fragment_second fragment_second=new fragment_second();
    private MainFragment fragment=new MainFragment();
    private fragment_third fragment_third=new fragment_third();

    private fragment_travel fragment_travel=new fragment_travel();
    private fragment_start fragment_start=new fragment_start();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytoolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mytoolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("SRT");

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, fragment).commit();

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottom_ticketing:
                        //getSupportActionBar().setIcon(R.drawable.srt);
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        getSupportActionBar().setTitle("SRT");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,fragment).commit();
                        return true;
                    case R.id.bottom_register:
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        getSupportActionBar().setTitle("승차권확인");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,fragment_second).commit();
                        return true;
                    case R.id.bottom_back:
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        getSupportActionBar().setTitle("정기/회수승차권발권");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,fragment_third).commit();
                        return true;
                    case R.id.bottom_travel:
                        showDialog_trl();
                        return true;
                }
                return false;
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
    //여행상품 대화상자
    void showDialog_trl(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this)
                .setMessage("시스템 점검 중 입니다.")
                .setPositiveButton("확인",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface,int i) {

                    }
                });
        AlertDialog dialog=builder.create();
        dialog.show();
    }

    public void onFragmentChange(int fragmentNum){
        if(fragmentNum==1){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,fragment_start).commit();
        }else if(fragmentNum==2){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,fragment_travel).commit();
        }else if(fragmentNum==3){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,fragment).commit();
        }
    }

}