package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSixSR5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_six_sr5);
    }

    public void javaStartJava7A(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR24", 11);
        editor.commit();
        setTopic6Status();
    }

    public void javaStartJava7B(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR24", 7);
        editor.commit();
        setTopic6Status();
    }

    public void javaStartJava7C(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR24", 3);
        editor.commit();
        setTopic6Status();
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
        int getSR11 = sharedPref.getInt("SR11", -1);
        int getSR12 = sharedPref.getInt("SR12", -1);
        int getSR13 = sharedPref.getInt("SR13", -1);
        int getSR14 = sharedPref.getInt("SR14", -1);
        int getSR15 = sharedPref.getInt("SR15", -1);
        int getSR16 = sharedPref.getInt("SR16", -1);
        int getSR17 = sharedPref.getInt("SR17", -1);
        int getSR18 = sharedPref.getInt("SR18", -1);
        int getSR19 = sharedPref.getInt("SR19", -1);
        int getSR20 = sharedPref.getInt("SR20", -1);
        int getSR21 = sharedPref.getInt("SR21", -1);
        int getSR22 = sharedPref.getInt("SR22", -1);
        int getSR23 = sharedPref.getInt("SR23", -1);

        if (getSR1 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointOne.class);
            startActivity(intent);
        }
        if (getSR2 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointTwo.class);
            startActivity(intent);
        }
        if (getSR3 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointThree.class);
            startActivity(intent);
        }
        if (getSR4 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointFour.class);
            startActivity(intent);
        }
        if (getSR5 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointOne.class);
            startActivity(intent);
        }
        if (getSR6 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointTwo.class);
            startActivity(intent);
        }
        if (getSR7 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointThree.class);
            startActivity(intent);
        }
        if (getSR8 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointOne.class);
            startActivity(intent);
        }
        if (getSR9 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointTwo.class);
            startActivity(intent);
        }
        if (getSR10 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointThree.class);
            startActivity(intent);
        }
        if (getSR11 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointFour.class);
            startActivity(intent);
        }
        if (getSR12 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFourPointOne.class);
            startActivity(intent);
        }
        if (getSR13 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFourPointTwo.class);
            startActivity(intent);
        }
        if (getSR14 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFourPointThree.class);
            startActivity(intent);
        }
        if (getSR15 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFourPointFour.class);
            startActivity(intent);
        }
        if (getSR16 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFivePointOne.class);
            startActivity(intent);
        }
        if (getSR17 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFivePointTwo.class);
            startActivity(intent);
        }
        if (getSR18 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFivePointThree.class);
            startActivity(intent);
        }
        if (getSR19 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFivePointFour.class);
            startActivity(intent);
        }
        if (getSR20 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaSixPointOne.class);
            startActivity(intent);
        }
        if (getSR21 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaSixPointTwo.class);
            startActivity(intent);
        }
        if (getSR22 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaSixPointThree.class);
            startActivity(intent);
        }
        if (getSR23 <= 0) {
            editor.putInt("endOfTopicSix", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaSixPointFour.class);
            startActivity(intent);
        }
    }

    public void setTopic6Status() {
        startSR();
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveSix", null);
        editor.commit();
        editor.putString("javaTopicSave", "StartJava7");
        editor.commit();
        Intent intent = new Intent(this, StartJava7.class);
        startActivity(intent);
    }
}
