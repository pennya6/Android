package com.example.srt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListItemAdapter extends BaseAdapter {

    ArrayList<ListItem> items=new ArrayList<ListItem>();
    Context context;

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        context=viewGroup.getContext();
        ListItem listItem=items.get(i);

        if(view==null){
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.listview_item,viewGroup,false);
        }
        TextView text=view.findViewById(R.id.list_text);
        TextView detail=view.findViewById(R.id.list_detail);

        text.setText(listItem.getText());
        detail.setText(listItem.getDetail());

        return view;
    }
    public void addItem(ListItem item){
        items.add(item);
    }
}
