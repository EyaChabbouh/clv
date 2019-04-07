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

public class slide_legume_al extends  PagerAdapter {

    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {
            R.drawable.leg1,
            R.drawable.leg2,
            R.drawable.leg3,
            R.drawable.leg4,
            R.drawable.leg5,
            R.drawable.leg7,
            R.drawable.leg8,
            R.drawable.leg9,
            R.drawable.leg10,
            R.drawable.leg11
    };
    // list of titles
    public String[] lst_title = {
             "CAPSICUM",
            "SPINAT",
            "CHAMPIGNON",
            "UNIONE",
            "CABBAGE",
            "KOHL",
            "KAROTTE",
            "BLUMENKOHL",
            "PEAS",
            "STECKRÜBE"
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
            Color.rgb(255,255,255)
    };


    public slide_legume_al(Context context) {
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
        View view = inflater.inflate(R.layout.slide_legume_al,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayoutlegume);
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


