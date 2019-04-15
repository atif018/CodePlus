package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class StartJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_java);
    }

    public void startJavaSection(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        String javaSaveOne = sharedPref.getString("javaSaveOne", null);
        if (javaSaveOne != null) {
            switch (javaSaveOne) {
                case "StartJava2":
                    Intent intent2 = new Intent(this, StartJava2.class);
                    startActivity(intent2);
                    break;
                case "StartJava3":
                    Intent intent3 = new Intent(this, StartJava3.class);
                    startActivity(intent3);
                    break;
                case "StartJava4":
                    Intent intent4 = new Intent(this, StartJava4.class);
                    startActivity(intent4);
                    break;
                case "StartJava5":
                    Intent intent5 = new Intent(this, StartJava5.class);
                    startActivity(intent5);
                    break;
                case "StartJava6":
                    Intent intent6 = new Intent(this, StartJava6.class);
                    startActivity(intent6);
                    break;
                case "StartJava7":
                    Intent intent7 = new Intent(this, StartJava7.class);
                    startActivity(intent7);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, JavaSRQuestion.class);
            startActivity(intent);
        }
    }
}
