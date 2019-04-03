package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
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
        Intent intent = new Intent(this, StartJava.class);
        startActivity(intent);
    }
}
