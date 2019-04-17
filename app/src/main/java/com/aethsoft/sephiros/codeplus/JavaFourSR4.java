package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaFourSR4 extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_four_sr4);
    }

    public void javaStartJava5A(View view) {
        editor.putInt("SR15", 11);
        editor.commit();

        setTopic4Status();
    }

    public void javaStartJava5B(View view) {
        editor.putInt("SR15", 7);
        editor.commit();

        setTopic4Status();
    }

    public void javaStartJava5C(View view) {
        editor.putInt("SR15", 3);
        editor.commit();

        setTopic4Status();
    }

    public void startSR() {
        if (getSR1 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointOne.class);
            startActivity(intent);
        }
        if (getSR2 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointTwo.class);
            startActivity(intent);
        }
        if (getSR3 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointThree.class);
            startActivity(intent);
        }
        if (getSR4 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointFour.class);
            startActivity(intent);
        }
        if (getSR5 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointOne.class);
            startActivity(intent);
        }
        if (getSR6 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointTwo.class);
            startActivity(intent);
        }
        if (getSR7 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointThree.class);
            startActivity(intent);
        }
        if (getSR8 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointOne.class);
            startActivity(intent);
        }
        if (getSR9 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointTwo.class);
            startActivity(intent);
        }
        if (getSR10 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointThree.class);
            startActivity(intent);
        }
        if (getSR11 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaThreePointFour.class);
            startActivity(intent);
        }
        if (getSR12 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFourPointOne.class);
            startActivity(intent);
        }
        if (getSR13 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFourPointTwo.class);
            startActivity(intent);
        }
        if (getSR14 <= 0) {
            editor.putInt("endOfTopicFour", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaFourPointThree.class);
            startActivity(intent);
        }
    }

    public void setTopic4Status() {
        startSR();
        editor.putString("javaSaveFour", null);
        editor.putString("javaTopicSave", "StartJava5");
        Intent intent = new Intent(this, StartJava5.class);
        startActivity(intent);
    }
}
