package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSixSR3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_six_sr3);
    }

    public void javaSixPointFourA(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR6", 9);
        editor.commit();
        setTopic6Status();
    }

    public void javaSixPointFourB(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR6", 6);
        editor.commit();
        setTopic6Status();
    }

    public void javaSixPointFourC(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("SR6", 3);
        editor.commit();
        setTopic6Status();
    }

    public void setTopic6Status() {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveSix", "JavaSixPointFour");
        editor.commit();

        for (int i = 27; i > 6; i--)
        {

            String srCurrent = "SR" + (i);
            int srI = sharedPref.getInt(srCurrent, -1);
            srI = srI - 1;
            editor.putInt(srCurrent, srI);
            editor.commit();

        }

        Intent intent = new Intent(this, JavaSixPointFour.class);
        startActivity(intent);
    }
}
