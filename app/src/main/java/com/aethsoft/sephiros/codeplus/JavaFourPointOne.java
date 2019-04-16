package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaFourPointOne extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSR1 = sharedPref.getInt("SR1", -1);
    int getSR2 = sharedPref.getInt("SR2", -1);
    int getSR3 = sharedPref.getInt("SR3", -1);
    int getSR4 = sharedPref.getInt("SR4", -1);
    int getSR5 = sharedPref.getInt("SR5", -1);
    int getSR6 = sharedPref.getInt("SR6", -1);
    int getSR7 = sharedPref.getInt("SR7", -1);
    int getSR8 = sharedPref.getInt("SR8", -1);
    int getSR9 = sharedPref.getInt("SR9", -1);
    int getSR10 = sharedPref.getInt("SR10", -1);
    int getSR11 = sharedPref.getInt("SR11", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_four_point_one);
    }

    public void javaProgramQuiz18(View view) {

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveFour", "JavaProgramQuiz18");
        editor.commit();

        getSR1 = getSR1 - 1;
        getSR2 = getSR2 - 1;
        getSR3 = getSR3 - 1;
        getSR4 = getSR4 - 1;
        getSR5 = getSR5 - 1;
        getSR6 = getSR6 - 1;
        getSR7 = getSR7 - 1;
        getSR8 = getSR8 - 1;
        getSR9 = getSR9 - 1;
        getSR10 = getSR10 - 1;
        getSR11 = getSR11 - 1;
        editor.putInt("SR1", getSR1);
        editor.putInt("SR2", getSR2);
        editor.putInt("SR3", getSR3);
        editor.putInt("SR4", getSR4);
        editor.putInt("SR5", getSR5);
        editor.putInt("SR6", getSR6);
        editor.putInt("SR7", getSR7);
        editor.putInt("SR8", getSR8);
        editor.putInt("SR9", getSR9);
        editor.putInt("SR10", getSR10);
        editor.putInt("SR11", getSR11);
        editor.commit();

        Intent intent = new Intent(this, JavaProgramQuiz18.class);
        startActivity(intent);
    }
}
