package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class Skill1Activity2 extends AppCompatActivity {

    Button Button_skill1;
    Button Button_skill11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill12);

        Button_skill1=findViewById(R.id.Button_skill1);
        Button_skill11=findViewById(R.id.Button_skill11);

        Button_skill1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Skill1Activity2.this,developPersonalSkillsActivity2.class);
                startActivity(intent);

            }
        });
        Button_skill11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Skill1Activity2.this,Skill2Activity2.class);
                startActivity(intent);

            }
        });
    }

}