package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSRTopics extends AppCompatActivity {

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
                switch (srCurrent) {
                    case "SR1":
                        Intent intent2 = new Intent(this, JavaOnePointOne.class);
                        startActivity(intent2);
                        break;
                    case "SR2":
                        Intent intent3 = new Intent(this, JavaOnePointTwo.class);
                        startActivity(intent3);
                        break;
                    case "SR3":
                        Intent intent4 = new Intent(this, JavaOnePointThree.class);
                        startActivity(intent4);
                        break;
                    case "SR4":
                        Intent intent5 = new Intent(this, JavaOnePointFour.class);
                        startActivity(intent5);
                        break;
                    case "SR5":
                        Intent intent6 = new Intent(this, JavaTwoPointOne.class);
                        startActivity(intent6);
                        break;
                    case "SR6":
                        Intent intent7 = new Intent(this, JavaTwoPointTwo.class);
                        startActivity(intent7);
                        break;
                    case "SR7":
                        Intent intent8 = new Intent(this, JavaTwoPointThree.class);
                        startActivity(intent8);
                        break;
                    case "SR8":
                        Intent intent9 = new Intent(this, JavaThreePointOne.class);
                        startActivity(intent9);
                        break;
                    case "SR9":
                        Intent intent10 = new Intent(this, JavaThreePointTwo.class);
                        startActivity(intent10);
                        break;
                    case "SR10":
                        Intent intent11 = new Intent(this, JavaThreePointThree.class);
                        startActivity(intent11);
                        break;
                    case "SR11":
                        Intent intent12 = new Intent(this, JavaThreePointFour.class);
                        startActivity(intent12);
                        break;
                    case "SR12":
                        Intent intent13 = new Intent(this, JavaFourPointOne.class);
                        startActivity(intent13);
                        break;
                    case "SR13":
                        Intent intent14 = new Intent(this, JavaFourPointTwo.class);
                        startActivity(intent14);
                        break;
                    case "SR14":
                        Intent intent15 = new Intent(this, JavaFourPointThree.class);
                        startActivity(intent15);
                        break;
                    case "SR15":
                        Intent intent16 = new Intent(this, JavaFourPointFour.class);
                        startActivity(intent16);
                        break;
                    case "SR16":
                        Intent intent17 = new Intent(this, JavaFivePointOne.class);
                        startActivity(intent17);
                        break;
                    case "SR17":
                        Intent intent18 = new Intent(this, JavaFivePointTwo.class);
                        startActivity(intent18);
                        break;
                    case "SR18":
                        Intent intent19 = new Intent(this, JavaFourPointThree.class);
                        startActivity(intent19);
                        break;
                    case "SR19":
                        Intent intent20 = new Intent(this, JavaFivePointFour.class);
                        startActivity(intent20);
                        break;
                    case "SR20":
                        Intent intent21 = new Intent(this, JavaSixPointOne.class);
                        startActivity(intent21);
                        break;
                    case "SR21":
                        Intent intent22 = new Intent(this, JavaSixPointTwo.class);
                        startActivity(intent22);
                        break;
                    case "SR22":
                        Intent intent23 = new Intent(this, JavaSixPointThree.class);
                        startActivity(intent23);
                        break;
                    case "SR23":
                        Intent intent24 = new Intent(this, JavaSixPointFour.class);
                        startActivity(intent24);
                        break;
                    case "SR24":
                        Intent intent25 = new Intent(this, JavaSixPointFive.class);
                        startActivity(intent25);
                        break;
                    case "SR25":
                        Intent intent26 = new Intent(this, JavaSevenPointOne.class);
                        startActivity(intent26);
                        break;
                    case "SR26":
                        Intent intent27 = new Intent(this, JavaSevenPointTwo.class);
                        startActivity(intent27);
                        break;
                    case "SR27":
                        Intent intent28 = new Intent(this, JavaSevenPointThree.class);
                        startActivity(intent28);
                        break;
                }
            }
        }

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String topicSave = sharedPref.getString("javaTopicSave", null);

        if (topicSave != null) {
            switch (topicSave) {
                case "StartJava":
                    Intent intent2 = new Intent(this, StartJava2.class);
                    startActivity(intent2);
                    break;
                case "StartJava2":
                    Intent intent3 = new Intent(this, StartJava3.class);
                    startActivity(intent3);
                    break;
                case "StartJava3":
                    Intent intent4 = new Intent(this, StartJava4.class);
                    startActivity(intent4);
                    break;
                case "StartJava4":
                    Intent intent5 = new Intent(this, StartJava5.class);
                    startActivity(intent5);
                    break;
                case "StartJava5":
                    Intent intent6 = new Intent(this, StartJava6.class);
                    startActivity(intent6);
                    break;
                case "StartJava6":
                    Intent intent7 = new Intent(this, StartJava7.class);
                    startActivity(intent7);
                    break;
                case "StartJava7":
                    Intent intent8 = new Intent(this, JavaComplete.class);
                    startActivity(intent8);
                    break;
            }
        }
    }
}
