package com.example.win7.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    private Button register,login;
    private TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        register=(Button)findViewById(R.id.signup_register);
        login=(Button)findViewById(R.id.signup_login);
        skip=(TextView)findViewById(R.id.signup_skip);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(SignupActivity.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(SignupActivity.this,NavigationActivity.class);
                startActivity(intent2);
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(SignupActivity.this,NavigationActivity.class);
                startActivity(intent3);
            }
        });

    }
}
