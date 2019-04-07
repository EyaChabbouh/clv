package com.example.aya.kids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class allemand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francais);
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
        Intent intent = new Intent(this, main_legume_al.class);
        startActivity(intent);

    }

    private void openfruit () {
        Intent intent = new Intent(this, main_fruit_al.class);
        startActivity(intent);


    }
    private void opencorp () {
        Intent intent = new Intent(this, main_corp_al.class);
        startActivity(intent);


    }
    private void opencouleur () {
        Intent intent = new Intent(this, main_couleur_al.class);
        startActivity(intent);


    }
    private void openforme () {
        Intent intent = new Intent(this, main_forme_al.class);
        startActivity(intent);


    }


}

