package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonTwoPointOnePointTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_two_point_one_point_two);
    }

    public void pythonTwoPointOnePointThree(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonSaveTwo", "PythonTwoPointOnePointThree");
        editor.apply();

        Intent intent = new Intent(this, PythonTwoPointOnePointThree.class);
        startActivity(intent);
    }
}