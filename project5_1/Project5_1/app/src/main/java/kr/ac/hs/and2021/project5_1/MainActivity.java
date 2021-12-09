package kr.ac.hs.and2021.project5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// 직접 풀어보기 5-3
//    EditText edt;
//    Button btn;
//    TextView tview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //화면 디자인 및 편집
        // activity_main.xml 삭제
        // setContentView(R.layout.activity_main); 주석처리

        // Java 코드 작성
        // Xml파일 대신에 java코드로 작성하기
        // control + q :간단하게 사용법 알수 있음
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
        // (XML) android:layout_width="match_parent", android:layout_height="match_parent"


        LinearLayout baseLayout = new LinearLayout(this);

        //자바코드로 설정하는 setOrientation
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        // (XML) android:orientation = "vertical"

        //배경색 지정 메소드
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        // (XML) android:background="#00ff00"
        
        //뷰와 파라미터를 지정해서 화면 구성하는 방법
        setContentView(baseLayout, params);

        // 예제1
        //새로운 버튼 변수
        Button btn = new Button(this);
        //버튼 속성 -> 자바
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.MAGENTA); //버튼 색상 지정
        baseLayout.addView(btn); //버튼을 레이아웃에 추가(addView 메소드 사용)

        //여기는 동일
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "코드로 생성한 버튼입니다", Toast.LENGTH_SHORT).show();
            }
        });

        // 직접 풀어보기 5-3
//        edt = new EditText(this);
//        edt.setHint("여기에 입력하세요");
//        baseLayout.addView(edt);
//
//        btn = new Button(this);
//        btn.setText("버튼입니다");
//        btn.setBackgroundColor(Color.YELLOW);
//        baseLayout.addView(btn);
//
//        tview = new TextView(this);
//        tview.setText("텍스트뷰입니다.");
//        tview.setTextSize(20);
//        tview.setTextColor(Color.MAGENTA);
//        baseLayout.addView(tview);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                tview.setText(edt.getText().toString());
//                }
//        });

    }
}