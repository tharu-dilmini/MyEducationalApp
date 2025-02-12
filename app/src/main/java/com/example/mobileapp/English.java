package com.example.mobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_english);
        ImageButton lets_homebtn = findViewById(R.id.imageButton41);
        lets_homebtn.setOnClickListener((v -> {
            Intent intent = new Intent(English.this, HomePage.class);
            startActivity(intent);
        }));
        ImageButton lets_coursebtn = findViewById(R.id.imageButton42);
        lets_coursebtn.setOnClickListener((v -> {
            Intent intent = new Intent(English.this, Courses.class);
            startActivity(intent);
        }));
        ImageButton lets_myaccountbtn = findViewById(R.id.imageButton43);
        lets_myaccountbtn.setOnClickListener((v -> {
            Intent intent = new Intent(English.this, MyAccount.class);
            startActivity(intent);
        }));
        View grade1btn = findViewById(R.id.imageButton47);
        grade1btn.setOnClickListener((v -> {
            Uri uri = Uri.parse("https://youtu.be/Zz8jwWjq1nY?si=hp3eXpDl31iygFPq");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
        View grade2btn = findViewById(R.id.imageButton48);
        grade2btn.setOnClickListener((v -> {
            Uri uri = Uri.parse("https://youtu.be/T8zAlS0lIaU?si=Kp-wz253mZZtdcp9");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
        View grade3btn = findViewById(R.id.imageButton35);
        grade3btn.setOnClickListener((v -> {
            Uri uri = Uri.parse("https://youtu.be/xxybaQ2cEUo?si=vjGfSI1XNSSL-pD3");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
        View grade4btn = findViewById(R.id.imageButton36);
        grade4btn.setOnClickListener((v -> {
            Uri uri = Uri.parse("https://youtu.be/REkEBleWadg?si=e1s3tUzToTDk0bZi");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
        View grade5btn = findViewById(R.id.imageButton37);
        grade5btn.setOnClickListener((v -> {
            Uri uri = Uri.parse("https://youtu.be/20WgjOkkKhM?si=RHu-B4J_eaQnGpUf");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
        View grade6btn = findViewById(R.id.imageButton38);
        grade6btn.setOnClickListener((v -> {
            Uri uri = Uri.parse("https://youtu.be/-WWEHPhOtVo?si=q2dYokLg7WeeaC3e");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
        View grade7btn = findViewById(R.id.imageButton39);
        grade7btn.setOnClickListener((v -> {
            Uri uri = Uri.parse("https://youtu.be/76EnnC4UA6k?si=UdQIi9Lu9EzwI4pA");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
        View grade8btn = findViewById(R.id.imageButton40);
        grade8btn.setOnClickListener((v -> {
            Uri uri = Uri.parse("https://youtu.be/l-wS6qLvNx0?si=YsJzrq7VGYov_SE1");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }));
    }
}