package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JavaProgramQuiz extends AppCompatActivity {

    private String answer = "one";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_program_quiz);

        EditText quizQuestion = (EditText) findViewById(R.id.quiz_input);
        quizQuestion.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    String attemptedAnswer = v.getText().toString();
                    String input = attemptedAnswer.toLowerCase();
                    if (input.equals(answer)) {
                        Toast.makeText(getApplicationContext(), "That is correct! Well done!", Toast.LENGTH_LONG).show();
                        javaOneSR2();
                    } else {
                        Toast.makeText(getApplicationContext(), "That is incorrect! Please try again!", Toast.LENGTH_LONG).show();
                    }
                    return false;
                }
        });
    }

    public void javaOneSR2() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int srStatus = sharedPref.getInt("JavaSRActivate", -1);

        if (srStatus == 1) {
            intent = new Intent(this, JavaOneSR2.class);
            editor.putString("javaSaveOne", "JavaOneSR2");
        } else {
            intent = new Intent(this, JavaOnePointThree.class);
            editor.putString("javaSaveOne", "JavaOnePointThree");
        }
        editor.commit();
        startActivity(intent);
    }

}
