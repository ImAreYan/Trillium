package com.example.trillium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Game extends AppCompatActivity {

    Button falseBtn, trueBtn, next, done;
    TextView scoreText,question, questionTwo, questionThree, questionFour, questionFive, questionSix, questionSeven, questionEight, questionNine, questionTen, answer, answerTwo, answerThree, answerFour, answerFive, answerSix, answerSeven, answerEight, answerNine, answerTen;
    int trueFalseCounter = 0, nextCounter = 0, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        done = findViewById(R.id.done);
        scoreText = findViewById(R.id.Score);
        falseBtn = findViewById(R.id.False);
        trueBtn = findViewById(R.id.True);
        next = findViewById(R.id.Next);
        question = findViewById(R.id.question1);
        questionTwo = findViewById(R.id.question2);
        questionThree = findViewById(R.id.question3);
        questionFour = findViewById(R.id.question4);
        questionFive = findViewById(R.id.question5);
        questionSix = findViewById(R.id.question6);
        questionSeven = findViewById(R.id.question7);
        questionEight = findViewById(R.id.question8);
        questionNine = findViewById(R.id.question9);
        questionTen = findViewById(R.id.question10);
        answer = findViewById(R.id.answer);
        answerTwo = findViewById(R.id.answer2);
        answerThree = findViewById(R.id.answer3);
        answerFour = findViewById(R.id.answer4);
        answerFive = findViewById(R.id.answer5);
        answerSix = findViewById(R.id.answer6);
        answerSeven = findViewById(R.id.answer7);
        answerEight = findViewById(R.id.answer8);
        answerNine = findViewById(R.id.answer9);
        answerTen = findViewById(R.id.answer10);

        falseBtn.setOnClickListener(view -> {
            trueFalseCounter++;
            if(trueFalseCounter == 1) {
                score++;
                question.setVisibility(View.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answer.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 2) {
                score++;
                questionTwo.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerTwo.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 3) {
                score++;
                questionThree.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerThree.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 4) {

                questionFour.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerFour.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 5) {

                questionFive.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerFive.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 6) {
                score++;
                questionSix.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerSix.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 7) {
                questionSeven.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerSeven.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 8) {
                score++;
                questionEight.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerEight.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 9) {
                questionNine.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerNine.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 10) {
                questionTen.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerTen.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }

        });

        trueBtn.setOnClickListener(view -> {
            trueFalseCounter++;
            if(trueFalseCounter == 1) {
                question.setVisibility(View.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answer.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 2) {
                questionTwo.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerTwo.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 3) {
                questionThree.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerThree.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 4) {
                score++;
                questionFour.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerFour.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 5) {
                score++;
                questionFive.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerFive.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 6) {
                questionSix.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerSix.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 7) {
                score++;
                questionSeven.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerSeven.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 8) {
                questionEight.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerEight.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 9) {
                score++;
                questionNine.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerNine.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }
            if(trueFalseCounter == 10) {
                score++;
                questionTen.setVisibility(view.GONE);
                trueBtn.setVisibility(view.INVISIBLE);
                falseBtn.setVisibility(view.INVISIBLE);

                answerTen.setVisibility(view.VISIBLE);
                next.setVisibility(view.VISIBLE);
            }

        });

        next.setOnClickListener(view -> {
            nextCounter++;
            if(nextCounter == 1) {
                questionTwo.setVisibility(view.VISIBLE);
                trueBtn.setVisibility(view.VISIBLE);
                falseBtn.setVisibility(view.VISIBLE);

                answer.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
            }
            if(nextCounter == 2) {
                questionThree.setVisibility(view.VISIBLE);
                trueBtn.setVisibility(view.VISIBLE);
                falseBtn.setVisibility(view.VISIBLE);

                answerTwo.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
            }
            if(nextCounter == 3) {
                questionFour.setVisibility(view.VISIBLE);
                trueBtn.setVisibility(view.VISIBLE);
                falseBtn.setVisibility(view.VISIBLE);

                answerThree.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
            }
            if(nextCounter == 4) {
                questionFive.setVisibility(view.VISIBLE);
                trueBtn.setVisibility(view.VISIBLE);
                falseBtn.setVisibility(view.VISIBLE);

                answerFour.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
            }
            if(nextCounter == 5) {
                questionSix.setVisibility(view.VISIBLE);
                trueBtn.setVisibility(view.VISIBLE);
                falseBtn.setVisibility(view.VISIBLE);

                answerFive.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
            }
            if(nextCounter == 6) {
                questionSeven.setVisibility(view.VISIBLE);
                trueBtn.setVisibility(view.VISIBLE);
                falseBtn.setVisibility(view.VISIBLE);

                answerSix.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
            }
            if(nextCounter == 7) {
                questionEight.setVisibility(view.VISIBLE);
                trueBtn.setVisibility(view.VISIBLE);
                falseBtn.setVisibility(view.VISIBLE);

                answerSeven.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
            }
            if(nextCounter == 8) {
                questionNine.setVisibility(view.VISIBLE);
                trueBtn.setVisibility(view.VISIBLE);
                falseBtn.setVisibility(view.VISIBLE);

                answerEight.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
            }
            if(nextCounter == 9) {
                questionTen.setVisibility(view.VISIBLE);
                trueBtn.setVisibility(view.VISIBLE);
                falseBtn.setVisibility(view.VISIBLE);

                answerNine.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
            }
            if(nextCounter == 10) {
                answerTen.setVisibility(view.INVISIBLE);
                next.setVisibility(view.INVISIBLE);
                done.setVisibility(view.VISIBLE);
                scoreText.setText("You scored " + score + " out of 10");
                scoreText.setVisibility(view.VISIBLE);

            }

        });

        done.setOnClickListener(view -> {
            startActivity(new Intent(Game.this, MainActivity.class));
        });
    }
}