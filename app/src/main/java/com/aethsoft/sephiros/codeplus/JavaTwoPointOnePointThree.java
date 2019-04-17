package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaTwoPointOnePointThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_two_point_one_point_three);
    }

    public void javaTwoPointOnePointThree(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveTwo", "JavaProgramQuiz7");
        editor.commit();

        int getSR1 = sharedPref.getInt("SR1", -1);
        int getSR2 = sharedPref.getInt("SR2", -1);
        int getSR3 = sharedPref.getInt("SR3", -1);
        int getSR4 = sharedPref.getInt("SR4", -1);

        getSR1 = getSR1 - 1;
        getSR2 = getSR2 - 1;
        getSR3 = getSR3 - 1;
        getSR4 = getSR4 - 1;

        editor.putInt("SR1", getSR1);
        editor.commit();
        editor.putInt("SR2", getSR2);
        editor.commit();
        editor.putInt("SR3", getSR3);
        editor.commit();
        editor.putInt("SR4", getSR4);
        editor.commit();

        Intent intent = new Intent(this, JavaProgramQuiz7.class);
        startActivity(intent);
    }
}
