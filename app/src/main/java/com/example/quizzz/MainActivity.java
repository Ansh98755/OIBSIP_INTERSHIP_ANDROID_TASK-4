package com.example.quizzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nex, prev;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nex = findViewById(R.id.nex);
        prev = findViewById(R.id.prev);

        Intent intent = getIntent();
        score = intent.getIntExtra("SCORE", 0);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is the first question", Toast.LENGTH_SHORT).show();
            }
        });
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton correctAnswer = findViewById(R.id.football);
                if (correctAnswer.isChecked()) {
                    score++;
                }
                Toast.makeText(MainActivity.this, "Next Question ", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(MainActivity.this, MainActivity2.class);
                it.putExtra("SCORE", score);
                startActivity(it);
            }
        });
    }

}