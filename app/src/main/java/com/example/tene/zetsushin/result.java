package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class result extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int sum = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        int q1_a = intent.getIntExtra("q1_answer",0);
        int q2_a = intent.getIntExtra("q2_answer",0);

        if(q1_a==2131558543) sum=sum+50;
        if(q2_a==2131558543) sum=sum+50;

        TextView ScoreView = (TextView) findViewById(R.id.score);
        ScoreView.setText(String.valueOf(sum));

        //TextView IdView = (TextView) findViewById(R.id.IdView);
        //IdView.setText(String.valueOf(q2_a));

    }

}
