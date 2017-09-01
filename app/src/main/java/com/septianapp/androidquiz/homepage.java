package com.septianapp.androidquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void goToAndroidActivity(View view) {
        Intent go_android = new Intent(this, QuizAndroid.class);
        Toast.makeText(this, "Lets Begin?", Toast.LENGTH_SHORT).show();
        startActivity(go_android);
    }

    public void goToMathActivity(View view) {
        Intent go_math = new Intent(this, QuizMath.class);
        Toast.makeText(this, "Are you Ready?", Toast.LENGTH_SHORT).show();
        startActivity(go_math);
    }

    public void goToScienceActivity(View view) {
        Intent go_science = new Intent(this, QuizScience.class);
        Toast.makeText(this, "Go go go!", Toast.LENGTH_SHORT).show();
        startActivity(go_science);
    }
}
