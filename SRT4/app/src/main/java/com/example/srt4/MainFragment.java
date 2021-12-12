package com.example.srt4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;


public class MainFragment extends Fragment {

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
        ViewGroup rootView=(ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);


        Button button_arrival=rootView.findViewById(R.id.button6);
        button_arrival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onFragmentChange(2);
            }
        });

        Button button_date=rootView.findViewById(R.id.button4);
        button_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onFragmentChange(1);
            }
        });

        Button mbtn,pbtn,mbtn2,pbtn2,mbtn3,pbtn3,mbtn4,pbtn4,mbtn5,pbtn5,mbtn6,pbtn6;
        TextView nbtn,nbtn2,nbtn3,nbtn4,nbtn5,nbtn6;
        final int[] curNum = {0};
        final int[] curNum2 = {0};
        final int[] curNum3 = {0};
        final int[] curNum4 = {0};
        final int[] curNum5 = {0};
        final int[] curNum6 = {0};

        mbtn=(Button) rootView.findViewById(R.id.minus_button1);
        nbtn=(TextView) rootView.findViewById(R.id.textView1);
        pbtn=(Button) rootView.findViewById(R.id.plus_button1);

        mbtn2=(Button) rootView.findViewById(R.id.minus_button2);
        nbtn2=(TextView) rootView.findViewById(R.id.textView2);
        pbtn2=(Button) rootView.findViewById(R.id.plus_button2);

        mbtn3=(Button) rootView.findViewById(R.id.minus_button3);
        nbtn3=(TextView) rootView.findViewById(R.id.textView3);
        pbtn3=(Button) rootView.findViewById(R.id.plus_button3);

        mbtn4=(Button) rootView.findViewById(R.id.minus_button4);
        nbtn4=(TextView) rootView.findViewById(R.id.textView4);
        pbtn4=(Button) rootView.findViewById(R.id.plus_button4);

        mbtn5=(Button) rootView.findViewById(R.id.minus_button5);
        nbtn5=(TextView) rootView.findViewById(R.id.textView5);
        pbtn5=(Button) rootView.findViewById(R.id.plus_button5);

        mbtn6=(Button) rootView.findViewById(R.id.minus_button6);
        nbtn6=(TextView) rootView.findViewById(R.id.textView6);
        pbtn6=(Button) rootView.findViewById(R.id.plus_button6);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum[0] <=0){
                    nbtn.setText("0");
                }else {
                    curNum[0]--;
                    nbtn.setText(curNum[0] +"");
                }
            }
        });

        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum[0] >=20){
                    nbtn.setText("20");
                }else{
                    curNum[0]++;
                    nbtn.setText(curNum[0] +"");
                }
            }
        });
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum2[0] <=0){
                    nbtn2.setText("0");
                }else {
                    curNum2[0]--;
                    nbtn2.setText(curNum2[0] +"");
                }
            }
        });
        pbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum2[0] >=20){
                    nbtn2.setText("20");
                }else{
                    curNum2[0]++;
                    nbtn2.setText(curNum2[0] +"");
                }
            }
        });
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum3[0] <=0){
                    nbtn3.setText("0");
                }else {
                    curNum3[0]--;
                    nbtn3.setText(curNum3[0] +"");
                }
            }
        });
        pbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum3[0] >=20){
                    nbtn3.setText("20");
                }else{
                    curNum3[0]++;
                    nbtn3.setText(curNum3[0] +"");
                }
            }
        });

        mbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum4[0] <=0){
                    nbtn4.setText("0");
                }else {
                    curNum4[0]--;
                    nbtn4.setText(curNum4[0] +"");
                }
            }
        });
        pbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum4[0] >=20){
                    nbtn4.setText("20");
                }else{
                    curNum4[0]++;
                    nbtn4.setText(curNum4[0] +"");
                }
            }
        });

        mbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum5[0] <=0){
                    nbtn5.setText("0");
                }else {
                    curNum5[0]--;
                    nbtn5.setText(curNum5[0] +"");
                }
            }
        });
        pbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum5[0] >=20){
                    nbtn5.setText("20");
                }else{
                    curNum5[0]++;
                    nbtn5.setText(curNum5[0] +"");
                }
            }
        });

        mbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum6[0] <=0){
                    nbtn6.setText("0");
                }else {
                    curNum6[0]--;
                    nbtn6.setText(curNum6[0] +"");
                }
            }
        });
        pbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curNum6[0] >=20){
                    nbtn6.setText("20");
                }else{
                    curNum6[0]++;
                    nbtn6.setText(curNum6[0] +"");
                }
            }
        });
        return rootView;
    }
}