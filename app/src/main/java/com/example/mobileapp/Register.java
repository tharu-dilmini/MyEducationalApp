package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ImageButton lets_homebtn = findViewById(R.id.imageButton24);
        lets_homebtn.setOnClickListener((v -> {
            Intent intent = new Intent(Register.this, HomePage.class);
            startActivity(intent);
        }));
        ImageButton lets_coursebtn = findViewById(R.id.imageButton25);
        lets_coursebtn.setOnClickListener((v -> {
            Intent intent = new Intent(Register.this, Courses.class);
            startActivity(intent);
        }));
        ImageButton lets_myaccountbtn = findViewById(R.id.imageButton26);
        lets_myaccountbtn.setOnClickListener((v -> {
            Intent intent = new Intent(Register.this, MyAccount.class);
            startActivity(intent);
        }));
    }
}