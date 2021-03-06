package com.example.aya.kids;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class slide_fruit_fr extends PagerAdapter {
        Context context;
        LayoutInflater inflater;

        // list of images
        public int[] lst_images = {
                R.drawable.f11,
                R.drawable.f2,
                R.drawable.f3,
                R.drawable.f4,
                R.drawable.f5,
                R.drawable.f6,
                R.drawable.f7,
                R.drawable.f8,
                R.drawable.f9,
                R.drawable.f12



        };
        // list of titles
        public String[] lst_title = {
                "ABRICOT",
                "RAISIN",
                "BANANE",
                "FRASE",
                "DATTE",
                "ANANASE",
                "ORANGE",
                "GRENADE",
                "FIGUE",
                "POMME"

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


    public slide_fruit_fr(Context context) {
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
            View view = inflater.inflate(R.layout.slide_fruit_fr,container,false);
            LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayoutfruit);
            ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);
            TextView txttitle= (TextView) view.findViewById(R.id.txttitle);
           // TextView description = (TextView) view.findViewById(R.id.txtdescription);
            layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
            imgslide.setImageResource(lst_images[position]);
            txttitle.setText(lst_title[position]);
           // description.setText(lst_description[position]);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((LinearLayout)object);
        }
    }


