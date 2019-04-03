package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava2 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java2);
    }

    public void startDataSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String topicTwoSaves = sharedPref.getString("topic2save", null);
        if (topicTwoSaves != null) {
            if (topicTwoSaves.equals("twotwo")) {
                intent = new Intent(this, JavaTwoPointTwo.class);
            }
            else if (topicTwoSaves.equals("onetwoone")) {
                intent = new Intent(this, JavaOnePointTwoPointOne.class);
            }
        }
        else {
            intent = new Intent(this, JavaTwoPointOne.class);
        }
        startActivity(intent);
    }
}
