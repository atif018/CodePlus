package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonTwoSR3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_two_sr3);
    }

    public void pythonStartPython3A(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR7", 12);
        editor.apply();
        setTopic2Status();
    }

    public void pythonStartPython3B(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR7", 8);
        editor.apply();
        setTopic2Status();
    }

    public void pythonStartPython3C(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR7", 3);
        editor.apply();
        setTopic2Status();
    }

    public void setTopic2Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonSaveTwo", null);
        editor.apply();

        for (int i = 1; i < 7; i++)
        {

            String srCurrent = "PSR" + (i);
            int srI = sharedPref.getInt(srCurrent, -1);
            srI = srI - 1;
            editor.putInt(srCurrent, srI);
            editor.apply();

        }

        Intent intent = new Intent(this, PythonSRTopics.class);
        startActivity(intent);
    }
}
