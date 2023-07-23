package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StudentLoginSignup extends AppCompatActivity {

    Button btn1,btn2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login_signup);

        btn1=findViewById(R.id.login_page);
        btn2=findViewById(R.id.signup_page);
        imageView=findViewById(R.id.gotoDashboardloginsign);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentLoginSignup.this,DashboardScreen.class));
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentLoginSignup.this,StudentLogin.class));
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentLoginSignup.this,StudenSignup.class));
                finish();
            }
        });
    }
}