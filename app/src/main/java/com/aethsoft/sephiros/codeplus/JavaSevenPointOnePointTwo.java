package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSevenPointOnePointTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_seven_point_one_point_two);
    }

    public void javaSevenPointOnePointThree(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveSeven", "JavaSevenPointOnePointThree");
        editor.apply();

        Intent intent = new Intent(this, JavaSevenPointOnePointThree.class);
        startActivity(intent);
    }
}
