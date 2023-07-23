package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    ImageView img1,img2,imge3,imge4,dashdash;
    TextView txt1,txt2,txt3,txt4;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        img1=findViewById(R.id.studentlogin);
        img2=findViewById(R.id.faculty_login);
        imge3=findViewById(R.id.collegelogin);
        imge4=findViewById(R.id.university_login);
        dashdash=findViewById(R.id.dashboardtodashboard);

        txt1=findViewById(R.id.student_text_login);
        txt2=findViewById(R.id.text_faculty_login);
        txt3=findViewById(R.id.college_login);
        txt4=findViewById(R.id.text_university_login);

        btn1=findViewById(R.id.studlogin_btn);
        btn2=findViewById(R.id.faculty_btn);
        btn3=findViewById(R.id.collegelogin_btn);
        btn4=findViewById(R.id.university_btn);

        dashdash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,DashboardScreen.class));
                finish();
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,StudentLoginSignup.class));
                finish();
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,FacultyLogin.class));
                finish();
            }
        });
        imge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,CollegeLogin.class));
                finish();
            }
        });
        imge4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,UniversityLogin.class));
                finish();
            }
        });

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,StudentLoginSignup.class));
                finish();
            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,FacultyLogin.class));
                finish();
            }
        });
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,CollegeLogin.class));
                finish();
            }
        });
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,UniversityLogin.class));
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,StudentLoginSignup.class));
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,FacultyLogin.class));
                finish();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,CollegeLogin.class));
                finish();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,UniversityLogin.class));
                finish();
            }
        });

    }
}