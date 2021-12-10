package com.example.srt3;

import java.util.List;

public class ListItem {
    private String text;
    private String detail;

    public String getDetail() {
        return detail;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    ListItem(String text,String detail){
        this.text=text;
        this.detail=detail;
    }


}
