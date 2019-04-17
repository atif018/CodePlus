package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java4);
    }

    public void startLoopsSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String javaSaveFour = sharedPref.getString("javaSaveFour", null);
        if (javaSaveFour != null) {
            switch (javaSaveFour) {
                case "JavaProgramQuiz18":
                    Intent intent2 = new Intent(this, JavaProgramQuiz18.class);
                    startActivity(intent2);
                    break;
                case "JavaFourSR1":
                    Intent intent3 = new Intent(this, JavaFourSR1.class);
                    startActivity(intent3);
                    break;
                case "JavaFourPointTwo":
                    Intent intent4 = new Intent(this, JavaFourPointTwo.class);
                    startActivity(intent4);
                    break;
                case "JavaProgramQuiz19":
                    Intent intent5 = new Intent(this, JavaProgramQuiz19.class);
                    startActivity(intent5);
                    break;
                case "JavaFourSR2":
                    Intent intent6 = new Intent(this, JavaFourSR2.class);
                    startActivity(intent6);
                    break;
                case "JavaFourPointThree":
                    Intent intent7 = new Intent(this, JavaFourPointThree.class);
                    startActivity(intent7);
                    break;
                case "JavaProgramQuiz20":
                    Intent intent8 = new Intent(this, JavaProgramQuiz20.class);
                    startActivity(intent8);
                    break;
                case "JavaFourSR3":
                    Intent intent9 = new Intent(this, JavaFourSR3.class);
                    startActivity(intent9);
                    break;
                case "JavaFourPointFour":
                    Intent intent10 = new Intent(this, JavaFourPointFour.class);
                    startActivity(intent10);
                    break;
                case "JavaProgramQuiz21":
                    Intent intent11 = new Intent(this, JavaProgramQuiz21.class);
                    startActivity(intent11);
                    break;
                case "JavaProgramQuiz22":
                    Intent intent12 = new Intent(this, JavaProgramQuiz22.class);
                    startActivity(intent12);
                    break;
                case "JavaFourSR4":
                    Intent intent13 = new Intent(this, JavaFourSR4.class);
                    startActivity(intent13);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, JavaFourPointOne.class);
            startActivity(intent);
        }
    }
}
