package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSevenSR2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_seven_sr2);
    }

    public void javaSevenPointThreeA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR26", 11);
        editor.commit();
        setTopic7Status();
    }

    public void javaSevenPointThreeB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR26", 7);
        editor.commit();
        setTopic7Status();
    }

    public void javaSevenPointThreeC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR26", 3);
        editor.commit();
        setTopic7Status();
    }

    public void setTopic7Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int getSRTopicNumber = sharedPref.getInt("endOfTopicSeven", -1);
        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopicSeven", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaSevenSR3.class);
            startActivity(intent);
        }
        editor.putString("javaSaveSeven", "JavaSevenPointThree");
        editor.commit();
        Intent intent = new Intent(this, JavaSevenPointThree.class);
        startActivity(intent);
    }
}
