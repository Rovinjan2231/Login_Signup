package com.example.login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Page extends AppCompatActivity {
    EditText eMail, passWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        TextView btn_signup=findViewById(R.id.sign_up);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_Page.this, Signup_Page.class));
            }
        });
        eMail = (EditText) findViewById(R.id.email);
        passWord = (EditText) findViewById(R.id.password);
        Button btn_login = findViewById(R.id.login_button);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = eMail.getText().toString();
                String password = passWord.getText().toString();

                String user = "admin@gmail.com";
                String pass = "admin123";

                if(email.equals(user) && password.equals(pass)){
                    startActivity(new Intent(Login_Page.this, MainActivity.class));
                }else{
                    Toast.makeText(getApplicationContext(), "The username or password you entered is incorrect", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}