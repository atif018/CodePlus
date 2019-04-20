package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaFiveSR1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_five_sr1);
    }

    public void javaFivePointTwoA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR16", 11);
        editor.commit();
        setTopic5Status();
    }

    public void javaFivePointTwoB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR16", 7);
        editor.commit();
        setTopic5Status();
    }

    public void javaFivePointTwoC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR16", 3);
        editor.commit();
        setTopic5Status();
    }

    public void setTopic5Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveFive", "JavaFivePointTwo");
        editor.commit();

        int getSRTopicNumber = sharedPref.getInt("endOfTopic", -1);

        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopic", 0);
            editor.commit();
            Intent intent2 = new Intent(this, JavaSRTopics.class);
            startActivity(intent2);
        }
        else {
            Intent intent = new Intent(this, JavaFivePointTwo.class);
            startActivity(intent);
        }
    }
}
