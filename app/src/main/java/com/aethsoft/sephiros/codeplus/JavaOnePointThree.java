package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOnePointThree extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();
    int getSR1 = sharedPref.getInt("SR1", -1);
    int getSR2 = sharedPref.getInt("SR2", -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_point_three);
    }

    public void javaProgramQuiz4(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("save", "JavaProgramQuiz4");
        editor.commit();

        getSR1 = getSR1 - 1;
        getSR2 = getSR2 - 1;
        editor.putInt("SR1", getSR1);
        editor.putInt("SR2", getSR2);
        editor.commit();

        Intent intent = new Intent(this, JavaProgramQuiz4.class);
        startActivity(intent);
    }
}
