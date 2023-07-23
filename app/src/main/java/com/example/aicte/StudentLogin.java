package com.example.aicte;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class StudentLogin extends AppCompatActivity {
    ImageView img1;
    Button btn1,login;

    TextInputLayout username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        img1=findViewById(R.id.login_back_button);
        btn1=findViewById(R.id.gotoSignpage);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernamevar=username.getEditText().getText().toString();
                String passwordvar=password.getEditText().getText().toString();

                if (!usernamevar.isEmpty()){
                    username.setError(null);
                    username.setErrorEnabled(false);
                    if (!passwordvar.isEmpty()){
                        password.setError(null);
                        password.setErrorEnabled(false);

                        final String username_data=username.getEditText().getText().toString();
                        final String password_data=password.getEditText().getText().toString();

                        FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
                        DatabaseReference databaseReference=firebaseDatabase.getReference("datauser");

                        Query check_username=databaseReference.orderByChild("username").equalTo(username_data);

                        check_username.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if (snapshot.exists()){
                                    username.setError(null);
                                    username.setErrorEnabled(false);
                                    String passwordCheck=snapshot.child(username_data).child("password").getValue(String.class);
                                    if (passwordCheck.equals(password_data)){
                                        password.setError(null);
                                        password.setErrorEnabled(false);
                                        Toast.makeText(getApplicationContext(),"Login Successfully...!",Toast.LENGTH_SHORT).show();
                                        Intent intent=new Intent(getApplicationContext(),Dashboard.class);
                                        startActivity(intent);
                                        finish();
                                    }else {
                                        password.setError("wrong password");
                                    }
                                }else {
                                    username.setError("User Does not Exist");

                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                    }else {
                        password.setError("Please Enter the Correct Password...!");
                    }
                }else {
                    username.setError("Please Enter the Username...!");
                }


            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentLogin.this,StudentLoginSignup.class));
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentLogin.this,StudenSignup.class));
                finish();
            }
        });
    }


}