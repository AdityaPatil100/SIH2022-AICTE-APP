package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StudenSignup extends AppCompatActivity {

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    TextInputLayout fullname,username,email,password,phone;

    ImageView text1;
    Button btn1,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studen_signup);

        text1=findViewById(R.id.signup_back_button);
        btn1=findViewById(R.id.gotologinpage);
        fullname=findViewById(R.id.signup_full_name);
        username=findViewById(R.id.signup_username);
        email=findViewById(R.id.signup_email);
        password=findViewById(R.id.signUp_password);
        signup=findViewById(R.id.next_btn);
        phone=findViewById(R.id.signup_phonenumber);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullnamevar=fullname.getEditText().getText().toString();
                String usernamevar=username.getEditText().getText().toString();
                String emailvar=email.getEditText().getText().toString();
                String phonevar=phone.getEditText().getText().toString();
                String passwordvar=password.getEditText().getText().toString();

                if (!fullnamevar.isEmpty()){
                    fullname.setError(null);
                    fullname.setErrorEnabled(false);
                    if (!usernamevar.isEmpty()){
                        username.setError(null);
                        username.setErrorEnabled(false);
                        if (!emailvar.isEmpty()){
                            email.setError(null);
                            email.setErrorEnabled(false);
                            if (!phonevar.isEmpty()){
                                phone.setError(null);
                                phone.setErrorEnabled(false);
                               if (!passwordvar.isEmpty()){
                                   password.setError(null);
                                   password.setErrorEnabled(false);
                                   if (!emailvar.matches("[a-zA-Z0-9._-]+@[a-z]+\\\\.+[a-z]+")) {
                                       rootNode = FirebaseDatabase.getInstance();
                                       reference = rootNode.getReference("datauser");

                                       String fullnamevar_s = fullname.getEditText().getText().toString();
                                       String usernamevar_s = username.getEditText().getText().toString();
                                       String emailvar_s = email.getEditText().getText().toString();
                                       String phonevar_s = phone.getEditText().getText().toString();
                                       String passwordvar_s = password.getEditText().getText().toString();


                                       storingData storingDatass = new storingData(fullnamevar_s, usernamevar_s, emailvar_s, phonevar_s, passwordvar_s);
                                       reference.child(usernamevar_s).setValue(storingDatass);

                                       Toast.makeText(getApplicationContext(), "Register Successfully...!", Toast.LENGTH_SHORT).show();

                                       Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                                       startActivity(intent);
                                       finish();



                                   }else {
                                       email.setError("Invalid Email...");

                                   }
                               }else {
                                   password.setError("Please Enter the Password Number");
                               }
                            }else {
                                phone.setError("Please Enter the Phone Number");
                            }
                        }else {
                            email.setError("Please Enter the Email");
                        }
                    }else {
                        username.setError("Please Enter the Username");
                    }
                }else {
                    fullname.setError("Please Enter the Full Name");
                }

            }
        });



        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudenSignup.this,StudentLoginSignup.class));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudenSignup.this,StudentLogin.class));
                finish();
            }
        });



    }


}
