package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome_page);
        Button lets_signupbtn = findViewById(R.id.button2);
        lets_signupbtn.setOnClickListener((v -> {
            Intent intent = new Intent(WelcomePage.this, SignupPage.class);
            startActivity(intent);
        })
        );
        Button lets_loginbtn = findViewById(R.id.button);
        lets_loginbtn.setOnClickListener((v -> {
            Intent intent = new Intent(WelcomePage.this, LoginPage.class);
            startActivity(intent);
        })
        );
    }
}