package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PythonProgramQuiz extends AppCompatActivity {

    private String answer = "one";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_program_quiz);

        EditText quizQuestion = (EditText) findViewById(R.id.quiz_input);
        quizQuestion.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String attemptedAnswer = v.getText().toString();
                String input = attemptedAnswer.toLowerCase();
                if (input.equals(answer)) {
                    Toast.makeText(getApplicationContext(), "That is correct! Well done!", Toast.LENGTH_LONG).show();
                    pythonOneSR2();
                } else {
                    Toast.makeText(getApplicationContext(), "That is incorrect! Please try again!", Toast.LENGTH_LONG).show();
                }
                return false;
            }
        });
    }

    public void pythonOneSR2() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int srStatus = sharedPref.getInt("PythonSRActivate", -1);

        int getSRTopicNumber = sharedPref.getInt("endOfTopic2", -1);

        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopic2", 0);
            editor.apply();
            intent = new Intent(this, PythonSRTopics.class);
        }
        else if (srStatus == 1) {
            intent = new Intent(this, PythonOneSR2.class);
            editor.putString("pythonSaveOne", "PythonOneSR2");
            editor.apply();
        } else {
            intent = new Intent(this, PythonOnePointThree.class);
            editor.putString("pythonSaveOne", "PythonOnePointThree");
            editor.apply();
        }
        startActivity(intent);
    }

}
