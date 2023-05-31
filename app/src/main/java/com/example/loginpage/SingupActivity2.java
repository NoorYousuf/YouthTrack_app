package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SingupActivity2 extends AppCompatActivity {
    EditText username;
    EditText password;
    EditText email;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup2);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")&& email.getText().toString().equals("user@123") ) {
                    Toast.makeText(SingupActivity2.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent
                            (SingupActivity2.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(SingupActivity2.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}