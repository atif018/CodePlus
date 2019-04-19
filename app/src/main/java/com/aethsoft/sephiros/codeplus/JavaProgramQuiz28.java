package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JavaProgramQuiz28 extends AppCompatActivity {

    private String answer = "2";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_program_quiz28);

        EditText quizQuestion = (EditText) findViewById(R.id.quiz_input);
        quizQuestion.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String attemptedAnswer = v.getText().toString();
                String input = attemptedAnswer.toLowerCase();
                if (input.equals(answer)) {
                    Toast.makeText(getApplicationContext(), "Great stuff!", Toast.LENGTH_LONG).show();
                    javaSixSR1();
                } else {
                    Toast.makeText(getApplicationContext(), "That is incorrect! Please try again!", Toast.LENGTH_LONG).show();

                }
                return false;
            }
        });
    }

    public void javaSixSR1() {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int srStatus = sharedPref.getInt("JavaSRActivate", -1);

        if (srStatus == 1) {
            intent = new Intent(this, JavaSixSR1.class);
            editor.putString("javaSaveSix", "JavaSixSR1");
            editor.commit();
        } else {
            intent = new Intent(this, JavaSixPointTwo.class);
            editor.putString("javaSaveSix", "JavaSixPointTwo");
            editor.commit();
        }
        startActivity(intent);
    }
}
