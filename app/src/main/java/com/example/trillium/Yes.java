package com.example.trillium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Yes extends AppCompatActivity {

    Button cBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes);

        cBtn = findViewById(R.id.continue1);

        cBtn.setOnClickListener(view -> {
            startActivity(new Intent(Yes.this, MainActivity.class));
        });

    }
}