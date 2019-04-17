package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava6 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java6);
    }

    public void startArraysSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String javaSaveSix = sharedPref.getString("javaSaveSix", null);
        if (javaSaveSix != null) {
            switch (javaSaveSix) {
                case "JavaSixPointOnePointOne":
                    Intent intent2 = new Intent(this, JavaSixPointOnePointOne.class);
                    startActivity(intent2);
                    break;
                case "JavaProgramQuiz28":
                    Intent intent3 = new Intent(this, JavaProgramQuiz28.class);
                    startActivity(intent3);
                    break;
                case "JavaSixSR1":
                    Intent intent4 = new Intent(this, JavaSixSR1.class);
                    startActivity(intent4);
                    break;
                case "JavaSixPointTwo":
                    Intent intent5 = new Intent(this, JavaSixPointTwo.class);
                    startActivity(intent5);
                    break;
                case "JavaProgramQuiz29":
                    Intent intent6 = new Intent(this, JavaProgramQuiz29.class);
                    startActivity(intent6);
                    break;
                case "JavaSixSR2":
                    Intent intent7 = new Intent(this, JavaSixSR2.class);
                    startActivity(intent7);
                    break;
                case "JavaSixPointThree":
                    Intent intent8 = new Intent(this, JavaSixPointThree.class);
                    startActivity(intent8);
                    break;
                case "JavaProgramQuiz30":
                    Intent intent9 = new Intent(this, JavaProgramQuiz30.class);
                    startActivity(intent9);
                    break;
                case "JavaSixSR3":
                    Intent intent10 = new Intent(this, JavaSixSR3.class);
                    startActivity(intent10);
                    break;
                case "JavaSixPointFour":
                    Intent intent11 = new Intent(this, JavaSixPointFour.class);
                    startActivity(intent11);
                    break;
                case "JavaProgramQuiz31":
                    Intent intent12 = new Intent(this, JavaProgramQuiz31.class);
                    startActivity(intent12);
                    break;
                case "JavaSixSR4":
                    Intent intent13 = new Intent(this, JavaSixSR4.class);
                    startActivity(intent13);
                    break;
                case "JavaSixPointFive":
                    Intent intent14 = new Intent(this, JavaSixPointFive.class);
                    startActivity(intent14);
                    break;
                case "JavaProgramQuiz32":
                    Intent intent15 = new Intent(this, JavaProgramQuiz32.class);
                    startActivity(intent15);
                    break;
                case "JavaSixSR5":
                    Intent intent16 = new Intent(this, JavaSixSR5.class);
                    startActivity(intent16);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, JavaSixPointOne.class);
            startActivity(intent);
        }
    }
}
