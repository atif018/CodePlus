package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaThreeSR4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_three_sr4);
    }

    public void javaStartJava4A(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR11", 11);
        editor.commit();
        setTopic3Status();
    }

    public void javaStartJava4B(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR11", 7);
        editor.commit();
        setTopic3Status();
    }

    public void javaStartJava4C(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR11", 3);
        editor.commit();
        setTopic3Status();
    }

    public void startSR() {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();

        int getSR1 = sharedPref.getInt("SR1", -1);
        int getSR2 = sharedPref.getInt("SR2", -1);
        int getSR3 = sharedPref.getInt("SR3", -1);
        int getSR4 = sharedPref.getInt("SR4", -1);
        int getSR5 = sharedPref.getInt("SR5", -1);
        int getSR6 = sharedPref.getInt("SR6", -1);
        int getSR7 = sharedPref.getInt("SR7", -1);
        int getSR8 = sharedPref.getInt("SR8", -1);
        int getSR9 = sharedPref.getInt("SR9", -1);
        int getSR10 = sharedPref.getInt("SR10", -1);

        if (getSR1 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointOne.class);
            startActivity(intent);
        }
        if (getSR2 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointTwo.class);
            startActivity(intent);
        }
        if (getSR3 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointThree.class);
            startActivity(intent);
        }
        if (getSR4 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointFour.class);
            startActivity(intent);
        }
        if (getSR5 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointOne.class);
            startActivity(intent);
        }
        if (getSR6 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointTwo.class);
            startActivity(intent);
        }
        if (getSR7 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointThree.class);
            startActivity(intent);
        }
        if (getSR8 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointOne.class);
            startActivity(intent);
        }
        if (getSR9 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointTwo.class);
            startActivity(intent);
        }
        if (getSR10 <= 0) {
            editor.putInt("endOfTopicThree", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointThree.class);
            startActivity(intent);
        }
    }

    public void setTopic3Status() {
        startSR();
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveThree", null);
        editor.commit();
        editor.putString("javaTopicSave", "StartJava4");
        editor.commit();
        Intent intent = new Intent(this, StartJava4.class);
        startActivity(intent);
    }
}
