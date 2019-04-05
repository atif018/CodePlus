package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava4 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java4);
    }

    public void startLoopsSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String topicFourSaves = sharedPref.getString("topic4save", null);
        if (topicFourSaves != null) {
            if (topicFourSaves.equals("fourtwo")) {
                intent = new Intent(this, JavaFourPointTwo.class);
            }
            else if (topicFourSaves.equals("fourthree")) {
                intent = new Intent(this, JavaFourPointThree.class);
            }
        }
        else {
            intent = new Intent(this, JavaFourPointOne.class);
        }
        startActivity(intent);
    }
}
