package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartPython7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_python7);
    }

    public void startPythonSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonTopicSave", "StartPython7");
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

    public void startDataSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonTopicSave", "StartPython7");
        editor.apply();
        String pythonSaveTwo = sharedPref.getString("pythonSaveTwo", null);
        if (pythonSaveTwo != null) {
            switch (pythonSaveTwo) {
                case "PythonTwoPointOnePointOne":
                    Intent intent2 = new Intent(this, PythonTwoPointOnePointOne.class);
                    startActivity(intent2);
                    break;
                case "PythonTwoPointOnePointTwo":
                    Intent intent3 = new Intent(this, PythonTwoPointOnePointTwo.class);
                    startActivity(intent3);
                    break;
                case "PythonTwoPointOnePointThree":
                    Intent intent4 = new Intent(this, PythonTwoPointOnePointThree.class);
                    startActivity(intent4);
                    break;
                case "PythonProgramQuiz7":
                    Intent intent5 = new Intent(this, PythonProgramQuiz7.class);
                    startActivity(intent5);
                    break;
                case "PythonTwoSR1":
                    Intent intent6 = new Intent(this, PythonTwoSR1.class);
                    startActivity(intent6);
                    break;
                case "PythonTwoPointTwo":
                    Intent intent7 = new Intent(this, PythonTwoPointTwo.class);
                    startActivity(intent7);
                    break;
                case "PythonTwoPointTwoPointOne":
                    Intent intent8 = new Intent(this, PythonTwoPointTwoPointOne.class);
                    startActivity(intent8);
                    break;
                case "PythonProgramQuiz8":
                    Intent intent9 = new Intent(this, PythonProgramQuiz8.class);
                    startActivity(intent9);
                    break;
                case "PythonTwoSR2":
                    Intent intent10 = new Intent(this, PythonTwoSR2.class);
                    startActivity(intent10);
                    break;
                case "PythonTwoPointThree":
                    Intent intent11 = new Intent(this, PythonTwoPointThree.class);
                    startActivity(intent11);
                    break;
                case "PythonTwoPointThreePointOne":
                    Intent intent12 = new Intent(this, PythonTwoPointThreePointOne.class);
                    startActivity(intent12);
                    break;
                case "PythonProgramQuiz9":
                    Intent intent13 = new Intent(this, PythonProgramQuiz9.class);
                    startActivity(intent13);
                    break;
                case "PythonProgramQuiz10":
                    Intent intent14 = new Intent(this, PythonProgramQuiz10.class);
                    startActivity(intent14);
                    break;
                case "PythonProgramQuiz11":
                    Intent intent15 = new Intent(this, PythonProgramQuiz11.class);
                    startActivity(intent15);
                    break;
                case "PythonProgramQuiz12":
                    Intent intent16 = new Intent(this, PythonProgramQuiz12.class);
                    startActivity(intent16);
                    break;
                case "PythonTwoSR3":
                    Intent intent17 = new Intent(this, PythonTwoSR3.class);
                    startActivity(intent17);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, PythonTwoPointOne.class);
            startActivity(intent);
        }
    }

    public void startDecisionsSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonTopicSave", "StartPython7");
        editor.apply();
        String pythonSaveThree = sharedPref.getString("pythonSaveThree", null);
        if (pythonSaveThree != null) {
            switch (pythonSaveThree) {
                case "PythonProgramQuiz13":
                    Intent intent2 = new Intent(this, PythonProgramQuiz13.class);
                    startActivity(intent2);
                    break;
                case "PythonThreeSR1":
                    Intent intent3 = new Intent(this, PythonThreeSR1.class);
                    startActivity(intent3);
                    break;
                case "PythonThreePointTwo":
                    Intent intent4 = new Intent(this, PythonThreePointTwo.class);
                    startActivity(intent4);
                    break;
                case "PythonProgramQuiz14":
                    Intent intent5 = new Intent(this, PythonProgramQuiz14.class);
                    startActivity(intent5);
                    break;
                case "PythonThreeSR2":
                    Intent intent6 = new Intent(this, PythonThreeSR2.class);
                    startActivity(intent6);
                    break;
                case "PythonThreePointThree":
                    Intent intent7 = new Intent(this, PythonThreePointThree.class);
                    startActivity(intent7);
                    break;
                case "PythonProgramQuiz15":
                    Intent intent8 = new Intent(this, PythonProgramQuiz15.class);
                    startActivity(intent8);
                    break;
                case "PythonThreeSR3":
                    Intent intent9 = new Intent(this, PythonThreeSR3.class);
                    startActivity(intent9);
                    break;
                case "PythonThreePointFour":
                    Intent intent10 = new Intent(this, PythonThreePointFour.class);
                    startActivity(intent10);
                    break;
                case "PythonProgramQuiz16":
                    Intent intent11 = new Intent(this, PythonProgramQuiz16.class);
                    startActivity(intent11);
                    break;
                case "PythonProgramQuiz17":
                    Intent intent12 = new Intent(this, PythonProgramQuiz17.class);
                    startActivity(intent12);
                    break;
                case "PythonThreeSR4":
                    Intent intent13 = new Intent(this, PythonThreeSR4.class);
                    startActivity(intent13);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, PythonThreePointOne.class);
            startActivity(intent);
        }
    }

    public void startLoopsSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonTopicSave", "StartPython7");
        editor.apply();
        String pythonSaveFour = sharedPref.getString("pythonSaveFour", null);
        if (pythonSaveFour != null) {
            switch (pythonSaveFour) {
                case "PythonProgramQuiz18":
                    Intent intent2 = new Intent(this, PythonProgramQuiz18.class);
                    startActivity(intent2);
                    break;
                case "PythonFourSR1":
                    Intent intent3 = new Intent(this, PythonFourSR1.class);
                    startActivity(intent3);
                    break;
                case "PythonFourPointTwo":
                    Intent intent4 = new Intent(this, PythonFourPointTwo.class);
                    startActivity(intent4);
                    break;
                case "PythonProgramQuiz19":
                    Intent intent5 = new Intent(this, PythonProgramQuiz19.class);
                    startActivity(intent5);
                    break;
                case "PythonFourSR2":
                    Intent intent6 = new Intent(this, PythonFourSR2.class);
                    startActivity(intent6);
                    break;
                case "PythonFourPointThree":
                    Intent intent7 = new Intent(this, PythonFourPointThree.class);
                    startActivity(intent7);
                    break;
                case "PythonProgramQuiz20":
                    Intent intent8 = new Intent(this, PythonProgramQuiz20.class);
                    startActivity(intent8);
                    break;
                case "PythonFourSR3":
                    Intent intent9 = new Intent(this, PythonFourSR3.class);
                    startActivity(intent9);
                    break;
                case "PythonFourPointFour":
                    Intent intent10 = new Intent(this, PythonFourPointFour.class);
                    startActivity(intent10);
                    break;
                case "PythonProgramQuiz21":
                    Intent intent11 = new Intent(this, PythonProgramQuiz21.class);
                    startActivity(intent11);
                    break;
                case "PythonProgramQuiz22":
                    Intent intent12 = new Intent(this, PythonProgramQuiz22.class);
                    startActivity(intent12);
                    break;
                case "PythonFourSR4":
                    Intent intent13 = new Intent(this, PythonFourSR4.class);
                    startActivity(intent13);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, PythonFourPointOne.class);
            startActivity(intent);
        }
    }

    public void startMethodsSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonTopicSave", "StartPython7");
        editor.apply();
        String pythonSaveFive = sharedPref.getString("pythonSaveFive", null);
        if (pythonSaveFive != null) {
            switch (pythonSaveFive) {
                case "PythonFiveSR1":
                    Intent intent2 = new Intent(this, PythonFiveSR1.class);
                    startActivity(intent2);
                    break;
                case "PythonFivePointTwo":
                    Intent intent3 = new Intent(this, PythonFivePointTwo.class);
                    startActivity(intent3);
                    break;
                case "PythonProgramQuiz23":
                    Intent intent4 = new Intent(this, PythonProgramQuiz23.class);
                    startActivity(intent4);
                    break;
                case "PythonFiveSR2":
                    Intent intent5 = new Intent(this, PythonFiveSR2.class);
                    startActivity(intent5);
                    break;
                case "PythonFivePointThree":
                    Intent intent6 = new Intent(this, PythonFivePointThree.class);
                    startActivity(intent6);
                    break;
                case "PythonProgramQuiz24":
                    Intent intent7 = new Intent(this, PythonProgramQuiz24.class);
                    startActivity(intent7);
                    break;
                case "PythonFiveSR3":
                    Intent intent8 = new Intent(this, PythonFiveSR3.class);
                    startActivity(intent8);
                    break;
                case "PythonFivePointFour":
                    Intent intent9 = new Intent(this, PythonFivePointFour.class);
                    startActivity(intent9);
                    break;
                case "PythonProgramQuiz25":
                    Intent intent10 = new Intent(this, PythonProgramQuiz25.class);
                    startActivity(intent10);
                    break;
                case "PythonProgramQuiz26":
                    Intent intent11 = new Intent(this, PythonProgramQuiz26.class);
                    startActivity(intent11);
                    break;
                case "PythonProgramQuiz27":
                    Intent intent12 = new Intent(this, PythonProgramQuiz27.class);
                    startActivity(intent12);
                    break;
                case "PythonFiveSR4":
                    Intent intent13 = new Intent(this, PythonFiveSR4.class);
                    startActivity(intent13);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, PythonFivePointOne.class);
            startActivity(intent);
        }
    }

    public void startArraysSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonTopicSave", "StartPython7");
        editor.apply();
        String pythonSaveSix = sharedPref.getString("pythonSaveSix", null);
        if (pythonSaveSix != null) {
            switch (pythonSaveSix) {
                case "PythonSixPointOnePointOne":
                    Intent intent2 = new Intent(this, PythonSixPointOnePointOne.class);
                    startActivity(intent2);
                    break;
                case "PythonProgramQuiz28":
                    Intent intent3 = new Intent(this, PythonProgramQuiz28.class);
                    startActivity(intent3);
                    break;
                case "PythonSixSR1":
                    Intent intent4 = new Intent(this, PythonSixSR1.class);
                    startActivity(intent4);
                    break;
                case "PythonSixPointTwo":
                    Intent intent5 = new Intent(this, PythonSixPointTwo.class);
                    startActivity(intent5);
                    break;
                case "PythonProgramQuiz29":
                    Intent intent6 = new Intent(this, PythonProgramQuiz29.class);
                    startActivity(intent6);
                    break;
                case "PythonSixSR2":
                    Intent intent7 = new Intent(this, PythonSixSR2.class);
                    startActivity(intent7);
                    break;
                case "PythonSixPointThree":
                    Intent intent8 = new Intent(this, PythonSixPointThree.class);
                    startActivity(intent8);
                    break;
                case "PythonProgramQuiz30":
                    Intent intent9 = new Intent(this, PythonProgramQuiz30.class);
                    startActivity(intent9);
                    break;
                case "PythonSixSR3":
                    Intent intent10 = new Intent(this, PythonSixSR3.class);
                    startActivity(intent10);
                    break;
                case "PythonSixPointFour":
                    Intent intent11 = new Intent(this, PythonSixPointFour.class);
                    startActivity(intent11);
                    break;
                case "PythonProgramQuiz31":
                    Intent intent12 = new Intent(this, PythonProgramQuiz31.class);
                    startActivity(intent12);
                    break;
                case "PythonSixSR4":
                    Intent intent13 = new Intent(this, PythonSixSR4.class);
                    startActivity(intent13);
                    break;
                case "PythonSixPointFive":
                    Intent intent14 = new Intent(this, PythonSixPointFive.class);
                    startActivity(intent14);
                    break;
                case "PythonProgramQuiz32":
                    Intent intent15 = new Intent(this, PythonProgramQuiz32.class);
                    startActivity(intent15);
                    break;
                case "PythonSixSR5":
                    Intent intent16 = new Intent(this, PythonSixSR5.class);
                    startActivity(intent16);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, PythonSixPointOne.class);
            startActivity(intent);
        }
    }

    public void startClassesSection(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonTopicSave", "StartPython7");
        editor.apply();
        String pythonSaveSeven = sharedPref.getString("pythonSaveSeven", null);
        if (pythonSaveSeven != null) {
            switch (pythonSaveSeven) {
                case "PythonSevenPointOnePointOne":
                    Intent intent2 = new Intent(this, PythonSevenPointOnePointOne.class);
                    startActivity(intent2);
                    break;
                case "PythonSevenPointOnePointTwo":
                    Intent intent3 = new Intent(this, PythonSevenPointOnePointTwo.class);
                    startActivity(intent3);
                    break;
                case "PythonSevenPointOnePointThree":
                    Intent intent4 = new Intent(this, PythonSevenPointOnePointThree.class);
                    startActivity(intent4);
                    break;
                case "PythonSevenPointOnePointFour":
                    Intent intent5 = new Intent(this, PythonSevenPointOnePointFour.class);
                    startActivity(intent5);
                    break;
                case "PythonProgramQuiz33":
                    Intent intent6 = new Intent(this, PythonProgramQuiz33.class);
                    startActivity(intent6);
                    break;
                case "PythonSevenSR1":
                    Intent intent7 = new Intent(this, PythonSevenSR1.class);
                    startActivity(intent7);
                    break;
                case "PythonSevenPointTwo":
                    Intent intent8 = new Intent(this, PythonSevenPointTwo.class);
                    startActivity(intent8);
                    break;
                case "PythonSevenPointTwoPointOne":
                    Intent intent9 = new Intent(this, PythonSevenPointTwoPointOne.class);
                    startActivity(intent9);
                    break;
                case "PythonProgramQuiz34":
                    Intent intent10 = new Intent(this, PythonProgramQuiz34.class);
                    startActivity(intent10);
                    break;
                case "PythonSevenSR2":
                    Intent intent11 = new Intent(this, PythonSevenSR2.class);
                    startActivity(intent11);
                    break;
                case "PythonSevenPointThree":
                    Intent intent12 = new Intent(this, PythonSevenPointThree.class);
                    startActivity(intent12);
                    break;
                case "PythonProgramQuiz35":
                    Intent intent13 = new Intent(this, PythonProgramQuiz35.class);
                    startActivity(intent13);
                    break;
                case "PythonSevenSR3":
                    Intent intent14 = new Intent(this, PythonSevenSR3.class);
                    startActivity(intent14);
                    break;
                case "PythonComplete":
                    Intent intent15 = new Intent(this, PythonComplete.class);
                    startActivity(intent15);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, PythonSevenPointOne.class);
            startActivity(intent);
        }
    }
}
