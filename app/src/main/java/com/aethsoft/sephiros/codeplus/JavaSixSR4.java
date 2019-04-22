package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSixSR4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_six_sr4);
    }

    public void javaSixPointFiveA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR5", 9);
        editor.commit();
        setTopic6Status();
    }

    public void javaSixPointFiveB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR5", 6);
        editor.commit();
        setTopic6Status();
    }

    public void javaSixPointFiveC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR5", 3);
        editor.commit();
        setTopic6Status();
    }

    public void setTopic6Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveSix", "JavaSixPointFive");
        editor.commit();

        for (int i = 27; i > 5; i--)
        {

            String srCurrent = "SR" + (i);
            int srI = sharedPref.getInt(srCurrent, -1);
            srI = srI - 1;
            editor.putInt(srCurrent, srI);
            editor.commit();

        }

        Intent intent = new Intent(this, JavaSixPointFive.class);
        startActivity(intent);
    }
}
