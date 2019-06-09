package com.example.aya.kids;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class quiz_fruit_fr extends AppCompatActivity {


    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private ImageView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

private int mQustionLength = mQuestionLibrary.lst_images.length ;
    private String mAnswer;

    private int mScore = 0;
    private int mQuestionNumber = 0;
    private int imgslide1 =0 ;
    Random r ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_fruit_fr);

        r= new Random();
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (ImageView) findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);



        updateQuestion(r.nextInt(mQustionLength));

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion(r.nextInt(mQustionLength));
                    Toast.makeText(quiz_fruit_fr.this, "Vrai", Toast.LENGTH_SHORT).show();

                }else {


                    Toast.makeText(quiz_fruit_fr.this, "Faux", Toast.LENGTH_SHORT).show();

                    gameOver();
                }

            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion(r.nextInt(mQustionLength));

                  Toast.makeText(quiz_fruit_fr.this, "Vrais", Toast.LENGTH_SHORT).show();

                }else {

                    Toast.makeText(quiz_fruit_fr.this, "Faux", Toast.LENGTH_SHORT).show();

                    gameOver();}
            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion(r.nextInt(mQustionLength));

            Toast.makeText(quiz_fruit_fr.this, "Vrais", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(quiz_fruit_fr.this, "Faux", Toast.LENGTH_SHORT).show();

                    gameOver();

                }
            }
        });






    }

    private void updateQuestion(int i){

       mQuestionView.setImageResource(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;

    }


    private void updateScore(int point) {
        mScoreView.setText(" " + mScore);
    }

    private  void  gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(quiz_fruit_fr.this);
        alertDialogBuilder
                .setMessage("Votre score est " + mScore + " point")
                .setCancelable(false)
                .setPositiveButton("Repeter le test", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(),activity_test.class));

                    }
                })
                .setNegativeButton(" Terminer ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
      AlertDialog alertDialog=alertDialogBuilder.create();
      alertDialog.show();
    }
}
