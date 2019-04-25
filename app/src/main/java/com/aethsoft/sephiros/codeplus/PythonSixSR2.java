package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonSixSR2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_six_sr2);
    }

    public void pythonSixPointThreeA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR21", 9);
        editor.apply();
        setTopic6Status();
    }

    public void pythonSixPointThreeB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR21", 6);
        editor.apply();
        setTopic6Status();
    }

    public void pythonSixPointThreeC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR21", 3);
        editor.apply();
        setTopic6Status();
    }

    public void setTopic6Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonSaveSix", "PythonSixPointThree");
        editor.apply();

        for (int i = 1; i < 21; i++)
        {

            String srCurrent = "PSR" + (i);
            int srI = sharedPref.getInt(srCurrent, -1);
            srI = srI - 1;
            editor.putInt(srCurrent, srI);
            editor.apply();

        }

        Intent intent = new Intent(this, PythonSixPointThree.class);
        startActivity(intent);
    }
}
