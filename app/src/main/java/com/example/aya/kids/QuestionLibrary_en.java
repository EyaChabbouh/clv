package com.example.aya.kids;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;


class QuestionLibrary_en extends PagerAdapter {
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


    private String mChoices_en [][] = {
            {"Grape", "Apricot", "Green"},
            {"Betrave", "Eyes", "Thumb"},
            {"Triangle", "Apple", "Ananase"},
            {"Grape", "Yellow", "Peas"},
            {"Grenade", "Betrave", "Eyes"},
            {"Yellow", "Violet", "Black"},
            {"Main", "Betrave", "Mouth"},
            {"Square", "Rectangle", "Landscape"},
            {"Banana", "Pineapple", "Apple"},
            {"SPINACH", "Grape", "Apricot"},
            {"Mouth", "Neck", "Nose"},
            {"Blue", "Violet", "Rose"},
            {"Rectangle", "Circle", "Cone"},
            {"Cauliflower", "Potato-Earth", "Peas"},
            {"Orange", "Date", "Fig"},
            {"Cuboid", "Heart", "Diamont"},
             {"Yellow", "Blue", "Black"}

    };



    private String mCorrectAnswers_en[] = {"Grape", "Eyes", "Triangle", "Peas", "Grenade", "Purple", "Mouth", "Square",
"Apricot", "SPINACH", "Neck", "Rose", "Rectangle", "Apple-Earth", "pear", "Cuboid", "Black"};





    public int getQuestion(int a) {
        int question = lst_images[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices_en[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices_en[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices_en[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers_en[a];
        return answer;
    }
    public String getresultat(int a) {
        String result = mCorrectAnswers_en[a];
        return result;
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


