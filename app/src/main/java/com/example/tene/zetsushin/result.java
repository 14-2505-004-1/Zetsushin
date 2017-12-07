package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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


        if(q1_a==2131296374) sum=sum+50;
        if(q2_a==2131296384) sum=sum+50;

        TextView ScoreView = (TextView) findViewById(R.id.score);
        ScoreView.setText(String.valueOf(sum));

        RadioGroup rg_q1_r=(RadioGroup) findViewById(R.id.q1_rg_r);
        //rg_q1_r.setEnabled(false);

        rg_q1_r.check(q1_a);

        RadioButton rb_1 = (RadioButton)findViewById(R.id.radioButton);
        RadioButton rb_2 = (RadioButton)findViewById(R.id.radioButton2);
        RadioButton rb_3 = (RadioButton)findViewById(R.id.radioButton3);
        RadioButton rb_4 = (RadioButton)findViewById(R.id.radioButton4);
        RadioButton rb_5 = (RadioButton)findViewById(R.id.radioButton5);
        if(q1_a==2131296374) {
            rb_2.setEnabled(false);
            rb_3.setEnabled(false);
            rb_4.setEnabled(false);
            rb_5.setEnabled(false);
        }else if(q1_a==2131296375){
            rb_1.setEnabled(false);
            rb_3.setEnabled(false);
            rb_4.setEnabled(false);
            rb_5.setEnabled(false);
        }else if(q1_a==2131296377){
            rb_1.setEnabled(false);
            rb_2.setEnabled(false);
            rb_4.setEnabled(false);
            rb_5.setEnabled(false);
        }else if(q1_a==2131296379){
            rb_1.setEnabled(false);
            rb_2.setEnabled(false);
            rb_3.setEnabled(false);
            rb_5.setEnabled(false);
        }else if(q1_a==2131296381){
            rb_1.setEnabled(false);
            rb_2.setEnabled(false);
            rb_3.setEnabled(false);
            rb_4.setEnabled(false);
        }

        RadioGroup rg_q2_r=(RadioGroup) findViewById(R.id.q2_rg_r);
        //rg_q2_r.setEnabled(false);

        rg_q2_r.check(q2_a);

        RadioButton rb_1_2 = (RadioButton)findViewById(R.id.radioButton_2);
        RadioButton rb_2_2 = (RadioButton)findViewById(R.id.radioButton2_2);
        RadioButton rb_3_2 = (RadioButton)findViewById(R.id.radioButton3_2);
        RadioButton rb_4_2 = (RadioButton)findViewById(R.id.radioButton4_2);
        RadioButton rb_5_2 = (RadioButton)findViewById(R.id.radioButton5_2);
        if(q2_a==2131296384) {
            rb_2_2.setEnabled(false);
            rb_3_2.setEnabled(false);
            rb_4_2.setEnabled(false);
            rb_5_2.setEnabled(false);
        }else if(q2_a==2131296376){
            rb_1_2.setEnabled(false);
            rb_3_2.setEnabled(false);
            rb_4_2.setEnabled(false);
            rb_5_2.setEnabled(false);
        }else if(q2_a==2131296378){
            rb_1_2.setEnabled(false);
            rb_2_2.setEnabled(false);
            rb_4_2.setEnabled(false);
            rb_5_2.setEnabled(false);
        }else if(q2_a==2131296380){
            rb_1_2.setEnabled(false);
            rb_2_2.setEnabled(false);
            rb_3_2.setEnabled(false);
            rb_5_2.setEnabled(false);
        }else if(q2_a==2131296382){
            rb_1_2.setEnabled(false);
            rb_2_2.setEnabled(false);
            rb_3_2.setEnabled(false);
            rb_4_2.setEnabled(false);
        }

        //TextView IdView = (TextView) findViewById(R.id.IdView);
        //IdView.setText(String.valueOf(q2_a));


    }
    @Override
    public void onBackPressed(){

    }

}
