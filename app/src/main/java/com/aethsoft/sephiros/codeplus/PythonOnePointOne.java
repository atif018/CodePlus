package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonOnePointOne extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_one_point_one);
    }

    public void pythonOneSR1(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int srStatus = sharedPref.getInt("PythonSRActivate", -1);

        int getSRTopicNumber = sharedPref.getInt("endOfTopicP", -1);

        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopicP", 0);
            editor.apply();
            intent = new Intent(this, PythonSRTopics.class);
        }
        else if (srStatus == 1) {
            intent = new Intent(this, PythonOneSR1.class);
            editor.putString("pythonSaveOne", "PythonOneSR1");
            editor.apply();
        } else {
            intent = new Intent(this, PythonOnePointTwo.class);
            editor.putString("pythonSaveOne", "PythonOnePointTwo");
            editor.apply();
        }
        startActivity(intent);
    }
}
