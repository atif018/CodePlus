package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaOnePointFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_one_point_four);
    }

    public void javaProgramQuiz2(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveOne", "JavaProgramQuiz2");
        editor.commit();

        Intent intent = new Intent(this, JavaProgramQuiz2.class);
        startActivity(intent);
    }
}
