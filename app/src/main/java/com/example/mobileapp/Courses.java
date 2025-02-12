package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_courses);
        ImageButton lets_homebtn = findViewById(R.id.imageButton7);
        lets_homebtn.setOnClickListener((v -> {
            Intent intent = new Intent(Courses.this, HomePage.class);
            startActivity(intent);
        }));
        ImageButton lets_myaccountbtn = findViewById(R.id.imageButton9);
        lets_myaccountbtn.setOnClickListener((v -> {
            Intent intent = new Intent(Courses.this, MyAccount.class);
            startActivity(intent);
        }));
        ImageButton lets_englishbtn = findViewById(R.id.imageButton13);
        lets_englishbtn.setOnClickListener((v -> {
            Intent intent = new Intent(Courses.this, English.class);
            startActivity(intent);
        }));
    }
}