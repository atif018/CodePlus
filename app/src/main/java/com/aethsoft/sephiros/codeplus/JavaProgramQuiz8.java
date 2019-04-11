package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JavaProgramQuiz8 extends AppCompatActivity {

    private String answer = "increment";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_program_quiz8);

        EditText quizQuestion = (EditText) findViewById(R.id.quiz_input);
        quizQuestion.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
                String attemptedAnswer = v.getText().toString();
                String input = attemptedAnswer.toLowerCase();
                String fbName = sharedPref.getString("name", null);
                if (input.equals(answer)) {
                    Toast.makeText(getApplicationContext(), "Great stuff, " + fbName + "!", Toast.LENGTH_LONG).show();
                    javaTwoSR2();
                } else {
                    Toast.makeText(getApplicationContext(), "That is incorrect! Please try again!", Toast.LENGTH_LONG).show();

                }
                return false;
            }
        });
    }

    public void javaTwoSR2() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int srStatus = sharedPref.getInt("JavaSRActivate", -1);

        if (srStatus == 1) {
            intent = new Intent(this, JavaTwoSR2.class);
            editor.putString("save", "JavaTwoSR2");
            editor.commit();
        } else {
            intent = new Intent(this, JavaTwoPointThree.class);
            editor.putString("save", "JavaTwoPointThree");
            editor.commit();
        }
        startActivity(intent);
    }
}
