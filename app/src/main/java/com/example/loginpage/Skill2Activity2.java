package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Skill2Activity2 extends AppCompatActivity {
    Button Button_skill2;
    Button Button_skill22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill22);

        Button_skill2=findViewById(R.id.Button_skill2);
        Button_skill22=findViewById(R.id.Button_skill22);

        Button_skill2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Skill2Activity2.this,Skill1Activity2.class);
                startActivity(intent);

            }
        });
        Button_skill22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Skill2Activity2.this,Skill4Activity2.class);
                startActivity(intent);

            }
        });
    }
}