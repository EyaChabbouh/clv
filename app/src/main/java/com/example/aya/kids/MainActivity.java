package com.example.aya.kids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button allemand = (Button) findViewById(R.id.allemand);
        Button francais = (Button) findViewById(R.id.francais);
        Button anglais = (Button) findViewById(R.id.anglais);
        francais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openfrancais();
            }
        });

        anglais.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openanglais();

            }
        });
        allemand.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openallemand();

            }
        });
    }
        private void openfrancais () {
            Intent intent = new Intent(this, francais.class);
            startActivity(intent);

        }
    private void openanglais () {
        Intent intent = new Intent(this, anglais.class);
        startActivity(intent);

    }
    private void openallemand () {
        Intent intent = new Intent(this, allemand.class);
        startActivity(intent);

    }
}
