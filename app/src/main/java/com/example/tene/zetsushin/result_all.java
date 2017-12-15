package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class result_all extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_all);

        Intent intent = getIntent();

int sum = 0;
int sum_r = 0;

        int q1_a = intent.getIntExtra("q1_answer",0);
        int q1_1_rb_id = intent.getIntExtra("q1_1_setId",0);
        int q1_2_rb_id = intent.getIntExtra("q1_2_setId",0);
        int q1_3_rb_id = intent.getIntExtra("q1_3_setId",0);
        int q1_4_rb_id = intent.getIntExtra("q1_4_setId",0);
        int q1_5_rb_id = intent.getIntExtra("q1_5_setId",0);

        RadioGroup rg_q1_r=(RadioGroup) findViewById(R.id.q1_rg_r);
        rg_q1_r.check(q1_a);
        RadioButton rb_q1_1 = (RadioButton)findViewById(R.id.radioButton);
        RadioButton rb_q1_2 = (RadioButton)findViewById(R.id.radioButton2);
        RadioButton rb_q1_3 = (RadioButton)findViewById(R.id.radioButton3);
        RadioButton rb_q1_4 = (RadioButton)findViewById(R.id.radioButton4);
        RadioButton rb_q1_5 = (RadioButton)findViewById(R.id.radioButton5);
        if(q1_a==q1_1_rb_id) {
            rb_q1_2.setEnabled(false);
            rb_q1_3.setEnabled(false);
            rb_q1_4.setEnabled(false);
            rb_q1_5.setEnabled(false);
        }else if(q1_a==q1_2_rb_id){
            rb_q1_1.setEnabled(false);
            rb_q1_3.setEnabled(false);
            rb_q1_4.setEnabled(false);
            rb_q1_5.setEnabled(false);
        }else if(q1_a==q1_3_rb_id){
            rb_q1_1.setEnabled(false);
            rb_q1_2.setEnabled(false);
            rb_q1_4.setEnabled(false);
            rb_q1_5.setEnabled(false);
        }else if(q1_a==q1_4_rb_id){
            rb_q1_1.setEnabled(false);
            rb_q1_2.setEnabled(false);
            rb_q1_3.setEnabled(false);
            rb_q1_5.setEnabled(false);
        }else if(q1_a==q1_5_rb_id){
            rb_q1_1.setEnabled(false);
            rb_q1_2.setEnabled(false);
            rb_q1_3.setEnabled(false);
            rb_q1_4.setEnabled(false);
        }
        int q5_a_r = intent.getIntExtra("q5_answer_r",0);
        int q5_rb1_id_r = intent.getIntExtra("q5_rb1_setId_r",0);
        int q5_rb2_id_r = intent.getIntExtra("q5_rb2_setId_r",0);
        int q5_rb3_id_r = intent.getIntExtra("q5_rb3_setId_r",0);
        int q5_rb4_id_r = intent.getIntExtra("q5_rb4_setId_r",0);
        int q5_rb5_id_r = intent.getIntExtra("q5_rb5_setId_r",0);
        RadioGroup rg_q5_r1=(RadioGroup) findViewById(R.id.q1_rg_r1);
/*^^;q1→r5*/        rg_q5_r1.check(q5_a_r);
        RadioButton rb_q5_1_r = (RadioButton)findViewById(R.id.radioButton_r);
        RadioButton rb_q5_2_r = (RadioButton)findViewById(R.id.radioButton2_r);
        RadioButton rb_q5_3_r = (RadioButton)findViewById(R.id.radioButton3_r);
        RadioButton rb_q5_4_r = (RadioButton)findViewById(R.id.radioButton4_r);
        RadioButton rb_q5_5_r = (RadioButton)findViewById(R.id.radioButton5_r);
        if(q5_a_r==q5_rb1_id_r) {
            rg_q5_r1.check(R.id.radioButton_r);
            rb_q5_2_r.setEnabled(false);
            rb_q5_3_r.setEnabled(false);
            rb_q5_4_r.setEnabled(false);
            rb_q5_5_r.setEnabled(false);
        }else if(q5_a_r==q5_rb2_id_r){
            rb_q5_1_r.setEnabled(false);
            rg_q5_r1.check(R.id.radioButton2_r);
            rb_q5_3_r.setEnabled(false);
            rb_q5_4_r.setEnabled(false);
            rb_q5_5_r.setEnabled(false);
        }else if(q5_a_r==q5_rb3_id_r){
            rb_q5_1_r.setEnabled(false);
            rb_q5_2_r.setEnabled(false);
            rg_q5_r1.check(R.id.radioButton3_r);
            rb_q5_4_r.setEnabled(false);
            rb_q5_5_r.setEnabled(false);
        }else if(q5_a_r==q5_rb4_id_r){
            rb_q5_1_r.setEnabled(false);
            rb_q5_2_r.setEnabled(false);
            rb_q5_3_r.setEnabled(false);
            rg_q5_r1.check(R.id.radioButton4_r);
            rb_q5_5_r.setEnabled(false);
        }else if(q5_a_r==q5_rb5_id_r){
            rb_q5_1_r.setEnabled(false);
            rb_q5_2_r.setEnabled(false);
            rb_q5_3_r.setEnabled(false);
            rb_q5_4_r.setEnabled(false);
            rg_q5_r1.check(R.id.radioButton5_r);
        }

        if(q1_a==q1_2_rb_id && q5_a_r==q5_rb1_id_r
                || q1_a==q1_3_rb_id && q5_a_r==q5_rb2_id_r
                || q1_a==q1_4_rb_id && q5_a_r==q5_rb4_id_r
                || q1_a==q1_5_rb_id && q5_a_r==q5_rb5_id_r){
            ConstraintLayout layout_q1 = (ConstraintLayout) findViewById(R.id.q1_back);
            layout_q1.setBackgroundResource(R.color.not_not);
        }

        if(q1_a==q1_1_rb_id)    sum=sum+5;if(q5_a_r==q5_rb3_id_r)    sum_r=sum_r+5;

        int q2_a = intent.getIntExtra("q2_answer",0);
        int q2_rb1_id = intent.getIntExtra("q2_rb1_setId",0);
        int q2_rb2_id = intent.getIntExtra("q2_rb2_setId",0);
        int q2_rb3_id = intent.getIntExtra("q2_rb3_setId",0);
        int q2_rb4_id = intent.getIntExtra("q2_rb4_setId",0);
        int q2_rb5_id = intent.getIntExtra("q2_rb5_setId",0);

        RadioGroup rg_q2_r=(RadioGroup) findViewById(R.id.q2_rg_r);

        RadioButton rb_q2_1 = (RadioButton)findViewById(R.id.radioButton_q2);
        RadioButton rb_q2_2 = (RadioButton)findViewById(R.id.radioButton2_q2);
        RadioButton rb_q2_3 = (RadioButton)findViewById(R.id.radioButton3_q2);
        RadioButton rb_q2_4 = (RadioButton)findViewById(R.id.radioButton4_q2);
        RadioButton rb_q2_5 = (RadioButton)findViewById(R.id.radioButton5_q2);
        if(q2_a==q2_rb1_id) {
            rg_q2_r.check(R.id.radioButton_q2);
            rb_q2_2.setEnabled(false);
            rb_q2_3.setEnabled(false);
            rb_q2_4.setEnabled(false);
            rb_q2_5.setEnabled(false);
        }else if(q2_a==q2_rb2_id){
            rb_q2_1.setEnabled(false);
            rg_q2_r.check(R.id.radioButton2_q2);
            rb_q2_3.setEnabled(false);
            rb_q2_4.setEnabled(false);
            rb_q2_5.setEnabled(false);
        }else if(q2_a==q2_rb3_id){
            rb_q2_1.setEnabled(false);
            rb_q2_2.setEnabled(false);
            rg_q2_r.check(R.id.radioButton3_q2);
            rb_q2_4.setEnabled(false);
            rb_q2_5.setEnabled(false);
        }else if(q2_a==q2_rb4_id){
            rb_q2_1.setEnabled(false);
            rb_q2_2.setEnabled(false);
            rb_q2_3.setEnabled(false);
            rg_q2_r.check(R.id.radioButton4_q2);
            rb_q2_5.setEnabled(false);
        }else if(q2_a==q2_rb5_id){
            rb_q2_1.setEnabled(false);
            rb_q2_2.setEnabled(false);
            rb_q2_3.setEnabled(false);
            rb_q2_4.setEnabled(false);
            rg_q2_r.check(R.id.radioButton5_q2);
        }
        int q11_a_r = intent.getIntExtra("q11_answer_r",0);
        int q11_rb1_id_r = intent.getIntExtra("q11_rb1_setId_r",0);
        int q11_rb2_id_r = intent.getIntExtra("q11_rb2_setId_r",0);
        int q11_rb3_id_r = intent.getIntExtra("q11_rb3_setId_r",0);
        int q11_rb4_id_r = intent.getIntExtra("q11_rb4_setId_r",0);
        int q11_rb5_id_r = intent.getIntExtra("q11_rb5_setId_r",0);
        RadioGroup rg_q11_r1=(RadioGroup) findViewById(R.id.q2_rg_r1);
/*^^;q2→r11*/        rg_q11_r1.check(q11_a_r);
        RadioButton rb_q11_1_r = (RadioButton)findViewById(R.id.radioButton_r_q2);
        RadioButton rb_q11_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q2);
        RadioButton rb_q11_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q2);
        RadioButton rb_q11_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q2);
        RadioButton rb_q11_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q2);
        if(q11_a_r==q11_rb1_id_r) {
            rg_q11_r1.check(R.id.radioButton_r_q2);
            rb_q11_2_r.setEnabled(false);
            rb_q11_3_r.setEnabled(false);
            rb_q11_4_r.setEnabled(false);
            rb_q11_5_r.setEnabled(false);
        }else if(q11_a_r==q11_rb2_id_r){
            rb_q11_1_r.setEnabled(false);
            rg_q11_r1.check(R.id.radioButton2_r_q2);
            rb_q11_3_r.setEnabled(false);
            rb_q11_4_r.setEnabled(false);
            rb_q11_5_r.setEnabled(false);
        }else if(q11_a_r==q11_rb3_id_r){
            rb_q11_1_r.setEnabled(false);
            rb_q11_2_r.setEnabled(false);
            rg_q11_r1.check(R.id.radioButton3_r_q2);
            rb_q11_4_r.setEnabled(false);
            rb_q11_5_r.setEnabled(false);
        }else if(q11_a_r==q11_rb4_id_r){
            rb_q11_1_r.setEnabled(false);
            rb_q11_2_r.setEnabled(false);
            rb_q11_3_r.setEnabled(false);
            rg_q11_r1.check(R.id.radioButton4_r_q2);
            rb_q11_5_r.setEnabled(false);
        }else if(q11_a_r==q11_rb5_id_r){
            rb_q11_1_r.setEnabled(false);
            rb_q11_2_r.setEnabled(false);
            rb_q11_3_r.setEnabled(false);
            rb_q11_4_r.setEnabled(false);
            rg_q11_r1.check(R.id.radioButton5_r_q2);
        }

        if(q2_a==q2_rb2_id && q11_a_r==q11_rb3_id_r
                || q2_a==q2_rb3_id && q11_a_r==q11_rb4_id_r
                || q2_a==q2_rb4_id && q11_a_r==q11_rb1_id_r
                || q2_a==q2_rb5_id && q11_a_r==q11_rb4_id_r){
            ConstraintLayout layout_q2 = (ConstraintLayout) findViewById(R.id.q2_back);
            layout_q2.setBackgroundResource(R.color.not_not);
        }

        if(q2_a==q2_rb1_id)    sum=sum+5;if(q11_a_r==q11_rb5_id_r)    sum_r=sum_r+5;

        int q3_a = intent.getIntExtra("q3_answer",0);
        int q3_rb1_id = intent.getIntExtra("q3_rb1_setId",0);
        int q3_rb2_id = intent.getIntExtra("q3_rb2_setId",0);
        int q3_rb3_id = intent.getIntExtra("q3_rb3_setId",0);
        int q3_rb4_id = intent.getIntExtra("q3_rb4_setId",0);
        int q3_rb5_id = intent.getIntExtra("q3_rb5_setId",0);

        RadioGroup rg_q3_r=(RadioGroup) findViewById(R.id.q3_rg_r);

        RadioButton rb_q3_1 = (RadioButton)findViewById(R.id.radioButton_q3);
        RadioButton rb_q3_2 = (RadioButton)findViewById(R.id.radioButton2_q3);
        RadioButton rb_q3_3 = (RadioButton)findViewById(R.id.radioButton3_q3);
        RadioButton rb_q3_4 = (RadioButton)findViewById(R.id.radioButton4_q3);
        RadioButton rb_q3_5 = (RadioButton)findViewById(R.id.radioButton5_q3);
        if(q3_a==q3_rb1_id) {
            rg_q3_r.check(R.id.radioButton_q3);
            rb_q3_2.setEnabled(false);
            rb_q3_3.setEnabled(false);
            rb_q3_4.setEnabled(false);
            rb_q3_5.setEnabled(false);
        }else if(q3_a==q3_rb2_id){
            rb_q3_1.setEnabled(false);
            rg_q3_r.check(R.id.radioButton2_q3);
            rb_q3_3.setEnabled(false);
            rb_q3_4.setEnabled(false);
            rb_q3_5.setEnabled(false);
        }else if(q3_a==q3_rb3_id){
            rb_q3_1.setEnabled(false);
            rb_q3_2.setEnabled(false);
            rg_q3_r.check(R.id.radioButton3_q3);
            rb_q3_4.setEnabled(false);
            rb_q3_5.setEnabled(false);
        }else if(q3_a==q3_rb4_id){
            rb_q3_1.setEnabled(false);
            rb_q3_2.setEnabled(false);
            rb_q3_3.setEnabled(false);
            rg_q3_r.check(R.id.radioButton4_q3);
            rb_q3_5.setEnabled(false);
        }else if(q3_a==q3_rb5_id){
            rb_q3_1.setEnabled(false);
            rb_q3_2.setEnabled(false);
            rb_q3_3.setEnabled(false);
            rb_q3_4.setEnabled(false);
            rg_q3_r.check(R.id.radioButton5_q3);
        }
        int q4_a_r = intent.getIntExtra("q4_answer_r",0);
        int q4_rb1_id_r = intent.getIntExtra("q4_rb1_setId_r",0);
        int q4_rb2_id_r = intent.getIntExtra("q4_rb2_setId_r",0);
        int q4_rb3_id_r = intent.getIntExtra("q4_rb3_setId_r",0);
        int q4_rb4_id_r = intent.getIntExtra("q4_rb4_setId_r",0);
        int q4_rb5_id_r = intent.getIntExtra("q4_rb5_setId_r",0);
        RadioGroup rg_q4_r1=(RadioGroup) findViewById(R.id.q3_rg_r1);
/*^^;q3→r11*/        rg_q4_r1.check(q4_a_r);
        RadioButton rb_q4_1_r = (RadioButton)findViewById(R.id.radioButton_r_q3);
        RadioButton rb_q4_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q3);
        RadioButton rb_q4_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q3);
        RadioButton rb_q4_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q3);
        RadioButton rb_q4_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q3);
        if(q4_a_r==q4_rb1_id_r) {
            rg_q4_r1.check(R.id.radioButton_r_q3);
            rb_q4_2_r.setEnabled(false);
            rb_q4_3_r.setEnabled(false);
            rb_q4_4_r.setEnabled(false);
            rb_q4_5_r.setEnabled(false);
        }else if(q4_a_r==q4_rb2_id_r){
            rb_q4_1_r.setEnabled(false);
            rg_q4_r1.check(R.id.radioButton2_r_q3);
            rb_q4_3_r.setEnabled(false);
            rb_q4_4_r.setEnabled(false);
            rb_q4_5_r.setEnabled(false);
        }else if(q4_a_r==q4_rb3_id_r){
            rb_q4_1_r.setEnabled(false);
            rb_q4_2_r.setEnabled(false);
            rg_q4_r1.check(R.id.radioButton3_r_q3);
            rb_q4_4_r.setEnabled(false);
            rb_q4_5_r.setEnabled(false);
        }else if(q4_a_r==q4_rb4_id_r){
            rb_q4_1_r.setEnabled(false);
            rb_q4_2_r.setEnabled(false);
            rb_q4_3_r.setEnabled(false);
            rg_q4_r1.check(R.id.radioButton4_r_q3);
            rb_q4_5_r.setEnabled(false);
        }else if(q4_a_r==q4_rb5_id_r){
            rb_q4_1_r.setEnabled(false);
            rb_q4_2_r.setEnabled(false);
            rb_q4_3_r.setEnabled(false);
            rb_q4_4_r.setEnabled(false);
            rg_q4_r1.check(R.id.radioButton5_r_q3);
        }

        if(q3_a==q3_rb1_id && q4_a_r==q4_rb5_id_r
                || q3_a==q3_rb2_id && q4_a_r==q4_rb1_id_r
                || q3_a==q3_rb3_id && q4_a_r==q4_rb3_id_r
                || q3_a==q3_rb5_id && q4_a_r==q4_rb4_id_r){
            ConstraintLayout layout_q3 = (ConstraintLayout) findViewById(R.id.q3_back);
            layout_q3.setBackgroundResource(R.color.not_not);
        }

        if(q3_a==q3_rb4_id)    sum=sum+5;if(q4_a_r==q4_rb2_id_r)    sum_r=sum_r+5;


        int q4_a = intent.getIntExtra("q4_answer",0);
        int q4_rb1_id = intent.getIntExtra("q4_rb1_setId",0);
        int q4_rb2_id = intent.getIntExtra("q4_rb2_setId",0);
        int q4_rb3_id = intent.getIntExtra("q4_rb3_setId",0);
        int q4_rb4_id = intent.getIntExtra("q4_rb4_setId",0);
        int q4_rb5_id = intent.getIntExtra("q4_rb5_setId",0);

        RadioGroup rg_q4_r=(RadioGroup) findViewById(R.id.q4_rg_r);

        RadioButton rb_q4_1 = (RadioButton)findViewById(R.id.radioButton_q4);
        RadioButton rb_q4_2 = (RadioButton)findViewById(R.id.radioButton2_q4);
        RadioButton rb_q4_3 = (RadioButton)findViewById(R.id.radioButton3_q4);
        RadioButton rb_q4_4 = (RadioButton)findViewById(R.id.radioButton4_q4);
        RadioButton rb_q4_5 = (RadioButton)findViewById(R.id.radioButton5_q4);
        if(q4_a==q4_rb1_id) {
            rg_q4_r.check(R.id.radioButton_q4);
            rb_q4_2.setEnabled(false);
            rb_q4_3.setEnabled(false);
            rb_q4_4.setEnabled(false);
            rb_q4_5.setEnabled(false);
        }else if(q4_a==q4_rb2_id){
            rb_q4_1.setEnabled(false);
            rg_q4_r.check(R.id.radioButton2_q4);
            rb_q4_3.setEnabled(false);
            rb_q4_4.setEnabled(false);
            rb_q4_5.setEnabled(false);
        }else if(q4_a==q4_rb3_id){
            rb_q4_1.setEnabled(false);
            rb_q4_2.setEnabled(false);
            rg_q4_r.check(R.id.radioButton3_q4);
            rb_q4_4.setEnabled(false);
            rb_q4_5.setEnabled(false);
        }else if(q4_a==q4_rb4_id){
            rb_q4_1.setEnabled(false);
            rb_q4_2.setEnabled(false);
            rb_q4_3.setEnabled(false);
            rg_q4_r.check(R.id.radioButton4_q4);
            rb_q4_5.setEnabled(false);
        }else if(q4_a==q4_rb5_id){
            rb_q4_1.setEnabled(false);
            rb_q4_2.setEnabled(false);
            rb_q4_3.setEnabled(false);
            rb_q4_4.setEnabled(false);
            rg_q4_r.check(R.id.radioButton5_q4);
        }
        int q9_a_r = intent.getIntExtra("q9_answer_r",0);
        int q9_rb1_id_r = intent.getIntExtra("q9_rb1_setId_r",0);
        int q9_rb2_id_r = intent.getIntExtra("q9_rb2_setId_r",0);
        int q9_rb3_id_r = intent.getIntExtra("q9_rb3_setId_r",0);
        int q9_rb4_id_r = intent.getIntExtra("q9_rb4_setId_r",0);
        int q9_rb5_id_r = intent.getIntExtra("q9_rb5_setId_r",0);
        RadioGroup rg_q9_r1=(RadioGroup) findViewById(R.id.q4_rg_r1);
/*^^;q4→r11*/        rg_q9_r1.check(q9_a_r);
        RadioButton rb_q9_1_r = (RadioButton)findViewById(R.id.radioButton_r_q4);
        RadioButton rb_q9_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q4);
        RadioButton rb_q9_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q4);
        RadioButton rb_q9_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q4);
        RadioButton rb_q9_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q4);
        if(q9_a_r==q9_rb1_id_r) {
            rg_q9_r1.check(R.id.radioButton_r_q4);
            rb_q9_2_r.setEnabled(false);
            rb_q9_3_r.setEnabled(false);
            rb_q9_4_r.setEnabled(false);
            rb_q9_5_r.setEnabled(false);
        }else if(q9_a_r==q9_rb2_id_r){
            rb_q9_1_r.setEnabled(false);
            rg_q9_r1.check(R.id.radioButton2_r_q4);
            rb_q9_3_r.setEnabled(false);
            rb_q9_4_r.setEnabled(false);
            rb_q9_5_r.setEnabled(false);
        }else if(q9_a_r==q9_rb3_id_r){
            rb_q9_1_r.setEnabled(false);
            rb_q9_2_r.setEnabled(false);
            rg_q9_r1.check(R.id.radioButton3_r_q4);
            rb_q9_4_r.setEnabled(false);
            rb_q9_5_r.setEnabled(false);
        }else if(q9_a_r==q9_rb4_id_r){
            rb_q9_1_r.setEnabled(false);
            rb_q9_2_r.setEnabled(false);
            rb_q9_3_r.setEnabled(false);
            rg_q9_r1.check(R.id.radioButton4_r_q4);
            rb_q9_5_r.setEnabled(false);
        }else if(q9_a_r==q9_rb5_id_r){
            rb_q9_1_r.setEnabled(false);
            rb_q9_2_r.setEnabled(false);
            rb_q9_3_r.setEnabled(false);
            rb_q9_4_r.setEnabled(false);
            rg_q9_r1.check(R.id.radioButton5_r_q4);
        }

        if(q4_a==q4_rb1_id && q9_a_r==q9_rb4_id_r
                || q4_a==q4_rb3_id && q9_a_r==q9_rb5_id_r
                || q4_a==q4_rb4_id && q9_a_r==q9_rb1_id_r
                || q4_a==q4_rb5_id && q9_a_r==q9_rb3_id_r){
            ConstraintLayout layout_q4 = (ConstraintLayout) findViewById(R.id.q4_back);
            layout_q4.setBackgroundResource(R.color.not_not);
        }

        if(q4_a==q4_rb2_id)    sum=sum+5;if(q9_a_r==q9_rb2_id_r)    sum_r=sum_r+5;


        TextView ScoreView = (TextView) findViewById(R.id.score_r);
        ScoreView.setText(String.valueOf(sum));
        TextView ScoreView_2 = (TextView) findViewById(R.id.score_r_2);
        ScoreView_2.setText(String.valueOf(sum_r));

    }
    @Override
    public void onBackPressed(){

    }
}
