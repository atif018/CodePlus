package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaThreePointTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_three_point_two);
    }

    public void javaProgramQuiz14(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveThree", "JavaProgramQuiz14");
        editor.commit();

        for (int i = 1; i < 9; i++)
        {

            String srCurrent = "SR" + (i);
            int srI = sharedPref.getInt(srCurrent, -1);
            srI = srI - 1;
            editor.putInt(srCurrent, srI);
            editor.commit();

        }

        Intent intent = new Intent(this, JavaProgramQuiz14.class);
        startActivity(intent);
    }
}
