package com.example.foreverfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * This app tests the user's knowledge of fitness and nutrition
 * by displaying a radio button and checkbox quiz,
 * with a score displayed as a toast
 * at the bottom to show user their score of x/11.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Tracks user's score
     */
    int score = 0;
    boolean allAnswered = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Get Score button is clicked.
     */
    public void getScore(View view) {
        allAnswered = true;
        score = 0;
        /**
         Find the user's name
         */
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        /**
         Q1 - Find out if user knows how many calories in a gram of protein
         */
        RadioButton Q1_RB1 = (RadioButton) findViewById(R.id.Q1_RB1);
        RadioButton Q1_RB2 = (RadioButton) findViewById(R.id.Q1_RB2);
        RadioButton Q1_RB3 = (RadioButton) findViewById(R.id.Q1_RB3);
        if (Q1_RB2.isChecked()) {
            score++;
        }
        if (!Q1_RB1.isChecked() && !Q1_RB2.isChecked() && !Q1_RB3.isChecked()) {
            allAnswered = false;
        }

        /**
         Q2 - Find out if user thinks they must starve themselves to lose weight
         */
        CheckBox question_two_answer_a = findViewById(R.id.question_two_answer_a);
        CheckBox question_two_answer_b = findViewById(R.id.question_two_answer_b);
        CheckBox question_two_answer_c = findViewById(R.id.question_two_answer_c);
        if (!question_two_answer_a.isChecked()
                && question_two_answer_b.isChecked()
                && question_two_answer_c.isChecked()) {
            score++;
        }
        if (!question_two_answer_a.isChecked()
                && !question_two_answer_b.isChecked()
                && !question_two_answer_c.isChecked()) {
            allAnswered = false;
        }

        /**
         Q3 - Find out if user knows how many calories in a gram of carbohydrate
         */
        RadioButton Q3_RB1 = (RadioButton) findViewById(R.id.Q3_RB1);
        RadioButton Q3_RB2 = (RadioButton) findViewById(R.id.Q3_RB2);
        RadioButton Q3_RB3 = (RadioButton) findViewById(R.id.Q3_RB3);
        if (Q3_RB2.isChecked()) {
            score++;
        }
        if (!Q3_RB1.isChecked() && !Q3_RB2.isChecked() && !Q3_RB3.isChecked()) {
            allAnswered = false;
        }

        /**
         Q4 - Find out if user thinks it's okay to eat PopTarts while dieting
         */
        RadioButton Q4_RB1 = (RadioButton) findViewById(R.id.Q4_RB1);
        RadioButton Q4_RB2 = (RadioButton) findViewById(R.id.Q4_RB2);
        if (Q4_RB1.isChecked()) {
            score++;
        }
        if (!Q4_RB1.isChecked() && !Q4_RB2.isChecked()) {
            allAnswered = false;
        }

        /**
         Q5 - Find out if user knows how many calories in a gram of fat
         */
        RadioButton Q5_RB1 = (RadioButton) findViewById(R.id.Q5_RB1);
        RadioButton Q5_RB2 = (RadioButton) findViewById(R.id.Q5_RB2);
        RadioButton Q5_RB3 = (RadioButton) findViewById(R.id.Q5_RB3);
        if (Q5_RB3.isChecked()) {
            score++;
        }
        if (!Q5_RB1.isChecked() && !Q5_RB2.isChecked() && !Q5_RB3.isChecked()) {
            allAnswered = false;
        }

        /**
         Q6 - Find out if user thinks weight training is beneficial long term
         */
        CheckBox question_six_answer_a = findViewById(R.id.question_six_answer_a);
        CheckBox question_six_answer_b = findViewById(R.id.question_six_answer_b);
        CheckBox question_six_answer_c = findViewById(R.id.question_six_answer_c);
        if (!question_six_answer_a.isChecked()
                && question_six_answer_b.isChecked()
                && question_six_answer_c.isChecked()) {
            score++;
        }
        if (!question_six_answer_a.isChecked()
                && !question_six_answer_b.isChecked()
                && !question_six_answer_c.isChecked()) {
            allAnswered = false;
        }

        /**
         Q7 - Find out if user thinks best way to lose weight is to eat in a caloric deficit
         */
        RadioButton Q7_RB1 = (RadioButton) findViewById(R.id.Q7_RB1);
        RadioButton Q7_RB2 = (RadioButton) findViewById(R.id.Q7_RB2);
        RadioButton Q7_RB3 = (RadioButton) findViewById(R.id.Q7_RB3);
        if (Q7_RB3.isChecked()) {
            score++;
        }
        if (!Q7_RB1.isChecked() && !Q7_RB2.isChecked() && !Q7_RB3.isChecked()) {
            allAnswered = false;
        }

        /**
         Q8 - Find out if user thinks it's okay to eat pizza & donuts. Ever?!
         */
        RadioButton Q8_RB1 = (RadioButton) findViewById(R.id.Q8_RB1);
        RadioButton Q8_RB2 = (RadioButton) findViewById(R.id.Q8_RB2);
        if (Q8_RB1.isChecked()) {
            score++;
        }
        if (!Q8_RB1.isChecked() && !Q8_RB2.isChecked()) {
            allAnswered = false;
        }

        /**
         Q9 - Find out if user thinks MOST effective way to burn fat is LISS.
         */
        RadioButton Q9_RB1 = (RadioButton) findViewById(R.id.Q9_RB1);
        RadioButton Q9_RB2 = (RadioButton) findViewById(R.id.Q9_RB2);
        RadioButton Q9_RB3 = (RadioButton) findViewById(R.id.Q9_RB3);
        if (Q9_RB2.isChecked()) {
            score++;
        }
        if (!Q9_RB1.isChecked() && !Q9_RB2.isChecked() && !Q9_RB3.isChecked()) {
            allAnswered = false;
        }

        /**
         Q10 - Find out if user thinks tracking food daily is the BEST way to lose weight.
         */
        RadioButton Q10_RB1 = (RadioButton) findViewById(R.id.Q10_RB1);
        RadioButton Q10_RB2 = (RadioButton) findViewById(R.id.Q10_RB2);
        if (Q10_RB1.isChecked()) {
            score++;
        }
        if (!Q10_RB1.isChecked() && !Q10_RB2.isChecked()) {
            allAnswered = false;
        }

        /**
         Q11 - Find out if user knows that nutrition
         is the MOST important component of weight mgmt.
         */
        EditText Question_11_answer = findViewById(R.id.Question_11_answer);
        if (Question_11_answer.getText().toString().equalsIgnoreCase("nutrition")
                || (Question_11_answer.getText().toString().equalsIgnoreCase("food"))) {
            score++;
        }
        if (Question_11_answer.getText().toString().equalsIgnoreCase("")) {
            allAnswered = false;
        }
        if (!allAnswered) {
            Toast.makeText(this, "Please answer ALL of the questions.", Toast.LENGTH_SHORT).show();
        } else {
            displayMessage(score, name);
            score = 0;
        }
    }

    /**
     * This method displays the username & final score x/11 on the screen.
     */
    private void displayMessage(int score, String name) {
        Toast.makeText(this, name + ", your score is " + score + " out of 11.", Toast.LENGTH_SHORT).show();
    }

}
