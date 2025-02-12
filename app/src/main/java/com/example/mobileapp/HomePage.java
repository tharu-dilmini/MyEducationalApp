package com.example.mobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ImageButton lets_coursebtn = findViewById(R.id.imageButton6);
        lets_coursebtn.setOnClickListener((v -> {
            Intent intent = new Intent(HomePage.this, Courses.class);
            startActivity(intent);
        })
        );
        ImageButton lets_myaccountbtn = findViewById(R.id.imageButton5);
        lets_myaccountbtn.setOnClickListener((v -> {
            Intent intent = new Intent(HomePage.this, MyAccount.class);
            startActivity(intent);
        }));
        ImageButton lets_registerbtn = findViewById(R.id.imageButton14);
        lets_registerbtn.setOnClickListener((v -> {
            Intent intent = new Intent(HomePage.this, Register.class);
            startActivity(intent);
        }));
        ImageButton lets_freecoursebtn = findViewById(R.id.imageButton15);
        lets_freecoursebtn.setOnClickListener((v -> {
            Intent intent = new Intent(HomePage.this, Courses.class);
            startActivity(intent);
        }));
        ImageButton lets_myaccounttbtn = findViewById(R.id.imageButton20);
        lets_myaccounttbtn.setOnClickListener((v -> {
            Intent intent = new Intent(HomePage.this, MyAccount.class);
            startActivity(intent);
        }));
        ImageButton lets_aboutusbtn = findViewById(R.id.imageButton17);
        lets_aboutusbtn.setOnClickListener((v -> {
            Intent intent = new Intent(HomePage.this, AboutUs.class);
            startActivity(intent);
        }));
        View livecourse = findViewById(R.id.imageButton16);
        livecourse.setOnClickListener((v -> {
            Uri uri = Uri.parse("https://youtu.be/GWY0OuS2Rpk?si=V6S1IhJxxt9mLUPe");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
        View websitebtn = findViewById(R.id.imageButton18);
        websitebtn.setOnClickListener((v -> {
            Uri uri = Uri.parse("http://secure.example.com");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
    }
}