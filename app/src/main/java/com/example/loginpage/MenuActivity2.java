package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity2 extends AppCompatActivity {
    Button Button_developM;
    Button Button_CreativeM;
    Button Button_GeneralM;
    Button Button_logoutM;
    Button Button_backM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        Button_developM= findViewById(R.id.Button_developM);

        Button_developM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,developPersonalSkillsActivity2.class);
                startActivity(intent);
            }
        });
        Button_CreativeM= findViewById(R.id.Button_CreativeM);

        Button_CreativeM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,CreativeThinkingSkillssActivity2.class);
                startActivity(intent);
            }
        });
        Button_GeneralM= findViewById(R.id.Button_GeneralM);

        Button_GeneralM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,AdviceActivity2.class);
                startActivity(intent);
            }
        });
        Button_logoutM= findViewById(R.id.Button_logoutM);

        Button_logoutM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,LogoutActivity2.class);
                startActivity(intent);
            }
        });
        Button_backM= findViewById(R.id.Button_backM);

        Button_backM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity2.this,AboutUsActivity2.class);
                startActivity(intent);
            }
        });
    }
}