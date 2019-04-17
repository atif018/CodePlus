package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaTwoSR3 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSR1 = sharedPref.getInt("SR1", -1);
    int getSR2 = sharedPref.getInt("SR2", -1);
    int getSR3 = sharedPref.getInt("SR3", -1);
    int getSR4 = sharedPref.getInt("SR4", -1);
    int getSR5 = sharedPref.getInt("SR5", -1);
    int getSR6 = sharedPref.getInt("SR6", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_two_sr3);
    }

    public void javaStartJava3A(View view) {
        editor.putInt("SR7", 11);
        editor.commit();

        setTopic2Status();
    }

    public void javaStartJava3B(View view) {
        editor.putInt("SR7", 7);
        editor.commit();

        setTopic2Status();
    }

    public void javaStartJava3C(View view) {
        editor.putInt("SR7", 3);
        editor.commit();

        setTopic2Status();
    }

    public void startSR() {
        if (getSR1 <= 0) {
            editor.putInt("endOfTopicTwo", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointOne.class);
            startActivity(intent);
        }
        if (getSR2 <= 0) {
            editor.putInt("endOfTopicTwo", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointTwo.class);
            startActivity(intent);
        }
        if (getSR3 <= 0) {
            editor.putInt("endOfTopicTwo", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointThree.class);
            startActivity(intent);
        }
        if (getSR4 <= 0) {
            editor.putInt("endOfTopicTwo", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointFour.class);
            startActivity(intent);
        }
        if (getSR5 <= 0) {
            editor.putInt("endOfTopicTwo", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointOne.class);
            startActivity(intent);
        }
        if (getSR6 <= 0) {
            editor.putInt("endOfTopicTwo", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoPointTwo.class);
            startActivity(intent);
        }
    }

    public void setTopic2Status() {
        startSR();
        editor.putString("javaSaveTwo", null);
        editor.putString("javaTopicSave", "StartJava3");
        Intent intent = new Intent(this, StartJava3.class);
        startActivity(intent);
    }
}
