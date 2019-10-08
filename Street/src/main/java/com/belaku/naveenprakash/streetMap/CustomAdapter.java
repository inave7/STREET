package com.belaku.naveenprakash.streetMap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int places[];
    String[] placeNames;
    LayoutInflater inflter;
    public CustomAdapter(Context applicationContext, int[] places, String[] placeNames) {
        this.context = applicationContext;
        this.places = places;
        this.placeNames = placeNames;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return places.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_gridview, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.imgv); // get the reference of ImageView
        icon.setImageResource(places[i]); // set logo images
        TextView textView = view.findViewById(R.id.tx);
        textView.setText(placeNames[i]);
        return view;
    }
}
