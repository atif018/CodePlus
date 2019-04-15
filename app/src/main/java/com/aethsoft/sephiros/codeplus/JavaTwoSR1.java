package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaTwoSR1 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSRTopicNumber = sharedPref.getInt("endOfTopicTwo", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_two_sr1);
    }

    public void javaTwoPointTwoA(View view) {
        editor.putInt("SR5", 11);
        editor.commit();

        setTopic2Status();
    }

    public void javaTwoPointTwoB(View view) {
        editor.putInt("SR5", 7);
        editor.commit();

        setTopic2Status();
    }

    public void javaTwoPointTwoC(View view) {
        editor.putInt("SR5", 3);
        editor.commit();

        setTopic2Status();
    }

    public void setTopic2Status() {
        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopicTwo", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoSR3.class);
            startActivity(intent);
        }
        editor.putString("javaSaveTwo", "JavaTwoPointTwo");
        Intent intent = new Intent(this, JavaTwoPointTwo.class);
        startActivity(intent);
    }
}
