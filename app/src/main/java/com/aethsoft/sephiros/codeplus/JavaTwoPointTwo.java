package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaTwoPointTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_two_point_two);
    }

    public void javaTwoPointTwoPointOne(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("javaSaveTwo", "JavaTwoPointTwoPointOne");
        editor.commit();

        Intent intent = new Intent(this, JavaTwoPointTwoPointOne.class);
        startActivity(intent);
    }
}
