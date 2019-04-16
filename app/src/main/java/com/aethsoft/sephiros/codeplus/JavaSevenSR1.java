package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSevenSR1 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSRTopicNumber = sharedPref.getInt("endOfTopicSeven", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_seven_sr1);
    }

    public void javaSevenPointTwoA(View view) {
        editor.putInt("SR25", 11);
        editor.commit();

        setTopic7Status();
    }

    public void javaSevenPointTwoB(View view) {
        editor.putInt("SR25", 7);
        editor.commit();

        setTopic7Status();
    }

    public void javaSevenPointTwoC(View view) {
        editor.putInt("SR25", 3);
        editor.commit();

        setTopic7Status();
    }

    public void setTopic7Status() {
        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopicSeven", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaSevenSR3.class);
            startActivity(intent);
        }
        editor.putString("javaSaveSeven", "JavaSevenPointTwo");
        Intent intent = new Intent(this, JavaSevenPointTwo.class);
        startActivity(intent);
    }
}
