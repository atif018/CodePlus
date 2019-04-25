package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonSevenSR3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_seven_sr3);
    }

    public void pythonCompleteA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR27", 9);
        editor.apply();
        setTopic7Status();
    }

    public void pythonCompleteB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR27", 6);
        editor.apply();
        setTopic7Status();
    }

    public void pythonCompleteC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR27", 3);
        editor.apply();
        setTopic7Status();
    }

    public void setTopic7Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonSaveSeven", "PythonComplete");
        editor.apply();

        for (int i = 1; i < 27; i++)
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
