package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOneSR2 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSRTopicNumber = sharedPref.getInt("endOfTopicOne", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_sr2);
    }

    public void javaOnePointThreeA(View view) {
        editor.putInt("SR2", 11);
        editor.commit();

        setTopic1Status();
    }

    public void javaOnePointThreeB(View view) {
        editor.putInt("SR2", 7);
        editor.commit();

        setTopic1Status();
    }

    public void javaOnePointThreeC(View view) {
        editor.putInt("SR2", 3);
        editor.commit();

        setTopic1Status();
    }

    public void setTopic1Status() {
        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopicOne", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaOneSR4.class);
            startActivity(intent);
        }
        editor.putString("javaSaveOne", "JavaOnePointThree");
        Intent intent = new Intent(this, JavaOnePointThree.class);
        startActivity(intent);
    }
}
