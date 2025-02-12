package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DonatorsRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_donators_register);
        ImageButton lets_homebtn = findViewById(R.id.imageButton12);
        lets_homebtn.setOnClickListener((v -> {
            Intent intent = new Intent(DonatorsRegister.this, HomePage.class);
            startActivity(intent);
        }));
    }
}