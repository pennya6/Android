package com.example.srt4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class fragment_travel extends Fragment {

    MainActivity activity;

    @Override
    public void onAttach(@NonNull Context context){
        super.onAttach(context);
        activity=(MainActivity) getActivity();
    }

    @Override
    public void onDetach(){
        super.onDetach();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ViewGroup rootView=(ViewGroup) inflater.inflate(R.layout.fragment_travel, container, false);

        ImageButton choice_srt,choice_korail,change_btn;
        final boolean[] i = {true};
        final boolean[] i2 = {true};
        Button start_btn;
        Button arrival_btn;
        final Button[] choice_btn1 = new Button[1];
        Button check_btn;

        choice_korail=(ImageButton) rootView.findViewById(R.id.imageButton5);
        choice_srt=(ImageButton)  rootView.findViewById(R.id.imageButton4);

        start_btn=(Button) rootView.findViewById(R.id.button);
        arrival_btn=(Button) rootView.findViewById(R.id.button7);

        change_btn=(ImageButton) rootView.findViewById(R.id.imageButton2);

        check_btn=(Button) rootView.findViewById(R.id.button2);

        choice_srt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i[0] ==true){
                    choice_srt.setImageResource(R.drawable.srt_2);
                    choice_korail.setImageResource(R.drawable.korail_1);
                    i[0] =true;
                }
            }
        });
        choice_korail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i[0] ==true){
                    choice_srt.setImageResource(R.drawable.srt_1);
                    choice_korail.setImageResource(R.drawable.korail_2);
                    i[0] =true;
                }
            }
        });

        //색지정 메소드
        start_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(i2[0] ==true){
                    start_btn.setTextColor(R.color.purple_300);
                    arrival_btn.setTextColor(R.color.grey);
                    i2[0] =true;

                    //역변경
                    switch (view.getId()){
                        case R.id.button8:
                            choice_btn1[0] =(Button) rootView.findViewById(R.id.button8); //지역선택
                            start_btn.setText((String) choice_btn1[0].getText());
                            break;
                        case R.id.button9:
                            choice_btn1[0] =(Button) rootView.findViewById(R.id.button9); //지역선택
                            start_btn.setText((String) choice_btn1[0].getText());
                            break;
                    }
                }
            }
        });
        arrival_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(i2[0] ==true){
                    arrival_btn.setTextColor(R.color.purple_300);
                    start_btn.setTextColor(R.color.grey);
                    i2[0] =true;
                }
            }
        });

        //위치변경
        change_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String change1= (String) arrival_btn.getText();
                String change2= (String) start_btn.getText();

                arrival_btn.setText(change2);
                start_btn.setText(change1);
            }
        });

        check_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onFragmentChange(3);
            }
        });
        return rootView;
    }
}