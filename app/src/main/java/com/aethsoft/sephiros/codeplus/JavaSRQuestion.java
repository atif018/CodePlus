package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSRQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_srquestion);
    }

    public void javaOnePointOneA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("JavaSRActivate", 1);
        editor.apply();

        for (int i = 1; i < 28; i++)
        {

            String srCurrent = "SR" + i;
            editor.putInt(srCurrent, 1);
            editor.apply();

        }

        startJavaOnePointOne();
    }

    public void javaOnePointOneB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("JavaSRActivate", 0);
        editor.apply();
        startJavaOnePointOne();
    }

    public void startJavaOnePointOne() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveOne", "JavaOnePointOne");
        editor.apply();
        Intent intent = new Intent(this, JavaOnePointOne.class);
        startActivity(intent);
    }
}
