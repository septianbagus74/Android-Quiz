package com.septianapp.androidquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.septianapp.androidquiz.CustomListView.CustomListMath;
import com.septianapp.androidquiz.quizAboutMath.QuizFiveMath;
import com.septianapp.androidquiz.quizAboutMath.QuizFourMath;
import com.septianapp.androidquiz.quizAboutMath.QuizOneMath;
import com.septianapp.androidquiz.quizAboutMath.QuizThreeMath;
import com.septianapp.androidquiz.quizAboutMath.QuizTwoMath;

public class QuizMath extends AppCompatActivity {

    ListView list;
    String[] math = {
            "Question Number One",
            "Question Number Two",
            "Question Number Three",
            "Question Number Four",
            "Question Number Five"
    };
    Integer[] imageId = {
            R.drawable.math,
            R.drawable.math,
            R.drawable.math,
            R.drawable.math,
            R.drawable.math
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_math);

        final CustomListMath adapter = new
                CustomListMath(this, math, imageId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(QuizMath.this, "Welcome to " + math[+position], Toast.LENGTH_SHORT).show();
                switch (math[position]){
                    case "Question Number One":
                        Intent goToOne = new Intent(QuizMath.this, QuizOneMath.class);
                        startActivity(goToOne);
                        break;
                    case "Question Number Two":
                        Intent goToTwo = new Intent(QuizMath.this, QuizTwoMath.class);
                        startActivity(goToTwo);
                        break;
                    case "Question Number Three":
                        Intent goToThree = new Intent(QuizMath.this, QuizThreeMath.class);
                        startActivity(goToThree);
                        break;
                    case "Question Number Four":
                        Intent goToFour = new Intent(QuizMath.this, QuizFourMath.class);
                        startActivity(goToFour);
                        break;
                    case "Question Number Five":
                        Intent goToFive = new Intent(QuizMath.this, QuizFiveMath.class);
                        startActivity(goToFive);
                        break;
                }
            }
        });
    }
}