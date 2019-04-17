package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOnePointOne extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_point_one);
    }

    public void javaOneSR1(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        int srStatus = sharedPref.getInt("JavaSRActivate", -1);

        if (srStatus == 1) {
            intent = new Intent(this, JavaOneSR1.class);
            editor.putString("javaSaveOne", "JavaOneSR1");
            editor.commit();
        } else {
            intent = new Intent(this, JavaOnePointTwo.class);
            editor.putString("javaSaveOne", "JavaOnePointTwo");
            editor.commit();
        }
        startActivity(intent);
    }
}
