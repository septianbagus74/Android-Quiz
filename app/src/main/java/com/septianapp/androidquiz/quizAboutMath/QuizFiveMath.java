package com.septianapp.androidquiz.quizAboutMath;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.septianapp.androidquiz.QuizMath;
import com.septianapp.androidquiz.R;

public class QuizFiveMath extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_five_math);

        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    public void onRadioButton(View view) {

        Boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton2:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton3:
                if (checked)
                    tampilDialog();
                break;
            case R.id.radioButton4:
                if (checked)
                    jawabanSalah();
                break;
        }
    }

    public void tampilDialog() {

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Yeaaay !!!");
        builder.setMessage("Your Already finish this Quiz!");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent goNext = new Intent(QuizFiveMath.this, QuizMath.class);
                startActivity(goNext);
                Toast.makeText(QuizFiveMath.this, "Congratulations", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Try Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                radiogroup.clearCheck();
            }
        });

        builder.create().show();

    }

    public void jawabanSalah(){

        Toast.makeText(this, "Wrong answer, please Try Again", Toast.LENGTH_SHORT).show();

    }
}