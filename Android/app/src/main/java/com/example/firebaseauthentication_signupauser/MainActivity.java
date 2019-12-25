package com.example.firebaseauthentication_signupauser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText SignInEmailEditText, SignInPasswordEditText;
    private TextView signUpTextView;
    private Button SignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Sign in Activity");

        SignInEmailEditText=(EditText)findViewById(R.id.signinemailedittextid);
        SignInPasswordEditText=(EditText)findViewById(R.id.signinpasswordedittextid);
        SignInButton=(Button) findViewById(R.id.signinButtonId);
        signUpTextView=(TextView)findViewById(R.id.SignUpTextViewId);

        signUpTextView.setOnClickListener(this);
        SignInButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signinButtonId:

                break;

            case R.id.SignUpTextViewId:

                Intent intent = new Intent (getApplicationContext(), SignUpUser.class);
                startActivity(intent);
                break;
        }
    }
}
