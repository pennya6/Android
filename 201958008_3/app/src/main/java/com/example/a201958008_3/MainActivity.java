package com.example.a201958008_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends Activity {

    Button btnPrev,btnNext,btnNum;
    myPictureView myPicture;
    int curNum=1;
    File[] imageFiles;
    String imageFname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 이미지 뷰어");
        ActivityCompat.requestPermissions(this,new  String[]{
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE},MODE_PRIVATE);
        btnPrev=(Button) findViewById(R.id.btnPrev);
        btnNext=(Button) findViewById(R.id.btnNext);
        btnNum=(Button)findViewById(R.id.btnNum);
        myPicture=(myPictureView) findViewById(R.id.myPictureView1);

        imageFiles=new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/Pictures/test").listFiles();
        imageFname=imageFiles[1].toString();
        myPicture.imagePath=imageFname;
        int length =imageFiles.length-1;

        btnPrev.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(curNum<=1){
                    Toast.makeText(getApplicationContext(),"첫번째 그림입니다",Toast.LENGTH_SHORT).show();
                    btnNum.setText(curNum+"/"+length);

                }else{
                    curNum--;
                    imageFname=imageFiles[curNum].toString();
                    myPicture.imagePath=imageFname;
                    myPicture.invalidate();
                    btnNum.setText(curNum+"/"+length);

                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curNum>=imageFiles.length-1){
                    Toast.makeText(getApplicationContext(),"마지막 그림입니다.",Toast.LENGTH_SHORT).show();
                    btnNum.setText(curNum+"/"+length);
                }else{
                    curNum++;
                    imageFname=imageFiles[curNum].toString();
                    myPicture.imagePath=imageFname;
                    myPicture.invalidate();
                    btnNum.setText(curNum+"/"+length);
                }
            }
        });

    }



}