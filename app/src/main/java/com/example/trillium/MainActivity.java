package com.example.trillium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button resourceBtn;
    Button gameBtn;
    Button assessmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resourceBtn = (Button)findViewById(R.id.resourceBtn);
        gameBtn = (Button)findViewById(R.id.gameBtn);
        assessmentBtn = (Button)findViewById(R.id.assessmentBtn);

        resourceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Resources.class));
            }
        });

        gameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Game.class));
            }
        });

        assessmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Assessment.class));
            }
        });
    }
}