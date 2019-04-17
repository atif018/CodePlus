package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava2 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java2);
    }

    public void startDataSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String javaSaveTwo = sharedPref.getString("javaSaveTwo", null);
        if (javaSaveTwo != null) {
            switch (javaSaveTwo) {
                case "JavaTwoPointOnePointOne":
                    Intent intent2 = new Intent(this, JavaTwoPointOnePointOne.class);
                    startActivity(intent2);
                    break;
                case "JavaTwoPointOnePointTwo":
                    Intent intent3 = new Intent(this, JavaTwoPointOnePointTwo.class);
                    startActivity(intent3);
                    break;
                case "JavaTwoPointOnePointThree":
                    Intent intent4 = new Intent(this, JavaTwoPointOnePointThree.class);
                    startActivity(intent4);
                    break;
                case "JavaProgramQuiz7":
                    Intent intent5 = new Intent(this, JavaProgramQuiz7.class);
                    startActivity(intent5);
                    break;
                case "JavaTwoSR1":
                    Intent intent6 = new Intent(this, JavaTwoSR1.class);
                    startActivity(intent6);
                    break;
                case "JavaTwoPointTwo":
                    Intent intent7 = new Intent(this, JavaTwoPointTwo.class);
                    startActivity(intent7);
                    break;
                case "JavaTwoPointTwoPointOne":
                    Intent intent8 = new Intent(this, JavaTwoPointTwoPointOne.class);
                    startActivity(intent8);
                    break;
                case "JavaProgramQuiz8":
                    Intent intent9 = new Intent(this, JavaProgramQuiz8.class);
                    startActivity(intent9);
                    break;
                case "JavaTwoSR2":
                    Intent intent10 = new Intent(this, JavaTwoSR2.class);
                    startActivity(intent10);
                    break;
                case "JavaTwoPointThree":
                    Intent intent11 = new Intent(this, JavaTwoPointThree.class);
                    startActivity(intent11);
                    break;
                case "JavaTwoPointThreePointOne":
                    Intent intent12 = new Intent(this, JavaTwoPointThreePointOne.class);
                    startActivity(intent12);
                    break;
                case "JavaProgramQuiz9":
                    Intent intent13 = new Intent(this, JavaProgramQuiz9.class);
                    startActivity(intent13);
                    break;
                case "JavaProgramQuiz10":
                    Intent intent14 = new Intent(this, JavaProgramQuiz10.class);
                    startActivity(intent14);
                    break;
                case "JavaProgramQuiz11":
                    Intent intent15 = new Intent(this, JavaProgramQuiz11.class);
                    startActivity(intent15);
                    break;
                case "JavaProgramQuiz12":
                    Intent intent16 = new Intent(this, JavaProgramQuiz12.class);
                    startActivity(intent16);
                    break;
                case "JavaTwoSR3":
                    Intent intent17 = new Intent(this, JavaTwoSR3.class);
                    startActivity(intent17);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, JavaTwoPointOne.class);
            startActivity(intent);
        }
    }
}
