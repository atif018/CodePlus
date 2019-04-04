package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartJava3 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java3);
    }

    public void startDecisionsSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String topicThreeSaves = sharedPref.getString("topic3save", null);
        if (topicThreeSaves != null) {
            if (topicThreeSaves.equals("threetwo")) {
                intent = new Intent(this, JavaThreePointTwo.class);
            }
            else if (topicThreeSaves.equals("threetwoone")) {
                intent = new Intent(this, JavaThreePointThree.class);
            }
        }
        else {
            intent = new Intent(this, JavaThreePointOne.class);
        }
        startActivity(intent);
    }
}
