package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOneSR3 extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSRTopicNumber = sharedPref.getInt("endoftopic1", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_sr3);
    }

    public void javaOnePointFourA(View view) {
        editor.putInt("SR3", 11);
        editor.commit();

        setTopic1Status();
    }

    public void javaOnePointFourB(View view) {
        editor.putInt("SR3", 7);
        editor.commit();

        setTopic1Status();
    }

    public void javaOnePointFourC(View view) {
        editor.putInt("SR3", 3);
        editor.commit();

        setTopic1Status();
    }

    public void setTopic1Status() {
        if (getSRTopicNumber == 1) {
            editor.putInt("endoftopic1", 0);
            editor.commit();
            Intent intent = new Intent(this, JavaOneSR4.class);
            startActivity(intent);
        }
        Intent intent = new Intent(this, JavaOnePointFour.class);
        startActivity(intent);
    }
}
