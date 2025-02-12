package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_account);
        ImageButton lets_homebtn = findViewById(R.id.imageButton);
        lets_homebtn.setOnClickListener((v -> {
            Intent intent = new Intent(MyAccount.this, HomePage.class);
            startActivity(intent);
        }));
        ImageButton lets_couresbtn = findViewById(R.id.imageButton2);
        lets_couresbtn.setOnClickListener((v -> {
            Intent intent = new Intent(MyAccount.this, Courses.class);
            startActivity(intent);
        }));
        ImageButton lets_logoutbtn = findViewById(R.id.imageButton28);
        lets_logoutbtn.setOnClickListener((v -> {
            Intent intent = new Intent(MyAccount.this, SignupPage.class);
            startActivity(intent);
        }));
    }
}