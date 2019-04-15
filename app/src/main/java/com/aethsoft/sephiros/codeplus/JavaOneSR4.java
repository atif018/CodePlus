package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOneSR4 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSR1 = sharedPref.getInt("SR1", -1);
    int getSR2 = sharedPref.getInt("SR2", -1);
    int getSR3 = sharedPref.getInt("SR3", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_sr4);
    }

    public void javaStartJava2A(View view) {
        editor.putInt("SR4", 11);
        editor.commit();

        setTopic1Status();
    }

    public void javaStartJava2B(View view) {
        editor.putInt("SR4", 7);
        editor.commit();

        setTopic1Status();
    }

    public void javaStartJava2C(View view) {
        editor.putInt("SR4", 3);
        editor.commit();

        setTopic1Status();
    }

    public void startSR() {
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
        editor.putString("javaSaveOne", null);
        Intent intent = new Intent(this, StartJava2.class);
        startActivity(intent);
    }
}
