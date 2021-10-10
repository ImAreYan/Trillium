package com.example.trillium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class No extends AppCompatActivity {

    Button cBtnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no);

        cBtnThree = findViewById(R.id.continue3);

        cBtnThree.setOnClickListener(view -> {
            startActivity(new Intent(No.this, MainActivity.class));
        });
    }
}