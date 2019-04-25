package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonSRQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_srquestion);
    }

    public void pythonOnePointOneA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PythonSRActivate", 1);
        editor.apply();

        for (int i = 1; i < 28; i++)
        {

            String srCurrent = "PSR" + i;
            editor.putInt(srCurrent, 1);
            editor.apply();

        }

        startPythonOnePointOne();
    }

    public void pythonOnePointOneB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PythonSRActivate", 0);
        editor.apply();
        startPythonOnePointOne();
    }

    public void startPythonOnePointOne() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonSaveOne", "PythonOnePointOne");
        editor.apply();
        Intent intent = new Intent(this, PythonOnePointOne.class);
        startActivity(intent);
    }
}
