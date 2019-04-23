package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSRTopics extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_srtopics);
    }

    public void nextSRTopic(View view) {

        for (int i = 1; i < 28; i++) {

            SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
            SharedPreferences.Editor editor = sharedPref.edit();

            String srCurrent = "SR" + i;

            int srI = sharedPref.getInt(srCurrent, -1);

            if (srI <= 0) {
                editor.putInt("endOfTopic", 1);
                editor.apply();
                editor.putInt(srCurrent, 10000);
                editor.apply();
                switch (srCurrent) {
                    case "SR1":
                        intent = new Intent(this, JavaOnePointOne.class);
                        startActivity(intent);
                        break;
                    case "SR2":
                        intent = new Intent(this, JavaOnePointTwo.class);
                        startActivity(intent);
                        break;
                    case "SR3":
                        intent = new Intent(this, JavaOnePointThree.class);
                        startActivity(intent);
                        break;
                    case "SR4":
                        intent = new Intent(this, JavaOnePointFour.class);
                        startActivity(intent);
                        break;
                    case "SR5":
                        intent = new Intent(this, JavaTwoPointOne.class);
                        startActivity(intent);
                        break;
                    case "SR6":
                        intent = new Intent(this, JavaTwoPointTwo.class);
                        startActivity(intent);
                        break;
                    case "SR7":
                        intent = new Intent(this, JavaTwoPointThree.class);
                        startActivity(intent);
                        break;
                    case "SR8":
                        intent = new Intent(this, JavaThreePointOne.class);
                        startActivity(intent);
                        break;
                    case "SR9":
                        intent = new Intent(this, JavaThreePointTwo.class);
                        startActivity(intent);
                        break;
                    case "SR10":
                        intent = new Intent(this, JavaThreePointThree.class);
                        startActivity(intent);
                        break;
                    case "SR11":
                        intent = new Intent(this, JavaThreePointFour.class);
                        startActivity(intent);
                        break;
                    case "SR12":
                        intent = new Intent(this, JavaFourPointOne.class);
                        startActivity(intent);
                        break;
                    case "SR13":
                        intent = new Intent(this, JavaFourPointTwo.class);
                        startActivity(intent);
                        break;
                    case "SR14":
                        intent = new Intent(this, JavaFourPointThree.class);
                        startActivity(intent);
                        break;
                    case "SR15":
                        intent = new Intent(this, JavaFourPointFour.class);
                        startActivity(intent);
                        break;
                    case "SR16":
                        intent = new Intent(this, JavaFivePointOne.class);
                        startActivity(intent);
                        break;
                    case "SR17":
                        intent = new Intent(this, JavaFivePointTwo.class);
                        startActivity(intent);
                        break;
                    case "SR18":
                        intent = new Intent(this, JavaFourPointThree.class);
                        startActivity(intent);
                        break;
                    case "SR19":
                        intent = new Intent(this, JavaFivePointFour.class);
                        startActivity(intent);
                        break;
                    case "SR20":
                        intent = new Intent(this, JavaSixPointOne.class);
                        startActivity(intent);
                        break;
                    case "SR21":
                        intent = new Intent(this, JavaSixPointTwo.class);
                        startActivity(intent);
                        break;
                    case "SR22":
                        intent = new Intent(this, JavaSixPointThree.class);
                        startActivity(intent);
                        break;
                    case "SR23":
                        intent = new Intent(this, JavaSixPointFour.class);
                        startActivity(intent);
                        break;
                    case "SR24":
                        intent = new Intent(this, JavaSixPointFive.class);
                        startActivity(intent);
                        break;
                    case "SR25":
                        intent = new Intent(this, JavaSevenPointOne.class);
                        startActivity(intent);
                        break;
                    case "SR26":
                        intent = new Intent(this, JavaSevenPointTwo.class);
                        startActivity(intent);
                        break;
                    case "SR27":
                        intent = new Intent(this, JavaSevenPointThree.class);
                        startActivity(intent);
                        break;
                }
                break;
            }
        }
    }

    public void nextSRTopic2(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String topicSave = sharedPref.getString("javaTopicSave", null);

        if (topicSave != null) {
            switch (topicSave) {
                case "StartJava":
                    Intent intent = new Intent(this, StartJava2.class);
                    startActivity(intent);
                    break;
                case "StartJava2":
                    Intent intent2 = new Intent(this, StartJava3.class);
                    startActivity(intent2);
                    break;
                case "StartJava3":
                    Intent intent3 = new Intent(this, StartJava4.class);
                    startActivity(intent3);
                    break;
                case "StartJava4":
                    Intent intent4 = new Intent(this, StartJava5.class);
                    startActivity(intent4);
                    break;
                case "StartJava5":
                    Intent intent5 = new Intent(this, StartJava6.class);
                    startActivity(intent5);
                    break;
                case "StartJava6":
                    Intent intent6 = new Intent(this, StartJava7.class);
                    startActivity(intent6);
                    break;
                case "StartJava7":
                    Intent intent7 = new Intent(this, JavaComplete.class);
                    startActivity(intent7);
                    break;
            }
        }
    }
}
