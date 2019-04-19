package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOneSR4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_sr4);
    }

    public void javaStartJava2A(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR4", 11);
        editor.commit();
        setTopic1Status();
    }

    public void javaStartJava2B(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR4", 7);
        editor.commit();
        setTopic1Status();
    }

    public void javaStartJava2C(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR4", 3);
        editor.commit();
        setTopic1Status();
    }

    public void startSR() {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();

        int getSR1 = 0;
        int getSR2 = sharedPref.getInt("SR2", -1);
        int getSR3 = sharedPref.getInt("SR3", -1);

        if (getSR1 <= 0) {
            editor.putInt("endOfTopicOne", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointOne.class);
            startActivity(intent);
        }
        if (getSR2 <= 0) {
            editor.putInt("endOfTopicOne", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointTwo.class);
            startActivity(intent);
        }
        if (getSR3 <= 0) {
            editor.putInt("endOfTopicOne", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointThree.class);
            startActivity(intent);
        }
    }

    public void setTopic1Status() {
        startSR();
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveOne", null);
        editor.commit();
        editor.putString("javaTopicSave", "StartJava2");
        editor.commit();
        Intent intent = new Intent(this, StartJava2.class);
        startActivity(intent);
    }
}
