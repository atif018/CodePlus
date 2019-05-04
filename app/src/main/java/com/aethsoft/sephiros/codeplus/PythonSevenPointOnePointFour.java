package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PythonSevenPointOnePointFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_seven_point_one_point_four);
    }

    public void pythonProgramQuiz33(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("pythonSaveSeven", "PythonProgramQuiz33");
        editor.apply();

        Intent intent = new Intent(this, PythonProgramQuiz33.class);
        startActivity(intent);
    }
}
