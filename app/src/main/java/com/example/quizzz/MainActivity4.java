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

public class MainActivity4 extends AppCompatActivity {
    Button prev,nex;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        nex=findViewById(R.id.nex);
        prev=findViewById(R.id.prev);

        Intent intent = getIntent();
        score = intent.getIntExtra("SCORE", 0);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity4.this, "Previous Question ", Toast.LENGTH_SHORT).show();
                Intent inte = new Intent(MainActivity4.this,MainActivity3.class);
                inte.putExtra("SCORE",score);
                startActivity(inte);
            }
        });

        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton correctAnswer = findViewById(R.id.twelve);
                if (correctAnswer.isChecked()) {
                    score++;
                }
                Toast.makeText(MainActivity4.this, "See your result", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(MainActivity4.this , MainActivity5.class);
                it.putExtra("SCORE",score);
                startActivity(it);
            }
        });
    }
}