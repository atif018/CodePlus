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
    int getSRTopicNumber = sharedPref.getInt("endoftopic1", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_two_sr3);
    }

    public void javaStartJava3A(View view) {
        editor.putInt("SR4", 11);
        editor.commit();

        setTopic2Status();
    }

    public void javaStartJava3B(View view) {
        editor.putInt("SR4", 7);
        editor.commit();

        setTopic2Status();
    }

    public void javaStartJava3C(View view) {
        editor.putInt("SR4", 3);
        editor.commit();

        setTopic2Status();
    }

    public void startSR() {
        if (getSR1 <= 0) {
            editor.putInt("endoftopic1", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointOne.class);
            startActivity(intent);
        }
        if (getSR2 <= 0) {
            editor.putInt("endoftopic1", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointTwo.class);
            startActivity(intent);
        }
        if (getSR3 <= 0) {
            editor.putInt("endoftopic1", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointThree.class);
            startActivity(intent);
        }
        if (getSR4 <= 0) {
            editor.putInt("endoftopic1", 1);
            editor.commit();
            Intent intent = new Intent(this, JavaOnePointFour.class);
            startActivity(intent);
        }
    }

    public void setTopic2Status() {
        if (getSRTopicNumber == 1) {
            editor.putInt("endoftopic2", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoSR3.class);
            startActivity(intent);
        }
        startSR();
        Intent intent = new Intent(this, StartJava3.class);
        startActivity(intent);
    }
}
