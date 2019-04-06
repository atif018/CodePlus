package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava5 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java5);
    }

    public void startMethodsSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String topicFiveSaves = sharedPref.getString("topic5save", null);
        if (topicFiveSaves != null) {
            if (topicFiveSaves.equals("fivetwo")) {
                intent = new Intent(this, JavaFivePointTwo.class);
            }
            else if (topicFiveSaves.equals("fivethree")) {
                intent = new Intent(this, JavaFivePointThree.class);
            }
        }
        else {
            intent = new Intent(this, JavaFivePointOne.class);
        }
        startActivity(intent);
    }
}
