package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSixSR1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_six_sr1);
    }

    public void javaSixPointTwoA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR20", 11);
        editor.commit();
        setTopic6Status();
    }

    public void javaSixPointTwoB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR20", 7);
        editor.commit();
        setTopic6Status();
    }

    public void javaSixPointTwoC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR20", 3);
        editor.commit();
        setTopic6Status();
    }

    public void setTopic6Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int getSRTopicNumber = sharedPref.getInt("endOfTopicSix", -1);
        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopicSix", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaSixSR5.class);
            startActivity(intent);
        }
        editor.putString("javaSaveSix", "JavaSixPointTwo");
        editor.commit();
        Intent intent = new Intent(this, JavaSixPointTwo.class);
        startActivity(intent);
    }
}
