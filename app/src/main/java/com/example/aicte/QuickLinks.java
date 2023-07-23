package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class QuickLinks extends AppCompatActivity {
    ImageView facuilty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_links);

        facuilty=findViewById(R.id.gotoquicklink);

        facuilty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuickLinks.this,DashboardScreen.class));
                finish();
            }
        });

    }
}