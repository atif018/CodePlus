package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class StartJava extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java);
    }

    public void startJavaSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String topicOneSaves = sharedPref.getString("topic1save", null);
        if (topicOneSaves != null) {
            if (topicOneSaves.equals("onetwo")) {
                intent = new Intent(this, JavaOnePointTwo.class);
            }
            else if (topicOneSaves.equals("onetwoone")) {
                intent = new Intent(this, JavaOnePointTwoPointOne.class);
            }
            else if (topicOneSaves.equals("onetwotwo")) {
                intent = new Intent(this, JavaOnePointTwoPointTwo.class);
            }
            else if (topicOneSaves.equals("onetwothree")) {
                intent = new Intent(this, JavaOnePointTwoPointThree.class);
            }
            else if (topicOneSaves.equals("onethree")) {
                intent = new Intent(this, JavaOnePointThree.class);
            }
            else if (topicOneSaves.equals("onefour")) {
                intent = new Intent(this, JavaOnePointFour.class);
            }
            else if (topicOneSaves.equals("onequizone")) {
                intent = new Intent(this, JavaProgramQuiz.class);
            }
            else if (topicOneSaves.equals("onequiztwo")) {
                intent = new Intent(this, JavaProgramQuiz2.class);
            }
            else if (topicOneSaves.equals("onequizthree")) {
                intent = new Intent(this, JavaProgramQuiz3.class);
            }
            else if (topicOneSaves.equals("onequizfour")) {
                intent = new Intent(this, JavaProgramQuiz4.class);
            }
            else if (topicOneSaves.equals("onequizfive")) {
                intent = new Intent(this, JavaProgramQuiz5.class);
            }
            else if (topicOneSaves.equals("onequizsix")) {
                intent = new Intent(this, JavaProgramQuiz6.class);
            }
        }
        else {
            intent = new Intent(this, JavaSRQuestion.class);
        }
        startActivity(intent);
    }
}
