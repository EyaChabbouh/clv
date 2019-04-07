package com.example.aya.kids;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class main_corp_fr extends AppCompatActivity {
    private ViewPager viewPager;
    private slide_corp_fr myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_francais);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new slide_corp_fr (this);
        viewPager.setAdapter(myadapter);

    }
}