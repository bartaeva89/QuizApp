package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

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
}
