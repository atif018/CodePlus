package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaTwoSR2 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSRTopicNumber = sharedPref.getInt("endoftopic2", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_two_sr2);
    }

    public void javaTwoPointThreeA(View view) {
        editor.putInt("SR6", 11);
        editor.commit();

        setTopic2Status();
    }

    public void javaTwoPointThreeB(View view) {
        editor.putInt("SR6", 7);
        editor.commit();

        setTopic2Status();
    }

    public void javaTwoPointThreeC(View view) {
        editor.putInt("SR6", 3);
        editor.commit();

        setTopic2Status();
    }

    public void setTopic2Status() {
        if (getSRTopicNumber == 1) {
            editor.putInt("endoftopic2", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaTwoSR3.class);
            startActivity(intent);
        }
        Intent intent = new Intent(this, JavaTwoPointThree.class);
        startActivity(intent);
    }
}