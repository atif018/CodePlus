package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava6 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java6);
    }

    public void startArraysSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String topicSixSaves = sharedPref.getString("topic6save", null);
        if (topicSixSaves != null) {
            if (topicSixSaves.equals("sixtwo")) {
                intent = new Intent(this, JavaSixPointTwo.class);
            }
            else if (topicSixSaves.equals("sixthree")) {
                intent = new Intent(this, JavaSixPointThree.class);
            }
        }
        else {
            intent = new Intent(this, JavaSixPointOne.class);
        }
        startActivity(intent);
    }
}
