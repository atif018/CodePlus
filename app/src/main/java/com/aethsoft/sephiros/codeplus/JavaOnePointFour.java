package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOnePointFour extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSR1 = sharedPref.getInt("SR1", -1);
    int getSR2 = sharedPref.getInt("SR2", -1);
    int getSR3 = sharedPref.getInt("SR3", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_point_four);
    }

    public void javaProgramQuiz2(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("save", "JavaProgramQuiz2");
        editor.commit();

        getSR1 = getSR1 - 1;
        getSR2 = getSR2 - 1;
        getSR3 = getSR3 - 1;
        editor.putInt("SR1", getSR1);
        editor.putInt("SR2", getSR2);
        editor.putInt("SR3", getSR3);
        editor.commit();

        Intent intent = new Intent(this, JavaProgramQuiz2.class);
        startActivity(intent);
    }
}
