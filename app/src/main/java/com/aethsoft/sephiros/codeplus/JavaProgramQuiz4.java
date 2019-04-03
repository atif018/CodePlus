package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JavaProgramQuiz4 extends AppCompatActivity {

    private String answer = "algorithm";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_program_quiz4);

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
                    javaOneSR3();
                } else {
                    Toast.makeText(getApplicationContext(), "That is incorrect! Please try again!", Toast.LENGTH_LONG).show();

                }
                return false;
            }
        });
    }

    public void javaOneSR3() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int srStatus = sharedPref.getInt("JavaSRActivate", -1);
        editor.putString("topic1save", "onefour");
        editor.commit();

        if (srStatus == 1) {
            intent = new Intent(this, JavaOneSR3.class);
        } else {
            intent = new Intent(this, JavaOnePointFour.class);
        }
        startActivity(intent);
    }
}
