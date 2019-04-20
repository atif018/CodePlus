package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOneSR1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_sr1);
    }

    public void javaOnePointTwoA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR1", 11);
        editor.commit();
        setTopicOneStatus();
    }

    public void javaOnePointTwoB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR1", 7);
        editor.commit();
        setTopicOneStatus();
    }

    public void javaOnePointTwoC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR1", 3);
        editor.commit();
        setTopicOneStatus();
    }

    public void setTopicOneStatus() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveOne", "JavaOnePointTwo");
        editor.commit();

        int getSRTopicNumber = sharedPref.getInt("endOfTopic", -1);

        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopic", 0);
            editor.commit();
            Intent intent2 = new Intent(this, JavaSRTopics.class);
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, JavaOnePointTwo.class);
            startActivity(intent);
        }
    }
}
