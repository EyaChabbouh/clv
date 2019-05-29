package com.example.aya.kids;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class francais extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Button fruit = (Button) findViewById(R.id.fruit);
        Button corp = (Button) findViewById(R.id.corp);
        Button legume = (Button) findViewById(R.id.legume);
        Button forme = (Button) findViewById(R.id.form);
        Button couleur = (Button) findViewById(R.id.couleur);
        legume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openlegume();
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openfruit();

            }
        });
        corp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             opencorp();
            }
        });
       couleur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencouleur();
            }
        });
        forme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openforme();
            }
        });
    }

    private void openlegume () {
        Intent intent = new Intent(this, main_legume.class);
        startActivity(intent);

    }

    private void openfruit () {
        Intent intent = new Intent(this, main_fruit_fr.class);
        startActivity(intent);


    }
    private void opencorp () {
        Intent intent = new Intent(this, main_corp_fr.class);
        startActivity(intent);


    }
    private void opencouleur () {
        Intent intent = new Intent(this, main_couleur_fr.class);
        startActivity(intent);


    }
    private void openforme () {
        Intent intent = new Intent(this, main_forme_fr.class);
        startActivity(intent);


    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            startActivity( new Intent(this,DrawerActivity.class));
        } else if (id == R.id.nav_gallery) {
            startActivity( new Intent(this,francais.class));
        } else if (id == R.id.nav_slideshow) {
            startActivity( new Intent(this,activity_test.class));
        } else if (id == R.id.nav_contact) {
            startActivity( new Intent(this,contact.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

