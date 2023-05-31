package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class developPersonalSkillsActivity2 extends AppCompatActivity {
    Button Button_develop;
    Button Button_developp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_develop_personal_skills2);

        Button_develop=findViewById(R.id.Button_develop);
        Button_developp=findViewById(R.id.Button_developp);

        Button_develop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(developPersonalSkillsActivity2.this,MenuActivity2.class);
                startActivity(intent);

            }
        });
        Button_developp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(developPersonalSkillsActivity2.this,Skill1Activity2.class);
                startActivity(intent);

            }
        });
    }

}