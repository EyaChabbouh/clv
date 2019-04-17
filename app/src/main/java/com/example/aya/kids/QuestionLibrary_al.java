package com.example.aya.kids;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;


class QuestionLibrary_al extends PagerAdapter {
    LayoutInflater inflater;
    Context context;
    public int[] lst_images = {
            R.drawable.f2,
            R.drawable.co1,
            R.drawable.a5,
            R.drawable.leg10,
            R.drawable.f8,
            R.drawable.c2,
            R.drawable.co3,
            R.drawable.a12,
            R.drawable.f12,
            R.drawable.leg2,
            R.drawable.co5,
            R.drawable.c5,
            R.drawable.a1,
            R.drawable.leg7,
            R.drawable.f9,
            R.drawable.a7,
            R.drawable.c1


    };


    private String mChoices [][] = {
            {"Traube", "Aprikose", "Grün"},
            {"Betreten", "Augen", "Daumen"},
            {"Triangle", "Apple", "Ananase"},
             {"Traube", "Gelb", "Erbsen"},
            {"Granate", "Betrave", "Eyes"},
            {"Gelb", "Violett", "Schwarz"},
          {"Main", "Betrave", "Mouth"},
          {"Quadrat", "Rechteck", "Landschaft"},
             {"Banane", "Ananas", "Apfel"},
          {"SPINAT", "Traube", "Aprikose"},
            {"Mund", "Hals", "Nase"},
           {"Blau", "Violett", "Rose"},
           {"Rechteck", "Kreis", "Kegel"},
            {"Blumenkohl", "Kartoffel-Erde", "Erbsen"},
         {"Orange", "Datum", "Fig"},
          {"Cuboid", "Herz", "Diamont"},
           {"Gelb", "Blau", "Schwarz"}

    };



    private String mCorrectAnswers[] = {"Traube", "Augen", "Triangle", "Erbsen", "Granate", "Violett", "Mouth", "Quadrat",
"Aprikose", "SPINACH", "Hals", "Rose", "Rechteck", "Apfel-Erde", "Birne", "Cuboid", "Black"};


public int getLength(){return lst_images.length;}


    public int getQuestion(int a) {
        int question = lst_images[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;

    }



}


