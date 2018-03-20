package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v){
        ScrollView questionView=(ScrollView)findViewById(R.id.question_view);
        ImageView tittleView=(ImageView)findViewById(R.id.title_view);
        Button startButton=(Button)findViewById(R.id.start_button);
        questionView.setVisibility(View.VISIBLE);
        tittleView.setVisibility(View.GONE);
        startButton.setVisibility(View.GONE);
    }

    public void checkResult(View v){
        TextView resultText=(TextView)findViewById(R.id.resultText);
        ScrollView questionView=(ScrollView)findViewById(R.id.question_view);
        ImageView tittleView=(ImageView)findViewById(R.id.title_view);
        Button startButton=(Button)findViewById(R.id.start_button);
        questionView.setVisibility(View.GONE);
        tittleView.setVisibility(View.VISIBLE);
        startButton.setVisibility(View.GONE);
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
        resultText.setVisibility(View.VISIBLE);
        resultText.setText(getString(R.string.correct_answer_message)+score);


    }

    private boolean checkOne(){
        boolean good=false;
        RadioButton firstSolution=(RadioButton) findViewById(R.id.first_solution);
        if (firstSolution.isChecked()){
            good=true;
        }
        return good;
    }

    private boolean checkTwo(){
        boolean good=false;
        EditText secondSolution=(EditText)findViewById(R.id.second_solution);
        if (secondSolution.getText().toString().equals("8")){
            good=true;
        }
        return good;
    }

    private boolean checkThree(){
        boolean good=false;
        CheckBox thirdBadSolution1=(CheckBox)findViewById(R.id.third_bad_solution_1);
        CheckBox thirdBadSolution2=(CheckBox)findViewById(R.id.third_bad_solution_2);
        CheckBox thirdGoodSolution1=(CheckBox)findViewById(R.id.third_good_solution_1);
        CheckBox thirdGoodSolution2=(CheckBox)findViewById(R.id.third_good_solution_2);
        if (!thirdBadSolution1.isChecked()&&!thirdBadSolution2.isChecked()&&thirdGoodSolution1.isChecked()&&thirdGoodSolution2.isChecked()){
            good=true;
        }
        return good;
    }

    private boolean checkFour(){
        boolean good=false;
        RadioButton forthSolution=(RadioButton)findViewById(R.id.forth_solution);
        if (forthSolution.isChecked()){
            good=true;
        }
        return good;
    }

    private boolean checkFive(){
        boolean good=false;
        CheckBox fifthBadSolution=(CheckBox)findViewById(R.id.fifth_bad_solution);
        CheckBox fifthGoodSolution1=(CheckBox)findViewById(R.id.fifth_good_solution_1);
        CheckBox fifthGoodSolution2=(CheckBox)findViewById(R.id.fifth_good_solution_2);
        if (!fifthBadSolution.isChecked()&&fifthGoodSolution1.isChecked()&&fifthGoodSolution2.isChecked()){
            good=true;
        }
        return good;
    }

}
