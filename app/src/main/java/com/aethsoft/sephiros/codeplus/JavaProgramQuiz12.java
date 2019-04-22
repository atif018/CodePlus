package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JavaProgramQuiz12 extends AppCompatActivity {

    private String answer = "camelcase";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_program_quiz12);

        EditText quizQuestion = (EditText) findViewById(R.id.quiz_input);
        quizQuestion.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String attemptedAnswer = v.getText().toString();
                String input = attemptedAnswer.toLowerCase();
                if (input.equals(answer)) {
                    Toast.makeText(getApplicationContext(), "Correct! You've completed Chapter 2!", Toast.LENGTH_LONG).show();
                    javaTwoSR3();
                } else {
                    Toast.makeText(getApplicationContext(), "That is incorrect! Please try again!", Toast.LENGTH_LONG).show();

                }
                return false;
            }
        });
    }

    public void javaTwoSR3() {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int srStatus = sharedPref.getInt("JavaSRActivate", -1);

        int getSRTopicNumber = sharedPref.getInt("endOfTopic", -1);

        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopic", 0);
            editor.apply();
            intent = new Intent(this, JavaSRTopics.class);
        }
        else if (srStatus == 1) {
            intent = new Intent(this, JavaTwoSR3.class);
            editor.putString("javaSaveTwo", "JavaTwoSR3");
            editor.apply();
        } else {
            intent = new Intent(this, StartJava3.class);
            editor.putString("javaSaveTwo", null);
            editor.apply();
        }
        startActivity(intent);
    }
}
