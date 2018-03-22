package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v){
        /**
         * This method shows the questions
         */
        LinearLayout questionLayout=(LinearLayout) findViewById(R.id.ll_question_form);
        ImageView tittleView=(ImageView)findViewById(R.id.iv_tittle);
        Button startButton=(Button)findViewById(R.id.btn_start);
        questionLayout.setVisibility(View.VISIBLE);
        tittleView.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
    }

    public void checkResult(View v){
        /**
         * This method counts and write the score.
         */
        int score=0;
        CharSequence text;
        if (checkOne()){
            score++;
        }
        if (checkTwo()){
            score++;
        }
        if (checkThree()){
            score++;
        }
        if (checkFour()){
            score++;
        }
        if (checkFive()){
            score++;
        }
        Context context = getApplicationContext();
        if (score == 5){
            text=getString(R.string.perfect_message);
        }else{
            text = getString(R.string.correct_answer_message)+score;
        }
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    private boolean checkOne(){
        /**
         * This method  checks the first question.
         */
        boolean good=false;
        RadioButton firstSolution=(RadioButton) findViewById(R.id.rbtn_first_solution);
        if (firstSolution.isChecked()){
            good=true;
        }
        return good;
    }

    private boolean checkTwo(){
        /**
         * This method  checks the second question.
         */
        boolean good=false;
        EditText secondSolution=(EditText)findViewById(R.id.et_second_solution);
        if (secondSolution.getText().toString().equals("8")){
            good=true;
        }
        return good;
    }

    private boolean checkThree(){
        /**
         * This method  checks the third question.
         */
        boolean good=false;
        CheckBox thirdBadSolution1=(CheckBox)findViewById(R.id.cb_third_bad_solution_1);
        CheckBox thirdBadSolution2=(CheckBox)findViewById(R.id.cb_third_bad_solution_2);
        CheckBox thirdGoodSolution1=(CheckBox)findViewById(R.id.cb_fifth_good_solution_1);
        CheckBox thirdGoodSolution2=(CheckBox)findViewById(R.id.cb_third_good_solution_2);
        if (!thirdBadSolution1.isChecked()&&!thirdBadSolution2.isChecked()&&thirdGoodSolution1.isChecked()&&thirdGoodSolution2.isChecked()){
            good=true;
        }
        return good;
    }

    private boolean checkFour(){
        /**
         * This method  checks the forth question.
         */
        boolean good=false;
        RadioButton forthSolution=(RadioButton)findViewById(R.id.rb_forth_solution);
        if (forthSolution.isChecked()){
            good=true;
        }
        return good;
    }

    private boolean checkFive(){
        /**
         * This method  checks the fifth question.
         */
        boolean good=false;
        CheckBox fifthBadSolution=(CheckBox)findViewById(R.id.cb_fifth_bad_solution);
        CheckBox fifthGoodSolution1=(CheckBox)findViewById(R.id.cb_fifth_good_solution_1);
        CheckBox fifthGoodSolution2=(CheckBox)findViewById(R.id.cb_fifth_good_solution_2);
        if (!fifthBadSolution.isChecked()&&fifthGoodSolution1.isChecked()&&fifthGoodSolution2.isChecked()){
            good=true;
        }
        return good;
    }

}
