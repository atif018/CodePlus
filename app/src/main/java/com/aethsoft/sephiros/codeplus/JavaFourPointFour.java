package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaFourPointFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_four_point_four);
    }

    public void javaProgramQuiz21(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveFour", "JavaProgramQuiz21");
        editor.commit();

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
        int getSR12 = sharedPref.getInt("SR12", -1);
        int getSR13 = sharedPref.getInt("SR13", -1);
        int getSR14 = sharedPref.getInt("SR14", -1);

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
        getSR12 = getSR12 - 1;
        getSR13 = getSR13 - 1;
        getSR14 = getSR14 - 1;

        editor.putInt("SR1", getSR1);
        editor.commit();
        editor.putInt("SR2", getSR2);
        editor.commit();
        editor.putInt("SR3", getSR3);
        editor.commit();
        editor.putInt("SR4", getSR4);
        editor.commit();
        editor.putInt("SR5", getSR5);
        editor.commit();
        editor.putInt("SR6", getSR6);
        editor.commit();
        editor.putInt("SR7", getSR7);
        editor.commit();
        editor.putInt("SR8", getSR8);
        editor.commit();
        editor.putInt("SR9", getSR9);
        editor.commit();
        editor.putInt("SR10", getSR10);
        editor.commit();
        editor.putInt("SR11", getSR11);
        editor.commit();
        editor.putInt("SR12", getSR12);
        editor.commit();
        editor.putInt("SR13", getSR13);
        editor.commit();
        editor.putInt("SR14", getSR14);
        editor.commit();

        Intent intent = new Intent(this, JavaProgramQuiz21.class);
        startActivity(intent);
    }
}
