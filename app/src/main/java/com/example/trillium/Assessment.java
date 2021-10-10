package com.example.trillium;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Assessment extends AppCompatActivity {

    CheckBox questionOneYes;
    CheckBox questionOneNo;
    CheckBox questionTwoYes;
    CheckBox questionTwoNo;
    CheckBox questionFourYes;
    CheckBox questionFourNo;
    CheckBox questionFiveYes;
    CheckBox questionFiveNo;
    CheckBox questionSixYes;
    CheckBox questionSixNo;
    CheckBox questionSevenYes;
    CheckBox questionSevenNo;
    CheckBox questionThreeFever;
    CheckBox questionThreeCoughing;
    CheckBox questionThreeTaste;
    CheckBox questionThreeBreath;
    CheckBox questionThreeNausea;
    CheckBox questionThreeNone;

    Button submitBtn;
    Boolean questionOne;
    Boolean questionTwo;
    Boolean questionThree;
    Boolean questionFour;
    Boolean questionFive;
    Boolean questionSix;
    Boolean questionSeven;
    Integer safe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);

        submitBtn = findViewById(R.id.button);
        questionOneYes = findViewById(R.id.checkBox3);
        questionOneNo = findViewById(R.id.checkBox4);
        questionTwoYes = findViewById(R.id.checkBox5);
        questionTwoNo = findViewById(R.id.checkBox6);
        questionFourYes = findViewById(R.id.checkBox11);
        questionFourNo = findViewById(R.id.checkBox12);
        questionFiveYes = findViewById(R.id.checkBox13);
        questionFiveNo = findViewById(R.id.checkBox14);
        questionSixYes = findViewById(R.id.checkBox16);
        questionSixNo = findViewById(R.id.checkBox15);
        questionSevenYes = findViewById(R.id.checkBox20);
        questionSevenNo = findViewById(R.id.checkBox19);
        questionThreeFever= findViewById(R.id.checkBox);
        questionThreeCoughing = findViewById(R.id.checkBox2);
        questionThreeTaste = findViewById(R.id.checkBox7);
        questionThreeBreath = findViewById(R.id.checkBox8);
        questionThreeNausea = findViewById(R.id.checkBox9);
        questionThreeNone = findViewById(R.id.checkBox10);

        questionOneYes.setOnClickListener(view -> {
            if(questionOneYes.isChecked()) {
                questionOne = false;
                questionOneNo.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen yes", Toast.LENGTH_SHORT).show();
            }
        });

        questionTwoYes.setOnClickListener(view -> {
            if(questionTwoYes.isChecked()) {
                questionTwo = false;
                questionTwoNo.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen yes", Toast.LENGTH_SHORT).show();
            }
        });

        questionFourYes.setOnClickListener(view -> {
            if(questionFourYes.isChecked()) {
                questionFour = false;
                questionFourNo.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen yes", Toast.LENGTH_SHORT).show();
            }
        });

        questionFiveYes.setOnClickListener(view -> {
            if(questionFiveYes.isChecked()) {
                questionFive = false;
                questionFiveNo.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen yes", Toast.LENGTH_SHORT).show();
            }
        });

        questionSixYes.setOnClickListener(view -> {
            if(questionSixYes.isChecked()) {
                questionSix = false;
                questionSixNo.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen yes", Toast.LENGTH_SHORT).show();
            }
        });

        questionSevenYes.setOnClickListener(view -> {
            if(questionSevenYes.isChecked()) {
                questionSeven = true;
                questionSevenNo.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen yes", Toast.LENGTH_SHORT).show();
            }
        });

        questionOneNo.setOnClickListener(view -> {
            if(questionOneNo.isChecked()) {
                questionOne = true;
                questionOneYes.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen no", Toast.LENGTH_SHORT).show();
            }
        });

        questionTwoNo.setOnClickListener(view -> {
            if(questionTwoNo.isChecked()) {
                questionTwo = true;
                questionTwoYes.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen no", Toast.LENGTH_SHORT).show();
            }
        });

        questionFourNo.setOnClickListener(view -> {
            if(questionFourNo.isChecked()) {
                questionFour = true;
                questionFourYes.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen no", Toast.LENGTH_SHORT).show();
            }
        });

        questionFiveNo.setOnClickListener(view -> {
            if(questionFiveNo.isChecked()) {
                questionFive = true;
                questionFiveYes.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen no", Toast.LENGTH_SHORT).show();
            }
        });

        questionSixNo.setOnClickListener(view -> {
            if(questionSixNo.isChecked()) {
                questionSix = true;
                questionSixYes.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen no", Toast.LENGTH_SHORT).show();
            }
        });

        questionSevenNo.setOnClickListener(view -> {
            if(questionSevenNo.isChecked()) {
                questionSeven = false;
                questionSevenYes.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen no", Toast.LENGTH_SHORT).show();
            }
        });

        questionThreeFever.setOnClickListener(view -> {
            if(questionThreeFever.isChecked()) {
                questionThree = true;
                questionThreeNone.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen fever and/or chills", Toast.LENGTH_SHORT).show();
            }
        });

        questionThreeCoughing.setOnClickListener(view -> {
            if(questionThreeCoughing.isChecked()) {
                questionThree = true;
                questionThreeNone.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen coughing", Toast.LENGTH_SHORT).show();
            }
        });

        questionThreeTaste.setOnClickListener(view -> {
            if(questionThreeTaste.isChecked()) {
                questionThree = true;
                questionThreeNone.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen loss of taste", Toast.LENGTH_SHORT).show();
            }
        });

        questionThreeBreath.setOnClickListener(view -> {
            if(questionThreeBreath.isChecked()) {
                questionThree = true;
                questionThreeNone.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen shortness of breath", Toast.LENGTH_SHORT).show();
            }
        });

        questionThreeNausea.setOnClickListener(view -> {
            if(questionThreeNausea.isChecked()) {
                questionThree = true;
                questionThreeNone.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen nausea", Toast.LENGTH_SHORT).show();
            }
        });

        questionThreeNone.setOnClickListener(view -> {
            if(questionThreeNone.isChecked()) {
                questionThree = false;
                questionThreeFever.setChecked(false);
                questionThreeCoughing.setChecked(false);
                questionThreeTaste.setChecked(false);
                questionThreeBreath.setChecked(false);
                questionThreeNausea.setChecked(false);
                Context context = getApplicationContext();
                Toast.makeText(context, "You have chosen none of the above", Toast.LENGTH_SHORT).show();
            }
        });

        /*
        if(questionOne  && questionTwo  && questionThree  && questionFour && questionFive && questionSix  && questionSeven ){
            safe = 0; // You can socialize
        }
        else if(questionOne || !questionOne && questionTwo && questionThree || !questionThree && questionFour && questionFive && questionSix && questionSeven){
            safe = 1; // Do not recommend socializing
        }
        else{
            safe = 2; // do not socialize
        }
         */


        submitBtn.setOnClickListener(view -> {
            if(questionOne  && questionTwo  && !questionThree  && questionFour && questionFive && questionSix  && questionSeven ){
                safe = 0; // You can socialize
            }

            else if((questionOne || !questionOne) && questionTwo && questionThree || !questionThree && questionFour && questionFive && questionSix && (questionSeven || !questionSeven)){
                safe = 1; // Do not recommend socializing
            }
            else{
                safe = 2; // do not socialize
            }
            if(safe == 0)
                startActivity(new Intent(Assessment.this, Yes.class));
            if(safe == 1)
                startActivity(new Intent(Assessment.this, Maybe.class));
            if(safe == 2)
                startActivity(new Intent(Assessment.this, No.class));

        });
    }
}