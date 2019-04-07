package com.example.aya.kids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button francais=(Button)findViewById(R.id.francais);
        francais.setOnClickListener((View.OnClickListener)this);
    }

    @Override
    public void onClick(View v) {
        openfrancais();
    }

    private void openfrancais() {
        Intent intent = new Intent(this, francais.class);
        startActivity(intent);
    }
}
