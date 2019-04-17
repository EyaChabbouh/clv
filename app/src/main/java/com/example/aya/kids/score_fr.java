package com.example.aya.kids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class score_fr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        TextView txtscore = (TextView) findViewById(R.id.score);
        Intent intent = getIntent();
        int score = intent.getIntExtra("score ",0);
        txtscore.setText("Score : "+ score);
    }
}
