package com.example.loginpage;
import androidx.annotation.NonNull;


import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.List;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity{
    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;
    private Button mSignupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsernameEditText = findViewById(R.id.username);
        mPasswordEditText = findViewById(R.id.password);
        mLoginButton = findViewById(R.id.loginButton);
        mSignupButton= findViewById(R.id.Buttonsingup);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUsernameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();

                // Check if username and password are correct
                if (username.equals("user") && password.equals("1234")) {
                    Intent intent = new Intent(MainActivity.this, AboutUsActivity2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SingupActivity2.class);
                startActivity(intent);
            }
        });
    }
}
