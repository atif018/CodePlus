package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartPython extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_python);
    }

    public void startPythonSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonTopicSave", "StartPython");
        editor.apply();
        String pythonSaveOne = sharedPref.getString("pythonSaveOne", null);
        if (pythonSaveOne != null) {
            switch (pythonSaveOne) {
                case "PythonOnePointOne":
                    Intent intent2 = new Intent(this, PythonOnePointOne.class);
                    startActivity(intent2);
                    break;
                case "PythonOneSR1":
                    Intent intent3 = new Intent(this, PythonOneSR1.class);
                    startActivity(intent3);
                    break;
                case "PythonOnePointTwo":
                    Intent intent4 = new Intent(this, PythonOnePointTwo.class);
                    startActivity(intent4);
                    break;
                case "PythonOnePointTwoPointOne":
                    Intent intent5 = new Intent(this, PythonOnePointTwoPointOne.class);
                    startActivity(intent5);
                    break;
                case "PythonOnePointTwoPointTwo":
                    Intent intent6 = new Intent(this, PythonOnePointTwoPointTwo.class);
                    startActivity(intent6);
                    break;
                case "PythonOnePointTwoPointThree":
                    Intent intent7 = new Intent(this, PythonOnePointTwoPointThree.class);
                    startActivity(intent7);
                    break;
                case "PythonProgramQuiz":
                    Intent intent8 = new Intent(this, PythonProgramQuiz.class);
                    startActivity(intent8);
                    break;
                case "PythonOneSR2":
                    Intent intent9 = new Intent(this, PythonOneSR2.class);
                    startActivity(intent9);
                    break;
                case "PythonOnePointThree":
                    Intent intent10 = new Intent(this, PythonOnePointThree.class);
                    startActivity(intent10);
                    break;
                case "PythonProgramQuiz4":
                    Intent intent11 = new Intent(this, PythonProgramQuiz4.class);
                    startActivity(intent11);
                    break;
                case "PythonOneSR3":
                    Intent intent12 = new Intent(this, PythonOneSR3.class);
                    startActivity(intent12);
                    break;
                case "PythonOnePointFour":
                    Intent intent13 = new Intent(this, PythonOnePointFour.class);
                    startActivity(intent13);
                    break;
                case "PythonProgramQuiz2":
                    Intent intent14 = new Intent(this, PythonProgramQuiz2.class);
                    startActivity(intent14);
                    break;
                case "PythonProgramQuiz3":
                    Intent intent15 = new Intent(this, PythonProgramQuiz3.class);
                    startActivity(intent15);
                    break;
                case "PythonProgramQuiz5":
                    Intent intent16 = new Intent(this, PythonProgramQuiz5.class);
                    startActivity(intent16);
                    break;
                case "PythonProgramQuiz6":
                    Intent intent17 = new Intent(this, PythonProgramQuiz6.class);
                    startActivity(intent17);
                    break;
                case "PythonOneSR4":
                    Intent intent18 = new Intent(this, PythonOneSR4.class);
                    startActivity(intent18);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, PythonSRQuestion.class);
            startActivity(intent);
        }
    }
}
