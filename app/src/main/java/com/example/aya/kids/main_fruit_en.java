package com.example.aya.kids;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;

public class main_fruit_en extends AppCompatActivity {
    private ViewPager viewPager;
    private slide_fruit_en myadapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_francais);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter1 = new slide_fruit_en (this);
        viewPager.setAdapter(myadapter1);


    }
    /**
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragement = null ;
                    switch ( item.getItemId()){
                        case R.id.nav_home :
                            selectedFragement =new MainActivity (); break;
                        case R.id.nav_langue :
                            selectedFragement =new anglais (); break;
                        case R.id.nav_test :
                            selectedFragement =new activity_test (); break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(fragement_container,selectedFragement).commit();
                    return  true ;
                }
                };
     **/
}
