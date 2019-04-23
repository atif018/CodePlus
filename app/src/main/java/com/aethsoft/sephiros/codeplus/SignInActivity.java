package com.aethsoft.sephiros.codeplus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import java.util.Arrays;

public class SignInActivity extends AppCompatActivity {

    private static final String TAG = "SignInActivity";
    private CallbackManager callbackManager;
    private AccessToken accessToken;
    private boolean isLoggedIn = false;
    private String firstName;
    private Profile mFbDetails;
    private String nameOfUser;
    private SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        accessToken = AccessToken.getCurrentAccessToken();
        isLoggedIn = accessToken != null && !accessToken.isExpired();

        if (isLoggedIn) {

            mFbDetails = Profile.getCurrentProfile();
            firstName = mFbDetails.getFirstName();

            sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("name", firstName);
            editor.apply();

            Toast.makeText(getApplicationContext(), "Welcome to Code+, " + firstName + "!", Toast.LENGTH_LONG).show();
            startCodeApp();

        }
        else {

            callbackManager = CallbackManager.Factory.create();
            LoginManager.getInstance().registerCallback(callbackManager,
                    new FacebookCallback<LoginResult>() {
                        @Override
                        public void onSuccess(LoginResult loginResult) {
                                Toast.makeText(getApplicationContext(), "Welcome to Code+!", Toast.LENGTH_LONG).show();
                                startCodeApp();
                            }


                        @Override
                        public void onCancel() {
                        }

                        @Override
                        public void onError(FacebookException exception) {

                        }
                    });

            //LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));

        }

        EditText getUserName = (EditText) findViewById(R.id.name_input);
        getUserName.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                nameOfUser = v.getText().toString();
                if (nameOfUser != null) {
                    Toast.makeText(getApplicationContext(), "Welcome to Code+, " + nameOfUser + "!", Toast.LENGTH_LONG).show();
                    startApp();
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter your name!", Toast.LENGTH_LONG).show();
                }
                return false;
            }
        });

    }

    public void startApp() {

        sharedPref = getApplicationContext().getSharedPreferences("CodePlusSaves", 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("name", nameOfUser);
        editor.apply();

        Intent intent = new Intent(this, StartApp.class);
        startActivity(intent);

    }

    private void startCodeApp() {

        Intent intent = new Intent(this, StartApp.class);
        startActivity(intent);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);

    }

}