package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonSRTopics extends AppCompatActivity {
    
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_srtopics);
    }

    public void nextSRTopic(View view) {

        for (int i = 1; i < 28; i++) {

            SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
            SharedPreferences.Editor editor = sharedPref.edit();

            String srCurrent = "PSR" + i;

            int srI = sharedPref.getInt(srCurrent, -1);

            if (srI <= 0) {
                editor.putInt("endOfTopic2", 1);
                editor.apply();
                editor.putInt(srCurrent, 10000);
                editor.apply();
                switch (srCurrent) {
                    case "PSR1":
                        intent = new Intent(this, PythonOnePointOne.class);
                        startActivity(intent);
                        break;
                    case "PSR2":
                        intent = new Intent(this, PythonOnePointTwo.class);
                        startActivity(intent);
                        break;
                    case "PSR3":
                        intent = new Intent(this, PythonOnePointThree.class);
                        startActivity(intent);
                        break;
                    case "PSR4":
                        intent = new Intent(this, PythonOnePointFour.class);
                        startActivity(intent);
                        break;
                    case "PSR5":
                        intent = new Intent(this, PythonTwoPointOne.class);
                        startActivity(intent);
                        break;
                    case "PSR6":
                        intent = new Intent(this, PythonTwoPointTwo.class);
                        startActivity(intent);
                        break;
                    case "PSR7":
                        intent = new Intent(this, PythonTwoPointThree.class);
                        startActivity(intent);
                        break;
                    case "PSR8":
                        intent = new Intent(this, PythonThreePointOne.class);
                        startActivity(intent);
                        break;
                    case "PSR9":
                        intent = new Intent(this, PythonThreePointTwo.class);
                        startActivity(intent);
                        break;
                    case "PSR10":
                        intent = new Intent(this, PythonThreePointThree.class);
                        startActivity(intent);
                        break;
                    case "PSR11":
                        intent = new Intent(this, PythonThreePointFour.class);
                        startActivity(intent);
                        break;
                    case "PSR12":
                        intent = new Intent(this, PythonFourPointOne.class);
                        startActivity(intent);
                        break;
                    case "PSR13":
                        intent = new Intent(this, PythonFourPointTwo.class);
                        startActivity(intent);
                        break;
                    case "PSR14":
                        intent = new Intent(this, PythonFourPointThree.class);
                        startActivity(intent);
                        break;
                    case "PSR15":
                        intent = new Intent(this, PythonFourPointFour.class);
                        startActivity(intent);
                        break;
                    case "PSR16":
                        intent = new Intent(this, PythonFivePointOne.class);
                        startActivity(intent);
                        break;
                    case "PSR17":
                        intent = new Intent(this, PythonFivePointTwo.class);
                        startActivity(intent);
                        break;
                    case "PSR18":
                        intent = new Intent(this, PythonFourPointThree.class);
                        startActivity(intent);
                        break;
                    case "PSR19":
                        intent = new Intent(this, PythonFivePointFour.class);
                        startActivity(intent);
                        break;
                    case "PSR20":
                        intent = new Intent(this, PythonSixPointOne.class);
                        startActivity(intent);
                        break;
                    case "PSR21":
                        intent = new Intent(this, PythonSixPointTwo.class);
                        startActivity(intent);
                        break;
                    case "PSR22":
                        intent = new Intent(this, PythonSixPointThree.class);
                        startActivity(intent);
                        break;
                    case "PSR23":
                        intent = new Intent(this, PythonSixPointFour.class);
                        startActivity(intent);
                        break;
                    case "PSR24":
                        intent = new Intent(this, PythonSixPointFive.class);
                        startActivity(intent);
                        break;
                    case "PSR25":
                        intent = new Intent(this, PythonSevenPointOne.class);
                        startActivity(intent);
                        break;
                    case "PSR26":
                        intent = new Intent(this, PythonSevenPointTwo.class);
                        startActivity(intent);
                        break;
                    case "PSR27":
                        intent = new Intent(this, PythonSevenPointThree.class);
                        startActivity(intent);
                        break;
                }
                break;
            }
        }
    }

    public void nextSRTopic2(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String topicSave = sharedPref.getString("pythonTopicSave", null);

        if (topicSave != null) {
            switch (topicSave) {
                case "StartPython":
                    Intent intent = new Intent(this, StartPython2.class);
                    startActivity(intent);
                    break;
                case "StartPython2":
                    Intent intent2 = new Intent(this, StartPython3.class);
                    startActivity(intent2);
                    break;
                case "StartPython3":
                    Intent intent3 = new Intent(this, StartPython4.class);
                    startActivity(intent3);
                    break;
                case "StartPython4":
                    Intent intent4 = new Intent(this, StartPython5.class);
                    startActivity(intent4);
                    break;
                case "StartPython5":
                    Intent intent5 = new Intent(this, StartPython6.class);
                    startActivity(intent5);
                    break;
                case "StartPython6":
                    Intent intent6 = new Intent(this, StartPython7.class);
                    startActivity(intent6);
                    break;
                case "StartPython7":
                    Intent intent7 = new Intent(this, PythonComplete.class);
                    startActivity(intent7);
                    break;
            }
        }
    }
}
