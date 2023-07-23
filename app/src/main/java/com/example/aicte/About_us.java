package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class About_us extends AppCompatActivity {
    Button back_btn,home,home_btn;
    ImageView facebook,twitter,website;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        back_btn=findViewById(R.id.back_btn);
        home_btn=findViewById(R.id.home_btn_press);
        facebook=findViewById(R.id.facebook);
        twitter=findViewById(R.id.twitter);
        website=findViewById(R.id.website_icon1);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About_us.this,MainActivity.class));
                finish();
            }
        });

        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About_us.this,MainActivity.class));
                finish();
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.facebook.com/OfficialAICTE/");
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://twitter.com/AICTE_INDIA");
            }
        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/");
            }
        });

    }

    private void goLink(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}