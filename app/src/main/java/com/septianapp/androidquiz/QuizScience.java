package com.septianapp.androidquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.septianapp.androidquiz.CustomListView.CustomListScience;
import com.septianapp.androidquiz.quizAboutScience.QuizFiveScience;
import com.septianapp.androidquiz.quizAboutScience.QuizFourScience;
import com.septianapp.androidquiz.quizAboutScience.QuizOneScience;
import com.septianapp.androidquiz.quizAboutScience.QuizThreeScience;
import com.septianapp.androidquiz.quizAboutScience.QuizTwoScience;

public class QuizScience extends AppCompatActivity {

    ListView list;
    String[] science = {
            "Question Number One",
            "Question Number Two",
            "Question Number Three",
            "Question Number Four",
            "Question Number Five"
    };
    Integer[] imageId = {
            R.drawable.oneandroid,
            R.drawable.twoandroid,
            R.drawable.threeandroid,
            R.drawable.fourandroid,
            R.drawable.fiveandroid
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_science);

        final CustomListScience adapter = new
                CustomListScience(this, science, imageId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(QuizScience.this, "Welcome to " + science[+position], Toast.LENGTH_SHORT).show();
                switch (science[position]){
                    case "Question Number One":
                        Intent goToOne = new Intent(QuizScience.this, QuizOneScience.class);
                        startActivity(goToOne);
                        break;
                    case "Question Number Two":
                        Intent goToTwo = new Intent(QuizScience.this, QuizTwoScience.class);
                        startActivity(goToTwo);
                        break;
                    case "Question Number Three":
                        Intent goToThree = new Intent(QuizScience.this, QuizThreeScience.class);
                        startActivity(goToThree);
                        break;
                    case "Question Number Four":
                        Intent goToFour = new Intent(QuizScience.this, QuizFourScience.class);
                        startActivity(goToFour);
                        break;
                    case "Question Number Five":
                        Intent goToFive = new Intent(QuizScience.this, QuizFiveScience.class);
                        startActivity(goToFive);
                        break;
                }
            }
        });
    }
}