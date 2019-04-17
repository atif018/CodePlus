package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java5);
    }

    public void startMethodsSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String javaSaveFive = sharedPref.getString("javaSaveFive", null);
        if (javaSaveFive != null) {
            switch (javaSaveFive) {
                case "JavaFiveSR1":
                    Intent intent2 = new Intent(this, JavaFiveSR1.class);
                    startActivity(intent2);
                    break;
                case "JavaFivePointTwo":
                    Intent intent3 = new Intent(this, JavaFivePointTwo.class);
                    startActivity(intent3);
                    break;
                case "JavaProgramQuiz23":
                    Intent intent4 = new Intent(this, JavaProgramQuiz23.class);
                    startActivity(intent4);
                    break;
                case "JavaFiveSR2":
                    Intent intent5 = new Intent(this, JavaFiveSR2.class);
                    startActivity(intent5);
                    break;
                case "JavaFivePointThree":
                    Intent intent6 = new Intent(this, JavaFivePointThree.class);
                    startActivity(intent6);
                    break;
                case "JavaProgramQuiz24":
                    Intent intent7 = new Intent(this, JavaProgramQuiz24.class);
                    startActivity(intent7);
                    break;
                case "JavaFiveSR3":
                    Intent intent8 = new Intent(this, JavaFiveSR3.class);
                    startActivity(intent8);
                    break;
                case "JavaFivePointFour":
                    Intent intent9 = new Intent(this, JavaFivePointFour.class);
                    startActivity(intent9);
                    break;
                case "JavaProgramQuiz25":
                    Intent intent10 = new Intent(this, JavaProgramQuiz25.class);
                    startActivity(intent10);
                    break;
                case "JavaProgramQuiz26":
                    Intent intent11 = new Intent(this, JavaProgramQuiz26.class);
                    startActivity(intent11);
                    break;
                case "JavaProgramQuiz27":
                    Intent intent12 = new Intent(this, JavaProgramQuiz27.class);
                    startActivity(intent12);
                    break;
                case "JavaFiveSR4":
                    Intent intent13 = new Intent(this, JavaFiveSR4.class);
                    startActivity(intent13);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, JavaFivePointOne.class);
            startActivity(intent);
        }
    }
}
