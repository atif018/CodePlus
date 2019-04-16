package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaFourSR1 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSRTopicNumber = sharedPref.getInt("endOfTopicFour", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_four_sr1);
    }

    public void javaFourPointTwoA(View view) {
        editor.putInt("SR12", 11);
        editor.commit();

        setTopic4Status();
    }

    public void javaFourPointTwoB(View view) {
        editor.putInt("SR12", 7);
        editor.commit();

        setTopic4Status();
    }

    public void javaFourPointTwoC(View view) {
        editor.putInt("SR12", 3);
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
        editor.putString("javaSaveFour", "JavaFourPointTwo");
        Intent intent = new Intent(this, JavaFourPointTwo.class);
        startActivity(intent);
    }
}
