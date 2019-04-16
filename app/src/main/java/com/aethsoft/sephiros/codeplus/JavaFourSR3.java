package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaFourSR3 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSRTopicNumber = sharedPref.getInt("endOfTopicFour", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_four_sr3);
    }

    public void javaFourPointFourA(View view) {
        editor.putInt("SR14", 11);
        editor.commit();

        setTopic4Status();
    }

    public void javaFourPointFourB(View view) {
        editor.putInt("SR14", 7);
        editor.commit();

        setTopic4Status();
    }

    public void javaFourPointFourC(View view) {
        editor.putInt("SR14", 3);
        editor.commit();

        setTopic4Status();
    }

    public void setTopic4Status() {
        if (getSRTopicNumber == 1) {
            editor.putInt("endOfTopicFour", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaFourSR4.class);
            startActivity(intent);
        }
        editor.putString("javaSaveFour", "JavaFourPointFour");
        Intent intent = new Intent(this, JavaFourPointFour.class);
        startActivity(intent);
    }
}
