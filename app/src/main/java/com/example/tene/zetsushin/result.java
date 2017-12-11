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

        int q1_1_rb_id = intent.getIntExtra("q1_1_setId",0);
        int q1_2_rb_id = intent.getIntExtra("q1_2_setId",0);
        int q1_3_rb_id = intent.getIntExtra("q1_3_setId",0);
        int q1_4_rb_id = intent.getIntExtra("q1_4_setId",0);
        int q1_5_rb_id = intent.getIntExtra("q1_5_setId",0);

        int q2_a = intent.getIntExtra("q2_answer",0);
        int q2_rb1_id = intent.getIntExtra("q2_rb1_setId",0);
        int q2_rb2_id = intent.getIntExtra("q2_rb2_setId",0);
        int q2_rb3_id = intent.getIntExtra("q2_rb3_setId",0);
        int q2_rb4_id = intent.getIntExtra("q2_rb4_setId",0);
        int q2_rb5_id = intent.getIntExtra("q2_rb5_setId",0);

        int q3_a = intent.getIntExtra("q3_answer",0);
        int q3_rb1_id = intent.getIntExtra("q3_rb1_setId",0);
        int q3_rb2_id = intent.getIntExtra("q3_rb2_setId",0);
        int q3_rb3_id = intent.getIntExtra("q3_rb3_setId",0);
        int q3_rb4_id = intent.getIntExtra("q3_rb4_setId",0);
        int q3_rb5_id = intent.getIntExtra("q3_rb5_setId",0);

        int q4_a = intent.getIntExtra("q4_answer",0);
        int q4_rb1_id = intent.getIntExtra("q4_rb1_setId",0);
        int q4_rb2_id = intent.getIntExtra("q4_rb2_setId",0);
        int q4_rb3_id = intent.getIntExtra("q4_rb3_setId",0);
        int q4_rb4_id = intent.getIntExtra("q4_rb4_setId",0);
        int q4_rb5_id = intent.getIntExtra("q4_rb5_setId",0);

        int q5_a = intent.getIntExtra("q5_answer",0);
        int q5_rb1_id = intent.getIntExtra("q5_rb1_setId",0);
        int q5_rb2_id = intent.getIntExtra("q5_rb2_setId",0);
        int q5_rb3_id = intent.getIntExtra("q5_rb3_setId",0);
        int q5_rb4_id = intent.getIntExtra("q5_rb4_setId",0);
        int q5_rb5_id = intent.getIntExtra("q5_rb5_setId",0);

        int q6_a = intent.getIntExtra("q6_answer",0);
        int q6_rb1_id = intent.getIntExtra("q6_rb1_setId",0);
        int q6_rb2_id = intent.getIntExtra("q6_rb2_setId",0);
        int q6_rb3_id = intent.getIntExtra("q6_rb3_setId",0);
        int q6_rb4_id = intent.getIntExtra("q6_rb4_setId",0);
        int q6_rb5_id = intent.getIntExtra("q6_rb5_setId",0);

        int q7_a = intent.getIntExtra("q7_answer",0);
        int q7_rb1_id = intent.getIntExtra("q7_rb1_setId",0);
        int q7_rb2_id = intent.getIntExtra("q7_rb2_setId",0);
        int q7_rb3_id = intent.getIntExtra("q7_rb3_setId",0);
        int q7_rb4_id = intent.getIntExtra("q7_rb4_setId",0);
        int q7_rb5_id = intent.getIntExtra("q7_rb5_setId",0);

        int q8_a = intent.getIntExtra("q8_answer",0);
        int q8_rb1_id = intent.getIntExtra("q8_rb1_setId",0);
        int q8_rb2_id = intent.getIntExtra("q8_rb2_setId",0);
        int q8_rb3_id = intent.getIntExtra("q8_rb3_setId",0);
        int q8_rb4_id = intent.getIntExtra("q8_rb4_setId",0);
        int q8_rb5_id = intent.getIntExtra("q8_rb5_setId",0);

        int q9_a = intent.getIntExtra("q9_answer",0);
        int q9_rb1_id = intent.getIntExtra("q9_rb1_setId",0);
        int q9_rb2_id = intent.getIntExtra("q9_rb2_setId",0);
        int q9_rb3_id = intent.getIntExtra("q9_rb3_setId",0);
        int q9_rb4_id = intent.getIntExtra("q9_rb4_setId",0);
        int q9_rb5_id = intent.getIntExtra("q9_rb5_setId",0);

        int q10_a = intent.getIntExtra("q10_answer",0);
        int q10_rb1_id = intent.getIntExtra("q10_rb1_setId",0);
        int q10_rb2_id = intent.getIntExtra("q10_rb2_setId",0);
        int q10_rb3_id = intent.getIntExtra("q10_rb3_setId",0);
        int q10_rb4_id = intent.getIntExtra("q10_rb4_setId",0);
        int q10_rb5_id = intent.getIntExtra("q10_rb5_setId",0);

        int q11_a = intent.getIntExtra("q11_answer",0);
        int q11_rb1_id = intent.getIntExtra("q11_rb1_setId",0);
        int q11_rb2_id = intent.getIntExtra("q11_rb2_setId",0);
        int q11_rb3_id = intent.getIntExtra("q11_rb3_setId",0);
        int q11_rb4_id = intent.getIntExtra("q11_rb4_setId",0);
        int q11_rb5_id = intent.getIntExtra("q11_rb5_setId",0);


        int q12_a = intent.getIntExtra("q12_answer",0);
        int q12_rb1_id = intent.getIntExtra("q12_rb1_setId",0);
        int q12_rb2_id = intent.getIntExtra("q12_rb2_setId",0);
        int q12_rb3_id = intent.getIntExtra("q12_rb3_setId",0);
        int q12_rb4_id = intent.getIntExtra("q12_rb4_setId",0);
        int q12_rb5_id = intent.getIntExtra("q12_rb5_setId",0);

        int q13_a = intent.getIntExtra("q13_answer",0);
        int q13_rb1_id = intent.getIntExtra("q13_rb1_setId",0);
        int q13_rb2_id = intent.getIntExtra("q13_rb2_setId",0);
        int q13_rb3_id = intent.getIntExtra("q13_rb3_setId",0);
        int q13_rb4_id = intent.getIntExtra("q13_rb4_setId",0);
        int q13_rb5_id = intent.getIntExtra("q13_rb5_setId",0);

        int q14_a = intent.getIntExtra("q14_answer",0);
        int q14_rb1_id = intent.getIntExtra("q14_rb1_setId",0);
        int q14_rb2_id = intent.getIntExtra("q14_rb2_setId",0);
        int q14_rb3_id = intent.getIntExtra("q14_rb3_setId",0);
        int q14_rb4_id = intent.getIntExtra("q14_rb4_setId",0);
        int q14_rb5_id = intent.getIntExtra("q14_rb5_setId",0);


        int q15_a = intent.getIntExtra("q15_answer",0);
        int q15_rb1_id = intent.getIntExtra("q15_rb1_setId",0);
        int q15_rb2_id = intent.getIntExtra("q15_rb2_setId",0);
        int q15_rb3_id = intent.getIntExtra("q15_rb3_setId",0);
        int q15_rb4_id = intent.getIntExtra("q15_rb4_setId",0);
        int q15_rb5_id = intent.getIntExtra("q15_rb5_setId",0);

        int q16_a = intent.getIntExtra("q16_answer",0);
        int q16_rb1_id = intent.getIntExtra("q16_rb1_setId",0);
        int q16_rb2_id = intent.getIntExtra("q16_rb2_setId",0);
        int q16_rb3_id = intent.getIntExtra("q16_rb3_setId",0);
        int q16_rb4_id = intent.getIntExtra("q16_rb4_setId",0);
        int q16_rb5_id = intent.getIntExtra("q16_rb5_setId",0);

        int q17_a = intent.getIntExtra("q17_answer",0);
        int q17_rb1_id = intent.getIntExtra("q17_rb1_setId",0);
        int q17_rb2_id = intent.getIntExtra("q17_rb2_setId",0);
        int q17_rb3_id = intent.getIntExtra("q17_rb3_setId",0);
        int q17_rb4_id = intent.getIntExtra("q17_rb4_setId",0);
        int q17_rb5_id = intent.getIntExtra("q17_rb5_setId",0);

        int q18_a = intent.getIntExtra("q18_answer",0);
        int q18_rb1_id = intent.getIntExtra("q18_rb1_setId",0);
        int q18_rb2_id = intent.getIntExtra("q18_rb2_setId",0);
        int q18_rb3_id = intent.getIntExtra("q18_rb3_setId",0);
        int q18_rb4_id = intent.getIntExtra("q18_rb4_setId",0);
        int q18_rb5_id = intent.getIntExtra("q18_rb5_setId",0);

        int q19_a = intent.getIntExtra("q19_answer",0);
        int q19_rb1_id = intent.getIntExtra("q19_rb1_setId",0);
        int q19_rb2_id = intent.getIntExtra("q19_rb2_setId",0);
        int q19_rb3_id = intent.getIntExtra("q19_rb3_setId",0);
        int q19_rb4_id = intent.getIntExtra("q19_rb4_setId",0);
        int q19_rb5_id = intent.getIntExtra("q19_rb5_setId",0);


        int q20_a = intent.getIntExtra("q20_answer",0);
        int q20_rb1_id = intent.getIntExtra("q20_rb1_setId",0);
        int q20_rb2_id = intent.getIntExtra("q20_rb2_setId",0);
        int q20_rb3_id = intent.getIntExtra("q20_rb3_setId",0);
        int q20_rb4_id = intent.getIntExtra("q20_rb4_setId",0);
        int q20_rb5_id = intent.getIntExtra("q20_rb5_setId",0);

        if(q1_a==q1_1_rb_id)    sum=sum+5;
        if(q2_a==q2_rb1_id)     sum=sum+5;
        if(q3_a==q3_rb4_id)     sum=sum+5;
        if(q4_a==q4_rb2_id)     sum=sum+5;
        if(q5_a==q5_rb4_id)     sum=sum+5;
        if(q6_a==q6_rb5_id)     sum=sum+5;
        if(q7_a==q7_rb5_id)     sum=sum+5;
        if(q8_a==q8_rb4_id)     sum=sum+5;
        if(q9_a==q9_rb5_id)     sum=sum+5;
        if(q10_a==q10_rb1_id)     sum=sum+5;
        if(q11_a==q11_rb4_id)     sum=sum+5;
        if(q12_a==q12_rb3_id)     sum=sum+5;
        if(q13_a==q13_rb1_id)     sum=sum+5;
        if(q14_a==q14_rb2_id)     sum=sum+5;
        if(q15_a==q15_rb4_id)     sum=sum+5;
        if(q16_a==q16_rb3_id)     sum=sum+5;
        if(q17_a==q17_rb5_id)     sum=sum+5;
        if(q18_a==q18_rb3_id)     sum=sum+5;
        if(q19_a==q19_rb2_id)     sum=sum+5;
        if(q20_a==q20_rb3_id)     sum=sum+5;



        TextView ScoreView = (TextView) findViewById(R.id.score);
        ScoreView.setText(String.valueOf(sum));

        RadioGroup rg_q1_r=(RadioGroup) findViewById(R.id.q1_rg_r);


        rg_q1_r.check(q1_a);

        RadioButton rb_1 = (RadioButton)findViewById(R.id.radioButton);
        RadioButton rb_2 = (RadioButton)findViewById(R.id.radioButton2);
        RadioButton rb_3 = (RadioButton)findViewById(R.id.radioButton3);
        RadioButton rb_4 = (RadioButton)findViewById(R.id.radioButton4);
        RadioButton rb_5 = (RadioButton)findViewById(R.id.radioButton5);
        if(q1_a==q1_1_rb_id) {
            rb_2.setEnabled(false);
            rb_3.setEnabled(false);
            rb_4.setEnabled(false);
            rb_5.setEnabled(false);
        }else if(q1_a==q1_2_rb_id){
            rb_1.setEnabled(false);
            rb_3.setEnabled(false);
            rb_4.setEnabled(false);
            rb_5.setEnabled(false);
        }else if(q1_a==q1_3_rb_id){
            rb_1.setEnabled(false);
            rb_2.setEnabled(false);
            rb_4.setEnabled(false);
            rb_5.setEnabled(false);
        }else if(q1_a==q1_4_rb_id){
            rb_1.setEnabled(false);
            rb_2.setEnabled(false);
            rb_3.setEnabled(false);
            rb_5.setEnabled(false);
        }else if(q1_a==q1_5_rb_id){
            rb_1.setEnabled(false);
            rb_2.setEnabled(false);
            rb_3.setEnabled(false);
            rb_4.setEnabled(false);
        }

        RadioGroup rg_q2_r=(RadioGroup) findViewById(R.id.q2_rg_r);

        rg_q2_r.check(q2_a);

        RadioButton rb_r1_2 = (RadioButton)findViewById(R.id.radioButton_2);
        RadioButton rb_r2_2 = (RadioButton)findViewById(R.id.radioButton2_2);
        RadioButton rb_r3_2 = (RadioButton)findViewById(R.id.radioButton3_2);
        RadioButton rb_r4_2 = (RadioButton)findViewById(R.id.radioButton4_2);
        RadioButton rb_r5_2 = (RadioButton)findViewById(R.id.radioButton5_2);
        if(q2_a==q2_rb1_id) {
            rb_r2_2.setEnabled(false);
            rb_r3_2.setEnabled(false);
            rb_r4_2.setEnabled(false);
            rb_r5_2.setEnabled(false);
        }else if(q2_a==q2_rb2_id){
            rb_r1_2.setEnabled(false);
            rb_r3_2.setEnabled(false);
            rb_r4_2.setEnabled(false);
            rb_r5_2.setEnabled(false);
        }else if(q2_a==q2_rb3_id){
            rb_r1_2.setEnabled(false);
            rb_r2_2.setEnabled(false);
            rb_r4_2.setEnabled(false);
            rb_r5_2.setEnabled(false);
        }else if(q2_a==q2_rb4_id){
            rb_r1_2.setEnabled(false);
            rb_r2_2.setEnabled(false);
            rb_r3_2.setEnabled(false);
            rb_r5_2.setEnabled(false);
        }else if(q2_a==q2_rb5_id){
            rb_r1_2.setEnabled(false);
            rb_r2_2.setEnabled(false);
            rb_r3_2.setEnabled(false);
            rb_r4_2.setEnabled(false);
        }

        RadioGroup rg_q3_r=(RadioGroup) findViewById(R.id.q3_rg_r);

        rg_q3_r.check(q3_a);

        RadioButton rb_r1_3 = (RadioButton)findViewById(R.id.radioButton_3);
        RadioButton rb_r2_3 = (RadioButton)findViewById(R.id.radioButton2_3);
        RadioButton rb_r3_3 = (RadioButton)findViewById(R.id.radioButton3_3);
        RadioButton rb_r4_3 = (RadioButton)findViewById(R.id.radioButton4_3);
        RadioButton rb_r5_3 = (RadioButton)findViewById(R.id.radioButton5_3);
        if(q3_a==q3_rb1_id) {
            rb_r2_3.setEnabled(false);
            rb_r3_3.setEnabled(false);
            rb_r4_3.setEnabled(false);
            rb_r5_3.setEnabled(false);
        }else if(q3_a==q3_rb2_id){
            rb_r1_3.setEnabled(false);
            rb_r3_3.setEnabled(false);
            rb_r4_3.setEnabled(false);
            rb_r5_3.setEnabled(false);
        }else if(q3_a==q3_rb3_id){
            rb_r1_3.setEnabled(false);
            rb_r2_3.setEnabled(false);
            rb_r4_3.setEnabled(false);
            rb_r5_3.setEnabled(false);
        }else if(q3_a==q3_rb4_id){
            rb_r1_3.setEnabled(false);
            rb_r2_3.setEnabled(false);
            rb_r3_3.setEnabled(false);
            rb_r5_3.setEnabled(false);
        }else if(q3_a==q3_rb5_id){
            rb_r1_3.setEnabled(false);
            rb_r2_3.setEnabled(false);
            rb_r3_3.setEnabled(false);
            rb_r4_3.setEnabled(false);
        }

        RadioGroup rg_q4_r=(RadioGroup) findViewById(R.id.q4_rg_r);

        rg_q4_r.check(q4_a);

        RadioButton rb_r1_4 = (RadioButton)findViewById(R.id.radioButton_4);
        RadioButton rb_r2_4 = (RadioButton)findViewById(R.id.radioButton2_4);
        RadioButton rb_r3_4 = (RadioButton)findViewById(R.id.radioButton3_4);
        RadioButton rb_r4_4 = (RadioButton)findViewById(R.id.radioButton4_4);
        RadioButton rb_r5_4 = (RadioButton)findViewById(R.id.radioButton5_4);
        if(q4_a==q4_rb1_id) {
            rb_r2_4.setEnabled(false);
            rb_r3_4.setEnabled(false);
            rb_r4_4.setEnabled(false);
            rb_r5_4.setEnabled(false);
        }else if(q4_a==q4_rb2_id){
            rb_r1_4.setEnabled(false);
            rb_r3_4.setEnabled(false);
            rb_r4_4.setEnabled(false);
            rb_r5_4.setEnabled(false);
        }else if(q4_a==q4_rb3_id){
            rb_r1_4.setEnabled(false);
            rb_r2_4.setEnabled(false);
            rb_r4_4.setEnabled(false);
            rb_r5_4.setEnabled(false);
        }else if(q4_a==q4_rb4_id){
            rb_r1_4.setEnabled(false);
            rb_r2_4.setEnabled(false);
            rb_r3_4.setEnabled(false);
            rb_r5_4.setEnabled(false);
        }else if(q4_a==q4_rb5_id){
            rb_r1_4.setEnabled(false);
            rb_r2_4.setEnabled(false);
            rb_r3_4.setEnabled(false);
            rb_r4_4.setEnabled(false);
        }

        RadioGroup rg_q5_r=(RadioGroup) findViewById(R.id.q5_rg_r);

        rg_q5_r.check(q5_a);

        RadioButton rb_r1_5 = (RadioButton)findViewById(R.id.radioButton_5);
        RadioButton rb_r2_5 = (RadioButton)findViewById(R.id.radioButton2_5);
        RadioButton rb_r3_5 = (RadioButton)findViewById(R.id.radioButton3_5);
        RadioButton rb_r4_5 = (RadioButton)findViewById(R.id.radioButton4_5);
        RadioButton rb_r5_5 = (RadioButton)findViewById(R.id.radioButton5_5);
        if(q5_a==q5_rb1_id) {
            rb_r2_5.setEnabled(false);
            rb_r3_5.setEnabled(false);
            rb_r4_5.setEnabled(false);
            rb_r5_5.setEnabled(false);
        }else if(q5_a==q5_rb2_id){
            rb_r1_5.setEnabled(false);
            rb_r3_5.setEnabled(false);
            rb_r4_5.setEnabled(false);
            rb_r5_5.setEnabled(false);
        }else if(q5_a==q5_rb3_id){
            rb_r1_5.setEnabled(false);
            rb_r2_5.setEnabled(false);
            rb_r4_5.setEnabled(false);
            rb_r5_5.setEnabled(false);
        }else if(q5_a==q5_rb4_id){
            rb_r1_5.setEnabled(false);
            rb_r2_5.setEnabled(false);
            rb_r3_5.setEnabled(false);
            rb_r5_5.setEnabled(false);
        }else if(q5_a==q5_rb5_id){
            rb_r1_5.setEnabled(false);
            rb_r2_5.setEnabled(false);
            rb_r3_5.setEnabled(false);
            rb_r4_5.setEnabled(false);
        }


        RadioGroup rg_q6_r=(RadioGroup) findViewById(R.id.q6_rg_r);

        rg_q6_r.check(q6_a);

        RadioButton rb_r1_6 = (RadioButton)findViewById(R.id.radioButton_6);
        RadioButton rb_r2_6 = (RadioButton)findViewById(R.id.radioButton2_6);
        RadioButton rb_r3_6 = (RadioButton)findViewById(R.id.radioButton3_6);
        RadioButton rb_r4_6 = (RadioButton)findViewById(R.id.radioButton4_6);
        RadioButton rb_r5_6 = (RadioButton)findViewById(R.id.radioButton5_6);
        if(q6_a==q6_rb1_id) {
            rb_r2_6.setEnabled(false);
            rb_r3_6.setEnabled(false);
            rb_r4_6.setEnabled(false);
            rb_r5_6.setEnabled(false);
        }else if(q6_a==q6_rb2_id){
            rb_r1_6.setEnabled(false);
            rb_r3_6.setEnabled(false);
            rb_r4_6.setEnabled(false);
            rb_r5_6.setEnabled(false);
        }else if(q6_a==q6_rb3_id){
            rb_r1_6.setEnabled(false);
            rb_r2_6.setEnabled(false);
            rb_r4_6.setEnabled(false);
            rb_r5_6.setEnabled(false);
        }else if(q6_a==q6_rb4_id){
            rb_r1_6.setEnabled(false);
            rb_r2_6.setEnabled(false);
            rb_r3_6.setEnabled(false);
            rb_r5_6.setEnabled(false);
        }else if(q6_a==q6_rb5_id){
            rb_r1_6.setEnabled(false);
            rb_r2_6.setEnabled(false);
            rb_r3_6.setEnabled(false);
            rb_r4_6.setEnabled(false);
        }

        RadioGroup rg_q7_r=(RadioGroup) findViewById(R.id.q7_rg_r);

        rg_q7_r.check(q7_a);

        RadioButton rb_r1_7 = (RadioButton)findViewById(R.id.radioButton_7);
        RadioButton rb_r2_7 = (RadioButton)findViewById(R.id.radioButton2_7);
        RadioButton rb_r3_7 = (RadioButton)findViewById(R.id.radioButton3_7);
        RadioButton rb_r4_7 = (RadioButton)findViewById(R.id.radioButton4_7);
        RadioButton rb_r5_7 = (RadioButton)findViewById(R.id.radioButton5_7);
        if(q7_a==q7_rb1_id) {
            rb_r2_7.setEnabled(false);
            rb_r3_7.setEnabled(false);
            rb_r4_7.setEnabled(false);
            rb_r5_7.setEnabled(false);
        }else if(q7_a==q7_rb2_id){
            rb_r1_7.setEnabled(false);
            rb_r3_7.setEnabled(false);
            rb_r4_7.setEnabled(false);
            rb_r5_7.setEnabled(false);
        }else if(q7_a==q7_rb3_id){
            rb_r1_7.setEnabled(false);
            rb_r2_7.setEnabled(false);
            rb_r4_7.setEnabled(false);
            rb_r5_7.setEnabled(false);
        }else if(q7_a==q7_rb4_id){
            rb_r1_7.setEnabled(false);
            rb_r2_7.setEnabled(false);
            rb_r3_7.setEnabled(false);
            rb_r5_7.setEnabled(false);
        }else if(q7_a==q7_rb5_id){
            rb_r1_7.setEnabled(false);
            rb_r2_7.setEnabled(false);
            rb_r3_7.setEnabled(false);
            rb_r4_7.setEnabled(false);
        }

        RadioGroup rg_q8_r=(RadioGroup) findViewById(R.id.q8_rg_r);

        rg_q8_r.check(q8_a);

        RadioButton rb_r1_8 = (RadioButton)findViewById(R.id.radioButton_8);
        RadioButton rb_r2_8 = (RadioButton)findViewById(R.id.radioButton2_8);
        RadioButton rb_r3_8 = (RadioButton)findViewById(R.id.radioButton3_8);
        RadioButton rb_r4_8 = (RadioButton)findViewById(R.id.radioButton4_8);
        RadioButton rb_r5_8 = (RadioButton)findViewById(R.id.radioButton5_8);
        if(q8_a==q8_rb1_id) {
            rb_r2_8.setEnabled(false);
            rb_r3_8.setEnabled(false);
            rb_r4_8.setEnabled(false);
            rb_r5_8.setEnabled(false);
        }else if(q8_a==q8_rb2_id){
            rb_r1_8.setEnabled(false);
            rb_r3_8.setEnabled(false);
            rb_r4_8.setEnabled(false);
            rb_r5_8.setEnabled(false);
        }else if(q8_a==q8_rb3_id){
            rb_r1_8.setEnabled(false);
            rb_r2_8.setEnabled(false);
            rb_r4_8.setEnabled(false);
            rb_r5_8.setEnabled(false);
        }else if(q8_a==q8_rb4_id){
            rb_r1_8.setEnabled(false);
            rb_r2_8.setEnabled(false);
            rb_r3_8.setEnabled(false);
            rb_r5_8.setEnabled(false);
        }else if(q8_a==q8_rb5_id){
            rb_r1_8.setEnabled(false);
            rb_r2_8.setEnabled(false);
            rb_r3_8.setEnabled(false);
            rb_r4_8.setEnabled(false);
        }
        RadioGroup rg_q9_r=(RadioGroup) findViewById(R.id.q9_rg_r);

        rg_q9_r.check(q9_a);

        RadioButton rb_r1_9 = (RadioButton)findViewById(R.id.radioButton_9);
        RadioButton rb_r2_9 = (RadioButton)findViewById(R.id.radioButton2_9);
        RadioButton rb_r3_9 = (RadioButton)findViewById(R.id.radioButton3_9);
        RadioButton rb_r4_9 = (RadioButton)findViewById(R.id.radioButton4_9);
        RadioButton rb_r5_9 = (RadioButton)findViewById(R.id.radioButton5_9);
        if(q9_a==q9_rb1_id) {
            rb_r2_9.setEnabled(false);
            rb_r3_9.setEnabled(false);
            rb_r4_9.setEnabled(false);
            rb_r5_9.setEnabled(false);
        }else if(q9_a==q9_rb2_id){
            rb_r1_9.setEnabled(false);
            rb_r3_9.setEnabled(false);
            rb_r4_9.setEnabled(false);
            rb_r5_9.setEnabled(false);
        }else if(q9_a==q9_rb3_id){
            rb_r1_9.setEnabled(false);
            rb_r2_9.setEnabled(false);
            rb_r4_9.setEnabled(false);
            rb_r5_9.setEnabled(false);
        }else if(q9_a==q9_rb4_id){
            rb_r1_9.setEnabled(false);
            rb_r2_9.setEnabled(false);
            rb_r3_9.setEnabled(false);
            rb_r5_9.setEnabled(false);
        }else if(q9_a==q9_rb5_id){
            rb_r1_9.setEnabled(false);
            rb_r2_9.setEnabled(false);
            rb_r3_9.setEnabled(false);
            rb_r4_9.setEnabled(false);
        }

        RadioGroup rg_q10_r=(RadioGroup) findViewById(R.id.q10_rg_r);

        rg_q10_r.check(q10_a);

        RadioButton rb_r1_10 = (RadioButton)findViewById(R.id.radioButton_10);
        RadioButton rb_r2_10 = (RadioButton)findViewById(R.id.radioButton2_10);
        RadioButton rb_r3_10 = (RadioButton)findViewById(R.id.radioButton3_10);
        RadioButton rb_r4_10 = (RadioButton)findViewById(R.id.radioButton4_10);
        RadioButton rb_r5_10 = (RadioButton)findViewById(R.id.radioButton5_10);
        if(q10_a==q10_rb1_id) {
            rb_r2_10.setEnabled(false);
            rb_r3_10.setEnabled(false);
            rb_r4_10.setEnabled(false);
            rb_r5_10.setEnabled(false);
        }else if(q10_a==q10_rb2_id){
            rb_r1_10.setEnabled(false);
            rb_r3_10.setEnabled(false);
            rb_r4_10.setEnabled(false);
            rb_r5_10.setEnabled(false);
        }else if(q10_a==q10_rb3_id){
            rb_r1_10.setEnabled(false);
            rb_r2_10.setEnabled(false);
            rb_r4_10.setEnabled(false);
            rb_r5_10.setEnabled(false);
        }else if(q10_a==q10_rb4_id){
            rb_r1_10.setEnabled(false);
            rb_r2_10.setEnabled(false);
            rb_r3_10.setEnabled(false);
            rb_r5_10.setEnabled(false);
        }else if(q10_a==q10_rb5_id){
            rb_r1_10.setEnabled(false);
            rb_r2_10.setEnabled(false);
            rb_r3_10.setEnabled(false);
            rb_r4_10.setEnabled(false);
        }

        RadioGroup rg_q11_r=(RadioGroup) findViewById(R.id.q11_rg_r);

        rg_q11_r.check(q11_a);

        RadioButton rb_r1_11 = (RadioButton)findViewById(R.id.radioButton_11);
        RadioButton rb_r2_11 = (RadioButton)findViewById(R.id.radioButton2_11);
        RadioButton rb_r3_11 = (RadioButton)findViewById(R.id.radioButton3_11);
        RadioButton rb_r4_11 = (RadioButton)findViewById(R.id.radioButton4_11);
        RadioButton rb_r5_11 = (RadioButton)findViewById(R.id.radioButton5_11);
        if(q11_a==q11_rb1_id) {
            rb_r2_11.setEnabled(false);
            rb_r3_11.setEnabled(false);
            rb_r4_11.setEnabled(false);
            rb_r5_11.setEnabled(false);
        }else if(q11_a==q11_rb2_id){
            rb_r1_11.setEnabled(false);
            rb_r3_11.setEnabled(false);
            rb_r4_11.setEnabled(false);
            rb_r5_11.setEnabled(false);
        }else if(q11_a==q11_rb3_id){
            rb_r1_11.setEnabled(false);
            rb_r2_11.setEnabled(false);
            rb_r4_11.setEnabled(false);
            rb_r5_11.setEnabled(false);
        }else if(q11_a==q11_rb4_id){
            rb_r1_11.setEnabled(false);
            rb_r2_11.setEnabled(false);
            rb_r3_11.setEnabled(false);
            rb_r5_11.setEnabled(false);
        }else if(q11_a==q11_rb5_id){
            rb_r1_11.setEnabled(false);
            rb_r2_11.setEnabled(false);
            rb_r3_11.setEnabled(false);
            rb_r4_11.setEnabled(false);
        }

        RadioGroup rg_q12_r=(RadioGroup) findViewById(R.id.q12_rg_r);

        rg_q12_r.check(q12_a);

        RadioButton rb_r1_12 = (RadioButton)findViewById(R.id.radioButton_12);
        RadioButton rb_r2_12 = (RadioButton)findViewById(R.id.radioButton2_12);
        RadioButton rb_r3_12 = (RadioButton)findViewById(R.id.radioButton3_12);
        RadioButton rb_r4_12 = (RadioButton)findViewById(R.id.radioButton4_12);
        RadioButton rb_r5_12 = (RadioButton)findViewById(R.id.radioButton5_12);
        if(q12_a==q12_rb1_id) {
            rb_r2_12.setEnabled(false);
            rb_r3_12.setEnabled(false);
            rb_r4_12.setEnabled(false);
            rb_r5_12.setEnabled(false);
        }else if(q12_a==q12_rb2_id){
            rb_r1_12.setEnabled(false);
            rb_r3_12.setEnabled(false);
            rb_r4_12.setEnabled(false);
            rb_r5_12.setEnabled(false);
        }else if(q12_a==q12_rb3_id){
            rb_r1_12.setEnabled(false);
            rb_r2_12.setEnabled(false);
            rb_r4_12.setEnabled(false);
            rb_r5_12.setEnabled(false);
        }else if(q12_a==q12_rb4_id){
            rb_r1_12.setEnabled(false);
            rb_r2_12.setEnabled(false);
            rb_r3_12.setEnabled(false);
            rb_r5_12.setEnabled(false);
        }else if(q12_a==q12_rb5_id){
            rb_r1_12.setEnabled(false);
            rb_r2_12.setEnabled(false);
            rb_r3_12.setEnabled(false);
            rb_r4_12.setEnabled(false);
        }

        RadioGroup rg_q13_r=(RadioGroup) findViewById(R.id.q13_rg_r);

        rg_q13_r.check(q13_a);

        RadioButton rb_r1_13 = (RadioButton)findViewById(R.id.radioButton_13);
        RadioButton rb_r2_13 = (RadioButton)findViewById(R.id.radioButton2_13);
        RadioButton rb_r3_13 = (RadioButton)findViewById(R.id.radioButton3_13);
        RadioButton rb_r4_13 = (RadioButton)findViewById(R.id.radioButton4_13);
        RadioButton rb_r5_13 = (RadioButton)findViewById(R.id.radioButton5_13);
        if(q13_a==q13_rb1_id) {
            rb_r2_13.setEnabled(false);
            rb_r3_13.setEnabled(false);
            rb_r4_13.setEnabled(false);
            rb_r5_13.setEnabled(false);
        }else if(q13_a==q13_rb2_id){
            rb_r1_13.setEnabled(false);
            rb_r3_13.setEnabled(false);
            rb_r4_13.setEnabled(false);
            rb_r5_13.setEnabled(false);
        }else if(q13_a==q13_rb3_id){
            rb_r1_13.setEnabled(false);
            rb_r2_13.setEnabled(false);
            rb_r4_13.setEnabled(false);
            rb_r5_13.setEnabled(false);
        }else if(q13_a==q13_rb4_id){
            rb_r1_13.setEnabled(false);
            rb_r2_13.setEnabled(false);
            rb_r3_13.setEnabled(false);
            rb_r5_13.setEnabled(false);
        }else if(q13_a==q13_rb5_id){
            rb_r1_13.setEnabled(false);
            rb_r2_13.setEnabled(false);
            rb_r3_13.setEnabled(false);
            rb_r4_13.setEnabled(false);
        }

        RadioGroup rg_q14_r=(RadioGroup) findViewById(R.id.q14_rg_r);

        rg_q14_r.check(q14_a);

        RadioButton rb_r1_14 = (RadioButton)findViewById(R.id.radioButton_14);
        RadioButton rb_r2_14 = (RadioButton)findViewById(R.id.radioButton2_14);
        RadioButton rb_r3_14 = (RadioButton)findViewById(R.id.radioButton3_14);
        RadioButton rb_r4_14 = (RadioButton)findViewById(R.id.radioButton4_14);
        RadioButton rb_r5_14 = (RadioButton)findViewById(R.id.radioButton5_14);
        if(q14_a==q14_rb1_id) {
            rb_r2_14.setEnabled(false);
            rb_r3_14.setEnabled(false);
            rb_r4_14.setEnabled(false);
            rb_r5_14.setEnabled(false);
        }else if(q14_a==q14_rb2_id){
            rb_r1_14.setEnabled(false);
            rb_r3_14.setEnabled(false);
            rb_r4_14.setEnabled(false);
            rb_r5_14.setEnabled(false);
        }else if(q14_a==q14_rb3_id){
            rb_r1_14.setEnabled(false);
            rb_r2_14.setEnabled(false);
            rb_r4_14.setEnabled(false);
            rb_r5_14.setEnabled(false);
        }else if(q14_a==q14_rb4_id){
            rb_r1_14.setEnabled(false);
            rb_r2_14.setEnabled(false);
            rb_r3_14.setEnabled(false);
            rb_r5_14.setEnabled(false);
        }else if(q14_a==q14_rb5_id){
            rb_r1_14.setEnabled(false);
            rb_r2_14.setEnabled(false);
            rb_r3_14.setEnabled(false);
            rb_r4_14.setEnabled(false);
        }

        RadioGroup rg_q15_r=(RadioGroup) findViewById(R.id.q15_rg_r);

        rg_q15_r.check(q15_a);

        RadioButton rb_r1_15 = (RadioButton)findViewById(R.id.radioButton_15);
        RadioButton rb_r2_15 = (RadioButton)findViewById(R.id.radioButton2_15);
        RadioButton rb_r3_15 = (RadioButton)findViewById(R.id.radioButton3_15);
        RadioButton rb_r4_15 = (RadioButton)findViewById(R.id.radioButton4_15);
        RadioButton rb_r5_15 = (RadioButton)findViewById(R.id.radioButton5_15);
        if(q15_a==q15_rb1_id) {
            rb_r2_15.setEnabled(false);
            rb_r3_15.setEnabled(false);
            rb_r4_15.setEnabled(false);
            rb_r5_15.setEnabled(false);
        }else if(q15_a==q15_rb2_id){
            rb_r1_15.setEnabled(false);
            rb_r3_15.setEnabled(false);
            rb_r4_15.setEnabled(false);
            rb_r5_15.setEnabled(false);
        }else if(q15_a==q15_rb3_id){
            rb_r1_15.setEnabled(false);
            rb_r2_15.setEnabled(false);
            rb_r4_15.setEnabled(false);
            rb_r5_15.setEnabled(false);
        }else if(q15_a==q15_rb4_id){
            rb_r1_15.setEnabled(false);
            rb_r2_15.setEnabled(false);
            rb_r3_15.setEnabled(false);
            rb_r5_15.setEnabled(false);
        }else if(q15_a==q15_rb5_id){
            rb_r1_15.setEnabled(false);
            rb_r2_15.setEnabled(false);
            rb_r3_15.setEnabled(false);
            rb_r4_15.setEnabled(false);
        }


        RadioGroup rg_q16_r=(RadioGroup) findViewById(R.id.q16_rg_r);

        rg_q16_r.check(q16_a);

        RadioButton rb_r1_16 = (RadioButton)findViewById(R.id.radioButton_16);
        RadioButton rb_r2_16 = (RadioButton)findViewById(R.id.radioButton2_16);
        RadioButton rb_r3_16 = (RadioButton)findViewById(R.id.radioButton3_16);
        RadioButton rb_r4_16 = (RadioButton)findViewById(R.id.radioButton4_16);
        RadioButton rb_r5_16 = (RadioButton)findViewById(R.id.radioButton5_16);
        if(q16_a==q16_rb1_id) {
            rb_r2_16.setEnabled(false);
            rb_r3_16.setEnabled(false);
            rb_r4_16.setEnabled(false);
            rb_r5_16.setEnabled(false);
        }else if(q16_a==q16_rb2_id){
            rb_r1_16.setEnabled(false);
            rb_r3_16.setEnabled(false);
            rb_r4_16.setEnabled(false);
            rb_r5_16.setEnabled(false);
        }else if(q16_a==q16_rb3_id){
            rb_r1_16.setEnabled(false);
            rb_r2_16.setEnabled(false);
            rb_r4_16.setEnabled(false);
            rb_r5_16.setEnabled(false);
        }else if(q16_a==q16_rb4_id){
            rb_r1_16.setEnabled(false);
            rb_r2_16.setEnabled(false);
            rb_r3_16.setEnabled(false);
            rb_r5_16.setEnabled(false);
        }else if(q16_a==q16_rb5_id){
            rb_r1_16.setEnabled(false);
            rb_r2_16.setEnabled(false);
            rb_r3_16.setEnabled(false);
            rb_r4_16.setEnabled(false);
        }



        RadioGroup rg_q17_r=(RadioGroup) findViewById(R.id.q17_rg_r);

        rg_q17_r.check(q17_a);

        RadioButton rb_r1_17 = (RadioButton)findViewById(R.id.radioButton_17);
        RadioButton rb_r2_17 = (RadioButton)findViewById(R.id.radioButton2_17);
        RadioButton rb_r3_17 = (RadioButton)findViewById(R.id.radioButton3_17);
        RadioButton rb_r4_17 = (RadioButton)findViewById(R.id.radioButton4_17);
        RadioButton rb_r5_17 = (RadioButton)findViewById(R.id.radioButton5_17);
        if(q17_a==q17_rb1_id) {
            rb_r2_17.setEnabled(false);
            rb_r3_17.setEnabled(false);
            rb_r4_17.setEnabled(false);
            rb_r5_17.setEnabled(false);
        }else if(q17_a==q17_rb2_id){
            rb_r1_17.setEnabled(false);
            rb_r3_17.setEnabled(false);
            rb_r4_17.setEnabled(false);
            rb_r5_17.setEnabled(false);
        }else if(q17_a==q17_rb3_id){
            rb_r1_17.setEnabled(false);
            rb_r2_17.setEnabled(false);
            rb_r4_17.setEnabled(false);
            rb_r5_17.setEnabled(false);
        }else if(q17_a==q17_rb4_id){
            rb_r1_17.setEnabled(false);
            rb_r2_17.setEnabled(false);
            rb_r3_17.setEnabled(false);
            rb_r5_17.setEnabled(false);
        }else if(q17_a==q17_rb5_id){
            rb_r1_17.setEnabled(false);
            rb_r2_17.setEnabled(false);
            rb_r3_17.setEnabled(false);
            rb_r4_17.setEnabled(false);
        }


        RadioGroup rg_q18_r=(RadioGroup) findViewById(R.id.q18_rg_r);

        rg_q18_r.check(q18_a);

        RadioButton rb_r1_18 = (RadioButton)findViewById(R.id.radioButton_18);
        RadioButton rb_r2_18 = (RadioButton)findViewById(R.id.radioButton2_18);
        RadioButton rb_r3_18 = (RadioButton)findViewById(R.id.radioButton3_18);
        RadioButton rb_r4_18 = (RadioButton)findViewById(R.id.radioButton4_18);
        RadioButton rb_r5_18 = (RadioButton)findViewById(R.id.radioButton5_18);
        if(q18_a==q18_rb1_id) {
            rb_r2_18.setEnabled(false);
            rb_r3_18.setEnabled(false);
            rb_r4_18.setEnabled(false);
            rb_r5_18.setEnabled(false);
        }else if(q18_a==q18_rb2_id){
            rb_r1_18.setEnabled(false);
            rb_r3_18.setEnabled(false);
            rb_r4_18.setEnabled(false);
            rb_r5_18.setEnabled(false);
        }else if(q18_a==q18_rb3_id){
            rb_r1_18.setEnabled(false);
            rb_r2_18.setEnabled(false);
            rb_r4_18.setEnabled(false);
            rb_r5_18.setEnabled(false);
        }else if(q18_a==q18_rb4_id){
            rb_r1_18.setEnabled(false);
            rb_r2_18.setEnabled(false);
            rb_r3_18.setEnabled(false);
            rb_r5_18.setEnabled(false);
        }else if(q18_a==q18_rb5_id){
            rb_r1_18.setEnabled(false);
            rb_r2_18.setEnabled(false);
            rb_r3_18.setEnabled(false);
            rb_r4_18.setEnabled(false);
        }


        RadioGroup rg_q19_r=(RadioGroup) findViewById(R.id.q19_rg_r);

        rg_q19_r.check(q19_a);

        RadioButton rb_r1_19 = (RadioButton)findViewById(R.id.radioButton_19);
        RadioButton rb_r2_19 = (RadioButton)findViewById(R.id.radioButton2_19);
        RadioButton rb_r3_19 = (RadioButton)findViewById(R.id.radioButton3_19);
        RadioButton rb_r4_19 = (RadioButton)findViewById(R.id.radioButton4_19);
        RadioButton rb_r5_19 = (RadioButton)findViewById(R.id.radioButton5_19);
        if(q19_a==q19_rb1_id) {
            rb_r2_19.setEnabled(false);
            rb_r3_19.setEnabled(false);
            rb_r4_19.setEnabled(false);
            rb_r5_19.setEnabled(false);
        }else if(q19_a==q19_rb2_id){
            rb_r1_19.setEnabled(false);
            rb_r3_19.setEnabled(false);
            rb_r4_19.setEnabled(false);
            rb_r5_19.setEnabled(false);
        }else if(q19_a==q19_rb3_id){
            rb_r1_19.setEnabled(false);
            rb_r2_19.setEnabled(false);
            rb_r4_19.setEnabled(false);
            rb_r5_19.setEnabled(false);
        }else if(q19_a==q19_rb4_id){
            rb_r1_19.setEnabled(false);
            rb_r2_19.setEnabled(false);
            rb_r3_19.setEnabled(false);
            rb_r5_19.setEnabled(false);
        }else if(q19_a==q19_rb5_id){
            rb_r1_19.setEnabled(false);
            rb_r2_19.setEnabled(false);
            rb_r3_19.setEnabled(false);
            rb_r4_19.setEnabled(false);
        }

        RadioGroup rg_q20_r=(RadioGroup) findViewById(R.id.q20_rg_r);

        rg_q20_r.check(q20_a);

        RadioButton rb_r1_20 = (RadioButton)findViewById(R.id.radioButton_20);
        RadioButton rb_r2_20 = (RadioButton)findViewById(R.id.radioButton2_20);
        RadioButton rb_r3_20 = (RadioButton)findViewById(R.id.radioButton3_20);
        RadioButton rb_r4_20 = (RadioButton)findViewById(R.id.radioButton4_20);
        RadioButton rb_r5_20 = (RadioButton)findViewById(R.id.radioButton5_20);
        if(q20_a==q20_rb1_id) {
            rb_r2_20.setEnabled(false);
            rb_r3_20.setEnabled(false);
            rb_r4_20.setEnabled(false);
            rb_r5_20.setEnabled(false);
        }else if(q20_a==q20_rb2_id){
            rb_r1_20.setEnabled(false);
            rb_r3_20.setEnabled(false);
            rb_r4_20.setEnabled(false);
            rb_r5_20.setEnabled(false);
        }else if(q20_a==q20_rb3_id){
            rb_r1_20.setEnabled(false);
            rb_r2_20.setEnabled(false);
            rb_r4_20.setEnabled(false);
            rb_r5_20.setEnabled(false);
        }else if(q20_a==q20_rb4_id){
            rb_r1_20.setEnabled(false);
            rb_r2_20.setEnabled(false);
            rb_r3_20.setEnabled(false);
            rb_r5_20.setEnabled(false);
        }else if(q20_a==q20_rb5_id){
            rb_r1_20.setEnabled(false);
            rb_r2_20.setEnabled(false);
            rb_r3_20.setEnabled(false);
            rb_r4_20.setEnabled(false);
        }

        //TextView IdView = (TextView) findViewById(R.id.IdView);
        //IdView.setText(String.valueOf(q1_1_rb_id));


    }
    /*@Override
    public void onBackPressed(){

    }*/

}
