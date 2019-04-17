package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java7);
    }

    public void startClassesSection(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String javaSaveSeven = sharedPref.getString("javaSaveSeven", null);
        if (javaSaveSeven != null) {
            switch (javaSaveSeven) {
                case "JavaSevenPointOnePointOne":
                    Intent intent2 = new Intent(this, JavaSevenPointOnePointOne.class);
                    startActivity(intent2);
                    break;
                case "JavaSevenPointOnePointTwo":
                    Intent intent3 = new Intent(this, JavaSevenPointOnePointTwo.class);
                    startActivity(intent3);
                    break;
                case "JavaSevenPointOnePointThree":
                    Intent intent4 = new Intent(this, JavaSevenPointOnePointThree.class);
                    startActivity(intent4);
                    break;
                case "JavaSevenPointOnePointFour":
                    Intent intent5 = new Intent(this, JavaSevenPointOnePointFour.class);
                    startActivity(intent5);
                    break;
                case "JavaProgramQuiz33":
                    Intent intent6 = new Intent(this, JavaProgramQuiz33.class);
                    startActivity(intent6);
                    break;
                case "JavaSevenSR1":
                    Intent intent7 = new Intent(this, JavaSevenSR1.class);
                    startActivity(intent7);
                    break;
                case "JavaSevenPointTwo":
                    Intent intent8 = new Intent(this, JavaSevenPointTwo.class);
                    startActivity(intent8);
                    break;
                case "JavaSevenPointTwoPointOne":
                    Intent intent9 = new Intent(this, JavaSevenPointTwoPointOne.class);
                    startActivity(intent9);
                    break;
                case "JavaProgramQuiz34":
                    Intent intent10 = new Intent(this, JavaProgramQuiz34.class);
                    startActivity(intent10);
                    break;
                case "JavaSevenSR2":
                    Intent intent11 = new Intent(this, JavaSevenSR2.class);
                    startActivity(intent11);
                    break;
                case "JavaSevenPointThree":
                    Intent intent12 = new Intent(this, JavaSevenPointThree.class);
                    startActivity(intent12);
                    break;
                case "JavaProgramQuiz35":
                    Intent intent13 = new Intent(this, JavaProgramQuiz35.class);
                    startActivity(intent13);
                    break;
                case "JavaSevenSR3":
                    Intent intent14 = new Intent(this, JavaSevenSR3.class);
                    startActivity(intent14);
                    break;
                case "JavaComplete":
                    Intent intent15 = new Intent(this, JavaComplete.class);
                    startActivity(intent15);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, JavaSevenPointOne.class);
            startActivity(intent);
        }
    }
}
