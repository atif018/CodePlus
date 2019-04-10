package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSevenPointOnePointThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_seven_point_one_point_three);
    }

    public void javaSevenPointOnePointFour(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("save", "JavaSevenPointOnePointFour");
        editor.commit();

        Intent intent = new Intent(this, JavaSevenPointOnePointFour.class);
        startActivity(intent);
    }
}
