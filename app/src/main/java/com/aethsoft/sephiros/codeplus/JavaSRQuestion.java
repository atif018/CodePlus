package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaSRQuestion extends AppCompatActivity {

    SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
    SharedPreferences.Editor editor = sharedPref.edit();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_srquestion);
    }

    public void javaOnePointOneA(View view) {
        editor.putInt("JavaSRActivate", 1);

        startJavaOnePointOne();
    }

    public void javaOnePointOneB(View view) {
        editor.putInt("JavaSRActivate", 0);

        startJavaOnePointOne();
    }

    public void startJavaOnePointOne() {
        editor.commit();
        Intent intent = new Intent(this, JavaOnePointOne.class);
        startActivity(intent);
    }
}
