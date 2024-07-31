package com.example.quizzz;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        int finalScore = getIntent().getIntExtra("SCORE", 0);
        TextView scoreTextView = findViewById(R.id.scoreTextView);
        scoreTextView.setText("Your final score is: " + finalScore);
    }
}