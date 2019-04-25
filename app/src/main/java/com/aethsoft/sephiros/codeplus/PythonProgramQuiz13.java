package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PythonProgramQuiz13 extends AppCompatActivity {
    
    private String answer = "yes";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_program_quiz13);

        EditText quizQuestion = (EditText) findViewById(R.id.quiz_input);
        quizQuestion.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String attemptedAnswer = v.getText().toString();
                String input = attemptedAnswer.toLowerCase();
                if (input.equals(answer)) {
                    Toast.makeText(getApplicationContext(), "That\'s correct!", Toast.LENGTH_LONG).show();
                    pythonThreeSR1();
                } else {
                    Toast.makeText(getApplicationContext(), "That is incorrect! Please try again!", Toast.LENGTH_LONG).show();

                }
                return false;
            }
        });
    }

    public void pythonThreeSR1() {

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
            intent = new Intent(this, PythonThreeSR1.class);
            editor.putString("pythonSaveThree", "PythonThreeSR1");
            editor.apply();
        } else {
            intent = new Intent(this, PythonThreePointTwo.class);
            editor.putString("pythonSaveThree", "PythonThreePointTwo");
            editor.apply();
        }
        startActivity(intent);
    }
}
