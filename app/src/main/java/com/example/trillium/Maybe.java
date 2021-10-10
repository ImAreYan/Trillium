package com.example.trillium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Maybe extends AppCompatActivity {

    Button cBtnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maybe);

        cBtnTwo = findViewById(R.id.continue2);

        cBtnTwo.setOnClickListener(view -> {
            startActivity(new Intent(Maybe.this, MainActivity.class));
        });
    }
}