package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonOneSR1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_one_sr1);
    }

    public void pythonOnePointTwoA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR1", 12);
        editor.apply();
        setTopicOneStatus();
    }

    public void pythonOnePointTwoB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR1", 8);
        editor.apply();
        setTopicOneStatus();
    }

    public void pythonOnePointTwoC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR1", 3);
        editor.apply();
        setTopicOneStatus();
    }

    public void setTopicOneStatus() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonSaveOne", "PythonOnePointTwo");
        editor.apply();

        Intent intent = new Intent(this, PythonOnePointTwo.class);
        startActivity(intent);
    }
}
