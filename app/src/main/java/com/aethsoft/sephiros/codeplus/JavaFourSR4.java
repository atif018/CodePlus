package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaFourSR4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_four_sr4);
    }

    public void javaStartJava5A(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR15", 12);
        editor.apply();
        setTopic4Status();
    }

    public void javaStartJava5B(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR15", 8);
        editor.apply();
        setTopic4Status();
    }

    public void javaStartJava5C(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR15", 3);
        editor.apply();
        setTopic4Status();
    }

    public void setTopic4Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveFour", null);
        editor.apply();

        for (int i = 1; i < 15; i++)
        {

            String srCurrent = "SR" + (i);
            int srI = sharedPref.getInt(srCurrent, -1);
            srI = srI - 1;
            editor.putInt(srCurrent, srI);
            editor.apply();

        }

        Intent intent = new Intent(this, JavaSRTopics.class);
        startActivity(intent);
    }
}
