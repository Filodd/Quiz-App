package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds up user's score based on number of correct answer and displays the score in  toast message.
     */
    public void submitAnswer(View view) {
        //adds one to user's score if third radio button is selected for question one
        RadioButton questionOneC = this.findViewById(R.id.question_one_c);
        boolean questionOneCorrect = questionOneC.isChecked();
        if (questionOneCorrect) {
            score += 1;
        }

        //adds one to user's score if first radio button is selected for question two
        RadioButton questionTwoA = this.findViewById(R.id.question_two_a);
        boolean questionTwoCorrect = questionTwoA.isChecked();
        if (questionTwoCorrect) {
            score += 1;
        }

        //adds one to user's score if third radio button is selected for question three
        RadioButton questionThreeC = this.findViewById(R.id.question_three_c);
        boolean questionThreeCorrect = questionTwoA.isChecked();
        if (questionThreeCorrect) {
            score += 1;
        }

        // adds one to user's score if they have entered text "Potenza" or "potenza" in editText
        // for question 4
        EditText capital = (EditText) findViewById(R.id.question_four_edit_text);
        String questionFourAnswer = capital.getText().toString();
        if (questionFourAnswer.equals("Potenza") || questionFourAnswer.equals("potenza")) ;
        if (questionFourAnswer.equals("Potenza") || questionFourAnswer.equals("potenza")) {
            score += 1;
        }

        //adds one to user's score if first radio button is selected for question five
        RadioButton questionFiveA = this.findViewById(R.id.question_five_a);
        boolean questionFiveCorrect = questionFiveA.isChecked();
        if (questionFiveCorrect) {
            score += 1;
        }

        // adds one to user's score if first and second checkbox are checked in question six
        CheckBox questionSixA = (CheckBox) findViewById(R.id.checkbox_six_a);
        CheckBox questionSixB = (CheckBox) findViewById(R.id.checkbox_question_six_b);
        CheckBox questionSixC = (CheckBox) findViewById(R.id.checkbox_question_six_c);
        boolean questionSixAChecked = questionSixA.isChecked();
        boolean questionSixBChecked = questionSixB.isChecked();
        boolean questionSixCChecked = questionSixC.isChecked();
        if (questionSixAChecked & questionSixBChecked & !questionSixCChecked) {
            score += 1;
        }

        //adds one to user's score if first radio button is selected for question seven
        RadioButton questionSevenA = (RadioButton) findViewById(R.id.radioButton_question_seven_a);
        boolean questionSevenCorrect = questionSevenA.isChecked();
        if (questionSevenCorrect) {
            score += 1;
        }

        // adds one to user's score if they have entered text "Lucani" in editText for question 4
        EditText nameOfInhabitants = (EditText) findViewById(R.id.question_eight_edit_text);
        String questionEightAnswer = nameOfInhabitants.getText().toString();
        if (questionEightAnswer.equals("Lucani") || questionEightAnswer.equals("lucani")) ;
        if (questionEightAnswer.equals("Lucani") || questionEightAnswer.equals("lucani")) {
            score += 1;
        }

        //adds one to user's score if first radio button is selected for question nine
        RadioButton questionNineA = (RadioButton) findViewById(R.id.question_nine_a);
        boolean questionNineCorrect = questionNineA.isChecked();
        if (questionNineCorrect) {
            score += 1;
        }

        // adds one to user's score if second and forth checkbox is checked in question ten
        CheckBox questionTenA = (CheckBox) findViewById(R.id.checkbox_ten_a);
        CheckBox questionTenB = (CheckBox) findViewById(R.id.checkbox_question_ten_b);
        CheckBox questionTenC = (CheckBox) findViewById(R.id.checkbox_question_ten_c);
        CheckBox questionTenD = (CheckBox) findViewById(R.id.checkbox_question_ten_d);
        boolean questionTenAChecked = questionTenA.isChecked();
        boolean questionTenBChecked = questionTenB.isChecked();
        boolean questionTenCChecked = questionTenC.isChecked();
        boolean questionTenDChecked = questionTenD.isChecked();
        if (!questionTenAChecked & questionTenBChecked & questionTenCChecked & !questionTenDChecked) {
            score += 1;
        }

        // displays user's score as toast message
        Toast.makeText(this, "You scored " + score + " out of 10", Toast.LENGTH_LONG).show();
        score = 0;

        //Intent to the official website
        String url = "http://www.discoverbasilicata.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void resetAnswer(View view) {

        //clear radio bottons after RESET button is clicked
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup_1);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup_2);
        RadioGroup radioGroup3 = findViewById(R.id.radioGroup_3);
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup_4);
        RadioGroup radioGroup5 = findViewById(R.id.radioGroup_5);
        RadioGroup radioGroup6 = findViewById(R.id.radioGroup_6);
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();


        //clear edit text after RESET button is clicked
        EditText QuestionFourEditText = findViewById(R.id.question_four_edit_text);
        QuestionFourEditText.getText().clear();
        EditText QuestionEightEditText = findViewById(R.id.question_eight_edit_text);
        QuestionEightEditText.getText().clear();

        //clear checkbox after RESET button is clicked
        CheckBox CheckBoxSixA = (CheckBox) findViewById(R.id.checkbox_six_a);
        CheckBoxSixA.setChecked(false);
        CheckBox CheckBoxSixB = (CheckBox) findViewById(R.id.checkbox_question_six_b);
        CheckBoxSixB.setChecked(false);
        CheckBox CheckBoxSixC = (CheckBox) findViewById(R.id.checkbox_question_six_c);
        CheckBoxSixC.setChecked(false);

        CheckBox CheckBoxTenA = (CheckBox) findViewById(R.id.checkbox_ten_a);
        CheckBoxTenA.setChecked(false);
        CheckBox CheckBoxTenB = (CheckBox) findViewById(R.id.checkbox_question_ten_b);
        CheckBoxTenB.setChecked(false);
        CheckBox CheckBoxTenC = (CheckBox) findViewById(R.id.checkbox_question_ten_c);
        CheckBoxTenC.setChecked(false);
        CheckBox CheckBoxTenD = (CheckBox) findViewById(R.id.checkbox_question_ten_d);
        CheckBoxTenD.setChecked(false);

    }

}


