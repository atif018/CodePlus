package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava3 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java3);
    }

    public void startDecisionsSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String javaSaveThree = sharedPref.getString("javaSaveThree", null);
        if (javaSaveThree != null) {
            switch (javaSaveThree) {
                case "JavaProgramQuiz13":
                    Intent intent2 = new Intent(this, JavaProgramQuiz13.class);
                    startActivity(intent2);
                    break;
                case "JavaThreeSR1":
                    Intent intent3 = new Intent(this, JavaThreeSR1.class);
                    startActivity(intent3);
                    break;
                case "JavaThreePointTwo":
                    Intent intent4 = new Intent(this, JavaThreePointTwo.class);
                    startActivity(intent4);
                    break;
                case "JavaProgramQuiz14":
                    Intent intent5 = new Intent(this, JavaProgramQuiz14.class);
                    startActivity(intent5);
                    break;
                case "JavaThreeSR2":
                    Intent intent6 = new Intent(this, JavaThreeSR2.class);
                    startActivity(intent6);
                    break;
                case "JavaThreePointThree":
                    Intent intent7 = new Intent(this, JavaThreePointThree.class);
                    startActivity(intent7);
                    break;
                case "JavaProgramQuiz15":
                    Intent intent8 = new Intent(this, JavaProgramQuiz15.class);
                    startActivity(intent8);
                    break;
                case "JavaThreeSR3":
                    Intent intent9 = new Intent(this, JavaThreeSR3.class);
                    startActivity(intent9);
                    break;
                case "JavaThreePointFour":
                    Intent intent10 = new Intent(this, JavaThreePointFour.class);
                    startActivity(intent10);
                    break;
                case "JavaProgramQuiz16":
                    Intent intent11 = new Intent(this, JavaProgramQuiz16.class);
                    startActivity(intent11);
                    break;
                case "JavaProgramQuiz17":
                    Intent intent12 = new Intent(this, JavaProgramQuiz17.class);
                    startActivity(intent12);
                    break;
                case "JavaThreeSR4":
                    Intent intent13 = new Intent(this, JavaThreeSR4.class);
                    startActivity(intent13);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, JavaThreePointOne.class);
            startActivity(intent);
        }
    }
}
