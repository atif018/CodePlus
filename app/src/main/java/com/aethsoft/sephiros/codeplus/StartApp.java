package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.Profile;

public class StartApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_app);
    }

    public void startJavaActivity(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);

        String topicSave = sharedPref.getString("javaTopicSave", null);
        if (topicSave != null) {
            switch (topicSave) {
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
            Intent intent = new Intent(this, StartJava.class);
            startActivity(intent);
        }
    }

    public void startPythonActivity(View view) {
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);

        String topicSave2 = sharedPref.getString("pythonTopicSave", null);
        if (topicSave2 != null) {
            switch (topicSave2) {
                case "StartPython2":
                    Intent intent2 = new Intent(this, StartPython2.class);
                    startActivity(intent2);
                    break;
                case "StartPython3":
                    Intent intent3 = new Intent(this, StartPython3.class);
                    startActivity(intent3);
                    break;
                case "StartPython4":
                    Intent intent4 = new Intent(this, StartPython4.class);
                    startActivity(intent4);
                    break;
                case "StartPython5":
                    Intent intent5 = new Intent(this, StartPython5.class);
                    startActivity(intent5);
                    break;
                case "StartPython6":
                    Intent intent6 = new Intent(this, StartPython6.class);
                    startActivity(intent6);
                    break;
                case "StartPython7":
                    Intent intent7 = new Intent(this, StartPython7.class);
                    startActivity(intent7);
                    break;
            }
        }
        else {
            Intent intent = new Intent(this, StartPython.class);
            startActivity(intent);
        }
    }
}
