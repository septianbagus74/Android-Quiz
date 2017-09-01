package com.septianapp.androidquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.septianapp.androidquiz.CustomListView.CustomListMath;
import com.septianapp.androidquiz.quizAboutAndroid.QuizFiveAndroid;
import com.septianapp.androidquiz.quizAboutAndroid.QuizFourAndroid;
import com.septianapp.androidquiz.quizAboutAndroid.QuizOneAndroid;
import com.septianapp.androidquiz.quizAboutAndroid.QuizThreeAndroid;
import com.septianapp.androidquiz.quizAboutAndroid.QuizTwoAndroid;

public class QuizAndroid extends AppCompatActivity {

    ListView list;
    String[] android = {
            "Question Number One",
            "Question Number Two",
            "Question Number Three",
            "Question Number Four",
            "Question Number Five"
    };
    Integer[] imageId = {
            R.drawable.alpha,
            R.drawable.alpha,
            R.drawable.alpha,
            R.drawable.alpha,
            R.drawable.alpha
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_android);

        final CustomListMath adapter = new
                CustomListMath(this, android, imageId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(QuizAndroid.this, "Welcome to " + android[+position], Toast.LENGTH_SHORT).show();
                switch (android[position]){
                    case "Question Number One":
                        Intent goToOne = new Intent(QuizAndroid.this, QuizOneAndroid.class);
                        startActivity(goToOne);
                        break;
                    case "Question Number Two":
                        Intent goToTwo = new Intent(QuizAndroid.this, QuizTwoAndroid.class);
                        startActivity(goToTwo);
                        break;
                    case "Question Number Three":
                        Intent goToThree = new Intent(QuizAndroid.this, QuizThreeAndroid.class);
                        startActivity(goToThree);
                        break;
                    case "Question Number Four":
                        Intent goToFour = new Intent(QuizAndroid.this, QuizFourAndroid.class);
                        startActivity(goToFour);
                        break;
                    case "Question Number Five":
                        Intent goToFive = new Intent(QuizAndroid.this, QuizFiveAndroid.class);
                        startActivity(goToFive);
                        break;
                }
            }
        });
    }
}