package com.example.aya.kids;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class main_fruit_fr extends AppCompatActivity {
    private ViewPager viewPager;
    private slide_fruit_fr myadapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_francais);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter1 = new slide_fruit_fr(this);
        viewPager.setAdapter(myadapter1);

    }
}
