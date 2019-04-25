package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonSevenSR2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_seven_sr2);
    }

    public void pythonSevenPointThreeA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR26", 9);
        editor.apply();
        setTopic7Status();
    }

    public void pythonSevenPointThreeB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR26", 6);
        editor.apply();
        setTopic7Status();
    }

    public void pythonSevenPointThreeC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PSR26", 3);
        editor.apply();
        setTopic7Status();
    }

    public void setTopic7Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonSaveSeven", "PythonSevenPointThree");
        editor.apply();

        for (int i = 1; i < 26; i++)
        {

            String srCurrent = "PSR" + (i);
            int srI = sharedPref.getInt(srCurrent, -1);
            srI = srI - 1;
            editor.putInt(srCurrent, srI);
            editor.apply();

        }

        Intent intent = new Intent(this, PythonSevenPointThree.class);
        startActivity(intent);
    }
}
