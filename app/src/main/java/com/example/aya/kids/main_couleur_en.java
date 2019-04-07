package com.example.aya.kids;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class main_couleur_en extends AppCompatActivity {
    private ViewPager viewPager;
    private slide_couleur_en myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_francais);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new slide_couleur_en (this);
        viewPager.setAdapter(myadapter);

    }
}