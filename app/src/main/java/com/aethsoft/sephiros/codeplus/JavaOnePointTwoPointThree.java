package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOnePointTwoPointThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_point_two_point_three);
    }

    public void javaProgramQuiz(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveOne", "JavaProgramQuiz");
        editor.commit();

        int getSR1 = sharedPref.getInt("SR1", -1);

        getSR1 = getSR1 - 1;

        editor.putInt("SR1", getSR1);

        editor.commit();

        Intent intent = new Intent(this, JavaProgramQuiz.class);
        startActivity(intent);
    }
}
