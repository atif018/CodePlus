package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaThreeSR2 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSRTopicNumber = sharedPref.getInt("endOfTopicThree", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_three_sr2);
    }

    public void javaThreePointThreeA(View view) {
        editor.putInt("SR9", 11);
        editor.commit();

        setTopic3Status();
    }

    public void javaThreePointThreeB(View view) {
        editor.putInt("SR9", 7);
        editor.commit();

        setTopic3Status();
    }

    public void javaThreePointThreeC(View view) {
        editor.putInt("SR9", 3);
        editor.commit();

        setTopic3Status();
    }

    public void setTopic3Status() {
        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopicThree", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaThreeSR4.class);
            startActivity(intent);
        }
        editor.putString("javaSaveThree", "JavaThreePointThree");
        Intent intent = new Intent(this, JavaThreePointThree.class);
        startActivity(intent);
    }
}
