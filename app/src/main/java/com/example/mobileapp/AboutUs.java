package com.example.mobileapp;

import static com.example.mobileapp.R.id.imageButton31;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about_us);
        ImageButton lets_donatorbtn = findViewById(R.id.imageButton27);
        lets_donatorbtn.setOnClickListener((v -> {
            Intent intent = new Intent(AboutUs.this, DonatorsRegister.class);
            startActivity(intent);
        }));
        ImageButton lets_homebtn = findViewById(imageButton31);
        lets_homebtn.setOnClickListener((v -> {
            Intent intent = new Intent(AboutUs.this, HomePage.class);
            startActivity(intent);
        }));
        ImageButton lets_coursebtn = findViewById(R.id.imageButton32);
        lets_coursebtn.setOnClickListener((v -> {
            Intent intent = new Intent(AboutUs.this, Courses.class);
            startActivity(intent);
        }));
        ImageButton lets_myaccountbtn = findViewById(R.id.imageButton33);
        lets_myaccountbtn.setOnClickListener((v -> {
            Intent intent = new Intent(AboutUs.this, MyAccount.class);
            startActivity(intent);
        }));
    }
}