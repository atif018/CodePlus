package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_app);
    }

    public void startJavaActivity(View view) {
        String javaTopic = "this, StartJava.class";
        Intent intent = new Intent();
        intent.
        startActivity(intent);
    }

    public void startPythonActivity(View view) {
        Intent intent = new Intent(this, StartPython.class);
        startActivity(intent);
    }
}
