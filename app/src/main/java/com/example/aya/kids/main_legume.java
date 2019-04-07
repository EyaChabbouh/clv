package com.example.aya.kids;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class main_legume extends AppCompatActivity {
    private ViewPager viewPager;
    private slide_legume_fr myadapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_francais);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter1 = new slide_legume_fr (this);
        viewPager.setAdapter(myadapter1);

    }
}
