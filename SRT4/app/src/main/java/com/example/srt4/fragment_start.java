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
import android.widget.CalendarView;

public class fragment_start extends Fragment {

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
        ViewGroup rootView=(ViewGroup) inflater.inflate(R.layout.fragment_start, container, false);

        CalendarView calendarView;
        Button check_btn;
        Button button;

        calendarView=rootView.findViewById(R.id.calendarView);

        check_btn=rootView.findViewById(R.id.button2);
        check_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //activity.finish();
                activity.onFragmentChange(3);
            }
        });

        button=rootView.findViewById(R.id.button29);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                button.setBackgroundColor(R.color.purple_300);
            }
        });

        return rootView;
    }
}