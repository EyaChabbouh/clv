package com.example.aya.kids;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class slide_corp_al extends  PagerAdapter {

    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {
            R.drawable.co1,
            R.drawable.co2,
            R.drawable.co3,
            R.drawable.co4,
            R.drawable.co5,
            R.drawable.co6,
            R.drawable.co7,
            R.drawable.co8,
            R.drawable.co9,
            R.drawable.co10,
            R.drawable.co11,
            R.drawable.co12

    };
    // list of titles
    public String[] lst_title = {
           "AUGEN",
            "FINGER",
            "MUND",
           "ZÄHNE",
             "HALS",
            "HAAR",
            "ZUNGE",
            "OHR",
             "DAUMEN",
            "BAUCH",
            "ELLBOGEN",
           "AUGENBRAUE"
    }   ;
    // list of descriptions

    // list of background colors
    public int[]  lst_backgroundcolor = {
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255),
            Color.rgb(255,255,255)
    };


    public slide_corp_al(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide_corp_fr,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayoutcorp);
        ImageView imgslide1 = (ImageView)  view.findViewById(R.id.slideimg);
        TextView txttitle1= (TextView) view.findViewById(R.id.txttitle);
        // TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide1.setImageResource(lst_images[position]);
        txttitle1.setText(lst_title[position]);
        // description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}


