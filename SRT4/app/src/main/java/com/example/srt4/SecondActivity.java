package com.example.srt4;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {
    Toolbar toolbar;
    ListItemAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.second);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("SRT Quick Menu");
        setSupportActionBar(toolbar);


        listView=findViewById(R.id.listview1);
        adapter=new ListItemAdapter();

        adapter.addItem(new ListItem("승차권 구매이력","3개월이내 내역 조회가능"));
        adapter.addItem(new ListItem("신용카드 결제내역",""));
        adapter.addItem(new ListItem("회원카드","회원 QR 코드"));
        adapter.addItem(new ListItem("할인쿠폰조회/등록","고객할인 쿠폰을 조회하세요"));
        adapter.addItem(new ListItem("회원 정보조회/변경",""));
        listView.setAdapter(adapter);
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
