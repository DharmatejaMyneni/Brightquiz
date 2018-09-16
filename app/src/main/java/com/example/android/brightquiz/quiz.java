package com.example.android.brightquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class quiz extends AppCompatActivity {


    int score = 0;           // tracks score of correct one
    Boolean checkSubmit;


    CheckBox checkboxNewDelhi;  // question1- choice1
    CheckBox checkboxNewYork;   // question1-choice2
    CheckBox checkboxKolkata;   // question1- choice3

    CheckBox checkboxGermany;   // question2- choice1
    CheckBox checkboxFrance;    // question2-choice2
    CheckBox checkboxCuba;      // question2-choice3


    CheckBox checkboxSouthAfrica;    // question3-choice1
    CheckBox checkboxIndia;          // question3-choice2
    CheckBox checkboxZuidafrika;        //question3-choice3


    CheckBox checkboxHindusthan;        //question4-choice1
    CheckBox checkboxBharath;        //question4-choice2
    CheckBox checkboxCeylon;        // question4-choice3


    EditText editTextAnswer;// question5

    RadioGroup radiobuttonGroup;
    RadioButton radiobuttoMadrid;
    RadioButton radiobuttonBeijing;
    RadioButton radiobuttonTokyo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        checkboxNewDelhi = findViewById(R.id.new_delhi);
        checkboxNewYork = findViewById(R.id.new_york);
        checkboxKolkata = findViewById(R.id.kolkata);

        checkboxGermany = findViewById(R.id.germany_cb);
        checkboxFrance = findViewById(R.id.france_cb);
        checkboxCuba = findViewById(R.id.cuba_cb);


        checkboxSouthAfrica = findViewById(R.id.south_africa);
        checkboxIndia = findViewById(R.id.india);
        checkboxZuidafrika = findViewById(R.id.australia_rb);


        checkboxHindusthan = findViewById(R.id.ankara);
        checkboxBharath = findViewById(R.id.moscow);
        checkboxCeylon = findViewById(R.id.mumbai);

        radiobuttoMadrid = findViewById(R.id.madrid_rb);
        radiobuttonBeijing = findViewById(R.id.beijing_rb);
        radiobuttonTokyo = findViewById(R.id.tokyo_rb);
        radiobuttonGroup = findViewById(R.id.first_radio_group);

        editTextAnswer = findViewById(R.id.your_answer);

        checkSubmit = false;

    }


    public void answerSubmit(View view) {


        /**
         * Question No.1
         * Correct Answer "new Delhi & Kolkata"
         * */

        if (checkboxNewDelhi.isChecked() && checkboxKolkata.isChecked() && !checkboxNewYork.isChecked()) {
            score += 1;
        }

        /**
         * Question No.2
         * Correct Answer "Germany & France"
         * */

        if (checkboxGermany.isChecked() && checkboxFrance.isChecked() && !checkboxCuba.isChecked()) {
            score += 1;
        }

        /**
         * Question No.3
         * Correct Answer "south africa and zuidafrika"
         * */

        if (checkboxSouthAfrica.isChecked() && checkboxZuidafrika.isChecked() && !checkboxIndia.isChecked()) {
            score += 1;
        }

        /**
         * Question No.4
         * Correct Answer "Hindusthan and Bharath"
         * */

        if (checkboxHindusthan.isChecked() && checkboxBharath.isChecked() && !checkboxCeylon.isChecked()) {
            score += 1;
        }

        /**
         * Question No.5
         * Correct Answer "damascus"
         * */

        String checkAnswerQuestion1 = editTextAnswer.getText().toString();
        if (checkAnswerQuestion1.equalsIgnoreCase("damascus")) {
            score += 1;
        }

        /**
         * Question No.5
         * Correct Answer "Tokyo"
         * */


        if (radiobuttonTokyo.isChecked()) {
            score += 1;
        }

        showToast();

    }

    // Show the final score
    private void showToast() {
        if (checkSubmit) {
            Toast.makeText(this, getString(R.string.check_submit), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, getString(R.string.final_score) + score, Toast.LENGTH_LONG).show();
            checkSubmit = true;
        }

    }

    // Reset all variables and scores.

    public void reset_button(View view) {
        score = 0;
        checkSubmit = false;
        editTextAnswer.setText("");
        checkboxNewYork.setChecked(false);
        checkboxNewDelhi.setChecked(false);
        checkboxCuba.setChecked(false);
        checkboxFrance.setChecked(false);
        checkboxGermany.setChecked(false);
        checkboxKolkata.setChecked(false);
        checkboxCeylon.setChecked(false);
        checkboxBharath.setChecked(false);
        checkboxHindusthan.setChecked(false);
        checkboxSouthAfrica.setChecked(false);
        checkboxIndia.setChecked(false);
        checkboxZuidafrika.setChecked(false);
        radiobuttonGroup.clearCheck();

    }


}
