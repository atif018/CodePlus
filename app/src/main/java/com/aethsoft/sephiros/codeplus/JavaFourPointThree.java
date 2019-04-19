package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaFourPointThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_four_point_three);
    }

    public void javaProgramQuiz20(View view) {

        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveFour", "JavaProgramQuiz20");
        editor.commit();

        Intent intent = new Intent(this, JavaProgramQuiz20.class);
        startActivity(intent);
    }
}
