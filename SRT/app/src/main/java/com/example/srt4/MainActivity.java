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
                        getSupportActionBar().setTitle("???????????????");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment,fragment_second).commit();
                        return true;
                    case R.id.bottom_back:
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        getSupportActionBar().setTitle("??????/?????????????????????");
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

    // ?????? ????????????
    void showDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this)
                .setMessage("SRT????????? ???????????? ????????? ?????? ?????? ??????????????????. \n\n" +
                        "????????? ????????? ????????? ?????????????????? SR????????????(1800-1472)??? ????????? ????????????. \n\n" +
                        "SRT???????????? ?????????????????????????\n")
                .setPositiveButton("???", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("?????????", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        AlertDialog dialog=builder.create();
        dialog.show();
    }
    //???????????? ????????????
    void showDialog_trl(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this)
                .setMessage("????????? ?????? ??? ?????????.")
                .setPositiveButton("??????",new DialogInterface.OnClickListener(){
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