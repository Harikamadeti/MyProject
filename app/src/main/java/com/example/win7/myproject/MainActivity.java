package com.example.win7.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1,editText2;
    private Button button1,button2;
    private TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.email);//email edittext
        editText2=(EditText)findViewById(R.id.password);//password edittext
        button1=(Button)findViewById(R.id.login);//login button
        button2=(Button)findViewById(R.id.register);//register button
        textView1=(TextView)findViewById(R.id.forgotpassword);//forgotpassword
        textView2=(TextView)findViewById(R.id.Skip);//skip,ill do it later
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NavigationActivity.class);
                startActivity(intent);
            }
        });

    }
}
