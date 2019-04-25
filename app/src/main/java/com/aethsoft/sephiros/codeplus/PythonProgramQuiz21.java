package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PythonProgramQuiz21 extends AppCompatActivity {

    private String answer = "while";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_program_quiz21);

        EditText quizQuestion = (EditText) findViewById(R.id.quiz_input);
        quizQuestion.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String attemptedAnswer = v.getText().toString();
                String input = attemptedAnswer.toLowerCase();
                if (input.equals(answer)) {
                    Toast.makeText(getApplicationContext(), "That is correct! Well done!", Toast.LENGTH_LONG).show();
                    pythonProgramQuiz22();
                } else {
                    Toast.makeText(getApplicationContext(), "That is incorrect! Please try again!", Toast.LENGTH_LONG).show();

                }
                return false;
            }
        });
    }

    public void pythonProgramQuiz22() {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonSaveFour", "PythonProgramQuiz22");
        editor.apply();

        Intent intent = new Intent(this, PythonProgramQuiz22.class);
        startActivity(intent);
    }
}
