package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreativeThinkingSkillssActivity2 extends AppCompatActivity {
    Button Button_thinking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creative_thinking_skillss2);

        Button_thinking= findViewById(R.id.Button_thinking);

        Button_thinking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CreativeThinkingSkillssActivity2.this,MenuActivity2.class);
                startActivity(intent);

            }
        });
    }
}