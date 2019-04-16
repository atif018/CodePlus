package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaFiveSR3 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSRTopicNumber = sharedPref.getInt("endOfTopicFive", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_five_sr3);
    }

    public void javaFivePointFourA(View view) {
        editor.putInt("SR18", 11);
        editor.commit();

        setTopic5Status();
    }

    public void javaFivePointFourB(View view) {
        editor.putInt("SR18", 7);
        editor.commit();

        setTopic5Status();
    }

    public void javaFivePointFourC(View view) {
        editor.putInt("SR18", 3);
        editor.commit();

        setTopic5Status();
    }

    public void setTopic5Status() {
        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopicFive", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaFiveSR4.class);
            startActivity(intent);
        }
        editor.putString("javaSaveFive", "JavaFivePointFour");
        Intent intent = new Intent(this, JavaFivePointFour.class);
        startActivity(intent);
    }
}
