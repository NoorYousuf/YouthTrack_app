package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Skill4Activity2 extends AppCompatActivity {
    Button Button_skill4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill42);

        Button_skill4 = findViewById(R.id.Button_skill4);


        Button_skill4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Skill4Activity2.this, Skill2Activity2.class);
                startActivity(intent);

            }
        });

    }


}
