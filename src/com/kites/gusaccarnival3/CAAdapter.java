package com.kites.gusaccarnival3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CAAdapter extends ArrayAdapter<ItemIntialize>{

    Context context; 
    int layoutResourceId;    
    ItemIntialize data[] = null;
    
    public CAAdapter(Context context, int layoutResourceId, ItemIntialize[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ItemIntializeHolder holder = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new ItemIntializeHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            row.setTag(holder);
        }
        else
        {
            holder = (ItemIntializeHolder)row.getTag();
        }
        
        ItemIntialize ItemIntialize = data[position];
        holder.imgIcon.setImageResource(ItemIntialize.icon);
        
        return row;
    }
    
    static class ItemIntializeHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}